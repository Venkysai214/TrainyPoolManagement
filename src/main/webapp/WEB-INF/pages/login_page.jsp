<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<body style="background-color:#FCF3CF">
<h2 style="color:Tomato;text-align: center">Log In </h2>
<form:form method="POST"  modelAttribute="strCmd">
    UserId :: <form:input path="userId" /><form:errors  path="userId"/> <br><br>
    Password :: <form:password path="password"/><form:errors  path="password"/> <br><br>
  <input type="submit"   value="login"/><br>
 
</form:form>
<a href="signup_page.htm">signup</a> 
<br><br></body>

</html>
