package com.thiru.exceptionhandling;


/*
 63) Can we have any code between try and catch blocks?{no}
 =========================================================
We shouldn’t declare any code between try and catch block. Catch block should immediately start after try 
block.
try{
//code
}
System.out.println(“one line of code”); // illegal
catch(Exception e){
//
}



64) Can we have any code between try and finally blocks?{no}
==========================================================
We shouldn’t declare any code between try and finally block. finally block should immediately start after 
catch block.If there is no catch block it should immediately start after try block.
try{
//code
}
System.out.println(“one line of code”); // illegal
finally{
//
}




65) Can we catch more than one exception in single catch block?
================================================================
From Java 7, we can catch more than one exception with single catch block. "This type of handling reduces" 
the "code duplication."
Note : When we catch more than one exception in single catch block , "catch parameter is implicity final". 
We cannot assign any value to catch parameter.


Ex : catch(ArrayIndexOutOfBoundsException || ArithmeticException e)
{
20
}
In the above example "e is final we cannot assign any value" or "modify e" in catch statement.



66) What are checked Exceptions?
=================================
1) All the subclasses of Throwable class except "error,Runtime Exception" and its subclasses are checked 
exceptions.
2) Checked exception should be thrown with keyword throws or should be provided try catch block, else 
the program would not compile. We do get compilation error.
Examples :
1) IOException,
2) SQlException,
3) FileNotFoundException,


4) InvocationTargetException,
5) CloneNotSupportedException
6) ClassNotFoundException
7) InstantiationException


67) What are unchecked exceptions in java?
===========================================
All subclasses of RuntimeException are called unchecked exceptions. These are unchecked exceptions 
because compiler does not checks if a method handles or throws exceptions.
Program compiles even if we do not catch the exception or throws the exception.
If an exception occurs in the program,program terminates . It is difficult to handle these exceptions 
because there may be many places causing exceptions.
Example : 1) Arithmetic Exception
3) ArrayIndexOutOfBoundsException//1
4) ClassCastException
5) IndexOutOfBoundException//1
6) NullPointerException//2
7) NumberFormatException
8) StringIndexOutOfBounds
9) UnsupportedOperationException
 */










public class ExceptionHandling00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
