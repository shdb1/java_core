package com.shadab.java.core.string;

public class StringTest {
	public static void main(String[] args) {
		
		// Strings are immutable
		String s="shadab";
		System.out.println(Integer.toHexString(System.identityHashCode(s)));
		s=s.concat("shadab");
		System.out.println(Integer.toHexString(System.identityHashCode(s)));
		System.out.println(s);
		String sh= new String("shshsh");
		System.out.println(Integer.toHexString(System.identityHashCode(sh)));
		sh=sh+"aaa";
		System.out.println(Integer.toHexString(System.identityHashCode(sh)));

		// if same string there in pool will return the same reference
		String data="shadab";
		System.out.println(Integer.toHexString(System.identityHashCode(data)));

		String data2="shadab";
		System.out.println(Integer.toHexString(System.identityHashCode(data2)));

	    // but if strings are created using new keyword then it will have always new object
		
		String data3=new String("shadab");
		System.out.println(Integer.toHexString(System.identityHashCode(data3)));

		String data4=new String("shadab");
		System.out.println(Integer.toHexString(System.identityHashCode(data4)));
		
		/*intern retruns if its available in pool, otherwise add in pool and returns the refernce
		so whenever we create a string with string literal it will call intern method always*/
		String data5=new String();
		System.out.println(Integer.toHexString(System.identityHashCode(data5)));
   String data6="Shabbu";
   System.out.println(Integer.toHexString(System.identityHashCode(data6)));

		System.out.println("intern"+data5.intern());
		
		/* why does in strings String ss=new String("aaa"); adds two object 
		one in pool and another in heap?
				
		Answer is bcz of new keyword one object will be going in heap and since 
		already we have created string literal by passing "" in string constructor will be added in pool
	    :p it sucks :p actually*/

	}

}
