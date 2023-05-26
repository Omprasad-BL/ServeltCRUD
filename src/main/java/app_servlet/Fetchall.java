package app_servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/fetching") 

public class Fetchall extends HttpServlet{
	   
	
		protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			
			
			 DataDao dao=new DataDao();
			 List<Users> user;
			     
			    user=  dao.fetch();

			    		req.setAttribute("lst", dao.fetch());
//			    		req.setAttribute("list", dao.fetch());
			    		res.setContentType("text/html ");
//			    		res.getWriter().print("<h1> all  Data Fetched  Successfully </h1>"
//			    				);
			    		req.getRequestDispatcher("Resp.jsp").include(req, res);
			
		}

}
