package com.shadab.java.core.collections.set;
import java.util.HashSet;
 
class Dog{
	String color;
 
	public Dog(String s){
		color = s;
	}	
}
 
public class SetAndHashCode {
	public static void main(String[] args) {
		HashSet<Dog> dogSet = new HashSet<Dog>();
		dogSet.add(new Dog("white"));
		dogSet.add(new Dog("white"));
 
		System.out.println("We have " + dogSet.size() + " white dogs!");
 
		if(dogSet.contains(new Dog("white"))){
			System.out.println("We have a white dog!");
		}else{
			System.out.println("No white dog!");
		}	
	}
}
