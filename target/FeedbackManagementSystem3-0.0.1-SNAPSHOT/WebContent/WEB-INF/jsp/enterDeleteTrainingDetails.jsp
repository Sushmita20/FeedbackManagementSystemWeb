<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <a href="coordinator.obj">Home</a>
	<a href="coControllertProgramMaintenance.obj">Back</a> |<a href="loginControllerindex.obj">Logout</a>
	<hr>


	<c:url var="myAction" value="trainingsaveTrainingDeleteDetails.obj" />
	<form:form method="post" modelAttribute="trainingProgram" action="${myAction}">
		<table align="center">
<tr>
				<td>Enter Training Code:</td>
				<td align="left">
				<form:select path="trainingCode">
				<form:options items="${ trainingCodeList }"/>
				</form:select></td>
				<td><form:errors path="trainingCode" cssStyle="color:red"></form:errors></td>
			</tr>

			<tr>
				<td colspan="2" align="left"><input type="submit" value="Delete Training Details" /></td>
			</tr>
		</table>
	</form:form>
	<center><span style="color:red;font-size:30px;">${successMessage}</span></center>
	
</body>
</html>