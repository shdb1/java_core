package com.shadab.java.core.references;


/*Strong References
Weak References
Soft References
Phantom References*/


public class StrongReferenceTest {

	public StrongReferenceTest() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
 		    {
		         //Strong Reference - by default
		        String g = new String();  
		         
		        //Now, object to which 'g' was pointing earlier is 
		        //eligible for garbage collection.
		        g = null; 
		    }
	}

}
