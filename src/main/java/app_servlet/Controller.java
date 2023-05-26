package app_servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/signup")
public class Controller extends HttpServlet{
   
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("name");
		long phone=Long.parseLong(req.getParameter("phone"));
		
		Users users=new Users();
		users.setName(name);
		users.setPhone(phone);
		users.setPhone(Long.parseLong(req.getParameter("phone")));
		
			
		
		DataDao useraccess=new DataDao();
		useraccess.save(users);
		
		res.getWriter().print("<h1>Data saved succesfully</h1>");
//		req.getRequestDispatcher("login.html").include(req, res);
		
	}
}
