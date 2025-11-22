package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		String name=request.getParameter("username");
		
		
		writer.println("<h1>WELCOME: "+name+"</h1>");
		HttpSession session = request.getSession();
		session.setAttribute("user", name);
		session.setMaxInactiveInterval(10);
		writer.println("<a href='servlet2'>Go to Servlet 2</a>");
	}

}
