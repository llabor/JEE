<%@ page import = "util.JuegoNumBean" %>
<jsp:useBean id="numg" class="util.JuegoNumBean" scope="session" />
<jsp:setProperty name="numg" property="*" />
<html>
    <head><title>Juego del n&uacute;mero</title></head>
    <body bgcolor="white">
        <font size=4>
            <% if (numg.getExito() ) { %>
            Muy bien! Has acertado en <%= numg.getNumIntentos() %> veces.<p>
            <% numg.reset(); %>
            ¿Quieres jugar <a href="JuegoNum.jsp">otra vez</a>?
            <% } else if (numg.getNumIntentos() == 0) { %>
            Bienvenido al Juego del n&uacute;mero.<p>
            He elegido un n&uacute;mero entre 1 y 100.<p>
            <form method=get>
                ¿Qu&eacute; n&uacute;mero es? 
                <input type=text name=guess>
                <input type=submit value="Intentar">
            </form>
            <% } else { %>
            Buen intento, pero no.. Prueba <b><%= numg.getPista() %></b>.
            Has intentado <%= numg.getNumIntentos() %> veces.
            He elegido un n&uacute;mero entre 1 y 100.<p>
            <form method=get>
                ¿Qu&eacute; n&uacute;mero es? 
                <input type=text name=guess>
                <input type=submit value="Intentar">
            </form>
            <% } %>
        </font>
    </body>
</html>