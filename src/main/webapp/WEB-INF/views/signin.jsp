<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Sign in</title>
	<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
	<link href="resources/css/style.css" rel="stylesheet" /> 
</head>
<body>
	<header id="button_wrap">
		<a href="about" class="btn btn-primary">About</a>
		<a href="recent" class="btn btn-primary">Recent</a>
		<a href="archive" class="btn btn-primary">Board</a>
		<a href="register" class="btn btn-primary">Register</a>
		<a href="signin" class="btn btn-primary">Sign In</a>
	</header>
	<section>
		<h1>로그인</h1>
		<form id="loginAction" action="loginUser" method="post">
			id:<input type="text" name="user_id" value="${user_id}"/><font color="red">${id_warning}</font><br />
			pw:<input type="password" name="user_password" /><font color="red">${pw_warning}</font><br />
			<input type="submit" value="Sign in"/>
		</form>
	</section>
	
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
</body>
</html>