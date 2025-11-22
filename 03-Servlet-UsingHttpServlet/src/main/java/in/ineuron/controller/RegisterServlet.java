package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public class RegisterServlet extends HttpServlet {


	private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String mobile=request.getParameter("mobile");
		String password=request.getParameter("password");
		
		PrintWriter writer = response.getWriter();
		writer.println("<center>");
		writer.println("<center><h1>User Details</h1></center><br/>");
		writer.println("<table>");
		writer.println("<tr><td>NAME:</td><td>"+name+"</td></tr>");
		writer.println("<tr><td>EMAIL:</td><td>"+email+"</td></tr>");
		writer.println("<tr><td>MOBILE:</td><td>"+mobile+"</td></tr>");
		writer.println("<tr><td>PASSWORD:</td><td>"+password+"</td></tr>");
		writer.println("</center>");
	}

}
