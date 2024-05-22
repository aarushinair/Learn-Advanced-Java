package com.CodeWithAarushi.awtSwing.example;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CheckBoxItemListener implements ItemListener
{
  JFrame frame;
  JCheckBox checkBoxArray[] = new JCheckBox[3];
  JTextField textField;
  JLabel label;
  JPanel panel;
  CheckBoxItemListener()
  {
    frame = new JFrame("JCheckBox Event Handling");
    frame.setLayout(new GridLayout(3,1));
    panel = new JPanel();
    checkBoxArray[0] = new JCheckBox("Java"); 
    checkBoxArray[1] = new JCheckBox("C");
    checkBoxArray[2] = new JCheckBox("PHP");
    for(int i = 0; i<3; i++)
    {
       panel.add(checkBoxArray[i]);
       checkBoxArray[i].addItemListener(this);
    }
    textField = new JTextField(20);
    label = new JLabel("Select the Programming " +
         "Language you have used : ", JLabel.CENTER);
    frame.add(label);  
    frame.add(panel);   
    frame.add(textField);
    frame.pack();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  public void itemStateChanged(ItemEvent ie)
  {
    String message="You have used: "; 
    for(int i=0; i<3; i++)
    {
     if(checkBoxArray[i].isSelected())
       message += checkBoxArray[i].getText() + "  ";
    }
    textField.setText(message);
  }
  public static void main(String[] args)
  {
    new CheckBoxItemListener();
  }
}







/*
👋 Hi, I’m @aarushinair - Aarushi Nair (she/her/ella)
👀 I’m a Computer Science Engineering Student
💞️ I’m looking to collaborate on #java, #python, #R, #applicationdevelopment
🌱 #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
📫 How to reach me: https://www.linkedin.com/in/aarushinair/
👩‍🏫 YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
🙋‍ Follow me on Twitter: https://twitter.com/aarushinair_
*/
