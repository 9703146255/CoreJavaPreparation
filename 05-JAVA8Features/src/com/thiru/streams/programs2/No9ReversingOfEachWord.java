package com.thiru.streams.programs2;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
 
 18) Reverse each word of a string using Java 8 streams?
 str = "Java Concept Of The Day"
 */

public class No9ReversingOfEachWord {

	public static void main(String[] args) {
		
		String str = "Java Concept Of The Day";
		String reverseString=Arrays.stream(str.split(" "))
									.map(word->new StringBuffer(word).reverse())
									.collect(Collectors.joining(" "));
		
		System.out.println(reverseString);

	}

}
