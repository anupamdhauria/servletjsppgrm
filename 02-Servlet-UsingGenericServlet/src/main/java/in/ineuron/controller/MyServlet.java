package in.ineuron.controller;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
public class MyServlet extends GenericServlet {
	

	private static final long serialVersionUID = 1L;
	
	static {
		System.out.println("MyServlet.class is loading");
	}
	
	
	public MyServlet() {
		System.out.println("MyServlet Object is creating");
	}


	@Override
	public void service(ServletRequest req	, ServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter writer = res.getWriter();
		writer.println("<h1>Welcome to Generic Servlet </h1>");
		
	}


}
