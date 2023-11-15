package com.thiru.emphasis;


/*
 * EXCEPTION PROPOGATION
 * =====================
Exception propagation refers to the "process of propagating" or 
passing an exception from "one method to another" or "from one part of the program to another".
==>When an exception occurs in a method, it can be handled within that method itself using try-catch blocks. 
==> However, if the exception is not handled within the method,
==> it can be propagated to the "calling method" or to the "next higher level" in the call stack. 
 */
public class ExceptionPropogation {

	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println("Exception handled in main method: " + e.getMessage());
		}
	}

	public static void method1() throws Exception {
		method2();
	}

	public static void method2() throws Exception {
		method3();
	}

	public static void method3() throws Exception {
		method4();
	}
	public static void method4() throws Exception {
		throw new Exception("Exception occurred in method4");
	}


}


