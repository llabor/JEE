<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mezclando Java y HTML</title>
</head>
<body>
<table border=2>
<%
    for ( int i = 0; i < 10; i++ ) {
        %>
        <TR>
        <TD>N�mero:</TD>
        <TD><%= i+1 %></TD>
        </TR>
        <%
    }
%>
</table>
</body>
</html>