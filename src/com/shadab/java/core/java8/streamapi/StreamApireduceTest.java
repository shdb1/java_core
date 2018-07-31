package com.shadab.java.core.java8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApireduceTest {

	public StreamApireduceTest() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Stream.of(10,20,22,12,14).reduce((x,y)->x+y).ifPresent(System.out::println);
	 
    Stream.of(10,20,22,12,14).reduce(Integer::sum).ifPresent(System.out::println);

    Stream.of("java", "c", "c#", "python").reduce((x,y)->x+" | "+y).ifPresent(System.out::println);

    
    Integer arrSum = Stream.of(10,20,22,12,14).parallel().reduce(1000, (x,y)->x+y, (p,q)->{
        System.out.println("combiner called  ps is-"+p+"   q is-"+q);
        return p+q;
    });
    System.out.println(arrSum);
	
	}

	
	
}


