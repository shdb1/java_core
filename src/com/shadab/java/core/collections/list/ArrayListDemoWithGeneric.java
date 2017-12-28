package com.shadab.java.core.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemoWithGeneric {
	public static void main(String[] args) {
		
		// without generic
	//	nongenericArrayList();
		// With Generic 
		genericArrayList();
		
	}
		
		public static void nongenericArrayList(){
			
			List myListObject= new ArrayList();
			myListObject.add(3);
			myListObject.add("2");
			System.out.println("Size of list is:"+myListObject.size());
			System.out.println("Elements in ArrayList are:"+myListObject);
		
			for(int i=0; i<myListObject.size();i++){
				System.out.println("Object index in list is:"+i);
				System.out.println("Object at "+i+" is "+myListObject.get(i));
			int myData = (int)myListObject.get(i);
			System.out.println("Converted integer number is :"+myData);
		}
	}
		
     public static void genericArrayList(){
			
			List<Integer> myListObject= new ArrayList<Integer>();
			myListObject.add(3);
			//myListObject.add("2");
			myListObject.add(2);
			System.out.println("Size of list is:"+myListObject.size());
			System.out.println("Elements in ArrayList are:"+myListObject);
		
			for(int i=0; i<myListObject.size();i++){
				System.out.println("Object index in list is:"+i);
				System.out.println("Object at "+i+" is "+myListObject.get(i));
			int myData = (int)myListObject.get(i);
			System.out.println("Converted integer number is :"+myData);
		}
	}
}
