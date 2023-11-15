package com.thiru.strings1;

/*
Given 2 strings, return their concatenation, 
except omit the first char of each. 
The strings will be at least length 1.

nonStart("Hello", "There") → "ellohere"
nonStart("java", "code") → "avaode"
nonStart("shotl", "java") → "hotlava"
===================================
return s1.substring(1)+s2.substring(1);
=======================================
 
 */


public class No_09_NonStart {

	public static String nonStart(String s1,String s2)
	{
		return s1.substring(1)+s2.substring(1);
	}
	public static void main(String[] args) 
	{
		System.out.println(nonStart("Hello", "There"));
		System.out.println(nonStart("java", "code"));
		System.out.println(nonStart("shotl", "java"));
	}

}
