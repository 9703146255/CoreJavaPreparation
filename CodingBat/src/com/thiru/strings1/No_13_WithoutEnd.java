package com.thiru.strings1;

/*
Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.
withouEnd2("Hello") → "ell"
withouEnd2("abc") → "b"
withouEnd2("ab") → ""
 */


public class No_13_WithoutEnd {
	public static String withouEnd2(String s)
	{
		if(s.length()<=2)
		{
			return "";
		}
		else
		{
			return s.substring(1,s.length()-1);
		}
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(withouEnd2("Hello"));
		System.out.println(withouEnd2("abc"));
		System.out.println(withouEnd2("ab"));
	
	}

}
