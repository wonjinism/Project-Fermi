<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Fermi Estimation</title>
	<script src="//cdn.ckeditor.com/4.11.1/standard/ckeditor.js"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
	<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
	<link href="resources/css/style.css" rel="stylesheet" /> 
	<script>
		function checkSubmit(event){
			event.preventDefault();
			var checkSubmit = confirm("등록하시겠습니까?");
			if(checkSubmit == true){
				document.getElementById("adminAction").submit();
			}
		}
	</script>
</head>
<body>
	<header id="button_wrap">
		<a href="about" class="btn btn-primary">About</a>
		<a href="recent" class="btn btn-primary">Recent</a>
		<a href="archive" class="btn btn-primary">Board</a>
		<a href="register" class="btn btn-primary">Register</a>
		<a href="signin" class="btn btn-primary">Sign In</a>
	</header>
	<section id="container">
		<table class="table table-striped table-bordered table-hover">
			<tr>
				<td>id</td>
				<td>Title</td>
				<td>Register</td>
				<td>Like</td>
			</tr>
			<c:forEach var="fermi" items="${fermiList}">
				<tr>
					<td>${fermi.fermi_id}</td>
					<td><a href="fermiDetails?fermi_id=${fermi.fermi_id}">${fermi.fermi_title}</a></td>
					<td>${fermi.fermi_regdate}</td>
					<td>${fermi.fermi_like}</td>
				</tr>
			</c:forEach>
		</table>

		<c:if test="${search ne null}">
			<a href="goPage?page=${navi.currentPage-1}&search=${search}">Prev</a>
			<c:forEach var="page" begin="${navi.startPageInGroup}" end="${navi.endPageInGroup}">
				<a href="goPage?page=${page}&search=${search}">${page}</a>
			</c:forEach>
			<a href="goPage?page=${navi.currentPage+1}&search=${search}">Next</a>
		</c:if>
		<c:if test="${search eq null}">
			<a href="goPage?page=${navi.currentPage-1}">Prev</a>
			<c:forEach var="page" begin="${navi.startPageInGroup}" end="${navi.endPageInGroup}">
				<a href="goPage?page=${page}">${page}</a>
			</c:forEach>
			<a href="goPage?page=${navi.currentPage+1}">Next</a>		
		</c:if>
	</section>
	
	
	<!-- 관리자 모드 -->
	<c:if test="${sessionScope.user_id eq 'admin'}">
		<section>
			<form id="adminAction" action="insertFermi" method="post">
				<input type="hidden" name="request" value="archive" />
				타이틀<input type="text" name="fermi_title" style="width: 50%"/><br />
				<textarea id="fermi_question" name="fermi_question" rows="10" cols="80"></textarea>
				<input type="submit" value="질문등록" onclick="checkSubmit(event)" />			
			</form>
	        <script>
				// Replace the <textarea id="editor"> with a CKEditor
				// instance, using default configuration.
				CKEDITOR.replace( 'fermi_question' );
	        </script>
        </section>
	</c:if>
	
	<form action="selectFermiList">
		<input type="hidden" name="page" id="page" />
		검색<input type="text" name="search" id="search" />
		<input type="submit" value="검색" />
	</form>

</body>
</html>