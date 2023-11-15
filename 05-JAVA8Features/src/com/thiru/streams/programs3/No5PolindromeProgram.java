package com.thiru.streams.programs3;

import java.util.stream.IntStream;
import java.util.stream.Stream;


/*
 		 	Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);

	        boolean anyMatchResult = numbers.anyMatch(num -> num > 3);
	        System.out.println("Any Match: " + anyMatchResult);

	        Stream<Integer> numbers2 = Stream.of(1, 2, 3, 4, 5);

	        boolean allMatchResult = numbers2.allMatch(num -> num > 3);
	        System.out.println("All Match: " + allMatchResult);

	        Stream<Integer> numbers3 = Stream.of(1, 2, 3, 4, 5);

	        boolean noneMatchResult = numbers3.noneMatch(num -> num > 5);
	        System.out.println("None Match: " + noneMatchResult);
	        
	        o/p
	        ===
	        Any Match: true
			All Match: false
			None Match: true
			======================================================================
			23) Palindrome program using Java 8 streams
			str = "ROTATOR";
			ROTATOR is a palindrome
			======================================================================
			
			
			
			String str = "ROTATOR";
			IntStream.range(0, str.length() / 2)
         .	forEach(index -> {											R  O  T  A
            char startChar = str.charAt(index);							0  1  2  3
            char endChar = str.charAt(str.length() - index - 1);	7-1=6  5  4  3
            															R  0  T  A
            System.out.println("Index " + index + ": Start char = " + startChar + ", End char = " + endChar);
            								0								R							R	
            									
         });


o/p
====
Index 0: Start char = R, End char = R
Index 1: Start char = O, End char = O
Index 2: Start char = T, End char = T


 */

public class No5PolindromeProgram {

	public static void main(String[] args) {
		
		String str = "ROTATOR";
		boolean isItPolindrome=IntStream.range(0, str.length()/2).noneMatch(i->str.charAt(i) !=str.length()-i-1);
																	// all false than true return becouse non-match
		if(isItPolindrome)
		{
			System.out.println("is a polindrome");
		}
		else
		{
			System.out.println("is not a polindrome");
		}

	}

}
