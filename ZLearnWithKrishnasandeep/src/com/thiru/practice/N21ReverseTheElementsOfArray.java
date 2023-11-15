
package com.thiru.practice;

import java.util.Stack;

/*
 
using stack(LIFO)  1,2,3==>3,2,1
================================



 
 
 */





public class N21ReverseTheElementsOfArray {

	public static void main(String[] args) {
		
		int array[]= {1,4,5};
		Stack<Integer> stack=new Stack<>();
		
		for(int i=0;i<array.length;i++)
		{
			stack.push(array[i]);
		}
		for(int i=0;i<array.length;i++)
		{
			array[i]=(int)stack.pop();
			System.out.println(array[i]);
		}
		
		
		
	}

}
