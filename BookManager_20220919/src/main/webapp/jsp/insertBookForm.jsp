<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book Insert</title>
</head>
<body>
	<div>
		<form name="insertBookForm" action="/BookManager_20220919/jsp/insertBookProc.jsp">
			제목: <input type="text" name="bookname" /><br />
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
			페이지 수: <input type="text" name="bookpagecnt" /><br />
			저자: <input type="text" name="bookauthor" /><br />
			<button onclick="this.form.submit();">등록</button>
		</form>
	</div>
</body>
</html>