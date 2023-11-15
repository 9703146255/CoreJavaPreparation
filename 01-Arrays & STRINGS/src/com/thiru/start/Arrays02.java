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


//Access Array Elements
//======================
access array elements
array[index]





 */



//Access Array Elements By using FOR loops
public class Arrays02 {

	public static void main(String[] args) {

		
		System.out.println("TYPE-1");
		int[] age= {25,26,24,28,35};
		
		//NORMAL FOR LOOP
	    for(int i=0;i<age.length;i++)
	    {
	    	System.out.println(age[i]);
	    }
		
		System.out.println("TYPE-2");
		int[] age1=new int[5];
		age1[0]=10;
		age1[1]=20;
		age1[2]=30;
		age1[3]=40;
		age1[4]=50;
		
		//NORMAL FOR LOOP
		   for(int i=0;i<age.length;i++)
		    {
		    	System.out.println(age[i]);
		    }
		
		
		
		System.out.println("TYPE-2");
		int[] age2=new int[] {10,20,30,40,50};  //new int[X] get error
		
		//NORMAL FOR LOOP
		   for(int i=0;i<age.length;i++)
		    {
		    	System.out.println(age[i]);
		    }
		
	
		
		
		
		
		
	}

}
