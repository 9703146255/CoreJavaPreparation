package com.thiru.strings1;
/*
Given a string of even length, return a string made of the middle two chars,
so the string "string" yields "ri". 
The string length will be at least 2.

middleTwo("string") → "ri"
middleTwo("code") → "od"
middleTwo("Practice") → "ct"
 */
public class No_15_MiddleTwo {
	public static String middleTwo(String s)
	{
		int mid=s.length()/2;
		return s.substring(mid-1, mid+1);
	}

	public static void main(String[] args) {
		System.out.println(middleTwo("string"));
		System.out.println(middleTwo("code"));
		System.out.println(middleTwo("Practice") );
	}

}
