 package com.thiru.start;

import java.util.Scanner;

/*

1)Find the duplicate value in the array
intput = 2,3,4,5,8,5,4,7  o/p==>4,4,5,5
2)Search element in the array
 */

public class Arrays12 {

	public static void main(String[] args) {
		
//		 Scanner sc=new Scanner(System.in);
//		 System.out.println("Ente the searching number in the array list :");
//		 int search=sc.nextInt();
//		
//		int[] a= {10,20,50,80,40,20,20,10,10};
//		int size=a.length;
//		int count=0;
//		
//		
//		for(int i=0;i<size;i++)
//		{
//			if(search==a[i])
//			{
//			  count++;
//			}
//		}
//		
//		if(count != 0)
//		{
//			System.out.println("Element is present..... :"+search);
//		}
//		else
//		{
//			System.out.println("Element is not present");
//		}
		/*
		 * 10 compares=>20,50,80,40,20,20,10,10
		 * 20 compares=>10,20,50,80,40,20,20,10,10
		 * 50 compares=>10,20,50,80,40,20,20,10,10
		 * ...............................etc
		 * 
		 * 
		 */
		
		
		
		int[] a= {40,50,60,70,90,10,20,10};
		int search=10;
		int count=0;
		for (int i = 0; i < a.length; i++) {
			
			if(search==a[i])
			{
				count++;
			}
		}
		if(count !=0)
		{
			System.out.println("present :"+count+" times");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
