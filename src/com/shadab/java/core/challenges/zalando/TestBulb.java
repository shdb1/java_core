package com.shadab.java.core.challenges.zalando;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

class Solution {
	public int solution(int[] A) {
		// write your code in Java SE 8
		int result = 0;
		LinkedHashMap<Integer, Bulb> bulbROws = new LinkedHashMap<Integer, Bulb>();
		Bulb prevousBulb = null;
		for (int bulbNumber = 0; bulbNumber < A.length; bulbNumber++) {
			Bulb bulb = new Bulb();
			HashMap<Integer, Bulb> bulbmap = new HashMap<>();
			bulb.bulbNumber = A[bulbNumber];
			bulb.prevBulb = prevousBulb;
			prevousBulb = bulb;
			bulbROws.put(A[bulbNumber], bulb);

		}
		int resulytCounter = 0;
		for (Map.Entry<Integer, Bulb> entry : bulbROws.entrySet()) {

			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

			boolean prevOn = false;
			bulbROws.get(entry.getKey()).isBulbOn = true;
			try {
				if ((entry.getKey() - 1) == 0) {
					prevOn = true;
				} else {
					prevOn = bulbROws.get(entry.getKey() - 1).isBulbOn;
				}

			} catch (Exception e) {
				// TODO: handle exception

			}
			if (prevOn)
				resulytCounter++;
		}

		return resulytCounter;
	}
}

class Bulb {

	boolean isBulbOn = false;
	Bulb prevBulb = null;
	int bulbNumber = 0;
}

public class TestBulb {

	public static void main(String[] args) {

		Solution solution = new Solution();
		int[] data1 = { 2, 1, 3, 5, 4 };
		int[] data11 = { 2, 3, 4, 1, 5 };
		int[] data = { 1, 3, 4, 2, 5 };
		int result = solution.solution(data);
		System.out.println(result);

	}
}
