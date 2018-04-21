package com.shadab.java.core.threads;
/**
 * @author Mohammad Shadab
 */
class FirstClass
{
 public void display(String msg)
 {
  System.out.print ("["+msg);
  try
  {
   Thread.sleep(1000);
  }
  catch(InterruptedException e)
  {
   e.printStackTrace();
  }
  System.out.println ("]");
 }
}

class SecondClass extends Thread
{
 String msg;
 FirstClass fobj;
 SecondClass (FirstClass fp,String str)
 {
  fobj = fp;
  msg = str;
  start();
 }
 public void run()
 {
  fobj.display(msg);
 }
}

public class NoSyncDemo
{
 public static void main (String[] args)
 {
	 FirstClass fnew = new FirstClass();
  SecondClass ss = new SecondClass(fnew, "welcome");
  SecondClass ss1= new SecondClass (fnew,"new");
  SecondClass ss2 = new SecondClass(fnew, "programmer");
 }
}
