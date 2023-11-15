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
 8) PRING SUM OF SQUARES OF EVEN NUMBER  WHICH IS DIV BY 3 FROM 1 TO 100
 
 
 
 */
public class EPrint1To100Div3and5 {

	public static void main(String[] args) {
		System.out.println("=====================while()===============");
		int start=1,end=100;
		while(start<=end)
		{
			if(start%3==0 && start%5==0)
			{
				System.out.println(start);
			}
			start++;
		}
		
		System.out.println("=====================do while()===============");
		int start1=1,end1=100;
		
		do
		{
			if(start1%3==0 && start1%5==0)
			{
				System.out.println(start1);
			}
			start1++;
		}
		while(start1<=end1);
		System.out.println("=====================for()===============");
		
		for(int i=1;i<=100;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println(i);
			}
		}
		
		
		
	}

}
