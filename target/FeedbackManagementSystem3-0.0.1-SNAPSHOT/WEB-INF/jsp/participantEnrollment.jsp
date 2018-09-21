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
</head>
<body>
	<a href="coordinator.obj">Home</a> |<a href="loginControllerindex.obj">Logout</a>
	<hr>

	<center>
		<h2>Participant Enrollment</h2>
		<div>
			<form:form modelAttribute="participant" action="savecoControllerparticipantEnroll.obj"   method="post">
				<table >

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
			<span style="color: red; font-size: 30px;">${msg}</span>
		</center>
		<%-- <c:if test="${flag eq true }">
			<h2>Participant Enrolled Successfully</h2>
		</c:if> --%>
	</center>
</body>
</html>