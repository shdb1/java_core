package com.shadab.java.core.collections.map;

public class IterateOverMap{
public static void main(String args[]){

HashMap<String, String> loans = new HashMap<String, String>();
loans.put<"home loan", "Citibank");
loans.put<"personal loan", "Wells Fargo");

/*
for (String key : loans.keySet()) {
   System.out.println("------------------------------------------------");
   System.out.println("Iterating or looping map using java5 foreach loop");
   System.out.println("key: " + key + " value: " + loans.get(key));
}
*/

/*
Set<String> keySet = loans.keySet();
Iterator<String> keySetIterator = keySet.iterator();
while (keySetIterator.hasNext()) {
   System.out.println("------------------------------------------------");
   System.out.println("Iterating Map in Java using KeySet Iterator");
   String key = keySetIterator.next();
   System.out.println("key: " + key + " value: " + loans.get(key));
}
*/

/*
Set<Map.Entry<String, String>> entrySet = loans.entrySet();
for (Entry entry : entrySet) {
   System.out.println("------------------------------------------------");
   System.out.println("looping HashMap in Java using EntrySet and java5 for loop");
   System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
}

*/

/*
Set<Map.Entry<String, String>> entrySet1 = loans.entrySet();
Iterator<Entry<String, String>> entrySetIterator = entrySet1.iterator();
while (entrySetIterator.hasNext()) {
   System.out.println("------------------------------------------------");
   System.out.println("Iterating HashMap in Java using EntrySet and Java iterator");
   Entry entry = entrySetIterator.next();
   System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
}
*/
/*

*/
}
}
