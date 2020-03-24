<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
<link rel="stylesheet" href="style.css">
</head>
<body>

	<div align="center" class="container">
		<h2>Login</h2>
		<s:form action="loginAction" class="loginForm">
			<s:textfield name="userName" label="User Name" class="formTextField"></s:textfield>
			<s:password name="password" label="Password" class="formTextField"></</s:password>
			<s:submit value="Login" class="actionBtn"></s:submit>
		</s:form>
	</div>

</body>
</html>