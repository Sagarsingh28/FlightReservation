<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>REGISTER</h1>
<form:form action="registerProcess" method="POST">
	<pre>
	First Name: <input type="text" name="firstName" placeholder="First Name"/>
	Last Name: <input type="text" name="lastName" placeholder="Last Name"/>
	Email ID: <input type="text" name="emailId" placeholder="Email ID"/>
	Password: <input type="password" name="password" placeholder="Your Password"/>
	Confirm Password: <input type="password" name="confirmPassword" placeholder="Confirm Password"/>
	<br/>
	<input type="submit" value="Register">
	</pre>
	
</form:form>
<h4>${msg}</h4>
<hr>
<button onclick="window.location.href='showAllStudents'">All Students</button>
</body>
</html>