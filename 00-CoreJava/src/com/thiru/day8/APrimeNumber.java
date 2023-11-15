package com.thiru.day8;



/*
1) Prime number  ==> 1 and itself
2) Factors of a number ==> no div values
3) Perfect no
4) Sum of the digits of the given number
5) sum of Square of the digits of the given number
6) sum of Cubes of the digits of the given numbers
 */


public class APrimeNumber {

	public static void main(String[] args) {
	
		/*
		int num=13,count=0;
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		
		if(count==2)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not a prime number");
		}
		
		*/
		
		/*
		int num=19,count=0;
		int start=1;
		
		while(start<=num)
		{
			if(num%start==0)
			{
				count++;
			}
			
			
			start++;
		}
		
		if(count==2)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not a prime");
		}
		
		*/
		
//		int num=19,count=0;
//		int start=1;
//		
//		do
//		{
//			if(num%start==0)
//			{
//				count++;
//			}
//			
//			
//			start++;
//		}
//		while(start<=num);
//		
//		if(count==2)
//		{
//			System.out.println("prime");
//		}
//		else
//		{
//			System.out.println("not a prime");
//		}
		
		
		
		//check given number or not
		
		
		int num=97;
		int count=0;
		
		for (int i = 1; i <= 97; i++) 
		{
			if(num%i == 0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("given number is prime number...");
		}
		else
		{
			System.out.println("not a prime number........");
		}
		
		
		
		

	}

}
