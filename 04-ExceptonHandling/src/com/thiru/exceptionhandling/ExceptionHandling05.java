package com.thiru.exceptionhandling;



/*

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
EXCEPTION NAME
EXCEPTION MESSAGE

STACK TRACE:
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.thiru.exceptionhandling.ExceptionHandling3.method1(ExceptionHandling3.java:62) clck3
	at com.thiru.exceptionhandling.ExceptionHandling3.method2(ExceptionHandling3.java:70) clck2
	at com.thiru.exceptionhandling.ExceptionHandling3.main(ExceptionHandling3.java:77)    clck1

//exception -->TRY BLOCK (TRUE)(FALSE)
//execute -->CATCH BLOCK (TRUE)(FALSE)
 
 TRUE-->EXECUTE FALSE-->NOT EXECUTE
 IF EXCEPTION ==>TRUE
 EXCETPTION  ==> FALSE
 FINALLY BLOCK ALWAYS TRUE
  


 */



public class ExceptionHandling05 {
	
     public static void main(String[] args) {
		  System.out.println("PROGRAM EXECUTION START");
			
			int firstNum=10;
			int secNum=0;
			int result=0;
			//RISKY CODE OR EXCEPTION RAISED PART
			try {
			result=firstNum/secNum; 
			}
			//EXCEPTION HANDLING PART
			//EXCEPTION NAME,MESSAGE PRINTED HEARE
			//IT WILL BE EXECUTE AT THE TIME OF EXCETPION ONLY
			catch(ArithmeticException Ae)
			{
				
				System.out.println(Ae.toString());
			}
			finally ///////////////////
			{
				System.out.println("FINALLY BLOCK");
			}
			System.out.println("OUT PUT IS :"+result);
			System.out.println("PROGRAM EXECUTION END");
			
		}
	
		
}
