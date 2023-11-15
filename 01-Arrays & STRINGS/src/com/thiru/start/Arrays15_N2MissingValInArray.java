package com.thiru.start;

import java.util.Scanner;
/*
 sum1=1+2+4+5
 sum2=1+2+3+4+5

 
 */

public class Arrays15_N2MissingValInArray {

	public static void main(String[] args) {
		
//     int[] a= {1,2,4,5};
//     int sum1=0;
//     int sum2=0;
//     
//     for(int i=0;i<a.length;i++)
//     {
//    	 sum1=sum1+a[i];
//     }
//     System.out.println(sum1);
//     
//     
//     for(int i=1;i<=5;i++)
//     {
//    	 sum2=sum2+i;
//     }
//     
//     System.out.println("Missing number in the array :" +(sum2-sum1));
     
    
		int[] a= {1,2,4,5,6,7};
		int len=a.length;
		int sum1=0,sum2=0;
		
		for(int i=0;i<len;i++)
		{
			sum1=sum1+a[i];
		}
		for(int i=1;i<=7;i++)
		{
			sum2=sum2+i;
		}
		
		System.out.println( sum2-sum1+" : is missing number");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
