package com.thiru.streams.programs1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12); 
5) How do you sort the given list of decimals in reverse order?
o/p
=====
71.85
56.98
42.89
33.78
23.58
21.12
17.13
12.45
 */

public class No5SortDecimalValuesInReverseOrder {

	public static void main(String[] args) {

		List<Double> decimalNo=Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
		
		decimalNo.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		
//		List<Integer> decimalNo=Arrays.asList(10,50,60,80,70,90,50,20,10,30);
//		
//		decimalNo.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
	}

}
