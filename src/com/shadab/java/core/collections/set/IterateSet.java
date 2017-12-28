package co.shadab.java.core.set;

public class HashSetLooperJava8{

    public static void main(String args[]) {
    
   /*
   Iterator<String> itr = setOfStocks.iterator();

// traversing over HashSet
System.out.println("Traversing over Set using Iterator");
while(itr.hasNext()){
  System.out.println(itr.next());
}
   */
   
   
 /*   for(String stock : setOfStocks){
   System.out.println(stock);
}
*/

        // Creating and initializing an HashSet for iteration
        Set<String> setOfBooks = new HashSet<>();
        setOfBooks.add("Effective Java");
        setOfBooks.add("Clean Code");
        setOfBooks.add("Refactoring");
        setOfBooks.add("Head First Java");
        setOfBooks.add("Clean Coder");
        
        // iterating over HashSet using forEach() method in Java 8
        setOfBooks.forEach(System.out::println);

    }

}
