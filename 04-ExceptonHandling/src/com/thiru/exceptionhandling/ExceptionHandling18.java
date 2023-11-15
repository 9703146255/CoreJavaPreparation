package com.thiru.exceptionhandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*

WHAT IS EXCEPITON:
==================
EXCEPTION IS AN EVENT THAT OCCURES DUTING THE EXECUTION OF PROGRAM 
THAT DISTRUP THE NORMAL FLOW OF THE PROGRAM EXECUTION

AGENDA
=======
TRY WITH RESOURCES
MULTIPLE CATCH BLOCKS
MULTIPLE EXCEPTIONS IN SINGLE CATCH BLOCK
WHEN WILL BE THE FINALLY BLOCK NOT BE EXECUTED	
ECLIPSE SHORTCUT FOR EXCEPION HANDLING
THROW CUSTOM (USER DEFINED EXCEPTION USING THROW KEYWORD


TRY WITH RESOURCES
==================
WE HAVE TO RUDUCE THE MEMORY LEAKAGE PROBLEMS f.close() --> if i forgot the close method
//we dont get memory leakage problems
//security problems
 
 
 we should use  try-catch-catch-catch........   try-catch-catch-catch........ try-catch-catch-catch........


MULTIPLE EXCEPTIONS IN SINGLE CATCH BLOCK BY SEPERATED PIPE SIMBLE |
=====================================================================
catch(ArithmeticException | FileNotFoundException e1)

WHEN WILL BE THE FINALLY BLOCK NOT BE EXECUTED	
===============================================
system.exit()  finally block is not execute

FINALLY BLOCK IS ALWAYS EXECUTED EXCEPT ONE CASE

 */








//FINALLY BLOCK IS ALWAYS EXECUTED EXCEPT ONE CASE
public class ExceptionHandling18 {

	public static void main(String[] args) throws IOException {
	
	
		try {
		int[] arr= {1,2,3};
		System.out.println(arr[1]/0);          //RISKY CODE
		}
		catch(Exception e1)
		{
			System.out.println("CATCH BLOCK"); //HANDLING CODE
		}
		finally
		{
			System.out.println("FINALLY BLOCK");
		}
			

	}

}
