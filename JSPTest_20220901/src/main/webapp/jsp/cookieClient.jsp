<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.net.URLEncoder" %>

<%
	// 클라이언트에게 전달한 쿠키들을 쿠키 배열로 받는다.
	Cookie[] cookies = request.getCookies();
	// 쿠키 배열의 크기를 구한다.
	int cookiesLength = cookies.length;
	// 쿠키가 있다면
	if (cookies!=null && cookiesLength>0) {
		// 쿠키 배열의 크기만큼 반복한다.
		for (int i=0; i<cookiesLength; i++) {
			// 쿠키명과 쿠키값을 출력해본다.
			out.print("쿠키명: " + cookies[i].getName());
			out.print(", 쿠키값: " + cookies[i].getValue() + "<br />");
			
			// 쿠키명이 name이면 쿠키값을 변경한다.(같은 쿠키명의 새로운 쿠키를 생성한다.)
			if (cookies[i].getName().equals("name")) {
				Cookie cookie = new Cookie("name", URLEncoder.encode("변경된 name 쿠키의 값","utf-8"));
				// 변경된 쿠키값을 확인한다.
				out.print("쿠키명: " + cookie.getName());
				out.print(", 변경된 쿠키값: " + cookie.getValue() + "<br />");
				
				// 쿠키를 삭제할 때는 setMaxAge(0)
				cookie.setMaxAge(0);
				
				// 쿠키 도메인 설정
				cookie.setDomain("www.abc.com");	// 해당 쿠키는 abc.com 도메인의 www 호스트만 발행된다.
				cookie.setDomain(".abc.com");	// 해당 쿠키는 abc.com 도메인의 모든 호스트에 발행된다.
				
				// 쿠키 경로 설정
				cookie.setPath("/path1");	// 해당 쿠키는 /path1에 발행된다.
				cookie.setPath("/path1/path2");	// 해당 쿠키는 /path1/path2에 발행된다.
			}
		}
	} else {
		out.print("쿠키가 없어요!");
	}
%>