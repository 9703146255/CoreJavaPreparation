package com.thiru.streams.programs2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
 
11) How do you get three maximum numbers and three minimum numbers from the given list of integers?
(45, 12, 56, 15, 24, 75, 31, 89)
Output :
—————–
Minimum 3 Numbers
—————–
12
15
24
—————–
Maximum 3 Numbers
—————–
89
75
56
 */

public class No2MaxAndMin3Nos {

	public static void main(String[] args) {

		
		List<Integer> list=Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		
		System.out.println(list);
		list.stream().sorted().limit(3).forEach(System.out::println);
		System.out.println();
		list.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
		
	}

}
