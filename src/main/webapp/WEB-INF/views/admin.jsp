<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Admin</title>
	<script src="//cdn.ckeditor.com/4.11.1/standard/ckeditor.js"></script>
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
	<c:if test="${sessionScope.user_id eq 'admin'}">
		<table>
			<tr>
				<td>id</td>
				<td>Title</td>
				<td>Register</td>
				<td>Like</td>
			</tr>
			<c:forEach var="fermi" items="${fermiList}">
				<tr>
					<td>${fermi.fermi_id}</td>
					<td>${fermi.fermi_title}</td>
					<td>${fermi.fermi_regdate}</td>
					<td>${fermi.fermi_like}</td>
				</tr>
			</c:forEach>
		</table>
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
	</c:if>
	<c:if test="${!(sessionScope.user_id eq 'admin')}">
		<h1><font color="red">관리자 모드</font></h1>
	</c:if>
</body>
</html>