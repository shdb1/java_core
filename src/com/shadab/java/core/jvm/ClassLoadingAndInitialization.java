package com.shadab.java.core.jvm;

public class ClassLoadingAndInitialization {
	
	/*What java Says:
	 * 
	 * https://docs.oracle.com/javase/specs/jvms/se7/html/jvms-5.html
	 * 
	 * http://openjdk.java.net/groups/hotspot/docs/RuntimeOverview.html#VM%20Class%20Loading%7Coutline
	 * 
	 * http://www.onjava.com/pub/a/onjava/2005/01/26/classloading.html
	 * 
	 * http://javarevisited.blogspot.in/2012/07/when-class-loading-initialization-java-example.html#ixzz2ZHoZKA48
	 * 
	 * https://www.youtube.com/watch?v=-zRp8xMvO_M
	*/
	
	
	public static void main(String args[]) throws InterruptedException {
          NotUsed o = null; //this class is not used, should not be initialized
          Thread.sleep(100000);
         Child t = new Child(); //initializing sub class, should trigger super class initialization
         System.out.println("object created for child going to sleep");
         Thread.sleep(10000);
         System.out.println((Object)o == (Object)t);
    }
}

/**
 * Super class to demonstrate that Super class is loaded and initialized before Subclass.
 */
class Parent {
    static { System.out.println("static block of Super class is initialized"); }
    
    {System.out.println("non static blocks in super class is initialized");}
    
    public Parent(){
    	System.out.println("parent constructor");
    }
}

/**
 * Java class which is not used in this program, consequently not loaded by JVM
 */
class NotUsed {
    static { System.out.println("NotUsed Class is initialized "); }
}

/**
 * Sub class of Parent, demonstrate when exactly sub class loading and initialization occurs.
 */
class Child extends Parent {
	public Child(){
		System.out.println("sublclass constructor");
	}
    static { System.out.println("static block of Sub class is initialized in Java "); }
    {System.out.println("non static blocks in sub class is initialized");}
}