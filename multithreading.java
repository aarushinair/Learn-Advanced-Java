package com.CodeWithAarushi.multithreading.example ;

// Implementing Runnable Interface
class MyRunnable implements Runnable
{
// Implementing run method of Runnable
  public void run( )
  {
    for( int i = 1 ; I < = 5 ; i++ )
 System.out.println( " Message " + i ) ;
  }
}

public class RunnableTest
{
  public static void main( String[ ] args )
  {
    MyRunnable r = new MyRunnable( ) ;
    Thread t = new Thread( r ) ;
    System.out.println( t ) ; 
// starting the thread by start method which will
// call run method internally
    t.start( ) ;
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
