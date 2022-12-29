package com.Sarvlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.*;
public class FirstSarvlet implements Servlet{

	ServletConfig config;
	
	@Override
	public void destroy() {
		System.out.println("Going to Distory......");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		
		return this.config;
	}

	@Override
	public String getServletInfo() {
		
		return "This servlet created by Adeep......";
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config = config;
		
		System.out.println("Createing Objects....");
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Servicing......");
		
	    res.setContentType("text/html");
	    PrintWriter out = res.getWriter();
	    out.println("<h1>This is my first project...</h1>");
	    out.println("<h1>Today is "+new Date().toString()+"</h1>");
		
	}

}
