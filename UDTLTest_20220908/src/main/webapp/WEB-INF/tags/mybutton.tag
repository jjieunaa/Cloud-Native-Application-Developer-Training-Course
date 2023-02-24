<%@ tag body-content="empty" pageEncoding="utf-8" %>

<%@ attribute name="title" required="true" %>
<%@ attribute name="color" type="java.lang.String" %>
<%@ attribute name="newtitle" fragment="true" %>

<span style="font-size: 50; color:<%=color%>"><%=title%></span>
