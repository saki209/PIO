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
<<<<<<< HEAD
    <form:form action="action_page.php" method="post" commandName="personForm">
      
        <div class="container" align="center">
          <label for="uname"><b>Username</b></label>
          <input type="text" placeholder="Enter Username" name="uname" path="username" required>
        </div>
        <br>
        <div  align="center">
          <label for="psw"><b>Password</b></label>
          <input type="password" placeholder="Enter Password" name="psw" path="password" required>
=======
    <form:form action="/TestWeb/home" method="post" modelAttribute="person">
      
        <div class="container" align="center">
          <form:label path="username"><b>username</b></form:label>
          <form:input type="text"  path="username" required="required"></form:input>
        </div>
        <br>
        <div  align="center">
          <form:label  path="password"><b>Password</b></form:label>
          <form:input type="password"  path="password" required="required"></form:input>
>>>>>>> 8d70f6abcfe282e00af0ed3cd7b1341ca501b503
        </div>
<br>
      <div  align="center">
        <pre>
<<<<<<< HEAD
      <button type="submit">Login</button>          <button type="submit">Singup</button>
=======
      <button type="submit">Login</button>          <button type="submit" formaction="/TestWeb/singup">Singup</button>
>>>>>>> 8d70f6abcfe282e00af0ed3cd7b1341ca501b503
        </pre>
        </div>
      <div align="center">
        <pre>
<<<<<<< HEAD
 <input type="checkbox" checked="checked" name="remember"> Remember me   <span class="psw"> <a href="#">Forgot password</a></span>
        <pre>
        </div>
      </form>
=======
 <input type="checkbox" checked="checked" name="remember"> Remember me   <span class="psw"> <a href="/TestWeb/reset">Forgot password</a></span>
        <pre>
        </div>
      </form:form>
>>>>>>> 8d70f6abcfe282e00af0ed3cd7b1341ca501b503
</body>
</html>