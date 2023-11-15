package com.thiru.strings1;
/*
 Given a string, return a version 
 without the first and last char, 
 so "Hello" yields "ell". 
 The string length will be at least 2.

withoutEnd("Hello") → "ell"
withoutEnd("java") → "av"
withoutEnd("coding") → "odin"
============================
return s.substring(1,s.length()-1);
========================================
 */

public class No_08_WithoutEnd {
	public static String withoutEnd(String s)
	{
		return s.substring(1,s.length()-1);
		
	}

	public static void main(String[] args) {

		
		
		System.out.println(withoutEnd("Hello"));
		System.out.println(withoutEnd("java"));
		System.out.println(withoutEnd("coding"));
	}

}
