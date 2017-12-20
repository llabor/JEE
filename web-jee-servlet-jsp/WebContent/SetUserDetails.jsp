<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="user.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<jsp:useBean id="user" class="user.UserData" scope="session"/> 
<head>
	<title>Set name</title>
</head>
<body>
	Setting values...<br><br>
	<%
	user.setUsername("Tim");
	user.setEmail("ff@ff.com");
	user.setAge(22);
	%>
</body>
</html>
<jsp:include page="GetUserDetails.jsp"></jsp:include>
<!-- También se puede hacer así:
<jsp:forward page="GetUserDetails.jsp"></jsp:forward> -->