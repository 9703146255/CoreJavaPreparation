package com.thiru.abstraction;

public abstract class SampleAC implements Laptop{
	
	
	//implemeted methods 
	@Override
	public void copy() {
		System.out.println("Lenovo copy method");
		
	}

	@Override
	public void paste() {
		System.out.println("Lenovo paste method");
		
	}
	//un implemeted methods 
	
	
	public abstract void cut();
	public abstract void keyBoard();


}

// 

/*


1)WHAT IS ABSTRACT CLASS
-----------------------------------------------------------------------------------------

ABSTRACT CLASS : ABSTRACT CLASS IS A CLASS WHICH IS HAVING ABSTRACT METHODS AND USING ABSTRACT KEY WORD
-----------------------------------------------------------------------------------------

2)WHEN TO USE HOW TO USE/CREATE ABSTRACT CLASS
-----------------------------------------------------------------------------------------

COMMON IMPLEMENTATION IS THERE BETWEEN MULTPLE CLASSES THAT COMMON IMPLEMENTATION
 WE CAN KEEP IN ABSTRACT CLASS
OR 
I AM NOT PROVIDE COMPLETE IMPLEMENTATION
REMAINING IMPLEMENTS ABSTRACT CLASS USED PEOPLES.

-----------------------------------------------------------------------------------------
3)CAN WE CREATE INSTANCE OF ABSTRACT CLASS
-----------------------------------------------------------------------------------------

WE CANNOT CREATE INSTANCE OR OBJECT TO THE ABSTRACT CLASS
-----------------------------------------------------------------------------------------
4)CAN WE HAVE NON-ABSTRACT METHODS INSIDE ABSTRACT CLASS
-----------------------------------------------------------------------------------------
YES WE CAN PLACED OR IF WE WANT TO DO PARTIAL/FULLY IMPLEMENTATON THAN ITS PASSIBLE

-----------------------------------------------------------------------------------------
5)CAN WE EXTENDS MULTIPLE ABSTRACT CLASSES INTO SINGLE CLASS
-----------------------------------------------------------------------------------------
NO WE CANNOT EXTENDS MULTIPLE ABSTARCT CLASSES INTO A SINGLE CLASS 

BECOUSE MULTIPLE INHERITENCE JAVA DOES NOT SUPPORT AT CLASS LEVEL

-----------------------------------------------------------------------------------------
5)CAN WE IMPLEMENTS THE ABSTRACT CLASSES LIKE AN INTERFACE?
-----------------------------------------------------------------------------------------
NO WE CANNOT EXTENDS MULTIPLE ABSTARCT CLASSES INTO A SINGLE CLASS 

BECOUSE MULTIPLE INHERITENCE JAVA DOES NOT SUPPORT AT CLASS LEVEL















*/