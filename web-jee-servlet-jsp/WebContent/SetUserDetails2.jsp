<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="user.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<jsp:useBean id="user" class="user.UserData" scope="session"/> 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Set name</title>
</head>
<body>

<form action="SaveUserDetails.jsp" method="post">
	Username:
	<input type="text" name="username"><br/>
	Email:
	<input type="text" name="email"><br/>
	Age:
	<input type="text" name="age"><br/>
	<input type=submit>
</form>
