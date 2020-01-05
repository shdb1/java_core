package com.shadab.java.core.challenges.zalando;

public class IdenticalPairs {
public static void main(String[] args) {
	SolutionIdenticalPairs pair = new SolutionIdenticalPairs();
	int[] data = { 3,5,6,3,3,5 };
	System.out.println(pair.solution(data));
}
}

class SolutionIdenticalPairs {
    public int solution(int[] A) {
        // write your code in Java SE 8
    	int numberOfPairs=0;
    	for(int arrayIndex=0 ; arrayIndex< A.length ; arrayIndex++){
    		for(int nextElement=arrayIndex+1;nextElement<A.length ;nextElement++){
    			if(arrayIndex!=nextElement)
    				{
    				if(A[arrayIndex]==A[nextElement])
    					numberOfPairs++;
    				}
    			
    		}
    	}
    	return numberOfPairs;
    }
}

