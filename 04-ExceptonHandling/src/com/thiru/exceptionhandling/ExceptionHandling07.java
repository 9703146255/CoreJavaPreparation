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


STACK TRACE:
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.thiru.exceptionhandling.ExceptionHandling3.method1(ExceptionHandling3.java:62) clck3
	at com.thiru.exceptionhandling.ExceptionHandling3.method2(ExceptionHandling3.java:70) clck2
	at com.thiru.exceptionhandling.ExceptionHandling3.main(ExceptionHandling3.java:77)    clck1

//exception -->TRY BLOCK (TRUE)
//execute -->CATCH BLOCK (TRUE)
 
 TRUE-->EXECUTE FALSE-->NOT EXECUTE
 IF EXCEPTION ==>TRUE
 EXCETPTION  ==> FALSE
 FINALLY BLOCK ALWAYS TRUE
 
 THROW
 ======
Java throw keyword is used throw an exception explicitly in the code, 
inside the function or the block of code.

throw is used within the method.

We are allowed to throw only one exception at a time i.e. we cannot throw multiple exceptions.

THROWS
======
Java throws keyword is used in the method signature to declare an exception
which might be thrown by the function while the execution of the code. 
  
throws is used with the method signature.

We can declare multiple exceptions using throws keyword that can be thrown by the method.
For example, main() throws IOException, SQLException.


UNREACHABLE CODE
=======================
int add(int a,int b)
{
return a/b;
//it is also unreachable code here
}



 */



public class ExceptionHandling07 {
	
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
			catch(ArithmeticException Ae)
			{
				Ae.printStackTrace();
				
				System.out.println(Ae.toString());
				//IF ANY SERIEAS PROBLEM IS OCCURE IN TRY BLOCK THAT WILL SEND TO JAVA BY USING throw keyword
				throw Ae;
				// WE CANNOT WRITE CODE HERE IF WE WRITE HERE IT SHOWS "UN-REACHBLE" CODE HERE,
			}
			finally
			{
				System.out.println("FINALLY BLOCK");
			}
			System.out.println("OUT PUT IS :"+result);
			System.out.println("PROGRAM EXECUTION END");
			
		}
	
		
}
