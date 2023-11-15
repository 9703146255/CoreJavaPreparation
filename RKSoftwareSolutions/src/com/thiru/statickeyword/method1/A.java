package com.thiru.statickeyword.method1;

public class A {
	int a=40;//non static  
static int b=40;// static  

	public static void main(String[] args) {
			//  System.out.println(a);   //Static
		System.out.println(b); //static values we can use inside static method
	}

}


/*
Q) Why is the Java main method static?
Ans) It is because the object is not required to call a static method.
 	 If it were a non-static method,
 	 JVM creates an object first then call main() method
 	 that will lead the problem of extra memory allocation.



*/