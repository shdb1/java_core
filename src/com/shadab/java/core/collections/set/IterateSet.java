package com.shadab.java.core.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IterateSet{

    public static void main(String args[]) {
    
    	Set<String> setOfBooks = new HashSet<String>();
        setOfBooks.add("Effective Java");
        setOfBooks.add("Clean Code");
        setOfBooks.add("Refactoring");
        setOfBooks.add("Head First Java");
        setOfBooks.add("Clean Coder");
        
        
 /*  Iterator<String> itr = setOfBooks.iterator();

// traversing over HashSet
System.out.println("Traversing over Set using Iterator");
while(itr.hasNext()){
  System.out.println(itr.next());
}*/
   
   
 /*  
    for(String stock : setOfBooks){
   System.out.println(stock);
}*/


        // Creating and initializing an HashSet for iteration
       
        
        // iterating over HashSet using forEach() method in Java 8
        setOfBooks.forEach(System.out::println);

    }

}
