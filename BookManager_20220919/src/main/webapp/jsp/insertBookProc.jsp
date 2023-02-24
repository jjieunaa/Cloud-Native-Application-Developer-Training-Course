<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<%@page import="java.sql.Connection"%>
<%@page import="book.util.ConnectionManager"%>

<jsp:useBean id="bookMaster" class="book.vo.BookMaster"/>
<jsp:useBean id="bookDetail" class="book.vo.BookDetail"/>
<jsp:setProperty name="bookMaster" property="*" />
<jsp:setProperty name="bookDetail" property="*" />

<%!
	public int getCurrentBookID(Connection conn) throws Exception {
		Statement stmtSelect = conn.createStatement();
		String selectQuery = " select bookid from bookmaster order by bookid desc limit 1 ";
		ResultSet rs = stmtSelect.executeQuery(selectQuery);
		int currentBookID = 0;
		if (rs.next()) {
			currentBookID = rs.getInt(1);
		}
		return currentBookID;
	}
%>
<%
	Connection conn = ConnectionManager.getConnection();
	conn.setAutoCommit(false);

	String insertBMquery = " insert into bookmaster(bookname, bookisbn, bookdomain, bookwdate) ";
		insertBMquery += " values (?,?,?,now()) ";

	String insertBDquery = " insert into bookdetail(bookid, bookcontent, bookpagecnt, bookauthor) ";
		insertBDquery += " values (?,?,?,?) ";
	
	PreparedStatement pstmtBM = conn.prepareStatement(insertBMquery);
	PreparedStatement pstmtBD = conn.prepareStatement(insertBDquery);

	try {
		pstmtBM.setString(1, bookMaster.getBookname());
		pstmtBM.setString(2, bookMaster.getBookisbn());
		pstmtBM.setString(3, bookMaster.getBookdomain());
		// pstmtBM.setTimestamp(4, bookMaster.getBookwdate());
		pstmtBM.executeUpdate();
		
		pstmtBD.setInt(1, getCurrentBookID(conn));	// temp code
		pstmtBD.setString(2, bookDetail.getBookcontent());
		pstmtBD.setInt(3, bookDetail.getBookpagecnt());
		pstmtBD.setString(4, bookDetail.getBookauthor());
		pstmtBD.executeUpdate();
		
		conn.commit();
	} catch (SQLException sqle) {
		sqle.printStackTrace();
		conn.rollback();
	} finally {
		pstmtBM.close();
		pstmtBD.close();
		conn.close();
	}

	response.sendRedirect("/BookManager_20220919/jsp/listBook.jsp");	
%>