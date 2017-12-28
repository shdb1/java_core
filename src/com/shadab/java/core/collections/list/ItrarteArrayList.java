package com.shadab.java.core.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ItrarteArrayList {
	
	public static void main(String[] args) {
		//iterateByForLoop();
		//shortedForLoop();
		//iteratorDemo();
		listIteratorDemo();
		
	}
	
	
	
	 static void iterateByForLoop(){
		 
		 List<String> myStringList = new ArrayList<String>();
		 // making a list
		 for(int i=0; i<=99;i++){
			 myStringList.add("Number="+i);
		 }
		 
		 System.out.println("list data is:"+myStringList);
		 
		 for(int j=0;j<myStringList.size();j++){
			 System.out.println("At index :"+j+" element is:"+myStringList.get(j));
		 }
		
	}

 static void shortedForLoop(){
		 
		 List<String> myStringList = new ArrayList<String>();
		 // making a list
		 for(int i=0; i<=99;i++){
			 myStringList.add("Number="+i);
		 }
		 
		 System.out.println("list data is:"+myStringList);
		 
		 for(String dataValue:myStringList){
			 System.out.println("element is:"+dataValue);
		 }
		
	}
 
 static void iteratorDemo(){
	 
	 List<String> myStringList = new ArrayList<String>();
	 // making a list
	 for(int i=0; i<=4;i++){
		 myStringList.add("Number="+i);
	 }
	 
	 System.out.println("list data is:"+myStringList);
	 
	Iterator<String> iterator = myStringList.iterator();
	while(iterator.hasNext()){
		iterator.next();
		String element=iterator.next();
		iterator.next();
		iterator.next();
		System.out.println(iterator.next());
		System.out.println(element);
	}
	
}
 
 static void listIteratorDemo(){
	 
	 List<String> myStringList = new ArrayList<String>();
	 // making a list
	 for(int i=0; i<=4;i++){
		 myStringList.add("Number="+i);
	 }
	 
	 System.out.println("list data is:"+myStringList);
	 
	ListIterator<String> listIterator = myStringList.listIterator();
	while(listIterator.hasNext()){
		listIterator.next();
		String element=listIterator.next();
		listIterator.next();
		listIterator.next();
		System.out.println(listIterator.next());
		System.out.println(element);
	}
	
for (int i = 0; i < myStringList.size(); i++) {
		if(i==2)
		{
			if(listIterator.hasPrevious())
			System.out.println(listIterator.previous());
		}
		
	}
	
}
 
}
