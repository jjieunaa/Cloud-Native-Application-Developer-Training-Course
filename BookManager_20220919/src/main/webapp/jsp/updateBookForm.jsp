<%@page import="book.vo.BookDetail"%>
<%@page import="book.vo.BookMaster"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="book.util.ConnectionManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String bookidParam = request.getParameter("bookid")==null ? "" : request.getParameter("bookid");

	Connection conn = ConnectionManager.getConnection();
	conn.setAutoCommit(false);
	
	String selectBMQuery = " select bookid, bookname from bookmaster where bookid=" + bookidParam;
	String selectBDQuery = " select bookpagecnt, bookauthor from bookdetail where bookid=" + bookidParam;
	
	Statement stmtBM = conn.createStatement();
	Statement stmtBD = conn.createStatement();
	
	ResultSet rsBM = stmtBM.executeQuery(selectBMQuery);
	ResultSet rsBD = stmtBD.executeQuery(selectBDQuery);
	
	BookMaster bookMaster = null;
	BookDetail bookDetail = null;
	
	if (rsBM.next()) {
		bookMaster = new BookMaster();
		bookMaster.setBookid(rsBM.getInt("bookid"));
		bookMaster.setBookname(rsBM.getString("bookname"));
	}
	
	if (rsBD.next()) {
		bookDetail = new BookDetail();
		bookDetail.setBookpagecnt(rsBD.getInt("bookpagecnt"));
		bookDetail.setBookauthor(rsBD.getString("bookauthor"));
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book Update</title>
</head>
<body>
	<div>
		<form name="updateBookForm" action="/BookManager_20220919/jsp/updateBookProc.jsp">
			<input type="hidden" name="bookid" value="<%=bookMaster.getBookid()%>" />
			제목: <input type="text" name="bookname" value="<%=bookMaster.getBookname()%>"/><br />
			ISBN: <input type="text" name="bookisbn" /><br />
			분류: 
			<select name="bookdomain">
				<option value="">미분류</option>
				<option value="novel">소설</option>
				<option value="classic">고전</option>
				<option value="essay">에세이</option>
			</select><br />
			<!--
			출판일: <input type="text" name="bookwdate" /><br />
			-->
			내용:<br /><textarea name="bookcontent" rows="5" cols="40"></textarea><br />
			페이지 수: <input type="text" name="bookpagecnt" value="<%=bookDetail.getBookpagecnt()%>"/><br />
			저자: <input type="text" name="bookauthor" value="<%=bookDetail.getBookauthor()%>"/><br />
			<button onclick="this.form.submit();">수정</button>
		</form>
	</div>
</body>
</html>