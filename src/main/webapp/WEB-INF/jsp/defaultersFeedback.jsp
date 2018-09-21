
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
</head>
<body background="<c:url value="resources/images/globe.jpg" />">


<div class="header">
  <a href="#default" class="logo"><b>Global Data Solutions</b></a>
  <div class="header-right">
     <a class= "active" href="adminControllerviewFeedbackReport.obj">Back</a>
    <a class= "active" href="loginControllerindex.obj">Logout</a>
   
  </div>
</div>
 


<!-- <a href="adminControllerviewFeedbackReport.obj">Back</a> |<a href="loginControllerindex.obj">Logout</a> -->
<center><h1>Defaulters</h1></center>

		<c:if test="${feedbackList ne null}">
			<table border="2px">
				<tr>
					<th rowspan="2">S.no</th>
					<th rowspan="2">Date</th>
					<th rowspan="2">Training</th>
					<th rowspan="2">Participant Name</th>
					<th colspan="5">Feedback Scores</th>
					
				</tr>
				<tr>
					
					<th>Pres comm</th>
					<th>Clarify dbts</th>
					<th>TM</th>
					<th>Hand out</th>
					<th>Hw/Sw/ntwrk</th>
					
				</tr>
				<% int i=1; %>
				<c:forEach items="${feedbackList}" var="feedback">
					<tr>
					<th><%= i %><% i++; %></th>
					<th>${feedback.feedbackDate}</th>
					<th>${feedback.trainingCode}</th>
					<th>${feedback.participantName} </th>				
					<th>${feedback.fbPrsComm}</th>
					<th>${feedback.fbClrfyDbts}</th>
					<th>${feedback.fbTm}</th>
					<th>${feedback.fbHndOut}</th>
					<th>${feedback.fbHwSwNtwrk}</th>
					
				</tr>
				</c:forEach>
			</table>
		</c:if>
		
		<c:if test="${feedbackList eq null }">
			<strong>${err}</strong>
		</c:if>
<div class="footer">
 <p><strong>Contact info: customercare@globaldata.com</strong></p>
</div>

</body>
</html>