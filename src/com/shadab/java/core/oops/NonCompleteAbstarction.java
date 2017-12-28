package com.shadab.java.core.oops;

public class NonCompleteAbstarction extends MyAbstract {

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("i am do something");
	}

public static void main(String[] args) {
	NonCompleteAbstarction nonCompleteAbstarction = new NonCompleteAbstarction();
	nonCompleteAbstarction.doSomething();
	nonCompleteAbstarction.doSomethingNnew();
}
}

//0-100 % percent
abstract class MyAbstract{
	public abstract void doSomething();
	public void doSomethingNnew(){
		System.out.println("hello");
	}
}