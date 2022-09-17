package com.shadab.java.core.accessmodifiers;

public class FinalVariable {

	public static final int rank = 20;
	public static final Data data = new Data();

}

class FinalTest {

	public static void main(String[] args) {
		FinalVariable finalVariable = new FinalVariable();
		// finalVariable.rank=30; //--> The final field FinalVariable.rank cannot be
		// assigned
		System.out.println(finalVariable.rank);
		// FinalVariable.data= new Data(); //--> Final variable cant be rebound to
		// another refrence
		System.out.println("id:" + FinalVariable.data.id + "name:" + FinalVariable.data.name);
		Data data = FinalVariable.data;
		// but internal of the object refenrenced by final variable can be modified
		data.id = 23;
		data.name = "Rohan";
		System.out.println("id:" + FinalVariable.data.id + "name:" + FinalVariable.data.name);

		System.out.println("***********************************");
		doSomething(20);
		doSomethingWithObject(data);
		
		
		  Data data2 = new Data (2,"Ramesh");
	//	data2=null; //--> cant be done
		System.out.println(data2.id);
		System.out.println(data2.name);
		doSomethingWithNonFinalParam(data2);
		System.out.println("doSomethingWithNonFinalParam");
		System.out.println(data2.id);
		System.out.println(data2.name);
		
		
		
		doSomethingWithChnageRef(data2);
		
		System.out.println(data2.id);
		System.out.println(data2.name);
	}

	public static void doSomething(final int anyNumber) {
		System.out.println(anyNumber);
		// anyNumber=30; // --> Cant re assign

	}

	// normal object passed in a final paramater
	public static void doSomethingWithObject(final Data data) {
		System.out.println(data.id);
		System.out.println(data.name);
		// data=null; //-->The final local variable data cannot be assigned. It must be
		// blank and not using a compound assignment

	}
	
	// normal object passed in a final paramater
		public static void doSomethingWithNonFinalParam(Data data) {
			data=new Data(419,"Jenky");
			System.out.println(data.id);
			System.out.println(data.name);
			// data=null; //-->The final local variable data cannot be assigned. It must be
			// blank and not using a compound assignment

		}
		
		// normal object passed in a final paramater
		public static void doSomethingWithChnageRef(Data data) {
 			System.out.println(data.id);
			System.out.println(data.name);
			data=new Data(420,"Junky");
			System.out.println(data.id);
			System.out.println(data.name);
	

		}
		
		
		
}



class Data {
	int id;
	String name;
	
	public Data(int id, String name) {
		this.id=id;
		this.name=name;
	}

	public Data() {
		// TODO Auto-generated constructor stub
	}
}
