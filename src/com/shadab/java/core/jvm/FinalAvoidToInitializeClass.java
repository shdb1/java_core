package com.shadab.java.core.jvm;

/**
 * Another Java program example to demonstrate class initialization and loading in Java.
 */

public class FinalAvoidToInitializeClass {

    public static void main(String args[]) throws InterruptedException {
  
       //accessing static field of Parent through child, should only initialize Parent
       System.out.println(ChildOne.familyName);
    }
}

 class ParentOne {
    //compile time constant, accessing this will not trigger class initialization
    //protected static final String familyName = "Lawson";
  
    protected static final String familyName = "Lawson";
  
    static { System.out.println("static block of Super class is initialized"); }
    {System.out.println("non static blocks in super class is initialized");}
}
 class ChildOne extends ParentOne{
	 
	 static { System.out.println("static block of child class is initialized"); }
	    {System.out.println("non static blocks in child class is initialized");}
	 
 }


