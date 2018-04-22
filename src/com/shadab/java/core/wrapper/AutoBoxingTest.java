/**
 * 
 */
package com.shadab.java.core.wrapper;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mshadab
 *
 */
public class AutoBoxingTest {
	  public static void main (String[] args)
	    {
	        /* Here we are creating a list
	          of elements of Integer type.
	          adding the int primitives type values */
	        List<Integer> list = new ArrayList<Integer>();
	        for (int i = 0; i < 10; i++)
	            list.add(i);
	        
	  	  howAutoboxingWorrks();
	    }

	  
	  public static void howAutoboxingWorrks(){
		    {
		        /* Here we are creating a list of elements
		          of Integer type. Adding the int primitives
		          type values by converting them into Integer
		          wrapper Object*/
		        List<Integer> list = new ArrayList<Integer>();
		        for (int i = 0; i < 10; i++)
		            list.add(Integer.valueOf(i));
		 
		    }
	  }
}
