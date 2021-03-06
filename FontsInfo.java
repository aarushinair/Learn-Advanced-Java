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






š Hi, Iām @aarushinair - Aarushi Nair (she/her/ella)
š Iām a Computer Science Engineering Student
šļø Iām looking to collaborate on #java, #python, #R, #applicationdevelopment
š± #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
š« How to reach me: https://www.linkedin.com/in/aarushinair/
š©āš« YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
šā Follow me on Twitter: https://twitter.com/aarushinair_
