package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public class RegisterServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		String password = request.getParameter("password");

		PrintWriter writer = response.getWriter();
		if (name.isEmpty() || email.isEmpty() || mobile.isEmpty() || password.isEmpty()) {
			writer.println("<center>");
			writer.println("<h1 style='color:red;'>User Registration Failed</h1>");
			writer.println("</center>");
			RequestDispatcher rd = request.getRequestDispatcher("register.html");
			rd.include(request, response);

		} else {
			System.out.println(name+" "+email+" "+mobile+" "+password);
			request.setAttribute("name", name);
			request.setAttribute("email", email);
			request.setAttribute("mobile", mobile);
			request.setAttribute("password", password);
			RequestDispatcher rd = request.getRequestDispatcher("success");
			rd.forward(request, response);
		}
	}

}
