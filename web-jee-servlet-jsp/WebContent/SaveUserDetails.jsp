<jsp:useBean id="user" class="user.UserData" scope="session"/>
<jsp:setProperty name="user" property="*"/> 
<!-- Se redirige la página a GetUserDetails.jsp -->
<jsp:forward page="GetUserDetails.jsp"/>
<!-- También se puede usar la acción jsp:include en vez de jsp:forward
	<jsp:include page="GetUserDetails.jsp"></jsp:include> -->