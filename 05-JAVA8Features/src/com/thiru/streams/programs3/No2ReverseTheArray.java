package com.thiru.streams.programs3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

/*
 20) Reverse an integer array[6, 9, 3, 7, 1, 5]
 {5, 1, 7, 3, 9, 6}; 
 
 int[] array = new int[]{5, 1, 7, 3, 9, 6};
IntStream.rangeClosed(1, array.length)
         .forEach(System.out::println);
 
 o/p
 ===
1
2
3
4
5
6


int[] array = new int[]{5, 1, 7, 3, 9, 6};
int[] reversedArray = IntStream.rangeClosed(1, array.length)
                               .map(i -> array[array.length - i])
                               .toArray();

// Print the reversed array
Arrays.stream(reversedArray).forEach(System.out::println);

o/p
=====
6
9
3
7
1
5
 */

public class No2ReverseTheArray {

	public static void main(String[] args) {

		
		int[] array=new int[]{5, 1, 7, 3, 9, 6};
		
		int[] reverseArray=IntStream.rangeClosed(1, Array.getLength(array)).map(i->array[array.length-i]).toArray();
		System.out.println(Arrays.toString(reverseArray));
	}

}
