package com.thiru.strings1;

/*
Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
The string length will be at least 2.
extraEnd("Hello") → "lololo"
extraEnd("ab") → "ababab"
extraEnd("Hi") → "HiHiHi"
==================================================================
//totalLength-2// we get last 2 characters//l-3 get 3 char//l-4 get 4 char
String lastTwoChar=s.substring(s.length()-2);
return lastTwoChar+lastTwoChar+lastTwoChar;
==================================================================

 */
public class No_05_ExtraEnd {

	
	public static String extraEnd(String s)
	{
		
		if(s.length()<2)
		{
			return s+s+s;
		}
		else 
		{								
			//totalLength-2// we get last 2 characters//l-3 get 3 char//l-4 get 4 char
			String lastTwoChar=s.substring(s.length()-2);
			return lastTwoChar+lastTwoChar+lastTwoChar;
		}
	
	}
	
	public static void main(String[] args) {

		System.out.println(extraEnd("Hello"));
		System.out.println(extraEnd("ab"));
		System.out.println(extraEnd("Hi"));
		}

}
