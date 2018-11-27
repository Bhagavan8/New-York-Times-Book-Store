package com.bhagavan.src;
import java.sql.*;  

public class Login {  
public static boolean validate(String email,String pass){  
boolean status=false;  
try{  
	Class.forName("com.mysql.jdbc.Driver");
	 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/webpage","root","smart");
      
PreparedStatement ps=connection.prepareStatement(  
"select Email,Password from book where Email=? and Password=?");  
ps.setString(1,email);  
ps.setString(2,pass);  
      
ResultSet rs=ps.executeQuery();  
status=rs.next();  
          
}
catch(Exception e)
{
	System.out.println(e);
}  
return status;  
}  
} 