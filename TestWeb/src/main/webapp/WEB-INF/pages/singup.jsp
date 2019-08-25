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
    sing up form
  </h1>
</div>
</header>
<Pre>

</Pre>
    <form:form action="/TestWeb/successsingup" modelAttribute="formbean">
      
        <div  align="center">
          <form:label path="firstname"><b>first name</b></form:label>
          <form:input type="text" placeholder="Enter Username" path="firstname" required="required"></form:input>
        </div>
        <br>
        <div  align="center">
          <form:label path="lastname"><b>last name</b></form:label>
          <form:input type="password" placeholder="Enter Password" path="lastname" required="required"></form:input>
        </div>
        <br>
        <div  align="center">
          <form:label path="phnumber"><b>mobile no.</b></form:label>
          <form:input type="password" placeholder="Enter Password" path="phnumber" required="required"></form:input>
        </div>
        <br>
        <div  align="center">
          <form:label path="password"><b>password</b></form:label>
          <form:input type="password" placeholder="Enter Password" path="password" required="required"></form:input>
        </div>
        <br>
        <div  align="center">
          <form:label path="reenter" ><b>re enter Password</b></form:label>
          <form:input type="password" placeholder="Enter Password" path="reenter" required="required"></form:input>
        </div>
<br>
      <div  align="center">
        <pre>
      <button type="submit">sing up</button>
        </pre>
        </div>
    
      </form:form>
</body>
</html>