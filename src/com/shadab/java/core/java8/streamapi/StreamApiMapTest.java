package com.shadab.java.core.java8.streamapi;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


/*
 * Intermediate Operations:

1. map
2. filter
3. sorted

Terminal Operations:

1.collect
2.forEach
3.reduce

*/

public class StreamApiMapTest {

	public StreamApiMapTest() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		List<String> listOfNames = Arrays.asList("mohammad","shadab","danish","ali");
		System.out.println("before stream processing ");
		System.out.println(listOfNames);
		List<String> listOfNamesAfterModification = 
				listOfNames.stream().map(name->"Hello "+name).collect(Collectors.toList());
		System.out.println("after stream processing");
		System.out.println(listOfNamesAfterModification);
	}

}
