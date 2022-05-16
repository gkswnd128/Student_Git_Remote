<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<title>Insert title here</title>
</head>
<body>
	<form action="/add.student">
	<table border=1 align="center">
		<tr>
		<th> New Student</th>
		</tr>
		<tr>
			<td><input type=text name="name" placeholder="Student Name" required></td>
		</tr>
		<tr>
			<td><input type=text name="kor" placeholder="Korean Score" required></td>
		</tr>
		<tr>
			<td><input type=text name="eng" placeholder="English Score" required></td>
		</tr>
		<tr>
			<td><input type=text name="math" placeholder="Math Score" required></td>
		</tr>
		<tr>
			<td><button id="add">Add</button><button id="back">Back</button></td>
		</tr>
	</table>
	
	</form>
	
	<script>
		$("#back").on("click",function(){
			location.href="index.jsp";
		})
	</script>
	
</body>
</html>