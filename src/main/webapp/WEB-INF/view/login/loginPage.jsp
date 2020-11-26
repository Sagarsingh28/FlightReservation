<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<h1>Login Page</h1>
<form:form action="loginCheck" method="POST">
<pre>
	Email Id: <input type="text" name="emailId" placeholder="Your Email ID">
	Password: <input type="password" name="password" placeholder="Your Password"><br>
		<input type="submit" value="Login">
</pre>
	
</form:form>
<h4>${msg}</h4>
</body>
</html>