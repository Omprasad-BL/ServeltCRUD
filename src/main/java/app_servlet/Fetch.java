package app_servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fetch")
public class Fetch extends HttpServlet{
	   
	
		protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			int  id=Integer.parseInt(req.getParameter("idnum"));
				
//			req.getRequestDispatcher("login.html").include(req, res);
			
			
			 DataDao dao=new DataDao();
			    Users user;
			    
			    
			        
			    	  user= dao.fetch(id);
			   
			   
			    if(user==null)
			    {
			    	res.getWriter().print("<h1>Inavild id entered <h1>");
			    }
			    else{
			    	if(user.getId()==id){
//			      	  List <Student> std= dao.fetch();

			    		req.setAttribute("usr", user);
//			    		req.setAttribute("list", dao.fetch());
			    		res.setContentType("text/html ");
			    		res.getWriter().print("<h1> Data Fetched  Successfully </h1>"
			    				);
				    	res.getWriter().print(user.getId());
				    	res.getWriter().print(user.getName());
				    	res.getWriter().print(user.getPhone());



//			    		req.getRequestDispatcher("loginResp.jsp").include(req, res);
			
			    	}
			    	
			    	}
		}

}
