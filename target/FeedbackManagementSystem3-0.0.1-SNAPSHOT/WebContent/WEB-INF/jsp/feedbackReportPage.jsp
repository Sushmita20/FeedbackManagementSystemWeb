<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<c:if test="${admin eq true}">
<body><a href="admin.obj">Home</a>
</c:if>
<c:if test="${coordinator eq true}">
<body><a href="coordinator.obj">Home</a>
</c:if>
 <a href="loginControllerindex.obj">Logout</a>
	<hr>
	<table border="1" align="center">
		<tr><td><a href="feedbackviewAllFeedback.obj">View All Training Program Feedbacks</a></td></tr>
		<tr><td><a href="feedbackenterFeedbackByFaculty.obj">View Faculty-wise Feedback</a></td></tr>
		<tr><td><a href="feedbackdefaulterList.obj">View Defaulter Feedbacks</a></td></tr>
	</table>
</body>
</html>