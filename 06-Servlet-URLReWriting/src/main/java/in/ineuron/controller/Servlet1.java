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
		
		
		writer.println("WELCOME: "+name);
		writer.println("<a href='servlet2?user="+name+"'>GO TO SERVLET 2 </a>");
	}

}
