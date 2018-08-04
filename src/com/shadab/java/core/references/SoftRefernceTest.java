package com.shadab.java.core.references;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/*soft reference object are cleaned only when application is about to die/ gonna give out of memory error
Means when really jvm need memory then only these types og objects are cleaned*/

public class SoftRefernceTest {

	public SoftRefernceTest() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
	// strong reference
	TestOnMe testOnMe = new TestOnMe();
	testOnMe.doNothing();
	SoftReference<TestOnMe> testOnMeSoftReference = new SoftReference<TestOnMe>(testOnMe);
	testOnMe.doNothing();
	// make object unreferenced,now object is available for GC .
	testOnMe=null;
	try {
		testOnMe.doNothing();
	} catch (Exception exception) {
		// TODO Auto-generated catch block
		System.out.println("NULL");
	}
	
	
	// But if we want we can revoke the object using get method
     System.gc(); 
	testOnMe = testOnMeSoftReference.get();
	 
		testOnMe.doNothing();
		System.out.println("Even GC Ran Object is available , because JVM has enough memory , Its in state to reach near out of memory error");
	    System.out.println("If you run this application with very small heap size then it may not be able to claim the object");
 }
	
}

	

