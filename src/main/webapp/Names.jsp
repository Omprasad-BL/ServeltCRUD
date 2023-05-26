<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@page import="java.util.List"%>
<%@page import="app_servlet.Users"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


   <%
        Users  name= (Users) request.getAttribute("name");
     %>
     
     <table border="1">
     
     <tr>
			<th>ID</th>
			<th>Name</th>
			<th>Mobile</th>
		</tr>
		
		<tr>
		  	<tr>
			<td><%=name.getId()%></td>
			<td><%=name.getName()%></td>
			<td><%=name.getPhone()%></td>
		</tr>
     
     </table>
     
      
<table>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Mobile</th>
		</tr>
         
          <% 

          List<Users> list=(List<Users>) request.getAttribute("lst");
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