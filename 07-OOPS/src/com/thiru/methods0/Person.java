package com.thiru.methods0;
/*
Class		===>	 Person 
Methods		===>	 takeInputs(), PrintData()
Variables	===> 	 name, age

 
 
 
 
 */
public class Person {
	
	String name;
	int age;
	void takeInputs(String l_name,int l_age)
	{
		name = l_name;
		age = l_age;
	}
	void print()
	{
		System.out.println("name :"+name+" and age is:"+age);
	}

}
