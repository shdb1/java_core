package com.shadab.java.core.collections.map;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapTest {

	public WeakHashMapTest() {
		// TODO Auto-generated constructor stub
	}
	
	 public static void main(String args[])throws Exception
	    {
		 
		 WeakHashMapTest weakHashMapTest = new WeakHashMapTest();
		// weakHashMapTest.withouWeakHashMapDemo();
		 weakHashMapTest.withWeakHashMapDemo();
	    }
	 
	 public void withouWeakHashMapDemo() throws InterruptedException {
		 
		 HashMap m = new HashMap();
	        Demo d = new Demo();
	         
	        // puts an entry into HashMap
	        m.put(d," Hi "); 
	         
	        System.out.println(m); 
	        d = null;
	         
	        // garbage collector is called
	        System.gc();
	         
	        //thread sleeps for 4 sec
	        Thread.sleep(4000); 
	         
	        System.out.println(m);
	        }
	 
	 public void withWeakHashMapDemo() throws InterruptedException {
		 

	        WeakHashMap m = new WeakHashMap();
	        Demo d = new Demo();
	         
	        // puts an entry into WeakHashMap
	        m.put(d," Hi "); 
	        System.out.println(m);
	         
	        d = null;
	         
	        // garbage collector is called
	        System.gc(); 
	         
	        // thread sleeps for 4 sec
	        Thread.sleep(4000); 
	         
	        System.out.println(m);
	    
	 }
	}
	 
	class Demo
	{
	    public String toString()
	    {
	        return "demo";
	    }
	     
	    // finalize method
	    public void finalize()
	    {
	        System.out.println("finalize method is called");
	    }

}
