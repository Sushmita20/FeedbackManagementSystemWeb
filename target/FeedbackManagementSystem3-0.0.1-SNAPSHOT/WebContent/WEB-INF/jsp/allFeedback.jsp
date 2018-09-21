<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<a href="adminControllerviewFeedbackReport.obj">Back</a> |<a href="loginControllerindex.obj">Logout</a>

<h1>All Training Program Report</h1>

		<c:if test="${feedbackList ne null}">
			<table border="2px">
				<tr>
					<th rowspan="2">S.no</th>
					<th rowspan="2">Date</th>
					<th rowspan="2">Training</th>
					<th rowspan="2">Faculty Name</th>
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

</body>
</html>