package com.shadab.java.core.challenges.zalando;

public class NumberOperation {
public static void main(String[] args) {
	SolutionHere ss= new SolutionHere();
	System.out.println(ss.solution("011100"));
}
}


class SolutionHere {
    public int solution(String S) {
        // write your code in Java SE 8
    	int givenNumber=Integer.parseInt(S,2);  
    	int steps= 0;
    	while(givenNumber!=0){
    		if(givenNumber%2==0)
    			givenNumber=divideOp(givenNumber);
    		else
    			givenNumber=subsOp(givenNumber);
    		steps++;
    	}

    	
    	return steps;
    }
    
    int divideOp(int number){
    	return number/2;
    }
   
    
    int subsOp(int number){
    	return number-1;
    }
    
}
