package com.thiru.abc;


/*
 STRINGS: COLLECION OF SEQUENTIAL CHARACTERS CALLED AS STRINGS
 IN JAVA STRINGS TREATS AS AN OBJECT
 IMMUTABLE IN NATURE
 


IN C language
==============
we can access the data directly
no '\0' at the end

TWO CHALLANGES
===============
NO direct  access the data directly
NO '\0' at the end

charAt() method
===============
if we want to retrieve single character data we can use -->charAt(number(0 to n))  method

length() method
===============
if we want to calculate the length of the string-->var.length()

without using inbuilt method to calculate the length of the string
==================================================================

COPY OF STRING    ==> a[i]=y[i] 
================


REVERSE OF STRING==> a[size-1-i]=y[i] 
================
a[i]        y[i]
=================
7			0
6			1
5			2
4			3
3			4
2			5
1			6
0			7

a[size-1-i]    y[i]  
===========================
8-1-i			0
8-1-i			1
8-1-i			2
8-1-i			3
8-1-i			4
8-1-i			5	
8-1-i			6
8-1-i			7

P

 
 */


public class ABC05 {

	public static void main(String[] args) {

	 
		
		//reversing of String
//		String name="raghuvaran";
//		int len=name.length();
//		char[] x=name.toCharArray();
//		char[] y=new char[len];
//		
//		int i=0;
//		while(i != len)
//		{
//			y[len-i-1]=x[i];
//			i++;
//		}
//		System.out.println(x);
//		System.out.println(y);
		
		
		
		String name="thirumalesh";
		int len=name.length();
		char[] x=name.toCharArray();
		char[] y=new char[len];
		int i=0;
		while(i != len)
		{
			y[len-i-1]=x[i];
			
			i++;
		}
		System.out.println(x);
		System.out.println(y);
		
		
		 
		 
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
          
	}

}
