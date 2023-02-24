<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

 <jsp:useBean id="product" class="product.Product" />
 <jsp:setProperty name="product" property="*"/>
 
 <%
 	application.setAttribute(product.getProdNo(), product);
 %>
 
 <jsp:forward page="prodList.jsp" />