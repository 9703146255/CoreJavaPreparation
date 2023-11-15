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

//6)Print positive and negative,zeroes elements seperatly, 
step-1==> for==>marks[i]	>	 0    ==> all +ve values
step-2==> for==>marks[i]	<	 0    ==> all -ve values
step-2==> for==>marks[i]	==	 0    ==> all  00 values



*/



//6)Print positive and negative,zeroes elements seperatly, 
public class Arrays07 {

	public static void main(String[] args) {
		
//		int[] marks= {50,60,70,-55,40,80,90,-20,-30,0,0};
//		int size=marks.length;
//		
//		
//		System.out.println("Positive elements are :");
//		
//		//+ve for loop great
//	  for(int i=0;i<size;i++)
//	  {
//		  //POSITIVE ELEMENTS
//		  if(marks[i]>0)
//		  {
//			   System.out.println(marks[i]+" ");
//		  }
//
//	  }
//	  
//	  //-ve for loop less
//	  System.out.println("Negative elements are :");
//	  for(int i=0;i<size;i++)
//	  {
//		  //NEGATIVE ELEMENTS
//		  if(marks[i]<0)
//		  {
//			   System.out.println(marks[i]+" ");
//		  }
//	  }
//	  System.out.println("Zeros are  elements are :");
//	  for(int i=0;i<size;i++)
//	  {
//		  if(marks[i]==0 )
//		  {
//			   System.out.println(marks[i]+" ");
//		  }
//	  }
//	  
		
		
		int[] marks= {50,60,70,-55,40,80,90,-20,-30,0,0};
		int len=marks.length;
		for(int i=0;i<marks.length;i++)
		{
			if(marks[i]>0)
			{
				System.out.println(marks[i]);
			}
		}
		for(int i=0;i<marks.length;i++)
		{
			if(marks[i]<0)
			{
				System.out.println(marks[i]);
			}
		}
		for(int i=0;i<marks.length;i++)
		{
			if(marks[i]==0)
			{
				System.out.println(marks[i]);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
