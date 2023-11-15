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
IF WE  HAVE TO IDENTIFY THE EXCEPTIONS AT run TIME THESE EXCEPTIONS ARE CALLED RUNTIME EXCEPTION 


IF WE WANT TO HANDLE THE EXCEPTIONS 

key words
===========
1) TRY  2) CATCH 3) FINALLY BLOCKS ARE USED AND ALSO
1)THROW 2)THROWS KEY WORDS ARE USED

RUNTIME EXCEPTION
		INDEXE OUT OF BOUND EXCEPTION
		NullPointerException
		ArithematicExcetpion
IO EXCEPTION
		FileNotFoundException
SQL EXCEPTION



1) try 
======

==>we will place RISKY CODE/EXCEPTION MAY RAISE  code inside the Try block
==>try is always associated with catch block or try finally block

catch
=====
//it will catch the exception what ever the error we will get
It will print  Error message
it will print which line we got error
catch block is always associated with try


finally
=======
finally block will be always execute, exception one case Sytem.exit(0)
which is having the RESOURSE RELEASE CODE
 

finally block in Java can be used to put "cleanup" code such as "closing a file", "closing connection", etc.
The "important statements to be printed" can be placed in the finally block.


THROW
 ======
==>Java throw keyword is used "throw" an exception explicitly in the code.
==>throw is used within the method.
==>Its allowed to throw only one exception at a time i.e. 
==>we cannot throw multiple exceptions.

THROWS
======
Java throws keyword is used in the method signature to declare an exception 
throws is used with the method signature.

We can declare multiple exceptions using throws keyword. that can be thrown by the method.
For example, main() throws IOException, SQLException.




final                                   finally 											finalize()
=====									=======												=========
varibles								finally												finalize()
methods									{													{
classes									Clean up;											Clean up;
										}													}
										
it is a keyword						It is a block										It is a method




 */



public class ExceptionHandling02 {

	public static void main(String[] args) {
	
		System.out.println("PROGRAM EXECUTION START");
		
		int firstNum=10;
		int secNum=0;
		int result;
		
		result=firstNum/secNum;
		
		System.out.println(result);
		System.out.println("PROGRAM EXECUTION END");
		
		
		

	}

}
