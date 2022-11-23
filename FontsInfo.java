package com.CodeWithAarushi.graphics.example;

import java.awt.*;
import javax.swing.*;

public class FontsInfo
{
  JFrame frame;
  JTextArea textarea;

  FontsInfo()
  {
    frame = new JFrame();
    frame.setLayout(new FlowLayout());
    textarea = new JTextArea();
  
    String[] font = GraphicsEnvironment
    .getLocalGraphicsEnvironment()
   .getAvailableFontFamilyNames();
  
    String temp = "";
  
    for (String name : font)
    {  
      temp = temp + name+"\n";
    }   
  
    textarea.setText(temp);
  
    frame.add(textarea);
    frame.setTitle("Welcome to Java!.");
    frame.setSize(300,600);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

  public static void main(String[] args)
  {
    new FontsInfo(); 
  }
}










👋 Hi, I’m @aarushinair - Aarushi Nair (she/her/ella)
👀 I’m a Computer Science Engineering Student
💞️ I’m looking to collaborate on #java, #python, #R, #applicationdevelopment
🌱 #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
📫 How to reach me: https://www.linkedin.com/in/aarushinair/
👩‍🏫 YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
🙋‍ Follow me on Twitter: https://twitter.com/aarushinair_
