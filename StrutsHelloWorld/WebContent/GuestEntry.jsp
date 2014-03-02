<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enter the Comments</title>
<script>
function setCooikiesValues()
{
	alert("Called ");
	document.cookie =
		  'Cookie=another test; expires=Fri, 3 Aug 2012 20:47:11 UTC; path=/';
	
}
</script>
</head>
<body>
Enter the Comments dear Guest
<s:form action="GuestView.action">
<s:textfield key="Enter you Name" name="guest"/>
<br/>
<s:textarea rows="5" cols="20" key="Enter your comments" name="message"/>
<s:hidden name="para" value="6"></s:hidden>
<s:submit value="Submit" />
<s:token name="clientToken"></s:token>
</s:form>
</body>
</html>