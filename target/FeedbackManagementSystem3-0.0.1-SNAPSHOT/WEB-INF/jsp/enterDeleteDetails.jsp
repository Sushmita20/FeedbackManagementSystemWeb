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


	<c:url var="myAction" value="coursesaveDeleteDetails.obj" />
	<form:form method="post" modelAttribute="course" action="${myAction}">
		<table align="center">

			<tr>
				<td>Enter Course Id:</td>
				<td align="left">
				<form:select path="courseId" >
				<form:options items="${ courseIdList }"/>
				</form:select>
				</td>
				<td><form:errors path="courseId" cssStyle="color:red"></form:errors></td>
			</tr>

			<tr>
				<td colspan="2" align="left"><input type="submit" value="Delete Course" /></td>
			</tr>
		</table>
	</form:form>
	<center><span style="color:green;font-size:30px;">${msg}</span></center>
	<%-- <c:if test="${flag eq true}">
		<center>
			<h3>Deleted Successfully</h3>
		</center>
	</c:if> --%>
</body>
</html>