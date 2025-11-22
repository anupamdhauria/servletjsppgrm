package in.ineuron.controller;
import java.io.*;
import jakarta.servlet.http.*;
public class MyServlet extends HttpServlet {
	

	private static final long serialVersionUID = 1L;
	
	static {
		System.out.println("MyServlet.class is loading");
	}
	
	
	public MyServlet() {
		System.out.println("MyServlet Object is creating");
	}
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter writer = res.getWriter();
		writer.println("<h1>Welcome to HttpServlet </h1>");
	}



}
