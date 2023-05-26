<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@page import="java.util.List"%>
<%@page import="app_servlet.Users"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
table, td{
border:1px solid black;
}

table{
background: lightyellow;
font-family: arial;
box-shadow: 2px 2px 2px black;
}
th{
color: ciago;
}
body{
display: grid;
justify-content: center;
align-items: center;
}
</style>
</head>
<body>
       <%--
	 Users urs = (Users) request.getAttribute("lst");
	--%>

 <table>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Mobile</th>
		</tr>
         
          <% List<Users> list=(List<Users>) request.getAttribute("lst");
	         for(Users ur:list){
	      %>
	      	<tr>
			<td><%=ur.getId()%></td>
			<td><%=ur.getName()%></td>
			<td><%=ur.getPhone()%></td>
		</tr>
	      
	      <%
            }
	      %>

	
	</table> 
</body>
</html>