package com.shadab.java.core.references;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;


/*1.We can’t get a referent of a phantom reference. 
The referent is never accessible directly through the API and
this is why we need a reference queue to work with this type of references.

2. The Garbage Collector adds a phantom reference to a
reference queue after the finalize method of its referent is
executed. It implies that the instance is still in the memory.
3.After GC Also they remains in memory so they are kind of ghosts .
*/
public class PhantomReferenceTest {

	public PhantomReferenceTest() {
		// TODO Auto-generated constructor stub
	}

public static void main(String[] args) throws IllegalArgumentException, InterruptedException {
	// strong reference
	TestOnMe testOnMe = new TestOnMe();
	testOnMe.doNothing();
 	testOnMe.doNothing();
	ReferenceQueue<TestOnMe> refQueue = new ReferenceQueue<TestOnMe>();
	 
    //Creating Phantom Reference to estOnMe object to which 'testOnMe' 
    //is also pointing.
    PhantomReference<TestOnMe> phantomRef = null;
     
    phantomRef = new PhantomReference<TestOnMe>(testOnMe,refQueue);
	
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
	testOnMe = phantomRef.get();  // always gives null , that the main difference between phantom and other(soft and weak) referrences
	try {
		testOnMe.doNothing();
		System.out.println("Since GC not Ran Object is available and could rescued");
	} catch (Exception exception) {
		// TODO Auto-generated catch block
System.out.println("Since GC ran Object Cleaned!!!");
 }
	
}


}
