package com.CodeWithAarushi.networking.example;

import java.net.*;

public class InetAddressDemo
{

  public static void main(String[] args) 
  {
   try
   { 
     InetAddress address = InetAddress.getLocalHost();
     System.out.println("Local host's address : "
                     + address);
     address = InetAddress.getByName("www.java.com");
     
     System.out.println("Java's address : "
                     + address);

     InetAddress[] allAddresses = InetAddress
          .getAllByName("www.java.com");
     
     for( int i=0 ; i < allAddresses.length ; i++)
       System.out.println("Address " + i+1 + " : "
                    + allAddresses[i]);
  }
   catch(UnknownHostException    e)
   {
      e.printStackTrace();
   }
 }   
}







š Hi, Iām @aarushinair - Aarushi Nair (she/her/ella)
š Iām a Computer Science Engineering Student
šļø Iām looking to collaborate on #java, #python, #R, #applicationdevelopment
š± #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
š« How to reach me: https://www.linkedin.com/in/aarushinair/
š©āš« YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
šā Follow me on Twitter: https://twitter.com/aarushinair_
