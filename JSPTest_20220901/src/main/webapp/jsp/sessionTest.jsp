<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	// 서버에서 생성한 세션을 획득
	HttpSession s = (HttpSession)request.getSession();
	
	// 3시간 동안 해당 세션을 유지
	s.setMaxInactiveInterval(60*60*3);
	
	// session에 속성 설정
	s.setAttribute("userid", "hong");	// String, Object
	s.setAttribute("userpwd", "1234");
	
	// session에서 속성명에 해당하는 속성값 획득
	String userid = (String)s.getAttribute("userid");
	String userpwd = (String)s.getAttribute("userpwd");
	
	out.print("userid: " + userid + ", userpwd: " + userpwd + "<br />");
	
	/* session 종료 (무효화) */
	// session이 null이 아니면
	if (s!=null) {
		
		// 세션 종료
		s.invalidate();
		
		// 에러코드 (세션 종료 후)
		session.invalidate();
		userid = (String)s.getAttribute("userid");
		userpwd = (String)s.getAttribute("userpwd");
		out.print("세션 종료 후 => userid: " + userid + ", userpwd: " + userpwd);
	}
%>