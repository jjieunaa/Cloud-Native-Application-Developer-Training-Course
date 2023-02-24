<%@page import="java.util.Iterator"%>
<%@page import="java.util.Set"%>
<%@page import="book.vo.BookDetail"%>
<%@page import="book.vo.BookMaster"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="book.util.ConnectionManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	Connection conn = null;
	conn = ConnectionManager.getConnection();
	
	Map<Object, Object> bookMap = new HashMap<Object, Object>();
	
	String selectQueryBM = " select bookid, bookname, bookisbn, bookdomain, bookwdate from bookmaster ";
		selectQueryBM += " order by bookid desc ";
	String selectQueryBD = " select bookpagecnt, bookauthor from bookdetail ";
		selectQueryBD += " order by bookid desc ";
	
	Statement stmtBM = conn.createStatement();
	Statement stmtBD = conn.createStatement();
	
	ResultSet rsBM = stmtBM.executeQuery(selectQueryBM);
	ResultSet rsBD = stmtBD.executeQuery(selectQueryBD);
	
	while (rsBM.next() && rsBD.next()) {
		BookMaster bmBean = new BookMaster();
		bmBean.setBookid(rsBM.getInt("bookid"));
		bmBean.setBookname(rsBM.getString("bookname"));
		bmBean.setBookisbn(rsBM.getString("bookisbn"));
		bmBean.setBookdomain(rsBM.getString("bookdomain"));
		bmBean.setBookwdate(rsBM.getTimestamp("bookwdate"));
		
		BookDetail bdBean = new BookDetail();
		bdBean.setBookpagecnt(rsBD.getInt("bookpagecnt"));
		bdBean.setBookauthor(rsBD.getString("bookauthor"));
		
		bookMap.put(bmBean, bdBean);
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book List</title>
</head>
<body>
	<div>
		<table>
			<caption>Book List</caption>
			<thead>
				<tr>
					<th>ISBN</th>
					<th>분류</th>
					<th>제목</th>
					<th>출판일</th>
					<th>페이지 수</th>
					<th>저자</th>
					<th>수정</th>
					<th>삭제</th>
				</tr>
			</thead>
			<tbody>
<%
	Set bookMapkeySet = bookMap.keySet();
	if (bookMapkeySet!=null && !bookMapkeySet.isEmpty()) {
		Iterator iterator = bookMapkeySet.iterator();
		while (iterator.hasNext()) {
			BookMaster bookMaster = (BookMaster)iterator.next();
			BookDetail bookDetail = (BookDetail)bookMap.get(bookMaster);
			out.print("<tr><td>"+bookMaster.getBookisbn()+"</td>");
			out.print("<td>"+bookMaster.getBookdomain()+"</td>");
			out.print("<td>"+bookMaster.getBookname()+"</td>");
			out.print("<td>"+bookMaster.getBookwdate()+"</td>");
			out.print("<td>"+bookDetail.getBookpagecnt()+"</td>");
			out.print("<td>"+bookDetail.getBookauthor()+"</td>");
			out.print("<td><a href='/BookManager_20220919/jsp/updateBookForm.jsp?bookid="+
					bookMaster.getBookid()+"'>[수정]</a></td>");
			out.print("<td><a href='/BookManager_20220919/jsp/deleteBookProc.jsp?bookid="+
					bookMaster.getBookid()+"'>[삭제]</a></td>");
		}
	}
%>				
				</tr>
			</tbody>
		</table>
	</div>
	<div>
		<a href="/BookManager_20220919/jsp/insertBookForm.jsp">책등록</a>
	</div>
</body>
</html>