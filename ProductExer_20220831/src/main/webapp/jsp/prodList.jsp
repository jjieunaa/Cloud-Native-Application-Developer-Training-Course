<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.Enumeration"%>
<%@page import="product.Product"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
	<thead>
		<tr>
			<th>제품번호</th>
			<th>제품명</th>
			<th>입고일</th>
			<th>재고수량</th>
			<th>재고(+)</th>
			<th>재고(-)</th>
		</tr>
	</thead>
	
<%
	Enumeration prodNos =  application.getAttributeNames();
%>	
	
	<tbody>
<%
	while (prodNos.hasMoreElements()) {
		String prodNo = (String)prodNos.nextElement();
		Product product = null;
		if (application.getAttribute(prodNo) instanceof Product) {
			product = (Product)(application.getAttribute(prodNo));
			if (product!=null) {
%>	
		<tr>	
			<td><%=product.getProdNo()%></td>
			<td><a href="prodUpdate.jsp?prodNo=<%=product.getProdNo()%>"><%=product.getProdName()%></a></td>
			<td><%=product.getProdDate()%></td>
			<td><%=product.getProdQuan()%></td>
			<td>재고(+)</td>
			<td>재고(-)</td>
		</tr>
<%
			}
		}
	}
%>		
	</tbody>
	
</table>
<div>
	<button id="write" onclick="location.href='prodWrite.jsp';">제품등록</button>
</div>
</body>
</html>









