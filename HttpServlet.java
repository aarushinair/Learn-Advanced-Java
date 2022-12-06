package com.CodeWithAarushi.servlet.example;

import java.io.*; 
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloWorld extends HttpServlet 
{
  public void doGet(HttpServletRequest request, 
          HttpServletResponse response) 
          throws ServletException, IOException 
{
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("

Hello World

"); 
  }
}



👋 Hi, I’m @aarushinair - Aarushi Nair (she/her/ella)
👀 I’m a Computer Science Engineering Student
💞️ I’m looking to collaborate on #java, #python, #R, #applicationdevelopment
🌱 #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
📫 How to reach me: https://www.linkedin.com/in/aarushinair/
👩‍🏫 YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
🙋‍ Follow me on Twitter: https://twitter.com/aarushinair_
