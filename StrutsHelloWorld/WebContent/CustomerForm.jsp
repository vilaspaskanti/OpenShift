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

<s:form action="addcustomer.action" method="post">
<s:textfield name="name" key="label.name" />
<s:textfield name="age" key="label.age" />
<s:textfield name="email" key="label.email" />
<s:textfield name="phone" key="label.phone" />

<s:submit method="addCustomer" key="label.add"></s:submit>
</s:form>
</body>
</html>