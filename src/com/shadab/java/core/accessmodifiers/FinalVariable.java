package com.shadab.java.core.accessmodifiers;

public class FinalVariable {
	
	public static final int rank =20;
	public static final Data data =new Data();

}

class FinalTest{
	
	public static void main(String[] args) {
		FinalVariable finalVariable = new FinalVariable();
		// finalVariable.rank=30; //--> The final field FinalVariable.rank cannot be assigned
		System.out.println(finalVariable.rank);
		//FinalVariable.data= new Data(); //--> Final variable cant be rebound to another refrence
		System.out.println("id:"+FinalVariable.data.id+"name:"+FinalVariable.data.name);
		Data data =FinalVariable.data;
		// but internal of the object refenrenced by final variable can be modified
		data.id=23;
		data.name="Rohan";
		System.out.println("id:"+FinalVariable.data.id+"name:"+FinalVariable.data.name);
	}
	
}

class Data{
	int id ;
	String name;
}
