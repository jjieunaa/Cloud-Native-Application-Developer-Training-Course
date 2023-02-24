<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="mb" tagdir="/WEB-INF/tags"%>

<mb:sum begin="1" end="100">
	1~100까지의 합: ${sum}
</mb:sum>