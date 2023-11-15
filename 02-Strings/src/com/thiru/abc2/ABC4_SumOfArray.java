package com.thiru.abc2;

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


1st) toCharArray() approach 
===========================================

check vowels,consonants, special characters

==>fix start,end, iterate value
==> (a to z) ==> filter (vowels and consonents)
==>remaining are special characters


CHECK GIVEN STRINGS ARE ANAGRMA OR NOT==> Arrays.sort(a), Arrays.equals(a,b)
=======================================
1)SORT DATA IN STRING ==>Arrays.sort(a);
2)COMPARE THE SORTED DATA ==>Arrays.equals(a, b);
AFTER SORTNG STRINGS ARE EQUAL ==> ANAGRAMS
AFTER SORTNG STRINGS ARE NOT EQUAL==> NOT ANAGRAMS


or 

HE is  AraDHYA
IS he  HradaYA

CHECK GIVEN STRING IS PANAGRAM OR NOT
=====================================
THE QUICK BROWN FOX JUMPS OVER A LAZY DOG
84-65 =19
72-65 =7
int a[]= {0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0};
         0 1 2 3 4 5 6 7 8 9 10 11 12 13       19           25
         
 while(i != len)
		{
			int index=y[i]-65;
			a[index]=1;
			i++;
		}        
         

         
 forEach loop
 ============
adding elements in the array    
         
*/


public class ABC4_SumOfArray {

	public static void main(String[] args) {


//		int[] x= {10,20,30,40,50};
//		int sum=0;
//		for(int res:x)
//		{
//			sum=sum+res;
//		}
//		System.out.println("sum of the array is :"+sum);
		
		
		
		
		int[] x= {10,20,30,40,50,60};
//		int sum=0;
//		int len=x.length;
//		for(int i=0;i<len;i++)
//		{
//			sum+=x[i];
//		}
//		System.out.println(sum);
		
		
		int sum=0;
		for(int res:x)
		{
			sum+=res;
		}
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
	}

}
