package com.shadab.java.core.java8.interfacechanges;

import java.text.DecimalFormat;

/*java default method are included to achieve following things:
	1. It defeat the fear of adding methods in interfaces , Lets say we have implemented an interface
	in 100 classes and now we want to have an extra method in our interface then it would force us to implement this method in all 100 class
	So it becomes really pain full to go to those 100 class and override the method.
	To overcome this issue java has introduced default method which we will not have to override in underlying classes.
	Now you may argue same thing can be achieve with abstract classes then why do we need default methods?
	Answer would be yes , Yeah it can be achieved with abstract classes . But in revrese i would remind the reason behind interface's birth. I hope that would give you anser.
	
	2. Also if a class implementing two interfaces having same methods in both in that case it becomes mandatory to implement the method by class
	lets say interface I1 has a default method called doWork() and Interface I2 also haso default method doWork() and these two interfaces are implemented by class C
	in this case class C must implement the doWork() method otherwise it would be a compilation error(to avoid ambiguity).
	
	3. Java interface default methods are also referred to as Defender Methods or Virtual extension methods.
	4. You cant use default method anywhere other than interfaces.
	5.It is forbidden to define default methods in interfaces for methods in java.lang.Object, since the default methods would never be "reachable".
	*
	*
	*
	*/

public class DefaultMethodInfo implements DefaultMethodsTestInterface{

	@Override
	public void myAbstarctMethod() {
		// TODO Auto-generated method stub
		System.out.println("abstract method implemented");
		
	}
	
	public static void main(String[] args) {
		
		DefaultMethodsTestInterface defaultMethodsTestInterface = new DefaultMethodInfo();
		defaultMethodsTestInterface.doWork();
		defaultMethodsTestInterface.myAbstarctMethod();
		
		
		// now test same default methods from two interfaces
		DemoDefaultMethodFromTwoInterfaces demoDefaultMethodFromTwoInterfaces = new DemoDefaultMethodFromTwoInterfaces();
		demoDefaultMethodFromTwoInterfaces.doWork();
	}

}

interface DefaultMethodsTestInterface{
	
	default void doWork() {
		System.out.println("do some work from default");
		
	}
	
	void myAbstarctMethod();
	
/*ERROR:- A default method cannot override a method from 
	 java.lang.Object
	default String toString() {
		
	}*/
	
}

interface DefaultMethodsTestInterface2{
	
	default void doWork() {
		System.out.println("do some work from default-I2");
		
	}
	
	void myAbstarctMethod();
	
}

class DemoDefaultMethodFromTwoInterfaces implements DefaultMethodsTestInterface,DefaultMethodsTestInterface2{

	@Override
	public void myAbstarctMethod() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		DefaultMethodsTestInterface2.super.doWork();
	}
	
}