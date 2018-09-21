<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<head>
<style>
body  {
    background-color: #cccccc;
}

.header {

  overflow: hidden;
  left: 60%;
  bottom: 75%;
  width: 100%;
  padding: 30px ;
}

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
.w3-container {
  position: fixed; /* or absolute */
  top: 65%;
  left: 44.5%;
}

.image{
position: fixed; /* or absolute */
  top: 45%;
  left: 45.75%;
}



</style>
</head>
<body background="<c:url value="resources/images/globe.jpg" />">


<div class="header">
 <center><img src="<c:url value="resources/images/logo.jpg"/>" alt="message"></center>
</div>


<div class="image">
	<img src="<c:url value="resources/images/human.png" />" alt="#" style="width:40%" style="height:40%">
</div>



<div class="footer">
 <p><strong>Contact info: customercare@globaldata.com</strong></p>
</div>

<div class="w3-container">
  <a href="loginControllerlogin.obj" class="w3-button w3-black">User Login</a>
</div>

</body>
</html> 
 
