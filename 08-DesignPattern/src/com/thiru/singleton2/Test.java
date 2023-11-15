package com.thiru.singleton2;

import java.lang.reflect.Constructor;

public class Test  {



	public static void main(String[] args) {

		 SingletoneClassExample s1=SingletoneClassExample.getInstance();
		 SingletoneClassExample s2=SingletoneClassExample.getInstance();
		 SingletoneClassExample s3=SingletoneClassExample.getInstance();
		 
		 System.out.println(s1.hashCode());
		 System.out.println(s2.hashCode());
		 System.out.println(s3.hashCode());
		 
		 //reflection
		 //==========
		 Constructor<?>[] s4 = SingletoneClassExample.class.getDeclaredConstructors();
		 s4[0].setAccessible(true);
		 System.out.println(s4[0].hashCode());
		 
		 
		 
		
		
		
		 
		 
		 
		 
		/*
		 * Re-flection==> we can call==> private constructor,private methods from outside of the class we can call
		 * De-serialisation
		 * Cloning
		 * Multithredding
		 * 
		 * based on these we can break the singleton class/creating one object
		 * 
		 * 
		 * 
		 * 
		 * 
		 * SingletoneClassExample s1=new SingletoneClassExample();
		 * SingletoneClassExample s2=new SingletoneClassExample();
		 * SingletoneClassExample s3=new SingletoneClassExample();
		 * System.out.println(s1.hashCode()); System.out.println(s2.hashCode());
		 * System.out.println(s3.hashCode());
		 * note: If we are making contructor as a private we cant't give access to create object for constructor
		 */
		
		
		
		
	}

}
