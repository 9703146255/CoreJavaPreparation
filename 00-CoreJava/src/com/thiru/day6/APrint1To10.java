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

public class APrint1To10 {

	public static void main(String[] args) {
		
		System.out.println("+++++++++++++++++ while() loop++++++++++++++++++++++++");
		int start=1,end=10;
		while(start<=end)
		{
			System.out.println(start);
			start++;
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		System.out.println(start);
		System.out.println(end);
          int first=1;
          int last=10;
		System.out.println("++++++++++++++++do while(); loop+++++++++++++++++++++++++");
		do {
			System.out.println(first);
			first++;
		}
		while(first<=last);
		
		System.out.println("++++++++++++++++++for() loop+++++++++++++++++++++++");
	
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		
		
		
	}
}
