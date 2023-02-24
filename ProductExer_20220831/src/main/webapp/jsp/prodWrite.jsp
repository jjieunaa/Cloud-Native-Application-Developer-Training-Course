<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form name="prodWriteForm" action="prodWriteProc.jsp">
<div>
	제품번호 : <input type="text" name="prodNo" /> <br/>
	제품명 : <input type="text" name="prodName" /> <br/> 
	입고일시 : <input type="text" name="prodDate" /> <br/>
	재고수량 :  <input type="text" name="prodQuan" /> <br/>
	<button onclick="this.form.submit();">등록</button>
</div>
</form>
</body>
</html>