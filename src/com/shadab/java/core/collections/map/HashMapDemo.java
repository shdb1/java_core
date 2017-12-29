package com.shadab.java.core.collections.map;

import java.util.HashMap;
import java.util.Map;

class BollywoodMovies {
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public int getReleaseYr() {
		return releaseYr;
	}
	public void setReleaseYr(int releaseYr) {
		this.releaseYr = releaseYr;
	}
	private String name, actor;
	private int releaseYr;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getName()+":"+this.getActor()+":"+this.getReleaseYr();
	}

}

public class HashMapDemo {

	public static void main(String[] args) {

		BollywoodMovies m = new BollywoodMovies();
		m.setActor("Akshay");
		m.setName("Thank You");
		m.setReleaseYr(2011);

		BollywoodMovies m1 = new BollywoodMovies();
		m1.setActor("Akshay");
		m1.setName("Khiladi");
		m1.setReleaseYr(1993);

		BollywoodMovies m2 = new BollywoodMovies();
		m2.setActor("Akshay");
		m2.setName("Taskvir");
		m2.setReleaseYr(2010);

		BollywoodMovies m3 = new BollywoodMovies();
		m3.setActor("Akshay");
		m3.setName("Taskvir");
		m3.setReleaseYr(2010);

		Map<BollywoodMovies, String> map = new HashMap<BollywoodMovies, String>();
		map.put(m, "ThankYou");
		map.put(m1, "Khiladi");
		map.put(m2, "Tasvir");
		map.put(m3, "Duplicate Tasvir");

		//Iterate over HashMap
		/*for (BollywoodMovies mm : map.keySet()) {
			System.out.println(mm);
			System.out.println(map.get(mm).toString());
		}*/

	BollywoodMovies m4 = new BollywoodMovies();
		m4.setActor("Akshay");
		m4.setName("Taskvir");
		m4.setReleaseYr(2010);

 //We are trying to retrieve m2, by creating object m4 with exact values as of m2, However Hashcode method is not implemented and that why we are not able to get Object m2 
		if(map.get(m4) == null ){
			System.out.println("----------------");
			System.out.println("Object not found");
			System.out.println("----------------");
		}else{
			System.out.println(map.get(m4).toString());
		}
	}
}
