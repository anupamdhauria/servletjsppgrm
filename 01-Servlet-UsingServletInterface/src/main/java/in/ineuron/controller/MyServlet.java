package in.ineuron.controller;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
public class MyServlet implements Servlet {
	
	private ServletConfig config=null;
	
	static {
		System.out.println("MyServlet.class is loading");
	}
	
	
	public MyServlet() {
		System.out.println("MyServlet Object is creating");
	}

//	life cycle method
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config=config;
		System.out.println("object is Instantiating with config value");
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		System.out.println("service method is running..");
		res.setContentType("text/html");
		
		PrintWriter out = res.getWriter();
		out.println("<h1>Hey Servlet Boy</h1>");
		
	}

	@Override
	public void destroy() {
		System.out.println("Object is destroying..");
	}

	//non life cycle methods
	@Override
	public ServletConfig getServletConfig() {
		return this.config;
	}

	@Override
	public String getServletInfo() {
		return "servlet information";
	}



}
