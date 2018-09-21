<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Faculty Skill List</title>
</head>
<body>
 
	<a href="admin.obj">Home</a> |<a href="loginControllerindex.obj">Logout</a><br/>

<table border="2px" align="center">
	<tr>
	<td>Faculty Id</td>
	<td>Skill Set</td>
	</tr>
	<c:forEach items="${facultySkillList }" var ="faculty">
	<tr>
	<td>${faculty.facultyId}</td>
	<td>${faculty.skillSet}</td>
	</tr>
	</c:forEach>
	</table>
</body>
</html>