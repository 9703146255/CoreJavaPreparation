package com.thiru.functionalinterface;

import java.util.function.Predicate;

public class FIPredicate {
	
 /*
 FUNCTIONAL INTERFACE:
 THERE ARE 4 TYPES OF FUNCTIONAL INTERFACES IN JAVA
 1)PREDI CATE --> IT WILL GIVE THE BOOLEAN RESULT ==> test()
 2)C"ON"SUMER  --> IT WILL NOT GIVE RESULT      ==>accept()
 3)FUNCTION/job  --> INPUT AND OUTPUT				==>apply()
 4)SUPPLIER  --> NO INPUT ONLY SUPPLY			==>get()
 
 WHAT IS FUNCTIONAL INTERFACE
 ============================
 IN THE INTERFACE WHICH IS HAVING ONLY ONE ABSTRACT METHOD THATS CALLED FUNCTIANAL INTERFACE

  */
	
	

	public static void main(String[] args) {
		
//		Predicate<String> checkLength=str->str.length()>5;
//		
//		//Check if the length of the string > 5 true else false
//		System.out.println(checkLength.test("thiruu"));
		
		 
		Predicate<String> name=s->s.length()>50;
		System.out.println(name.test("kiran kiran kirannnnnnkiran kiran kirannnnnnkiran kiran kirannnnnnkiran kiran kirannnnnnkiran kiran kirannnnnn"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
