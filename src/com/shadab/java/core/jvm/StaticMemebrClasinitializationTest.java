package com.shadab.java.core.jvm;

/**
 * Another Java program example to demonstrate class initialization and loading in Java.
 */

public class StaticMemebrClasinitializationTest {

    public static void main(String args[]) throws InterruptedException {
  
       //accessing static field of Parent through child, should only initialize All Parent
       System.out.println(ChildClass.familyName);
    }
}
class GrandParentClass{
	
	
	static { System.out.println("static block of Grand Super class is initialized"); }
    {System.out.println("non static blocks in Grand super class is initialized");}
}
class ParentClass extends  GrandParentClass { 
//class ParentClass {
    //compile time constant, accessing this will not trigger class initialization
    //protected static final String familyName = "Lawson";
  
    protected static String familyName = "Lawson";
  
    static { System.out.println("static block of Super class is initialized"); }
    {System.out.println("non static blocks in super class is initialized");}
}
 class ChildClass extends ParentClass{
	 
	 static { System.out.println("static block of child class is initialized"); }
	    {System.out.println("non static blocks in child class is initialized");}
	 
 }


