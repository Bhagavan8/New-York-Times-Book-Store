package com.bhagavan.src;   
import java.io.*;  
    import java.sql.*;  
    import javax.servlet.ServletException;  
    import javax.servlet.http.*;  
      
    @SuppressWarnings("serial")
	public class Register extends HttpServlet {  
    public void doPost(HttpServletRequest request, HttpServletResponse response)  
                throws ServletException, IOException {  
      
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
              
    String n=request.getParameter("firstName");  
    String p=request.getParameter("lastName");  
    String e=request.getParameter("Email");  
    String c=request.getParameter("PhoneNumber");
    String pp=request.getParameter("Password");
    String d=request.getParameter("DOB");
    String g=request.getParameter("Gender");
    String a=request.getParameter("Address");
              
    try{  
		Class.forName("com.mysql.jdbc.Driver");
		 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/webpage","root","smart");
      
    
	PreparedStatement ps=connection.prepareStatement(  
    "insert into book values(?,?,?,?,?,?,?,?)");  
      
    ps.setString(1,n);  
    ps.setString(2,p);  
    ps.setString(3,e);  
    ps.setString(4,c);
    ps.setString(5,pp);  
      
    ps.setString(6,g);  
    ps.setString(7,a);
    ps.setString(8,d);
              
    int i=ps.executeUpdate();  
    if(i>0)  
    out.print("You are successfully registered...");  
          
              
    }catch (Exception e2) {System.out.println(e2);}  
              
    out.close();  
    }  
      
    } 