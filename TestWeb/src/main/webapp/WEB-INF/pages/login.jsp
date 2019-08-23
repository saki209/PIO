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
    <form:form action="action_page.php" method="post" commandName="personForm">
      
        <div class="container" align="center">
          <label for="uname"><b>Username</b></label>
          <input type="text" placeholder="Enter Username" name="uname" path="username" required>
        </div>
        <br>
        <div  align="center">
          <label for="psw"><b>Password</b></label>
          <input type="password" placeholder="Enter Password" name="psw" path="password" required>
        </div>
<br>
      <div  align="center">
        <pre>
      <button type="submit">Login</button>          <button type="submit">Singup</button>
        </pre>
        </div>
      <div align="center">
        <pre>
 <input type="checkbox" checked="checked" name="remember"> Remember me   <span class="psw"> <a href="#">Forgot password</a></span>
        <pre>
        </div>
      </form>
</body>
</html>