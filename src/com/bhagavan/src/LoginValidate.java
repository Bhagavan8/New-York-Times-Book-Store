package com.bhagavan.src;

	import java.io.IOException;  
	import java.io.PrintWriter;  
	  
	import javax.servlet.RequestDispatcher;  
	import javax.servlet.ServletException;  
	import javax.servlet.http.HttpServlet;  
	import javax.servlet.http.HttpServletRequest;  
	import javax.servlet.http.HttpServletResponse;  
	  
	  
	@SuppressWarnings("serial")
	public class LoginValidate extends HttpServlet {  
	public void doPost(HttpServletRequest request, HttpServletResponse response)  
	        throws ServletException, IOException {  
	  
	    response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	          
	    String e=request.getParameter("Email");  
	    String p=request.getParameter("Password");  
	          
	    if(Login.validate(e, p)){  
	        RequestDispatcher rd=request.getRequestDispatcher("Servlets");  
	        rd.forward(request,response);  
	    }  
	    else{  
	        out.print("Sorry username or password error");  
	        RequestDispatcher rd=request.getRequestDispatcher("book.html");  
	        rd.include(request,response);  
	    }  
	          
	    out.close();  
	    }  
	}