<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
	<title>Login Page</title>
	<meta charset="utf-8">
	<link rel="stylesheet" href="./css/login.css" type="text/css" media="all" />
</head>

<body>
<div class="login-page">
  <div class="form">
	<form class="login-form" action="loginservlet" method="post">
		<input type="text" name="un" placeholder="username"/><br>
		<input type="password" name="pw" placeholder="password"/><br>
	<!-- <input type="submit" value="Enviar"> -->
		<button type="submit">login</button>
	</form>
	</div>
</div>
</body>
</html>