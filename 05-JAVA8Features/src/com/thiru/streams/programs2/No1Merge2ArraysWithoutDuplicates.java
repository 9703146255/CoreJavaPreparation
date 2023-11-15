package com.thiru.streams.programs2;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
a1==>{4, 2, 5, 1};
a2==>{8, 1, 9, 5};
10) How do you merge two unsorted arrays into single sorted array without duplicates?
o/p
====
[1, 2, 4, 5, 8, 9]

 */

public class No1Merge2ArraysWithoutDuplicates {

	public static void main(String[] args) {
    
		int[] a=new int[] {4, 2, 5, 1};
		int[] b=new int[] {8, 1, 9, 5};
		
		int[] c=IntStream
				.concat(Arrays.stream(a), Arrays.stream(b))
				.sorted()
				.distinct()
				.toArray();
		
		System.out.println(Arrays.toString(c));
		
		
		
	}

}
