package com.shadab.java.core.references;

import java.lang.ref.WeakReference;

public class WeakReferenceTest {

	public WeakReferenceTest() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
	// strong reference
	TestOnMe testOnMe = new TestOnMe();
	testOnMe.doNothing();
	WeakReference<TestOnMe> testOnMeWeakReference = new WeakReference<TestOnMe>(testOnMe);
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
     System.gc();// switch on/off this line
	testOnMe = testOnMeWeakReference.get();
	try {
		testOnMe.doNothing();
		System.out.println("Since GC not Ran Object is available and could rescued");
	} catch (Exception exception) {
		// TODO Auto-generated catch block
System.out.println("Since GC ran Object Cleaned!!!");
}
	
}
}

class TestOnMe{
	public void doNothing() {
		System.out.println("I am Lazy!!!");
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("FINALIZED");
	}
}

