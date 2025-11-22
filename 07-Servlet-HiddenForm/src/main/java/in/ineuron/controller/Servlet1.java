package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		String name=request.getParameter("username");
		
		
		writer.println("<h1>WELCOME: "+name+"</h1>");
		writer.println("<form action='servlet2'>"+
				"<input type='hidden' name='user' value='"+name+"'/>"
				+"<input type='submit' value='Go to Servlet 2'</input>"
				+"</form>");
	}

}
