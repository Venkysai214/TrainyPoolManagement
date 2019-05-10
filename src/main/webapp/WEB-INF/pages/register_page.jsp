<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Registration Form</title>

</head>
<style>
h3{
  font-family: Calibri; 
  font-size: 25pt;         
  font-style: normal; 
  font-weight: bold; 
  color:SlateBlue;
  text-align: center; 
  text-decoration: underline
}

table{
  font-family: Calibri; 
  color:black; 
  font-size: 11pt; 
  font-style: normal;
  font-weight: bold;
  text-align:; 
  
}
table.inner{
  border: 0px
}
body{
  background-color:#f1f1c1;
}
</style>
 
<body>
<h3>REGISTRATION FORM</h3>
<form:form method="POST"  modelAttribute="strCmd">
 
<table align="center" cellpadding = "10">
 
<!----- First Name ---------------------------------------------------------->
<tr>
<td>FIRST NAME</td>
<td><form:input type="text" path="firstName" maxlength="30"/><form:errors  path="firstName"/>
(max 30 characters a-z and A-Z)
</td>
</tr>
 
<!----- Last Name ---------------------------------------------------------->
<tr>
<td>LAST NAME</td>
<td><form:input path="lastName" maxlength="30"/><form:errors  path="lastName"/>
(max 30 characters a-z and A-Z)
</td>
</tr>
<!----- Last Name ---------------------------------------------------------->
<tr>
<td>AGE</td>
<td><form:input path="age" maxlength="2"/><form:errors  path="age"/>
</td>
</tr>
 <!----- Gender ----------------------------------------------------------->
<tr>
<td>GENDER</td>
<td>
Male <input type="radio" name="Gender" value="Male" />
Female <input type="radio" name="Gender" value="Female" />
</td>
</tr>
<!----- Mobile Number ---------------------------------------------------------->
<tr>
<td>CONTACT NUMBER</td>
<td>
<form:input path="contactNo" maxlength="10"/><form:errors  path="contactNo" />
(10 digit number)
</td>
</tr>
 
<!----- USER Name ---------------------------------------------------------->
<tr>
<td>USER ID</td>
<td><form:input path="userId"  maxlength="30"/><form:errors  path="userId"/>
</td>
</tr>
 
<!----- PASSWORD ---------------------------------------------------------->
<tr>
<td>PASSWORD</td>
<td><form:password path="password"  maxlength="30"/><form:errors  path="password"/>
</td>
</tr>
 

<!----- Submit and Reset ------------------------------------------------->
<tr>
<td colspan="2" align="center">
<input type="submit" value="Submit">
<input type="reset" value="Reset">
</td>
</tr>
</table>
 
</form:form>
<h5 style="color:green;text-align: center">${registerResult }</h5>
 <h4 style="text-align:center"><a href="welcome.htm">Home</a> </h4>
</body>
</html>