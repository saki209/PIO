<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<title>sing up</title>
</head>
<body>
	<form:form action="/ICWebApp/pdf" method="post">
		<div align="center">
			<h1>Check your details and confirm</h1>
			<h3>firstnaem is : ${monthly.firstname}</h3>
			<h3>Last name is : ${monthly.lastname}</h3>
			<h3>S/O : ${monthly.sonof}</h3>
			<h3>phone number is: ${monthly.phnumber}</h3>
			<h3>address is : ${monthly.address}</h3>
			<h3>loan amount is: ${monthly.amount}</h3>
			<h3>interest is: ${monthly.interest}</h3>
		</div>
		<div align="center">
			<button type="submit">generate PDF</button>
			<button type="submit" formaction="/ICWebApp/hi">edit</button>
		</div>

	</form:form>
</body>
</html>