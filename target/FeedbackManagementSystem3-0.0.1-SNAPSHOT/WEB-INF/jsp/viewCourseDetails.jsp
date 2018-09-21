<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Course Details</title>
</head>
<body>
<a href="admin.obj">Home</a><br/>
<a href="adminControllercourseMaintainance.obj">Back</a> |<a href="loginControllerindex.obj">Logout</a>
<h3>Available Courses </h3>
<table border="2px" align="center">
	<tr>
	<td>Course Id</td>
	<td>Course Name</td>
	<td>Duration</td>
	</tr>
	<c:forEach items="${courseList}" var ="course">
	<tr>
	<td>${course.courseId}</td>
	<td>${course.courseName}</td>
	<td>${course.noOfDays}</td>
	</tr>
	</c:forEach>
	</table>

</body>
</html>