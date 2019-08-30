<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html>
<html>
<head>
    <title>sing up</title>
</head>
<body>
    <header>
  <div  align="center">
  <h1>
    monthly interest
  </h1>
</div>
</header>
<Pre>

</Pre>
    <form:form action="/ICWebApp/hello" modelAttribute="monthly">
      
        <div  align="center">
          <form:label path="firstname"><b>first name</b></form:label>
          <form:input type="text" placeholder="Enter Username" path="firstname" required="required"></form:input>
        </div>
        <br>
        <div  align="center">
          <form:label path="lastname"><b>last name</b></form:label>
          <form:input type="text" placeholder="Enter Password" path="lastname" required="required"></form:input>
        </div>
        <br>
        <div  align="center">
          <form:label path="phnumber"><b>mobile no.</b></form:label>
          <form:input type="text" placeholder="Enter Password" path="phnumber" required="required"></form:input>
        </div>
        <br>
        <div  align="center">
          <form:label path="address"><b>address</b></form:label>
          <form:input type="text" placeholder="Enter address" path="address" required="required"></form:input>
        </div>
        <br>
        <div  align="center">
          <form:label path="sonof" ><b>son of</b></form:label>
          <form:input type="text" placeholder="Enter FatherName" path="sonof" required="required"></form:input>
        </div>
		        <br>
		<div  align="center">
          <form:label path="amount" ><b>amount</b></form:label>
          <form:input type="text" placeholder="Enter Amount" path="amount" required="required"></form:input>
        </div>
		        <br>
		<div  align="center">
          <form:label path="interest" ><b>interestrate</b></form:label>
          <form:input type="text" placeholder="Enter InterestRate" path="interest" required="required"></form:input>
        </div>
<br>
      <div  align="center">
        <pre>
      <button type="submit">confirm</button>
        </pre>
        </div>
    
      </form:form>
</body>
</html>