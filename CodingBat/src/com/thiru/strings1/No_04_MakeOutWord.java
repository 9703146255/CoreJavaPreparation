package com.thiru.strings1;



/*
Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.

makeOutWord("<<>>", "Yay") → "<<Yay>>"
makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
makeOutWord("[[]]", "word") → "[[word]]"
==========================================
return s1.substring(0, 2)+s2+s1.substring(2);
		//(include)0,1,2(exclude)  
==============================================
 */
public class No_04_MakeOutWord {

	public static String makeOutWord(String s1,String s2)
	{
		return s1.substring(0, 2)+s2+s1.substring(2);
		//(include)0,1,2(exclude)      //f
		
	}
	
	
	public static void main(String[] args) {
		System.out.println(makeOutWord("<<>>", "Yay"));
		System.out.println(makeOutWord("<<>>", "WooHoo"));
		System.out.println(makeOutWord("[[]]", "word"));
		System.out.println(makeOutWord("{{}}", "thiru"));

	}

}
