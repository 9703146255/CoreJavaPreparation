package com.thiru.strings1;
/*
Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"

===========================================
int mid=s.length()/2;        //mid==>0,mid
		return s.substring(0,mid);
============================================
 */
public class No_07_FirstHalf {

	public static String firstHalf(String s)
	{
		int mid=s.length()/2;        //mid==>0,mid
		return s.substring(0,mid);
	}
	
	
	
	
	public static void main(String[] args) {
		System.out.println(firstHalf("WooHoo"));
		System.out.println(firstHalf("HelloThere"));
		System.out.println(firstHalf("abcdef"));
		

	}

}
