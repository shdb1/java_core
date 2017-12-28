package com.shadab.java.core.oops;

public class OvverridingDemo {
int age;
int atest=13;
public void test(){
	int atest=12;
	System.out.println(atest);
}
public OvverridingDemo(int age) {
	// TODO Auto-generated constructor stub
	this.age=age;
}
	public static void main(String[] args) {
	/*	
		OvverridingDemo ovverridingDemo = new OvverridingDemo(12);
		System.out.println("age is:"+ovverridingDemo.age);
		ovverridingDemo.test();
		
		
		
		
		
		A a = new A();
		B b= new B();
		A ab = new B();
		
		a.doSomething();
		b.doSomething();
		ab.doSomething();
		b.doWork();
		System.out.println(b.a);*/
		
		
		//A a = new A();
		B b = new B();
	}
}

class A{
	public A(){
		System.out.println("I am from super");
	}
	int a=10;
	public void doWork(){
		System.out.println("do work");
	}
	public void doSomething(){
		System.out.println("I am doSomething from A");
	}
}
class B extends A{
	public B(){
		super();
		System.out.println("I am from B constructor");
	
	}
	public void doSomething(){
		System.out.println("value of"+super.a);
		System.out.println("I am doSomething from B");
	}
	public void doNothing(){
		System.out.println("I am doNothing from B");
	}
}