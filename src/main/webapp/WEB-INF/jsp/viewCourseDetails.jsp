<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
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
.header {
  overflow: hidden;
  background-color: #f1f1f1;
  padding: 20px 10px;
}

.header a {
  float: left;
  color: black;
  text-align: center;
  padding: 12px;
  text-decoration: none;
  font-size: 18px; 
  line-height: 25px;
  border-radius: 4px;
}

.header a.logo {
  font-size: 25px;
  font-weight: bold;
}

.header a:hover {
  background-color: #ddd;
  color: black;
}

.header a.active {
  background-color: dodgerblue;
  color: white;
}

.header-right {
  float: right;
}

table{
 	position : fixed;
 	top : 25%;
 	left : 25%;
 	border-collapse: collapse;
 	border-radius : 25px;
 	width: 50%;
}
tr:nth-child(even){
		background-color: #f2f2f2;
}
th,td{
text-align: left;
padding: 8px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Course Details</title>
</head>
<body background="<c:url value="resources/images/globe.jpg" />">

<div class="header">
  <a href="#default" class="logo"><b>Global Data Solutions</b></a>
  <div class="header-right">
    <a href="admin.obj">Admin Home</a>
    <a class= "active" href="loginControllerindex.obj">Logout</a>
    <a class= "active" href="adminControllercourseMaintainance.obj">Back</a>
  </div>
</div>

<div class="footer">
 <p><strong>Contact info: customercare@globaldata.com</strong></p>
</div>

<!-- <a href="admin.obj">Home</a><br/>
<a href="adminControllercourseMaintainance.obj">Back</a> |<a href="loginControllerindex.obj">Logout</a> -->
<center>
<h2>Available Courses </h2>
</center>
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