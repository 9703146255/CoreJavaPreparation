package com.thiru.strings1;

/*
Given a string and an int n,
 return a string made of the first and last n chars from the string. 
The string length will be at least n.

nTwice("Hello", 2) → "Helo"
nTwice("Chocolate", 3) → "Choate"
nTwice("Chocolate", 1) → "Ce"
 */
public class No_17_NTwice {
	
	public static String nTwice(String str, int n) {
	    String firstNChars = str.substring(0, n);
	    String lastNChars = str.substring(str.length() - n);
	    return firstNChars + lastNChars;
	}

	public static void main(String[] args) {
		System.out.println(nTwice("Hello", 2));       // Output: "Helo"
	    System.out.println(nTwice("Chocolate", 3));  // Output: "Choate"
	    System.out.println(nTwice("Chocolate", 1));  // Output: "Ce"
		

	}

}
