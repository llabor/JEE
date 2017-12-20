<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Request</title>
</head>
<body>
<%
    // This scriptlet declares and initializes "date"
    System.out.println( "Evaluando fecha ahora" );
    java.util.Date fecha = new java.util.Date();
%>
Hola! La hora es:
<%
    out.println( fecha );
    out.println( "<BR>La dirección IP de tu máquina según javax.servlet.http.HttpServletRequest es:" );
    out.println( request.getRemoteHost());
%>
</body>
</html>