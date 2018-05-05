package com.shadab.java.core.jvm;

import java.util.HashMap;
import java.util.Map;

public class HeapMemoryTest {
	Map myMap= new HashMap<String, String>();
	public static void main(String[] args) {
		
		/* I have set VM argumnets as -Xms1M -Xmx1M , Minimum Heap size(Xms) 1 MB and Maximum heap size(Xmx) 1MB
		 After running the program i could see the out of memory error on "object number 0   map entry value is 5507"*/
		
		
		for (int i = 0; i < 10000; i++) {
		HeapMemoryTest test= new HeapMemoryTest();
		for (int j = 0; j < 10000; j++) {
			test.myMap.put("key"+j, "value"+j);
			System.out.println("object number"+i+"   map entry value is"+j);
		}
		}
	}

}
