
package com.thiru.start;

import java.util.Stack;

/*
 
using stack(LIFO)  1,2,3==>3,2,1
================================



 
 
 */





public class Arrays17_N21ReverseTheElementsOfArray {

	public static void main(String[] args) {
		
//		int array[]= {1,4,5};
//		Stack<Integer> stack=new Stack<>();
//		
//		for(int i=0;i<array.length;i++)
//		{
//			stack.push(array[i]);
//		}
//		for(int i=0;i<array.length;i++)
//		{
//			array[i]=(int)stack.pop();
//			System.out.println(array[i]);
//		}
		
		
		
		
		
		
		
		
//		Stack<Integer> stk=new Stack<>();
//		
//		
//		
//		int[] x= {1,2,4,5,7,9};
//		int len=x.length;
//		for(int i=0;i<len;i++)
//		{
//			stk.push(x[i]);
//		}
//		for(int i=0;i<len;i++)
//		{
//			x[i]=stk.pop();
//			System.out.println(x[i]);
//		}
		
		
		
		
		
		
		
		int[] x= {10,20,40,50,1};
		int len=x.length;
		
		Stack<Integer> stk=new Stack<>();
		for(int i=0;i<len;i++)
		{
			stk.push(x[i]);
		}
		for(int i=0;i<len;i++)
		{
			x[i]=stk.pop();
			System.out.println(x[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
