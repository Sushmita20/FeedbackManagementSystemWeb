<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
.abc{
position : fixed;
 	top : 50%;
 	left : 25%;
}
</style>
</head>
<body background="<c:url value="resources/images/globe.jpg" />">
<div class="footer">
 <p><strong>Contact info: customercare@globaldata.com</strong></p>
</div>

<div class="header">
  <a href="#default" class="logo"><b>Global Data Solutions</b></a>
  <div class="header-right">
    <a href="coordinator.obj">Coordinator Home</a>
    
   
    <a class= "active" href="loginControllerindex.obj">Logout</a>
  </div>
</div>

	<!-- <a href="coordinator.obj">Home</a> |<a href="loginControllerindex.obj">Logout</a>
	<hr>
 -->
	<center>
		<h2>Participant Enrollment</h2>
		<div>
			<form:form modelAttribute="participant" action="saveCoordinatorParticipantEnroll.obj"   method="post">
				<table class="abc" >

					<tr>
						<td>Select Participant Id:</td>
						<td><form:select path="participantId">

							<form:options items="${participantList}" />
						</form:select></td>
					</tr>

					<tr>
						<td>Select a training program:</td>
						<td><form:select path="trainingCode">
							
							<form:options items="${trainingCodeList}" />
						</form:select></td>
					</tr>
                   <tr>
				<td colspan="2" align="left"><input type="submit" value="Enroll Participant" /></td>
			</tr>

				</table>
			</form:form>
		</div>

		<center>
			<span style="color:green; font-size: 30px;">${msg}</span>
		</center>
		<%-- <c:if test="${flag eq true }">
			<h2>Participant Enrolled Successfully</h2>
		</c:if> --%>
	</center>
</body>
</html>