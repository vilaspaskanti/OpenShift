<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%response.sendRedirect("GuestEntry.action"); %>
<s:property value="message" default="Guest"/>
<s:form action="vilas.action" method="post">
<s:textfield name="username"  />

<s:submit method="execute"  />
</s:form>
</body>
</html>