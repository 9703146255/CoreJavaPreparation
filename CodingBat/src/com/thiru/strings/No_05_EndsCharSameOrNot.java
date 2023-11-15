package com.thiru.strings;
/*
Given two strings, return true if either of the strings appears at the very end of the other string,
ignoring upper/lower case differences (in other words,
the computation should not be "case sensitive").
Note: str.toLowerCase() returns the lowercase version of a string.

endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true
 */
public class No_05_EndsCharSameOrNot {

	public static boolean endOther(String first,String scnd) 
	{
		
		first=first.toLowerCase();
		scnd=scnd.toLowerCase();
		
		//Hiabc   abc==>yes				AbC			HiaBc=>yes
		return first.endsWith(scnd) || scnd.endsWith(first);
		
	}
	
	
	public static void main(String[] args) {

		System.out.println(endOther("Hiabc", "abc"));
		System.out.println(endOther("AbC", "HiaBc"));
		System.out.println(endOther("abc", "abXabc"));
		
		
	}

}
