package com.shadab.java.core.challenges.linkedlist.compare;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

	static class SinglyLinkedListNode {
		public int data;
		public SinglyLinkedListNode next;

		public SinglyLinkedListNode(int nodeData) {
			this.data = nodeData;
			this.next = null;
		}
	}

	static class SinglyLinkedList {
		public SinglyLinkedListNode head;
		public SinglyLinkedListNode tail;

		public SinglyLinkedList() {
			this.head = null;
			this.tail = null;
		}

		public void insertNode(int nodeData) {
			SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

			if (this.head == null) {
				this.head = node;
			} else {
				this.tail.next = node;
			}

			this.tail = node;
		}
	}

	public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter)
			throws IOException {
		while (node != null) {
			bufferedWriter.write(String.valueOf(node.data));

			node = node.next;

			if (node != null) {
				bufferedWriter.write(sep);
			}
		}
	}

	// Complete the compareLists function below.

	/*
	 * For your reference:
	 *
	 * SinglyLinkedListNode { int data; SinglyLinkedListNode next; }
	 *
	 */
	static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
		
		boolean result = true;
		
		if (head1 == null && head2 == null) {
			 return result;
		}
		if ((head1!=null && head2==null ) || (head2!=null && head1==null )){
			result=false;
			return result;

			
		}
		SinglyLinkedListNode node1=head1;
		SinglyLinkedListNode node2=head2;
		
		while (node1!=null){
			
			if ((node1!=null && node2==null ) || (node2!=null && node1==null )){
				result=false;
break;
				
			}
			
			 Optional<Integer> node1Data = Optional.ofNullable(   node1.data);
			 Optional<Integer>  node2Data = Optional.ofNullable(   node2.data);
			if(node1Data.get()!=node2Data.get()){
				result= false;
				break;
			}
			node1=node1.next;
			node2=node2.next;
				
		}
		
		return result;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

 
		//for (int testsItr = 0; testsItr < tests; testsItr++) {
			SinglyLinkedList llist1 = new SinglyLinkedList();
			SinglyLinkedListNode n1 = new SinglyLinkedListNode(1);
			SinglyLinkedListNode n2 = new SinglyLinkedListNode(2);
			n1.next=n2;
		 
			SinglyLinkedList llist2 = new SinglyLinkedList();
			SinglyLinkedListNode n11 = new SinglyLinkedListNode(1);
//			SinglyLinkedListNode n22 = new SinglyLinkedListNode(2);
//			n11.next=n22;
 			boolean result = compareLists(n1, n11);
 			System.out.println(result);

			}


		//}

	//	scanner.close();
	}

