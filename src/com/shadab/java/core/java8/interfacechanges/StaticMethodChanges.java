package com.shadab.java.core.java8.interfacechanges;

/*static method has all properties same as default method EXCEPT it cant be overriden by any implementing class
 * static method can be used for util methods.instead of writing util classes we can write those methods inside interfaces now.
 * 
 * */

public class StaticMethodChanges implements StaticInterfaceTestI{

	@Override
	public void normalAbstarct() {
		// TODO Auto-generated method stub
		System.out.println("normal abstract method");
	}
	
	public static void main(String[] args) {
		StaticInterfaceTestI staticInterfaceTestI = new StaticMethodChanges();
		staticInterfaceTestI.defaultMethod();
		staticInterfaceTestI.normalAbstarct();
		StaticInterfaceTestI.staticMethod();
	}

}

interface StaticInterfaceTestI{
	
	public void normalAbstarct() ;
	default void defaultMethod() {
		System.out.println("Default");
	}
	static void staticMethod() {
		System.out.println("STATIC");
	}
}
