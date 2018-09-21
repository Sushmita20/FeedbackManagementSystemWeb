<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script>
  $( function() {
    $( "#Startdatepicker" ).datepicker({
    	dateFormat: 'd-M-y'
    });
  } );
  </script>
   <script>
  $( function() {
    $( "#Enddatepicker" ).datepicker({
    	dateFormat: 'd-M-y'
    });
  } );
  </script>
</head>
<body>
 <a href="coordinator.obj">Home</a>
	<a href="coControllertProgramMaintenance.obj">Back</a> |<a href="loginControllerindex.obj">Logout</a>
	<hr>
	<h2 align="center">Enter Training Details</h2>

	<c:url var="myAction" value="trainingsaveTrainingDetails.obj" />
	<form:form method="post" modelAttribute="trainingProgram" action="${myAction}">
		<table align="center">
		
		<tr>
				<td>Course Code:</td>
				<td align="left">
				<form:select path="courseCode" required="required">
				
				<form:options items="${ courseIdList }"/>
				</form:select>
				</td>
				<td><form:errors path="courseCode" cssStyle="color:red"></form:errors></td>
		</tr>

		<tr>
				<td>Faculty Code:</td>
				<td align="left">
				<form:select path="facultyCode" required="required" >
				
				<form:options items="${ facultyCodeList }"/>
				</form:select>
				</td>
				<td><form:errors path="facultyCode" cssStyle="color:red"></form:errors></td>
		</tr>
		
			<tr>
				<td>Start Date :</td>
				<td align="left"><form:input path="startDate" id="Startdatepicker" required="required"/></td>
				<td><form:errors path="startDate" cssStyle="color:red"></form:errors></td>
			</tr>
            <tr>
				<td>End Date :</td>
				<td align="left"><form:input path="endDate" id="Enddatepicker" required="required"/></td>
				<td><form:errors path="endDate" cssStyle="color:red"></form:errors></td>
			</tr>
            
			<tr>
				<td colspan="2" align="left"><input type="submit" value="Add Training Details" /></td>
			</tr>
		</table>
	</form:form>
     <center><span style="color:red;font-size:30px;">${message}</span></center>  
</body>
</html>