<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login user</title>
</head>
<body>
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
				<td colspan="2" align="left"><input type="submit"
					value="Login" /></td>
			</tr>
		</table>
		</form:form>
		<c:if test="${errMessage ne null }">
		${errMessage}
		</c:if>
	
</body>
</html>