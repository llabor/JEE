<jsp:useBean id="user" class="user.UserData" scope="session"/>
<jsp:setProperty name="user" property="*"/> 
<!-- Se redirige la p�gina a GetUserDetails.jsp -->
<jsp:forward page="GetUserDetails.jsp"/>
<!-- Tambi�n se puede usar la acci�n jsp:include en vez de jsp:forward
	<jsp:include page="GetUserDetails.jsp"></jsp:include> -->