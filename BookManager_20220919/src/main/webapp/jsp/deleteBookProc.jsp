<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Statement"%>
<%@page import="book.util.ConnectionManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String bookidParam = request.getParameter("bookid")==null ? "" : request.getParameter("bookid");
	
	Connection conn = ConnectionManager.getConnection();
	conn.setAutoCommit(false);

	String deleteBMQuery = " delete from bookmaster where bookid="+bookidParam+" ";
	String deleteBDQuery = " delete from bookdetail where bookid="+bookidParam+" ";
	
	Statement statementBM = conn.createStatement();
	Statement statementBD = conn.createStatement();
	
	try {
		statementBM.executeUpdate(deleteBMQuery);
		statementBD.executeUpdate(deleteBDQuery);
		conn.commit();
	} catch (SQLException sqle) {
		sqle.printStackTrace();
		conn.rollback();
	} finally {
		if (statementBM!=null) statementBM.close();
		if (statementBD!=null) statementBD.close();
		if (conn!=null) conn.close();
	}
	
	response.sendRedirect("/BookManager_20220919/jsp/listBook.jsp");
%>