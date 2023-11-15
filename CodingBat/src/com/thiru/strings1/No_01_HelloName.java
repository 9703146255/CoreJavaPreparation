package com.thiru.strings1;
/*
 Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

helloName("Bob") → "Hello Bob!"
helloName("Alice") → "Hello Alice!"
helloName("X") → "Hello X!"
===================================
"Hello "+s+"!";
===================================
 */
public class No_01_HelloName {

	public static String helloName(String s)
	{
		return "Hello "+s+"!";
	}
	

	public static void main(String[] args) 
	{
		System.out.println(helloName("Bob"));
		System.out.println(helloName("Alice"));
		System.out.println(helloName("X"));
			
	}

}
