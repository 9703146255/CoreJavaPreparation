package com.thiru.singleton;

public class Test {

	public static void main(String[] args) {

		 SingletoneClassExample s1=SingletoneClassExample.getInstance();
		 SingletoneClassExample s2=SingletoneClassExample.getInstance();
		 SingletoneClassExample s3=SingletoneClassExample.getInstance();
		 
		 System.out.println(s1.hashCode());
		 System.out.println(s2.hashCode());
		 System.out.println(s3.hashCode());
		
		
		
		/*
		 * SingletoneClassExample s1=new SingletoneClassExample();
		 * SingletoneClassExample s2=new SingletoneClassExample();
		 * SingletoneClassExample s3=new SingletoneClassExample();
		 * System.out.println(s1.hashCode()); System.out.println(s2.hashCode());
		 * System.out.println(s3.hashCode());
		 * note: If we are making contructor as a private we cant't give access to create object for constructor
		 */
		
		
		
		
	}

}
