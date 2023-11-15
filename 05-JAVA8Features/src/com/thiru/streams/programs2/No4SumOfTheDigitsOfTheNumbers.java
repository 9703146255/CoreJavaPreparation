package com.thiru.streams.programs2;

import java.util.stream.Collectors;
import java.util.stream.Stream;
/*
13) Find sum of all digits of a number in Java 8?
Output :

17

==================================================================
int i = 15623;
Stream<String> digitStream = Stream.of(String.valueOf(i).split(""));

digitStream.forEach(System.out::println);
1
5
6
2
3
===========================================================
int i = 15623;
int sumOfDigits = Stream.of(String.valueOf(i).split(""))
        .mapToInt(Integer::parseInt)
        .sum();

System.out.println(sumOfDigits);

o/p
==
17

The sum of the digits 1 + 5 + 6 + 2 + 3 is 17.
 */

public class No4SumOfTheDigitsOfTheNumbers {

	public static void main(String[] args) {

		System.out.println("method-1");
		int i = 15623;
		Integer sumOfDigits=Stream.of(String.valueOf(i).split(""))
				.collect(Collectors.summingInt(Integer::parseInt));
		System.out.println(sumOfDigits);
		System.out.println();
		
		
		System.out.println("method-2");
		int i1 = 15623;
		int sumOfDigits1 = Stream.of(String.valueOf(i).split(""))
		        .mapToInt(Integer::parseInt)
		        .sum();

		System.out.println(sumOfDigits1);
		
		
	}

}
