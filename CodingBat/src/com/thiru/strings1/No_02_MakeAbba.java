package com.thiru.strings1;
/*
Given two strings, a and b, return the result of putting them together in the order abba,
 e.g. "Hi" and "Bye" returns "HiByeByeHi".
makeAbba("Hi", "Bye") → "HiByeByeHi"
makeAbba("Yo", "Alice") → "YoAliceAliceYo"
makeAbba("What", "Up") → "WhatUpUpWhat"
============================================
 s1+s2+s2+s1;
============================================


 */

public class No_02_MakeAbba {

	public static String makeAbba(String s1, String s2)
	{
	return s1+s2+s2+s1;
	}
		
public static void main(String[] args) {
System.out.println(makeAbba("Hi", "Bye"));
System.out.println(makeAbba("Yo", "Alice"));
System.out.println(makeAbba("What", "Up"));
		
		
		
	}

}
