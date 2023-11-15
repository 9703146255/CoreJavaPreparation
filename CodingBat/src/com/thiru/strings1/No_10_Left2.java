package com.thiru.strings1;

/*
Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.

left2("Hello") → "lloHe"
left2("java") → "vaja"
left2("Hi") → "Hi"
 */


public class No_10_Left2 {
	public static String left2(String s)
	{
		return s.substring(2) + s.substring(0,2);
	}            //llo            he=>include(0),1,(2)exclude


public static void main(String[] args) {
System.out.println(left2("Hello"));
System.out.println(left2("java"));
System.out.println(left2("Hi"));
	}

}
