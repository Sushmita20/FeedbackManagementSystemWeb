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
	<a href="participant.obj">Home</a> |<a href="loginControllerindex.obj">Logout</a>
	<hr>
	<c:if test="${id eq true}">
		<c:url var="myAction" value="participantenterFeedbackForm.obj" />
		<form:form method="post" modelAttribute="feedback"
			action="${myAction}">
			<table align="center">
				<tr>
					<td>Enter Participant Id:</td>
					<td align="left"><form:input path="participantId" /></td>
					<td><form:errors path="participantId" cssStyle="color:red"></form:errors></td>
				</tr>
				<tr>
					<td colspan="2" align="left"><input type="submit" value="Next" /></td>
				</tr>
			</table>
		</form:form>
	</c:if>
	<c:if test="${form eq true}">
		<h2 align="center">Enter Feedback</h2>

		<c:url var="myAction" value="participantsaveFeedback.obj" />
		<form:form method="post" modelAttribute="feedback" action="${myAction}">
			<table align="left">

				<tr>
					<td>Training Code*:</td>
					<td align="left"><form:select path="trainingCode">
						<form:options items="${ trainingCodeList }" />
						</form:select>
						</td>
					<td><form:errors path="trainingCode" cssStyle="color:red"></form:errors></td>
				</tr>
				<tr>
					<td>Participant ID*:</td>
					<td align="left"><form:input path="participantId" required="required" /></td>
					<td><form:errors path="participantId" cssStyle="color:red"></form:errors></td>
				</tr>
				<tr>
					<td>Participant Name* :</td>
					<td align="left"><form:input path="participantName" required="required" /></td>
					<td><form:errors path="participantName" cssStyle="color:red"></form:errors></td>
				</tr>
			</table>
			<table border="1px" align="center">
				<tr>
					<th colspan="5">Feedback Scores</th>
				</tr>
				<tr>
					<th>PresComm*</th>
					<th>Clarify doubts*</th>
					<th>TM*</th>
					<th>Hand out*</th>
					<th>HwSwNtwrk*</th>

				</tr>
				<tr>
					<td><form:input path="FbPrsComm" value="0" />
						
					</td>
					<td><form:input path="FbClrfyDbts" value="0"  />
					
					</td>
					<td><form:input path="FbTm" value="0"  />
						
					</td>
					<td><form:input path="FbHndOut" value="0"  />
						
					</td>
					<td><form:input path="FbHwSwNtwrk" value="0"  /> 
					</td>
				</tr>
				<tr>
					<th><form:errors path="FbPrsComm" cssStyle="color:red"></form:errors></th>
					<th><form:errors path="FbClrfyDbts"	cssStyle="color:red"></form:errors></th>
					<th><form:errors path="FbTm" cssStyle="color:red"></form:errors></th>
					<th><form:errors path="FbHndOut" cssStyle="color:red"></form:errors></th>
					<th><form:errors path="FbHwSwNtwrk" cssStyle="color:red"></form:errors></th>

				</tr>
			</table>
			<table>
				<tr>
					<td>Comments</td>
					<td><form:textarea path="comments" rows="5" cols="30" /></td>
					<td>Suggestions</td>
					<td><form:textarea path="suggestions" rows="5" cols="30" /></td>
				</tr>
				<%-- <tr><td>Feedback Date :</td><td><form:input type="date" path="feedbackDate"/></td></tr> --%>
				<tr>
					<td colspan="2" align="left"><input type="submit" value="Submit" /></td>
				</tr>
			</table>
		</form:form>
	</c:if>
	<center>
		<span style="color: red; font-size: 30px;">${message}</span>
	</center>
	<c:if test="${flag eq true}">
		<center>
			<h3>Your Feedback has been submitted successfully.</h3>
		</center>
	</c:if>
</body>
</html>