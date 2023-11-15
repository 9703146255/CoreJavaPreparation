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


7)Print Highest and lowest value in the array
step:1	==> low=m[0],high=m[0]
step:1	==> for==> high<m[i] ==> high=m[i]
step:2	==> for==> high>m[i] ==> low=m[i]



*/



//6)Print highest element and lowest elements seperatly
//{50,60,70,-55,40,80,90,-20,-30,0,0};
public class Arrays08 {

	public static void main(String[] args) {
		
//		int[] marks= {50,60,70,-55,40,80,90,-20,-30,0,0};
//		int size=marks.length;
//		int high=marks[0];
//		int low=marks[0];
//		
//		
//		//great/less in single for (if,if)
//		for(int i=0;i<size;i++)
//		{
//			
//			//for highest value/marks 
//			if(high<marks[i]) 
//			{
//				high=marks[i];
//			}
//	
//			//for lowest value/marks
//			if(low>marks[i]) 
//			{
//				low=marks[i];
//			}
//		}
//		System.out.println("Highest values is  :"+high);
//		System.out.println("Lowest values is :"+low);
//	}
//
//}



/* or
 //great/less in single for (if,if)
		for(int i=0;i<size;i++)
		{
			
			//for highest value/marks 
			if(high<marks[i]) 
			{
				high=marks[i];
			}
		}
			for(int i=0;i<size;i++)
			{
			//for lowest value/marks
			if(low>marks[i]) 
			{
				low=marks[i];
			}
		}
		System.out.println("Highest values is  :"+high);
		System.out.println("Lowest values is :"+low);
 
 */
		
		
		
		int[] marks= {50,60,70,-55,40,80,90,-20,-30,0,0};
		int len=marks.length;
		int high=marks[0];
		int low=marks[0];
		
		for(int i=0;i<marks.length;i++)
		{
			if(high<marks[i])
			{
				high=marks[i];
			}
			if(low>marks[i])
			{
				low=marks[i];
			}
		}
		System.out.println(low);
		System.out.println(high);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}}
