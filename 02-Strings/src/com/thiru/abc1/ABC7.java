package com.thiru.abc1;


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


NEGLECT THE SPACES
==================
if(y[i] != ' ')

CONVERT FIRST LETTER TO UPPER CASE
==================================
aradhya brillian center ==> Aradhya Brillian Center

check vowels,consonants, special characters
===========================================
==>fix start,end, iterate value
==> (a to z) ==> filter (vowels and consonants)
==>remaining are special characters


step:1==> while=> if(y[i] >='a' && y[i] <='z') vow & cons else spe

*/

public class ABC7 {

	public static void main(String[] args) {
//		String x="aradhya brillian's center's";
//		char[] y=x.toCharArray();
//		int len=y.length;
//		
//		int vowcnt=0;
//		int concnt=0;
//		int spclcnt=0;
//		
//		int i=0;
//		while(i != len)
//		{
//			if(y[i] >='a' && y[i] <='z')
//			{
//				if(y[i]=='a' || y[i]=='e'  || y[i]=='i' || y[i]=='o' || y[i]=='u')
//				{
//					vowcnt++;
//				}
//				else
//				{
//					concnt++;
//				}
//			}
//			else
//			{
//				spclcnt++;
//			}
//			
//				
//			i++;
//		}
//		System.out.println("vowcnt :"+vowcnt);
//		System.out.println("concnt :"+concnt);
//		System.out.println("spclcnt :"+spclcnt);

		
//		String name="aradhya brillian's center's";
//		char[] x=name.toCharArray();
//	    int len=x.length;
//	    int vowCount=0;
//	    int conCount=0;
//	    int spcCount=0;
//	    
//	    int i=0;
//	    while(i != len)
//	    {
//	    	if(x[i]>='a' && x[i]<='z')
//	    	{
//	    		if(x[i]=='a' || x[i]=='e' || x[i]=='i' || x[i]=='o' || x[i]=='u')
//	    		{
//	    			vowCount++;
//	    		}
//	    		else
//	    		{
//	    			conCount++;
//	    		}
//	    		
//	    	}
//	    	else
//	    	{
//	    		spcCount++;
//	    	}
//	    	i++;
//	    }
//		
//	    System.out.println("vowels count : "+vowCount);
//	    System.out.println("vowels count : "+conCount);
//	    System.out.println("vowels count : "+spcCount);
		
		
		
//		String name="aradhya brillian's center's";
//		char[] x=name.toCharArray();
//		int len=name.length();
//		int cCount=0;
//		int sCount=0;
//		int vCount=0;
//		
//		int i=0;
//		while(i != len)
//		{
//			
//			if(x[i]>='a' && x[i]<='z')
//			{
//				if(x[i]=='a' || x[i]=='e' || x[i]=='i' || x[i]=='o' || x[i]=='u' )
//				{
//					vCount++;
//				}
//				else
//				{
//					cCount++;
//				}
//			}
//			else
//			{
//				sCount++;
//			}
//			i++;
//		}
//		System.out.println("vCount "+vCount);
//		System.out.println("cCount "+cCount);
//		System.out.println("sCount "+sCount);
		
		
//		String name="aradhya brillian's center's";
//		char[] x=name.toCharArray();
//		int len=x.length;
//		int vc=0;
//		int cc=0;
//		int spc=0;
//		
//		int i=0;
//		while(i != len)
//		{
//			if(x[i]<='z' && x[i]>='a')
//			{
//				if(x[i]=='a' || x[i]=='e' || x[i]=='i' || x[i]=='o' || x[i]=='u')
//				{
//					vc++;
//				}
//				else
//				{
//					cc++;
//				}
//			}
//			else 
//			{
//				spc++;
//			}
//			i++;
//		}
//		System.out.println("vowel are :"+vc+" consonents :"+cc+" special characters are: "+spc);
//		
	
		
		String name="aradhya brillian's center's";
		int len=name.length();
		char[] x=name.toCharArray();
		int vcount=0,ccount=0,scount=0;
		int i=0;
		while(i != len)
		{
			if((x[i] >='a' && x[i]<='z')  ||  (x[i] >='A' && x[i]<='A'))
			{
				if(x[i]=='a' || x[i]=='e' || x[i]=='i' || x[i]=='o' || x[i]=='u' || x[i]=='A' || x[i]=='E' || x[i]=='I' || x[i]=='O' || x[i]=='U')
				{
					vcount++;
				}
				else
				{
					ccount++;
				}
			}
			else
			{
				scount++;
			}
			
			i++;
		}
		System.out.println("vowels count: "+vcount);
		System.out.println("consonents count: "+ccount);
		System.out.println("special character count: "+scount);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}

}
