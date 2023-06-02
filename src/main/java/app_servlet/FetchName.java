package app_servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/sname")
public class FetchName extends HttpServlet{
	   
	
		protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			
			String name= req.getParameter("uname");
			
			 DataDao dao=new DataDao();
			 List<Users> users;
			     
			    users=  dao.fetch();

			    		req.setAttribute("lst",users);
			    		req.setAttribute("name", name);
//			    		res.setContentType("text/html ");
//			    		res.getWriter().print("<h1> all  Data Fetched  Successfully </h1>"
//			    				);
			    		req.getRequestDispatcher("Names.jsp").include(req, res);
			    		
			    	
			    	    
//			    	    if(student==null)
//			    	    {
//			    	    	resp.getWriter().print("<h1>Inavild email/mobile<h1>");
//			    	    }
//			    	    else{
//			    	    	if(student.getPassword().equals(password)){
////			    	      	  List <Student> std= dao.fetch();
//
//			    	    		req.setAttribute("stud", student);
//			    	    		req.setAttribute("list", dao.fetch());
//			    	    		resp.setContentType("text/html ");
//			    	    		resp.getWriter().print("<h1> Your Account Logged in Successfully </h1>"
//			    	    				);
//			    	    		req.getRequestDispatcher("loginResp.jsp").include(req, resp);
//			
		} 

}
