package com.CodeWithAarushi.collections.example;

import java.util.*;

public class ArrayListExample 
{
   public static void main(String args[]) 
   {
      ArrayList list = new ArrayList();
      
      System.out.println("Initial size of list :" +
        " " + list.size());
     
      list.add("A");
      list.add("B");
      list.add("C");
      list.add("D");
      list.add("E"); 
      list.add("F");
      list.add(1, "1");

      System.out.println("Size after addition :" +
        " " +list.size());

      System.out.println("Contents of list: " + list);
      
      for(Object str : list)
        System.out.println(str);
      
      list.remove("F");
      list.remove(2);

      System.out.println("Size of after deletion : "
                + list.size());
      System.out.println("Contents of list : " + list);
 } 
}



👋 Hi, I’m @aarushinair - Aarushi Nair (she/her/ella)
👀 I’m a Computer Science Engineering Student
💞️ I’m looking to collaborate on #java, #python, #R, #applicationdevelopment
🌱 #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
📫 How to reach me: https://www.linkedin.com/in/aarushinair/
👩‍🏫 YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
🙋‍ Follow me on Twitter: https://twitter.com/aarushinair_
