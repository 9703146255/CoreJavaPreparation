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
count ++;  //always execute when polindrome
continue; //skip
}

x=x.replace(" ","") method
================
too hot to hoot -->tootottohoot

x=x.replace(" ","") method
x=x.toUpperCase() or x=x.toLowerCase() methods
====================================== 
too Hot to HOOT ==>TOOHOTTOHOOT(IF UPPERCASE)


CONVERT UPPERCASE TO LOWER CASE
================================
UPPERCASE+32=LOWERCASE
65       +32=97

a    b  c    d    e    f   ---------
97  98  99  100  101  102

DIFFERENCE EACH LETTER IS ==> 32

A   B    C    D   E    F   --------
65  66   67   68  69   70


CONVERT LOWER CASE TO UPPER CASE
================================
LOWERCASE-32=UPPERCASE
97       -32=65




CONVERT LOWER CASE TO UPPER CASE
================================
LOWERCASE-32=UPPERCASE
97       -32=65
 
 */

//To convert lower to "upper case"
public class ABC09 {

	public static void main(String[] args) {
		
		
//upper to lower conversion
//		String name="thirumalesh golla";
//		int len=name.length();
//		char[] x=name.toCharArray();
//		int i=0;
//		while(i != len)
//		{
//			x[i]=(char) (x[i]-32);
//			i++;
//		}
//		System.out.println(x);
		
//		String name="THIRUMALESH GOLLA";
//		int len=name.length();
//		char[] x=name.toCharArray();
//		int i=0;
//		while(i != len)
//		{
//			if(x[i] != ' ')
//			{
//			x[i]=(char) (x[i]+32);
//			}
//			
//			i++;
//		}
//		System.out.println(x);
		
		
		
		
		
		
		

//      String x="jelly fish";
//      char[] y=x.toCharArray();
//      int len=y.length;
//      
//      int i=0;
//      while(i != len)
//      {
//    	  
//    	  //only one array y[i]
//    	  y[i]=(char) (y[i]-32);
//    	  i++;
//      }
//      System.out.println(x);
//      System.out.println(y);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//	String name="jelly fish";
//	char[] x=name.toCharArray();
//	int len=x.length;
//	
//	int i=0;
//	while(i != len)
//	{
//		x[i]=(char) (x[i]-32);
//		System.out.println(x[i]);
//		i++;
//	}
		
		
//		String name="thirumalesh";
//		int len=name.length();
//		char[] x=name.toCharArray();
//		
//		int i=0;
//		
//		while(i != len)
//		{
//			x[i]=(char) (x[i]-32);
//			i++;
//		}
//		System.out.println(x);
//		
		
		
		
//		String name="thirumalesh  golla";
//		int len=name.length();
//		char[] x=name.toCharArray();
//		int i=0;
//		while(i != len)
//		{
//			x[i]=(char) (x[i]-32);
//			i++;
//		}
//		System.out.println(x);
		
		
		
		
//		String name="THIRUMALESH YADAV";
//		int len=name.length();
//		char[] x=name.toCharArray();
//		int i=0;
//		while(i != len)
//		{
//			
//			
//			if(x[i] != ' ')
//			{
//				x[i]=(char) (x[i]+32);
//			}
//			
//			i++;
//		}
//		System.out.println(x);
		
//		String name="golla thirumalesh how are you";
//		int len=name.length();
//		char[] x=name.toCharArray();
//		x[0]=(char) (x[0]-32);
//		int i=0;
//		while(i != len)
//		{
//			if(x[i]==' ')
//			{
//				x[i+1]=(char) (x[i+1]-32);
//			}
//			i++;
//		}
//		System.out.println(x);
		
		String name="golla thirumalesh how are you";
		int len=name.length();
		char[] x=name.toCharArray();
		x[0]=(char) (x[0]-32);
		int i=0;
	    while(i != len)
	    {
	    	if(x[i]==' ')
	    	{
	    	x[i+1]=(char) (x[i+1]-32);
	    	}
	    	
	    	i++;
	    }
	    System.out.println(x);
	

		 
		
		
//		String name="THIRUMALESH GOLLA";
//		char[] x=name.toCharArray();
//		int len=name.length();
//		
//		int i=0;
//		while(i != len)
//		{  
//			if(x[i] !=' ')
//			{
//			x[i]=(char) (x[i]+32);
//			}
//			i++;
//		}
//		System.out.println(x);
		
		//CONVERT FIRST LETTER UPPERCASE
		//================================
//		
//		String name="GOLLA THIRUMALESH";
//		char[] x=name.toCharArray();
//		int len=name.length();
//		x[0]= (char) (x[0]+32);
//		int i=0;
//		while(i != len)
//		{  
//			if(x[i] ==' ')
//			{
//			x[i+1]=(char) (x[i+1]+32);
//			}
//			i++;
//		}
//		System.out.println(x);
//		
		
		
		//upper case
//		String name="golla thirumalesh";
//		int len=name.length();
//	    char x[]=name.toCharArray();
//	    
//	    int i=0;
//	    while(i != len)
//	    {
//	    	x[i]=(char) (x[i]-32);
//	    	i++;
//	    }
//	    System.out.println(x);
	    
	    
//	    String name="GOLLA THIRUMALESH";
//		int len=name.length();
//	    char x[]=name.toCharArray();
//	    
//	    int i=0;
//	    while(i != len)
//	    { 
//	    	
//	    	if(x[i] != ' ')
//	    	{
//	    	x[i]=(char) (x[i]+32);
//	    	}
//	    	i++;
//	    }
//	    System.out.println(x);
		
		
//		 	String name="golla thirumalesh";
//			int len=name.length();
//		    char x[]=name.toCharArray();
//		    x[0]=(char) (x[0]-32);
//		    
//		    int i=0;
//		    while(i != len)
//		    { 
//		    	
//		    	if(x[i] == ' ')
//		    	{
//		    	x[i+1]=(char) (x[i+1]-32);
//		    	}
//		    	i++;
//		    }
//		    System.out.println(x);
		
		
//		String name="GOLLA THIRUMALESH";
//		int len=name.length();
//	    char x[]=name.toCharArray();
//	    x[0]=(char) (x[0]+32);
//	    
//	    int i=0;
//	    while(i != len)
//	    { 
//	    	
//	    	if(x[i] == ' ')
//	    	{
//	    	x[i+1]=(char) (x[i+1]+32);
//	    	}
//	    	i++;
//	    }
//	    System.out.println(x);
	    		
		
		
		 
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
          
	}

}
