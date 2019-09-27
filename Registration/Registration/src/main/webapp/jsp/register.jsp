<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>

<form action="/register" method="post">
<label>Name :</label>
<input type="text" name="name" placeholder="name" required="required"><br>
<label>Technology :</label>
<input type="text" name="technology" placeholder="technology" required="required"><br>
<label>Address :</label>
<input type="text" name="address" placeholder="address" required="required"><br>

<input type="submit" value="Register">

</form>

</body>
</html>