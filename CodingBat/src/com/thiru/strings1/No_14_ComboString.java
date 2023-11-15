package com.thiru.strings1;

/*
Given 2 strings, a and b, return a string of the form short+long+short,
 with the shorter string on the outside and the longer string on the inside. 
The strings will not be the same length, but they may be empty (length 0).
comboString("Hello", "hi") → "hiHellohi"
comboString("hi", "Hello") → "hiHellohi"
comboString("aaa", "b") → "baaab"
 */
public class No_14_ComboString {
		public static String comboString(String s1,String s2)
		{
			if(s1.length()>s2.length())
			{
				return s2+s1+s2;
			}
			else
			{
				return s1+s2+s1;
			}
		}
	
	
	public static void main(String[] args) {
	System.out.println(comboString("Hello", "hi"));
	System.out.println(comboString("hi", "Hello"));
	System.out.println(comboString("aaa", "b"));

	}

}
