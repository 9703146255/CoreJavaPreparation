package com.thiru.strings1;
/*
Given a string, return true if it ends in "ly".

endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false
 */
public class No_16_EndsLy {
	
	public static boolean endsLy(String s)
	{
		return s.endsWith("ly");
		
	}

	public static void main(String[] args) {
		System.out.println(endsLy("oddly"));
		System.out.println(endsLy("y"));
		System.out.println(endsLy("oddy"));

	}

}
