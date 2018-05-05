package com.shadab.java.core.jvm;

public class StackMemoryTest {
	public static void main(String[] args) {
/*		
 * i Have set stack size -Xss256k  and i could see the stack over flow error in few seconds
*/		StackMemoryTest stackMemoryTest = new StackMemoryTest();
		stackMemoryTest.testStackMemory(5);
	}
	
	public int testStackMemory(int number){
		int testNumber=1;
		while(testNumber>0){
			testNumber=testNumber+100;
			testStackMemory(testNumber);
		}
		return testNumber;

	}
}


