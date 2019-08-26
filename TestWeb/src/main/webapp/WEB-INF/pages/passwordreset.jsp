<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>password reset</title>
</head>
<body>
	<header>
		<div align="center">
			<h1>password reset form</h1>
		</div>
	</header>
	<Pre>

</Pre>
	<form:form action="/TestWeb/resetsucces"  modelAttribute="resetpassword">

		<div class="container" align="center">
			<form:label path="firstname"><b>first name</b></form:label> 
			<form:input type="text"	path="firstname" required="required"></form:input>
		</div>
		<br>
		<div align="center">
			<form:label path="lastname" ><b>last name</b></form:label> 
			<form:input type="text"	path="lastname" required="required"></form:input>
		</div>
		<br>
		<div align="center">
			<form:label path="phnumber"><b>mobile no.</b></form:label> 
			<form:input type="text" path="phnumber" required="required"></form:input>
		</div>
		<br>
		<div align="center">
			<form:label path="newpassword"><b>new Password</b></form:label>
			 <form:input type="password" path="newpassword" required="required"></form:input>
		</div>
		<br>
		<div align="center">
			<form:label path="reenternewpassword"><b>reenter new Password</b></form:label>
			<form:input type="password" path="reenternewpassword" required="required"></form:input>
		</div>
		<br>
		<div align="center">
			<pre>
      <button type="submit">reset</button>
        </pre>
		</div>

	</form:form>
</body>
</html>