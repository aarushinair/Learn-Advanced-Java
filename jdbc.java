package com.CodeWithAarushi.jdbc.example;

import java.sql.*;
import java.io.*;

public class JdbcConnectivity
{
  public static void main(String[] args) throws SQLException
  {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    String userName = "root";
    String password = "sa";
    String url = "jdbc:mysql://localhost:3306/links";
    try
    {
      Class.forName("com.mysql.jdbc.Driver");
      conn = DriverManager.getConnection 
                            (url, userName, password);
      
      if(conn!=null)
        System.out.println("Connection successful..");
      
      stmt = conn.createStatement();
      rs = stmt.executeQuery("Select * from student");
      
      while(rs.next())
      {
       System.out.print("Roll Number = " + rs.getInt(3));
       System.out.print(" First Name = " + rs.getString(1));
       System.out.println(" Last Name = " + rs.getString(2));
      }
      
      conn.close();
    
    }
    catch(Exception e) 
    {
       System.out.println(e);}
    }
}   










š Hi, Iām @aarushinair - Aarushi Nair (she/her/ella)
š Iām a Computer Science Engineering Student
šļø Iām looking to collaborate on #java, #python, #R, #applicationdevelopment
š± #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
š« How to reach me: https://www.linkedin.com/in/aarushinair/
š©āš« YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
šā Follow me on Twitter: https://twitter.com/aarushinair_
