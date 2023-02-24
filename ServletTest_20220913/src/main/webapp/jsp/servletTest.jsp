<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<form action="/ServletTest_20220913/myServlet" method="post">
			<input type="hidden" name="name" value="강감찬" />
			<input type="hidden" name="age" value="50" />
			<button onclick="javascript:this.form.submit();">클릭</button>
		</form>
	</div>
</body>
</html>