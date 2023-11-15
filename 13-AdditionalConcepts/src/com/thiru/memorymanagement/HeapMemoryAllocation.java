package com.thiru.memorymanagement;

//Exception in thread "main" java.lang.OutOfMemoryError: Java heap space

public class HeapMemoryAllocation {

	
   
	
	
	
	public static void main(String[] args) {
		
		int size=10;
		 
		for(int i=0;i<Integer.MAX_VALUE;i++)
		{
			int[] arr=new int[size];
			size *=2;
			System.out.println(size);
		}
		
		
		//
		//java.lang.OutOfMemoryError: Java heap space
		//-Xms768m by default==>671088640
		//-Xms900m ==>671088640
		//-Xmx900m ==>335544320
		

	}

}
