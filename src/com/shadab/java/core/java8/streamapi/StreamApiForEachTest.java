package com.shadab.java.core.java8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiForEachTest {

	public StreamApiForEachTest() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {



		List<String> listOfNames = Arrays.asList("mohammad","shadab","danish","ali");
		System.out.println("before stream processing ");
		System.out.println(listOfNames);
		System.out.println("after stream processing");

	 
				listOfNames.stream().forEach(name->System.out.println(name));
 


	}

}
