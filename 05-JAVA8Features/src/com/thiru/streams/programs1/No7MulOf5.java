package com.thiru.streams.programs1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
7) From the given list of integers, print the numbers which are multiples of 5?
I/P
====
(45, 12, 56, 15, 24, 75, 31, 89)

O/P
===
45
15
75 
 */

public class No7MulOf5 {

	public static void main(String[] args) {
//       List<Integer> list=Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
//       
//       List<Integer>  divBy5=list.stream().filter(s->s%5==0).collect(Collectors.toList());
//	
//	   System.out.println(divBy5);
		
		
		
		// or
		
		 List<Integer> list=Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		 list.stream().filter(s->s%5==0).forEach(System.out::println);
		
		
	}

}
