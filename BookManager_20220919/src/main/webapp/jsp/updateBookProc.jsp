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

<%
	Connection conn = ConnectionManager.getConnection();
	conn.setAutoCommit(false);

	String updateBMQuery = " update bookmaster set bookname=? where bookid=? ";
	String updateBDQuery = " update bookdetail set bookpagecnt=?, bookauthor=? where bookid=? ";

	PreparedStatement pstmtBM = conn.prepareStatement(updateBMQuery);
	PreparedStatement pstmtBD = conn.prepareStatement(updateBDQuery);

	try {
		pstmtBM.setString(1, bookMaster.getBookname());
		pstmtBM.setInt(2, bookMaster.getBookid());
		pstmtBM.executeUpdate();
		
		pstmtBD.setInt(1, bookDetail.getBookpagecnt());
		pstmtBD.setString(2, bookDetail.getBookauthor());
		pstmtBD.setInt(3, bookDetail.getBookid());
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