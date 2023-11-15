package com.thiru.strings1;
/*
Given a string, return the string made of its first two chars,
 so the String "Hello" yields "He". 
 If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "".
  Note that str.length() returns the length of a string.
firstTwo("Hello") → "He"
firstTwo("abcdefg") → "ab"
firstTwo("ab") → "ab"
=====================================================
	return s.substring(0,2);
=====================================================
 */
public class No_06_FirstTwo {
   
	public static String firstTwo(String s)
	{
		if(s.length()<2)
		{
			return s;
		}
		else 
		{
			return s.substring(0,2);
		}
					
		
	}
	
	public static void main(String[] args) {
		System.out.println(firstTwo("Hello"));
		System.out.println(firstTwo("abcdefg"));
		System.out.println(firstTwo("a"));

	}

}
