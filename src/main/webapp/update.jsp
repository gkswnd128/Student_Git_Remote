<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<title>Insert title here</title>
</head>
<body>
     <table border 1px align=center>
        
        <tr>
        <th colspan = 8> Student List
        </tr>
        
        <tr>
           <th>rank
           <th>sid
           <th>name
           <th>kor
           <th>eng
           <th>math
           <th>sum
           <th>avg
        </tr>
    
           <c:forEach var ="i" item="${list }"> 
           <tr>
                <td>${i.rank}
				<td>${i.sid }
				<td>${i.name }
				<td>${i.kor }
				<td>${i.eng }
				<td>${i.math }
				<td>${i.kor + i.eng + i.math }
				<td><fmt:formatNumber value="${(i.kor+i.eng+i.math)/3.0 }"
						pattern=".0" /> 
           </tr>
                 
            </c:forEach>
           
           <tr>
           
             <td colspan=8>
              <form action="update.student">
					<input type=text name="sid" placeholder="Input sid to update">
					<input type=text name="name" placeholder="Input name to update">
					<input type=text name="kor" placeholder="Input kor to update">
					<input type=text name="eng" placeholder="Input eng to update">
					<input type=text name="math" placeholder="Input math to update">
					<button>Update</button>
				</form>
		</tr>
		<tr>
			<td colspan=8><button id="back">back</button>
		</tr>
	</table>
	
	<script>
		$("#back").on("click", function() {
			location.href = "index.jsp";
		})
	</script>
     
</body>
</html>