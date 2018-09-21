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


	<c:url var="myAction" value="trainingviewTrainingDetailsId.obj" />
	<form:form method="post" modelAttribute="training" action="${myAction}">
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
				<td colspan="2" align="left"><input type="submit" value="View Training Details" /></td>
			</tr>
		</table>
	</form:form>
	<center><span style="color:red;font-size:30px;">${errmsg}</span></center>
	<c:if test="${flag eq true}">
		<center>
			<h3>Training Details</h3>
			<table>
	<tr>
	<td>Training Code</td>
	<td>Course Code</td>
	<td>Faculty Code</td>
	<td>Start Date</td>
	<td>End Date</td>
	</tr>
	
	<tr>
	<td>${training.trainingCode}</td>
	<td>${training.courseCode}</td>
	<td>${training.facultyCode}</td>
	<td>${training.startDate}</td>
	<td>${training.endDate}</td>
	</tr>
	
</table>
		</center>
	</c:if>
</body>
</html>