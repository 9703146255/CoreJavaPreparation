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

CHECK GIVEN STRING IS POLINDROME OR NOT
=======================================
LEVEL
RACECAR
RADAR
REFER
CIVIC

-------------
0  1  2  3  4
L  E  V  E  L  ==>ORIGINAL

0  1  2  3  4
L  E  V  E  L  ==>OFTER REVERSE
-------------
0 1 2 3 4 
I N D I A

0 1 2 3 4 
A I D N I
-------------




if (a[i] != y[i]) l != l false
{                 e != e false
syso(no poli)     count will increase each time
}
else
{
count ++;
continue;
}
 
 
 too hot to hoot -->NOT A POLINDROME
 ========================================================
 x=x.replace(" ", ""); // add extra as ==> replace method ==> POLINDROME

too Hot to HOOT -->NOT A POLINDROME
 
 
 
 ex1: LEVEL
 ex2: too hot to hoot  ==>	toohottohoot
 ex2: too Hot to HOOT  ==>  tooHottoHOOT	==>	too hot to hoot ==>	toohottohoot[before]==>	toohottohoot[after reverse]
 
 
 
 */


public class ABC06 {

	public static void main(String[] args) {

//       String x="LEVEL";
//       char[] y=x.toCharArray();
//       int len=y.length;
//       char[] a=new char[len];
//       int i=0;
//       //all iteration values and reverse
//       //=================================
//       while(i != len)
//       {
//    	   a[len-1-i]=y[i];
//    	   i++;
//       }
//       
//       i=0;
//       while(i != len)
//       {
//    	   //a[i] not equal of y[i]
//    	   //WE WILL GET UNIQUE HERE
//    	   //COMPARE FIRST AND LAST ELEMENT
//    	   //LEVEL //BEFOR
//    	   //LEVEL //AFTER REVERSE
//    	   if(a[i] != y[i])  
//    	   {
//    		   System.out.println("not a polindrome");  //NPE
//    		   System.exit(0);
//    	   }
//    	   else
//    	   {
//    		   ++i; //1,2,3,4,5      INC/C
//    		   continue;
//    	   }
//       }
//       System.out.println("given string is polindrome");
          
		
		
		

					
		

		
		
		
		

		
		
		
		String name="LEVEL";
		int len=name.length();
		char[] x=name.toCharArray();
		char[] y=new char[len];
		int i=0;
		while(i != len)
		{
			y[len-i-1]=x[i];
			
			i++;
		}
		
		i = 0;
		while(i != len)
		{
			if(x[i] != y[i])
			{
				System.out.println("not a polindrome");
				System.exit(0);
			}
			else
			{
				i++;
				continue;
			}
		}
		System.out.println("given string is polindrome");
		
	//check given string is polindrome or not
		
		
		

		
		
		
		
		
		
		
		
		
		
          
	}

}
