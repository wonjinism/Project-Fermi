<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %> 
<%-- <%@ page session="false" %> --%>
<html>
<head>
	<title>Home</title>
	<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
	<style>
		#button_wrap {
			display: flex;
			justify-content: center;
			align-items: center;
		}
		#button_wrap a {
			display: inline-block;
			margin: 30px;
		}
	</style>
</head>

<body>
	<c:if test="${sessionScope.user_id != null}">
		<h1>${sessionScope.user_id}님 환영합니다.</h1>
	</c:if>
	<div id="button_wrap">
		<a href="recent" class="btn btn-primary">Recent</a>
		<a href="archive" class="btn btn-primary">Board</a>
		<a href="register" class="btn btn-primary">Register</a>
		<a href="signin" class="btn btn-primary">Sign In</a>
	</div>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
</body>
</html>
