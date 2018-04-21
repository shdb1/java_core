package com.shadab.java.core.systemclass;
/**
 * @author Mohammad Shadab
 */

public class SystemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// prints the name of the system property
		System.out.println(System.getProperty("user.dir"));

		// prints the name of the Operating System
		System.out.println(System.getProperty("os.name"));

		// prints Java Runtime Version
		System.out.println(System.getProperty("java.runtime.version"));
		
		// get All properties
		System.out.println(System.getProperties());
	}

}
