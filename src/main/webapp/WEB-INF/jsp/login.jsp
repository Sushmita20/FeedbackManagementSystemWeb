<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<head>
<style>
.header {

  overflow: hidden;
  left: 60%;
  bottom: 75%;
  width: 100%;
  padding: 30px ;
}

.footer{
 position: fixed;
   left: 0;
   bottom: 0;
   width: 100%;
   background-color: hsla(0, 100%, 30%, 0.3);
   opacity:0.8;
   color: black;
   text-align: left;
   padding: 5px;
}

.credentials{
  position: fixed; 
  top: 40%;
  left: 40%;
}

tr,td
{
    padding: 5px;
}

.w3-container {
  position: fixed; /* or absolute */
  top: 65%;
  left: 44.5%;
}
.errormsg{
color: red;
}

</style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login user</title>
</head>
<body background="<c:url value="resources/images/globe.jpg" />">

<div class="header">
 <center><img src="<c:url value="resources/images/logo.jpg"/>" alt="message"></center>
</div>

<div class="footer">
 <p><strong>Contact info: customercare@globaldata.com</strong></p>
</div>

<div class="credentials"><center>
	<h1 align="center">
		User Login 
	</h1>


	<c:url var="myAction" value="loginControllervalidateLogin.obj" />
	<form:form method="post" modelAttribute="employee" action="${myAction}" >
		<table align="center">
			
			<tr>
				<td>UserId : </td>
				<td><form:input  path="employeeId" Required = "Required"/></td>
				<td>
					<span style="color:red">
						<form:errors path="employeeId" ></form:errors>
					</span>
				</td>
			</tr>
			<tr>
				<td>Password : </td>
				<td><form:input path="password" Required = "Required"/></td>
				<td>
					<span style="color:red">
						<form:errors path="password"></form:errors>
					</span>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="left"><input type="submit" class="w3-button w3-black"
					value="Login" /></td>
			</tr>
		</table>
		</form:form>
		</center>
		</div>
		<div class= "errormsg">
		<c:if test="${errMessage ne null }">
		<center><strong>${errMessage}</strong></center>
		</c:if>
		</div>
	
</body>
</html>