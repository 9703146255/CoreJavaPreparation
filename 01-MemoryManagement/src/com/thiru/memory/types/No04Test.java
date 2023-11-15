package com.thiru.memory.types;

//when ever heap memory will full we will get ==>java.lang.OutOfMemoryError[768MB]


/*
 
 fixing size here
 start[size] = 1
  fixed[size] = 1
   start[size] = 1
 
 */


public class No04Test {
	
	public static void main(String[] args)
	{
	   int size=1;
	   
	   for(int i=0;i<Integer.MAX_VALUE;i++)
	   {
		   int[] n=new int[size];
		   
		   
		   
		   System.out.println(size=size*2);
		   
	   }
	}

}
