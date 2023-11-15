package com.thiru.exceptionhandling;



/*
 1) Checked Exception
 ====================

The classes that directly inherit the Throwable class 
except RuntimeException and Error are known as checked exceptions. 
For example, IOException, SQLException, etc. Checked exceptions are checked at compile-time.

2) Unchecked Exception
=======================
The classes that inherit the RuntimeException are known as unchecked exceptions. 
For example, ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, etc. Unchecked exceptions are not checked at compile-time, but they are checked at runtime.
3) Error

Error is irrecoverable. Some example of errors are OutOfMemoryError, VirtualMachineError, AssertionError etc.
 
 

WHAT IS EXCEPITON:
==================
EXCEPTION IS AN EVENT THAT OCCURES DUTING THE EXECUTION OF PROGRAM 
THAT DISTRUP THE NORMAL FLOW OF THE PROGRAM EXECUTION

EXCEPRION HANDLING :
==================
BY DEFAULT JAVA CAN STOP THE EXECUTION OF PROGRAM I DONT WANT THIS
WHENEVER USER WANTS TO HANDLE THE EXCEPION CALLED AS EXCEPION HANDLING

DIFFERENT TYPES OF EXCEPTIONS
====================================
1) CHECKED EXCEPTIONS   ==>COMPILETIME EXCEPTION ==> 
2) UNCHECKED EXCEPTIONS ==> RUNTIME EXCEPTION    ==>  AT THE TIME OF EXCECUTION THESE EXCEPTIONS ARE COME

1) CHECKED EXCEPTIONS   ==>COMPILETIME EXCEPTION
================================================
IF WE HAVE TO IDENTIFY THE EXCEPTION AT COMPILE TIME CALLED CHECKED OR COMPILE TIME EXCEPTIONS
2) UNCHECKED EXCEPTIONS ==> RUNTIME EXCEPTION 
==============================================
IF WE DONT  HAVE TO IDENTIFY THE EXCEPTIONS AT COMPILE TIME THESE EXCEPTIONS ARE CALLED RUNTIME EXCEPTION 


IF WE WANT TO HANDLE THE EXCEPTIONS 

1) TRY  2) CATCH 3) FINALLY BLOCKS ARE USED AND ALSO
1)THROW 2)THROWS KEY WORDS ARE USED

STACK TRACE:
============

1) EXCEPTION NAME        ==>java.lang.ArithmeticException
2) EXCEPTION MESSAGE     ==> / by zero
3) WHICH LINE NUMBER     ==>
4) METHODS INFORMATION   ==>


STACK TRACE:
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.thiru.exceptionhandling.ExceptionHandling3.method1(ExceptionHandling3.java:62) clck3
	at com.thiru.exceptionhandling.ExceptionHandling3.method2(ExceptionHandling3.java:70) clck2
	at com.thiru.exceptionhandling.ExceptionHandling3.main(ExceptionHandling3.java:77)    clck1

//exception -->TRY BLOCK
//execute -->CATCH BLOCK

methods
=======
Ae.toString()

 */



public class ExceptionHandling04 {
	
     public static void main(String[] args) {
		  System.out.println("PROGRAM EXECUTION START");
			
			int firstNum=10;
			int secNum=0;
			int result=0;
			//RISKY CODE OR EXCEPTION RAISED CODE
			try {
			result=firstNum/secNum; 
			}
			//EXCEPTION HANDLING PART
			
			catch(ArithmeticException Ae)
			{
				System.out.println(Ae.toString());
			}
			
			System.out.println("OUT PUT IS :"+result);
			System.out.println("PROGRAM EXECUTION END");
			
		}
	
		
}
