<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="coordinator.obj">Home</a><br/>
<a href="coControllertProgramMaintenance.obj">Back</a> |<a href="loginControllerindex.obj">Logout</a>
<table>
	<tr>
	<td>Training Code</td>
	<td>Course Code</td>
	<td>Faculty Code</td>
	<td>Start Date</td>
	<td>End Date</td>
	</tr>
	<c:forEach items="${trainingDetailsList }" var ="training">
	<tr>
	<td>${training.trainingCode}</td>
	<td>${training.courseCode}</td>
	<td>${training.facultyCode}</td>
	<td>${training.startDate}</td>
	<td>${training.endDate}</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>