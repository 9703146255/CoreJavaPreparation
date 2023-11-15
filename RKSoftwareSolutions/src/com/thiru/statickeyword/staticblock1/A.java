package com.thiru.statickeyword.staticblock1;
/*
 3) Java static block
	Is used to initialize the static data member.
	It is executed before the main method at the time of classloading
	
	

 */
public class A {

	  static
	  {
		  System.out.println("static block is invoked");
	  }  
	public static void main(String[] args) {
		System.out.println("Hello main");  

	}

}


/*
Q) Can we execute a program without main() method?
starting from Java 11, "Single-File Source Code."

*/