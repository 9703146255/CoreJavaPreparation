package com.thiru.start;


/*
 
  1)What is an Array ?
================
An array is a collection of similar types of data.


For example, if we want to store the names of 100 people then we can create an array of the string type that can store 100 names.
============================================================================================================
String[] array = new String[100];



// among 3 are valid declarations
============================
int intArray[]; 
or int[] intArray;  
or int  []intArray;



byte byteArray[];
short shortsArray[];
boolean booleanArray[];
long longArray[];
float floatArray[];
double doubleArray[];
char charArray[];

// an array of references to objects of
// the class MyClass (a class created by
// user)
MyClass myClassArray[]; 

Object[]  ao,        // array of Object
Collection[] ca;  // array of Collection
                     // of unknown type




3 ways to Declare an array
======================
1)declaration, instantiation and initialization  
2)declaration and instantiation  After //initialization  through INDEXING
3)Array Literal

1)declaration, instantiation and initialization  
======================================
    int a[]={33,3,4,5};//declaration, instantiation and initialization  


2)//declaration and instantiation  After //initialization  through INDEXING
============================================================
int a[]=new int[5];
a[0]=10;//initialization  
a[1]=20;  
a[2]=70;  
a[3]=40;  
a[4]=50;  


3)Array Literal
============
 int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 
 // Declaring array literal

1)Access Array Elements
//======================
access array elements
array[index]

2)ACCESSING ELEMENT BY USING FOR LOOP
3)ACCESSING ELEMENTS BY USING FOR EACH LOOP
4)SUM OF THE ELEMENTS IN THE ARRAY

*/



//print max and minimum values in the array
public class Arrays04 {

	public static void main(String[] args) {
		
		
			int[] marks= {10,20,40,50,80,70,90,60,1,54,9};
			int min=marks[0];
			int max=marks[0];
			for (int i = 0; i < marks.length; i++)
			{
				if(max<marks[i])
				{
					max=marks[i];
				}
				
				if(min>marks[i])
				{
					min=marks[i];
				}
		
			}
			System.out.println("max marks :"+max);
			System.out.println("max marks :"+min);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
