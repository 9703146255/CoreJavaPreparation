package com.thiru.exceptionhandling;



/*

  [] Object
  		()Throwable
  			 []Exception
  			 		[RISQ]
  			 		()RuntimeException
  			 			[]IndexOutOfBoundsException
  			 			[]NullPointerException
  			 			[]ArithematicException
  			 		()IOException
  			 			[]FileNotFoundException
  			 		()SQLException




WHAT IS EXCEPITON:
==================
EXCEPTION IS AN EVENT THAT OCCURES DUTING THE EXECUTION OF PROGRAM 
THAT DISTRUP THE NORMAL FLOW OF THE PROGRAM EXECUTION.
Ae.toString(),
Ae.getMessage(),
Ae.getStackTrace()

 */



public class ExceptionHandling01 {

	public static void main(String[] args) {
	
		System.out.println("PROGRAM EXECUTION START");
		
		int firstNum=10;
		int secNum=1;
		int result;
		
		result=firstNum/secNum;
		
		System.out.println(result);
		System.out.println("PROGRAM EXECUTION END");
		
		
		

	}

}
