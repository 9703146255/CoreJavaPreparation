package com.thiru.exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

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

                           MANDATORY  & OPTIONAL         
                        ===================================================
===> case1)              try(man)        catch(man)            finally(optional)
===> case2)              try(man)        catch(optional)       finally(man)
===> case3)              try             catch                 finally
always TRY IS MONDATORY AND FIRTS BLOCK
3-BLOCKS ==> WE CAN TRY 3 FACTORIAL TIMES HERE



 Throwable==========>     Exception
                             IOException
                             SQLException
                             ClassNotFoundException
                             RunTimeException =========>ArithematicException
                                                        NullPointerException
                                                        NumberFormatExcetpion
                                                        IndexOutOfBoundsException==>ArrayIndexOutOfBoundsException
                                                                                    StringIndexOutOfBoundsException


HIERARCHY OF EXCCEPTION IN JAVA
================================
Object                          object throw on man exception occure man he didnt run io io io cool stop and sit
     Throwable
          Exception
                RuntimException
                       IndexOutOfBoundsException  india lo NALLA vallu ARRA  vallu RUN chestunnaru
                       NullPointerException
                       ArithematicException
                IOException
                        FileNotFoundException
                SQLException



 */



public class ExceptionHandling12 {
	                                       //WE HAVE TO THROWS  MULTIPLE EXCEPTIONS ALSO AT A TIME
     public static void main(String[] args) throws FileNotFoundException {
		  System.out.println("PROGRAM EXECUTION START");
			

			
		}
	
		
}
