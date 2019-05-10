<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jstl/core"  prefix="c"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<title>Trainer Pool  Management</title>
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
ul{
	list-style-type:none;
	margin:0px;
	padding:0px;
	overflow:hidden;
	background-color:orange;
	border-radius: 20px;
	
	}
li {
float:left;
}
li a{
	display:block;
	color:black;
	text-align:center;
	padding:16px;
	text-decoration:none;
	margin:5px;
	width:70px;
}
li a:hover{
	background-color:lightgray;
	border-radius: 20px;
	
}
span.note{
font-size:120%;
color:red;
}
footer {
  background-color: orange;
  border-radius: 20px;
  padding: 3px;
  margin:15px;
  text-align: center;
  color: white;

}


</style>
</head>
<meta name="viewport" content="width=device-width,initial-scale=1.0">   
<body>
	<h1 style="text-align:center">Trainer <span style="color:red">Pool</span>Management</h1>
<ul>
	<li><a href="#home">Home</a></li>
	<li><a href="#course">Course</a></li>
	<li><a href="#career">Career</a></li>
	<li><a href="#about">About</a></li>
	<li><a href="#contact">Contact</a></li>
</ul>
<h3>Login Form</h3>
<h5 style="color:red;text-align: center">${result }<h5></h5>
<form:form method="POST"  modelAttribute="strCmd">
 
<table align="center" cellpadding = "10">
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
 
<!------------Login------------------------------->
<tr>
<td colspan="2" align="center">
<input type="submit" value="Login">
<input type="reset" value="Reset">
</td>
</tr>
</table>
 
</form:form>

<h4 style="text-align:center">New User Signup here:<a href="signup_page.htm">signup</a> </h4>

<footer>
  <p>@All Rights are Reserved</p>
</footer>

</body>

</html>