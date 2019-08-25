<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
    
<html>
<head>
    <title>login page</title>
</head>
<body>
    <header>
  <div  align="center">
  <h1>
    interest calculater application
  </h1>
</div>
</header>
<Pre>

</Pre>
    <form:form action="/TestWeb/home" method="post" modelAttribute="person">
      
        <div class="container" align="center">
          <form:label path="username"><b>username</b></form:label>
          <form:input type="text"  path="username" required="required"></form:input>
        </div>
        <br>
        <div  align="center">
          <form:label  path="password"><b>Password</b></form:label>
          <form:input type="password"  path="password" required="required"></form:input>
        </div>
<br>
      <div  align="center">
        <pre>
      <button type="submit">Login</button>          <button type="submit" formaction="/TestWeb/singup">Singup</button>
        </pre>
        </div>
      <div align="center">
        <pre>
 <input type="checkbox" checked="checked" name="remember"> Remember me   <span class="psw"> <a href="/TestWeb/reset">Forgot password</a></span>
        <pre>
        </div>
      </form:form>
</body>
</html>