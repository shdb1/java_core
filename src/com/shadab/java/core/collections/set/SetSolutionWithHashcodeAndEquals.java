package com.shadab.java.core.collections.set;
import java.util.HashSet;
 
class Cat{
	String color;
 
	public Cat(String s){
		color = s;
	}
 
	//overridden method, has to be exactly the same like the following
	public boolean equals(Object obj) {
		if (!(obj instanceof Cat))
			return false;	
		if (obj == this)
			return true;
			
		return this.color.equals(((Cat) obj).color);
	}
 
	public int hashCode(){
		return color.length();//for simplicity reason
	}
}
 
public class SetSolutionWithHashcodeAndEquals {
	public static void main(String[] args) {
		HashSet<Cat> CatSet = new HashSet<Cat>();
		CatSet.add(new Cat("white"));
		CatSet.add(new Cat("white"));
 
		System.out.println("We have " + CatSet.size() + " white Cats!");
 
		if(CatSet.contains(new Cat("white"))){
			System.out.println("We have a white Cat!");
		}else{
			System.out.println("No white Cat!");
		}	
	}
}
