package com.shadab.java.core.oops;

public class CompleteAbstarction implements Animals {

	@Override
	public void eatGrass() {
		// TODO Auto-generated method stub
		System.out.println("hiii");
	}
	
	public static void main(String[] args) {
		CompleteAbstarction abstarction  = new CompleteAbstarction();
		abstarction.eatGrass();
		Animals abstarction1  = new CompleteAbstarction();
		abstarction1.eatGrass();
	}
}
// 100 % abstarction
 interface Animals{
	public void eatGrass();
	/*public doSleep(){
		System.out.println("hello i am sleeping");
	}*/
}
