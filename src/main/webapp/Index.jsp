<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<title>Insert title here</title>
</head>
<style>
	table{
		width:200px;
	}
	table button{
		width:100%;
		height:100%;
	}
</style>

<body>

<table border="1" align="center">

	<tr>
	
		<td> 
			<button id="create"> New Student </button>
		</td>
	
	</tr>

	<tr>
	
		<td> 
			<button id="read"> Student List </button>
		</td>
	
	</tr>

	<tr>
	
		<td> 
			<button id="delete"> Delete </button>
		</td>
	
	</tr>

	<tr>
	
		<td> 
			<button id="update"> Modify </button>
		</td>
	
	</tr>


</table>


	<script>
		$("#create").on("click",function(){
			location.href="create.jsp";
		})
		$("#read").on("click",function(){
			location.href="read.student";
		})
		$("#delete").on("click",function(){
			location.href="deleteList.student";
		})
		$("#update").on("click",function(){
			location.href="updatelist.student";
		})
	</script>


</body>
</html>