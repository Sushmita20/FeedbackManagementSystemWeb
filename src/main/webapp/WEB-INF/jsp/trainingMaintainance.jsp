<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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
 	top : 40%;
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
</head>
<body background="<c:url value="resources/images/globe.jpg" />">

<div class="header">
  <a href="#default" class="logo"><b>Global Data Solutions</b></a>
  <div class="header-right">
    <a  href="coordinator.obj">Coordinator Home</a>
    
   
    <a class= "active" href="loginControllerindex.obj">Logout</a>
  </div>
</div>



<div class="footer">
 <p><strong>Contact info: customercare@globaldata.com</strong></p>
</div>

<!-- <a href="coordinator.obj">Home</a> | <a href="logout.obj">Logout</a>
	<hr> -->
	<table border="1" align="center">
		<tr><td><a href="trainingenterTrainingDetails.obj">Add Training Program Details</a></td></tr>
		<tr><td><a href="trainingshowTrainingDetails.obj">View All Training Program Details</a></td></tr>
		<tr><td><a href="trainingenterTrainingDetailsId.obj">View Training Details By Id</a></td></tr>	
		<tr><td><a href="trainingenterTrainingUpdateDetails.obj">Update Training Details</a></td></tr>	
		<tr><td><a href="trainingenterTrainingDeleteDetails.obj">Delete Training Details</a></td></tr>	
	</table>
</body>
</html>