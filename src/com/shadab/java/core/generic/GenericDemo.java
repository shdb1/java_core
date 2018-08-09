package com.shadab.java.core.generic;

public class GenericDemo {
public static void main(String[] args) {
	TestDataTypes<String> stringObject = new TestDataTypes<String>();
	stringObject.setX("Hello Shadab");
	String output = stringObject.getX();
	System.out.println("You greeting message is: "+output);
	
	TestDataTypes<Integer> intObject = new TestDataTypes<Integer>();
	intObject.setX(22);
	int luckyNumber = intObject.getX();
	
	System.out.println("Your lucky number is:"+luckyNumber);

	
	
	
	
	
}
	
}

// we can use any thing but T suggested as it is type.
class TestDataTypes <X>{
	
	private X x;
	
	public X getX() {
		return x;
	}

	public void setX(X x) {
		this.x = x;
	}
}
