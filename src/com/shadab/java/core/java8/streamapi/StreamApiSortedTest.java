package com.shadab.java.core.java8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiSortedTest {

	public StreamApiSortedTest() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {


	List<String> listOfNames = Arrays.asList("mohammad","shadab","danish","ali");
	System.out.println("before stream processing ");
	System.out.println(listOfNames);
	List<String> listOfNamesAfterModification = 
			listOfNames.stream().sorted().collect(Collectors.toList());
	System.out.println("after stream processing");
	System.out.println(listOfNamesAfterModification);


}
}
