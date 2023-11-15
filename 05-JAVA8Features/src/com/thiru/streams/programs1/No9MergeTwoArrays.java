package com.thiru.streams.programs1;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
9) How do you merge two unsorted arrays into single sorted array using Java 8 streams?
i/p
====
arra1==>{4, 2, 7, 1, 1};
arra2==>{8, 3, 9, 5};
o/p
====
[1, 2, 3, 4, 5, 7, 8, 9]
 
 */
public class No9MergeTwoArrays {

	public static void main(String[] args) {

		
		int[] a=new int[] {4, 2, 7, 1, 1};
		int[] b=new int[] {8, 3, 9, 5};
		
		int[] c=IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
		System.out.println(Arrays.toString(c));		
		
	}

}
