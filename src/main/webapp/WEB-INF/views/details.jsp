<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>${fermi.fermi_title}</title>
	<script src="//cdn.ckeditor.com/4.11.1/standard/ckeditor.js"></script>
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
	<h2>${fermi.fermi_title}</h2>
	<h3>Problem ${fermi.fermi_id}</h3>
	<table style="border: 1px solid black">
		<tr><td>${fermi.fermi_question}</td></tr>
	</table>
	
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
</body>
</html>