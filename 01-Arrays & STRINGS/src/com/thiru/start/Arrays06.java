package com.thiru.start;


/*

 1)Access Array Elements
//======================
access array elements
array[index]

2)ACCESSING ELEMENT BY USING FOR LOOP
=====================================
array[index]

3)ACCESSING ELEMENTS BY USING FOR EACH LOOP
4)SUM OF THE ELEMENTS IN THE ARRAY
5)COPY OF THE ELEMENTS IN THE ARRAY IS
6)Print positive and negative elements seperatly
7)Print Highest and lowest value in the array
8)Display elements in Ascending order
9)Display elements in Descending order
 
 
 
 
 step-1:take one full,one empty arrays  [a1,c1]
 step-2:for==>copy full array to empty array  c1=a1
 step-3:for==> print full array
 step43:for==> print emty/copy array
 

*/




public class Arrays06 {

	public static void main(String[] args) {
		
//		int[] marks= {50,60,70,40,80,90}; //full array 
//		int size=marks.length;
//		int[] copy=new int[size]; //empty array for copy
		
		
//		//storrign marks array to copy array
//		for(int i=0;i<size;i++)
//		{
//			copy[i]=marks[i];
//		}
//		
//		//displaying first array
//		System.out.print("Initail array is :");
//		for(int i=0;i<size;i++)
//		{
//			System.out.print(marks[i]+",");
//		}
//		
//		System.out.println();
//		//displaying second/copy array
//		System.out.print("Copy of array is :");
//		for(int i=0;i<size;i++)
//		{
//			System.out.print(copy[i]+",");
//		}
		
//		int temp=0;
//		
//		
//		int[] a= {10,20,40,50,-70,-50,0,0,50,55};
//		int len=a.length;
//		for(int i=0;i<len;i++)
//		{
//		  for(int j=0;j<len;j++)
//		  {
//			  if(a[i]<a[j])
//			  {
//				  
//				 temp= a[i];
//				 a[i]=a[j];
//				 a[j]=temp;
//			  }
//						  
//		  }
//		  
//		}
//		
//		for(int i=0;i<len;i++)
//		{
//			System.out.println(a[i]);
//		}
//		
//		
//	
//		
//		
		
		
		
		int[] a= {10,20,40,50,-70,-50,0,0,50,55};
		int len=a.length;
		int temp=0;
		
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len;j++)
			{
			    if(a[i]<a[j])       //note==>a[i]<a[j]==> ascendin order   //note==>a[i]>a[j]==> descending order
			    {
			    	temp=a[i];
			    	a[i]=a[j];
			    	a[j]=temp;
			    }
			}
		}
		
		for(int i=0;i<len;i++)
		{
			System.out.println(a[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
