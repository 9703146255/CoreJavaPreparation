package com.collectionsF.iterableI.collectionI.listI.vectorC.stackC;

import java.util.Stack;

public class StackPractice {

	public static void main(String[] args) {
		
		//Stack follows LIFO[style]
		//stack is always empty intial stage  ==>NO STACK INITIAL
		//we don't create some "size" 
		//stack calls only parameterless constructor 
		
		
		//it is always assume ANTICLOCK WISE DIRECTION
		//APPLICABLE FOR ONLY BELOWE METHODS
		//stack
		//========
		//push()
		//pop()
		//peek()
		//searchH()
		//empty()
		
		//THESE METHODS FOLLOWS THE STACK OPERATION
		
		Stack<String> s1=new Stack<String>();  //() -->it is always empty in intioal
		s1.add("red");     //0
		s1.add("black");   //1	
		s1.add("white");   //2	
		
//		//it is consider  vertical anti-clockwise direction
//		System.out.println(s1);
//		System.out.println(s1.get(2)); //IT PERFOME LIKE LIST becouse not stack method but implements from vector
//		System.out.println(s1.set(0, "pink"));  //update
//		System.out.println(s1);
//		System.out.println("peek value :"+s1.peek());
//		System.out.println("push value  :"+s1.push("100"));
//		System.out.println(s1);
//		System.out.println("pop value :"+s1.pop());
//		System.out.println(s1);
//		System.out.println("search method : 2nd positions  tells(1,2,3,)not started zero, anticlock wise direction "+s1.search("black"));
//		System.out.println("s1.push(null) :"+s1.push(null));
//		System.out.println(s1);
//		System.out.println("is empty  :"+s1.isEmpty());
//		 
//		//STACK APPLICATIONS :
//		// WORD-->UNDO REDO
//		//BROWSER --> FRONT ARROW/BACK ARROW//RECURSION//BRACKETS{} () WE CAN USED STACK
		
		System.out.println(s1);
		System.out.println(s1.push("kanthri"));
		System.out.println(s1);
		System.out.println(s1.peek());
		System.out.println(s1);
		System.out.println(s1.pop());
		System.out.println(s1);
		System.out.println(s1.search(s1));

	
		
	}

}
