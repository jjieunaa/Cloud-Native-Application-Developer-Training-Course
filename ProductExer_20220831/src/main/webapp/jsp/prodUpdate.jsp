<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="product.Product"%>    
    
<%
	String prodNo = request.getParameter("prodNo");
	Product product = (Product)application.getAttribute(prodNo);
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form name="prodUpdateForm" action="prodUpdateProc.jsp">
<div>
	제품번호 : <input type="text" name="prodNo" value="<%=product.getProdNo()%>" /> <br/>
	제품명 : <input type="text" name="prodName" value="<%=product.getProdName()%>" /> <br/> 
	입고일시 : <input type="text" name="prodDate" value="<%=product.getProdDate()%>" /> <br/>
	재고수량 :  <input type="text" name="prodQuan" value="<%=product.getProdQuan()%>" /> <br/>
	<button onclick="this.form.submit();">수정</button>
</div>
</form>
</body>
</html>