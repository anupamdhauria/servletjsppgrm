package in.ineuron.controller;

import java.io.*;
import jakarta.servlet.http.*;

public class SuccessServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse res) throws IOException {
		String name = (String) request.getAttribute("name");
		String email = (String) request.getAttribute("email");
		String mobile = (String) request.getAttribute("mobile");
		String password = (String) request.getAttribute("password");

		res.setContentType("text/html");
		PrintWriter writer = res.getWriter();
		writer.println("<center>");
		writer.println("<h1 style='color:green;'>User Registed Successfully</h1>");
		writer.println("</center>");
		writer.println("<hr/><br/><center>");
		writer.println("<center><h1>User Details</h1></center><br/>");
		writer.println("<table>");
		writer.println("<tr><td>NAME:</td><td>" + name + "</td></tr>");
		writer.println("<tr><td>EMAIL:</td><td>" + email + "</td></tr>");
		writer.println("<tr><td>MOBILE:</td><td>" + mobile + "</td></tr>");
		writer.println("<tr><td>PASSWORD:</td><td>" + password + "</td></tr>");
		writer.println("</center>");
	}

}
