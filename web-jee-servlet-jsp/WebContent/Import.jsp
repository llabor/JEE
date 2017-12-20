<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ page import="java.util.*" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Import ejemplo</title>
</head>
<body>
<%
    System.out.println( "Evaluando la fecha" );
    Date fecha = new Date();
%>
Hola! La hora es: <%= fecha %>
</body>
</html>