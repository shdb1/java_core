package com.shadab.java.core.challenges.tree.bst;

/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions. The Node class is defined as follows: */


    class Node {
    int data;
    Node left;
    Node right;
    
    
     }
    
   public class BSTTest{
	   public static void main(String[] args) {
		
	}
	   
	   
	   boolean checkBST(Node root) {
		   boolean result =false;
		   if(root!=null){
			   return isBST(root,root.left.data,root.right.data,root.data);
		   }
		   else{
	        return result;
		   }
	    }
	   
	   boolean isBST(Node currentNode , int leftData , int rightData,int rootData){
		   boolean result = false;
		   if(rootData>leftData || rootData>rightData)
			   return false;
		   else
			   return true;
		   
	   }
	   
   }

  
