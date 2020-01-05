package com.shadab.java.core.challenges.sm;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CamelCase {
	public static void main(String[] args) {
		System.out.println(Solution.camelcase("saveChangesInTheEditor"));
	}
}



  class Solution {

    // Complete the camelcase function below.
    static int camelcase(String s) {
    if(s==null)
    	return 0;
    	int counter=1;
for (int i = 0; i < s.length(); i++) {
	if(s.charAt(i)>64 && s.charAt(i)<91)
		counter++;
}
return counter;
    }

 
     
}
