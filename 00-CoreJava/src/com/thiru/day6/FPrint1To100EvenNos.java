package com.thiru.day6;
/*
 BY USING while() LOOP, AND do while() LOOP AND for() loop
 
 
 
 1) PRINT THE NUMBERS FROM 1 TO 10
 2) PRINT THE NUMEBRS FROM 10 TO 1
 3) PRINT THE NUMEBRS FROM 100 TO 200
 4) PRINT THE NUMEBRS FROM 1 TO 100  WHiCH IS DIV BY  3 AND 5
 5) PRINT THE NUMEBRS FROM 1 TO 100 ODD NO'S
 6) PRING SQUARE OF EVEN NUMBERS FROM 1 TO 10
 7) PRINT SUM OF SQUARES OF ODD NUMBERS FROM 1 TO 10
 8) Print sum of squares of even numbers that are divisible by 3 from 1 to 100
 
 
 
 */
public class FPrint1To100EvenNos {

	public static void main(String[] args) {
	System.out.println("==========================while()=========================");
		int start=1,end=100,sum=0;
		while(start<=end)
		{
			if(start%2==0 && start%3==0)
			{
				sum=sum+start*start;
			System.out.println(sum);
			}
			start++;
			
		}
		
		
		System.out.println("==========================do while()=========================");
		int start1=1,end1=100,sum1=0;
		do
		{
			if(start1%2==0 && start1%3==0)
			{
				sum1=sum1+start1*start1;
			System.out.println(sum1);
			}
			start1++;
			
		}
		while(start1<=end1);
		System.out.println("========================== for()=========================");
		int sum2=0;
		for(int i=1;i<=100;i++)
		{
			if(i%2==0 && i%3==0)
			{
				sum2=sum2+i*i;
			System.out.println(sum2);
			}
		}
	}

}
