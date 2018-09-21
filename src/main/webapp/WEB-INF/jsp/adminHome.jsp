<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
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
.logout {
  position: fixed; /* or absolute */
  top: 1%;
  left: 95%;
}
table{
 	border : 1;
 	position : fixed;
 	top : 40%;
 	left : 25%;
 	border-collapse: collapse;
 	border-radius : 25px 25px 25px 25px;
 	width: 50%;
}
tr:nth-child(even){
		background-color: #f2f2f2;
}
th,td{
text-align: center;
padding: 8px;
}

.w3-button w3-black {
    background-color: black;
    border: none;
    color: white;
    padding: 20px 40px;
    text-align: center;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
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


</style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Home</title>
</head>
<body background="<c:url value="resources/images/globe.jpg" />">

<div class="header">
  <a href="#default" class="logo"><b>Global Data Solutions</b></a>
  <div class="header-right">
    
    <a class= "active" href="loginControllerindex.obj">Logout</a>
  </div>
</div>

<br><br><br><br><br><br><br><br><br><br>

	<table border="1" align="center">
		<tr><td><a href="adminControllerskillMaintainance.obj" >Faculty Skill Maintenance</a></td></tr>
		<tr><td><a href="adminControllercourseMaintainance.obj" >Course Maintenance</a></td></tr>
		<tr><td><a href="adminControllerviewFeedbackReport.obj" >View Feedback Report</a></td></tr>
	</table>


	<div class="footer">
 	<p><strong>Contact info: customercare@globaldata.com</strong></p>
	</div>
</body>
</html>