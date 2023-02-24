<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="beans.RegionBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="util.ConnectionManager" %>

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
			<th>RegionID</th>
			<th>RegionDescription</th>
		</tr>
	</thead>
	<tbody>
			
<%
	Connection conn = null;
	conn = ConnectionManager.getConnection();
	// out.print(conn);
	
	// 실습: Region 테이블의 데이터를 테이블에 출력하세요~
	
	// 하나의 행의 데이터는 RegionBean 객체 하나에 매핑
	// 여러행의 데이터를 저장할 리스트를 생성
	List<RegionBean> list = new ArrayList<RegionBean>();
	
	String sql = " select * from Region ";
	Statement stmt = conn.createStatement();
	ResultSet rs = stmt.executeQuery(sql);
	while (rs.next()) {
		// 행 데이터 1개 = 빈객체 하나
		RegionBean bean = new RegionBean();
		// 빈의 setter를 이용해서 각 컬럼의 값을 객체의 프라퍼티에 설정
		bean.setRegionID(rs.getInt("RegionID"));
		bean.setRegionDescription(rs.getString("regionDescription"));
		// 리스트에 빈을 저장
		list.add(bean);
		// 빈의 getter를 이용해서 컬럼의 값을 출력/연산
		out.print("<tr><td>" + bean.getRegionID() + "</td><td>"
				+ bean.getRegionDescription() + "</td></tr>");
	}
	out.print("</tbody></table>");
	
	// 닫아주자~
	if (rs!=null) rs.close();
	if (stmt!=null) stmt.close();
	if (conn!=null) conn.close();
%>

</body>
</html>