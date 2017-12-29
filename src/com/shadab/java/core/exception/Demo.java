package com.shadab.java.core.exception;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			myExceptionTest(90);
			//myExceptionTest(190);
			System.out.println("after exeption");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			System.out.println("I will be executed always");
		}
	

	}
	
	public static void myExceptionTest(int temprature) throws Exception{
		
		System.out.println("hey temp is:"+temprature);
		if(temprature>110)
		throw new Exception();
	}

}
