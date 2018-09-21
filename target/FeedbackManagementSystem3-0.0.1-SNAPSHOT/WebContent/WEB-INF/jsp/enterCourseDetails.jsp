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
<a href="admin.obj">Home</a><br/>
	<a href="adminControllercourseMaintainance.obj">Back</a> |<a href="loginControllerindex.obj">Logout</a>
	<hr>
	<h2 align="center">Enter Course Details</h2>

	<c:url var="myAction" value="coursesaveCourseDetails.obj" />
	<form:form method="post" modelAttribute="course" action="${myAction}">
		<table align="center">

			<tr>
				<td>Course Name:</td>
				<td align="left"><form:input path="courseName" required="required" Pattern="[a-zA-Z1-9]{1,15}"/></td>
				<td><form:errors path="courseName" cssStyle="color:red"></form:errors></td>
			</tr>
			<tr>
				<td>Duration :</td>
				<td align="left"><form:input path="noOfDays" required="required" Pattern="[1-9]{1,5}"/></td>
				<td><form:errors path="noOfDays" cssStyle="color:red"></form:errors></td>
			</tr>

			<tr>
				<td colspan="2" align="left"><input type="submit" value="Add Course" /></td>
			</tr>
		</table>
	</form:form>
	<center><span style="color:red;font-size:30px;">${errmsg}</span></center>
	<center><span style="color:green;font-size:30px;">${msg}</span></center>
	<%-- <c:if test="${flag eq true}">
		<center>
			<h3>Your course details have been added. Your course id is ${courseId}</h3>
		</center>
	</c:if> --%>
</body>
</html>