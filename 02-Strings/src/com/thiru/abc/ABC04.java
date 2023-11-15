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

COPY OF STRING          a[i]=y[i] 
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

 
 */


public class ABC04 {

	public static void main(String[] args) {

//          String x="abc tech";
//        
//        //to convert string to character array {a,b,c, ,t,e,c,h}=7(length)
//          char[] y=x.toCharArray();
//          int len=y.length;
//          char[] a=new char[len];
//          
//          int i=0;
//          while(i != len)
//          {
//        	  a[i]=y[i];
//        	  i++;
//          }
//          System.out.println(y);
//          System.out.println(a);
          
    
		
//		String s="abc tech";
//		int len=s.length();
//		char[] x=s.toCharArray();
//		char[] y=new char[len];
//		
//		int i=0;
//		while(i != len)
//		{
//			y[i]=x[i];
//			
//			i++;
//		}
//		System.out.println(x);
//		System.out.println(y);
//		
		
//		String s="thop thiru";
//		int len=s.length();
//		char[] x=s.toCharArray();
//		char[] y=new char[len];
//		int i=0;
//		while(i != len)
//		{
//			y[i]=x[i];
//			i++;
//		}
//		System.out.println(x);
//		System.out.println(y);
		
		
//		//counting number of elements in a strnigs without using length method
//	String  name = "thiru";
//	name=name.concat("@");
//	char[] x=name.toCharArray();
//	int i=0;
//	int count=0;
//	
//	while(x[i] != '@')
//	{
//		count++;
//		i++;
//	}
//		System.out.println(count);
		
		
		
//copy of strings from one string to another string		
		

//		String name="thirumalesh";
//		int len=name.length();
//		char[] x=name.toCharArray();
//		char[] y=new char[len];
//		int i=0;
//		while(i != len)
//		{
//			y[i]=x[i];
//			
//			i++;
//		}
//		System.out.println(x);
//		System.out.println(y);
		
		//or 
		
//		String name="thirumalesh";
//		int len=name.length();
//		char[] x=name.toCharArray();
//		char[] y=new char[len];
//		int i=0;
//		while(i != len)
//		{
//			y[len-i-1]=x[i];
//			i++;
//		}
//		System.out.println(x);
//		System.out.println(y);
		
//		String name="thirumalesh";
//		int len=name.length();
//		char[] x=name.toCharArray();
//		char[] y=new char[len];
//		int i=0;
//		while(i != len)
//		{
//			
//			y[i]=x[i];
//			i++;
//		}
//		System.out.println(x);
//		System.out.println(y);
		
		
//		String name="thiru";
//		char[] x=name.toCharArray();
//		int len=name.length();
//		char[] y=new char[len];
//		
//		int i=0;
//		while(i != len)
//		{
//			y[i]=x[i];
//			
//			i++;
//		}
//		System.out.println(x);
//		System.out.println(y);
		
		
		
		
		String name="thiru hi how are you";
		char[] x=name.toCharArray();
		int len=name.length();
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
