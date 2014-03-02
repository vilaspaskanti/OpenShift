<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User's Comments</title>
</head>
<body>
Previous users Comments<br> 
<div style="float: right;"><a href="<s:url action='GuestEntry.action'/>" >Click here to sign in</a></div>
<s:iterator status="stats" value="messages">
<s:property value="#stats.count"/>.<br>
On:<s:property value="when"/>,<br>
<b><s:property value="guest"/>:</b>
<s:property value="message"/>!
<br><br>
</s:iterator>
<s:i18n name="ApplicationResources" id="text">

</s:i18n>

</body>
</html>