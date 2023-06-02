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

     
   
     <table border="1">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Mobile</th>
		</tr>
         
          <% 
          String  name= (String) request.getAttribute("name");

          List<Users> list=(List<Users>) request.getAttribute("lst");
	         for(Users ur:list){
	        	 if(ur.getName().equals(name)){
	    
	      %>
	      
	      	<tr>
			<td><%=ur.getId()%></td>
			<td><%=ur.getName()%></td>
			<td><%=ur.getPhone()%></td>
		</tr>
	      
	      <%
            }
	         }
	       
	      %>

	
	</table> 
     
      


</body>
</html>