<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<title>dailypdf</title>
</head>
<body>
	<form:form action="/TestWeb/dailypdf" method="post">
		<div align="center">
			<h1>Check your details and confirm</h1>
			<h3>firstnaem is : ${daily.firstname}</h3>
			<h3>Last name is : ${daily.lastname}</h3>
			<h3>S/O : ${daily.sonof}</h3>
			<h3>phone number is: ${daily.phnumber}</h3>
			<h3>address is : ${daily.address}</h3>
			<h3>loan amount is: ${daily.amount}</h3>
			<h3>interest is: ${daily.interest}</h3>
		</div>
		<div align="center">
			<button type="submit">generate PDF</button>
			<button type="submit" formaction="/TestWeb/giving" name="daily">edit</button>
		</div>

	</form:form>
</body>
</html>