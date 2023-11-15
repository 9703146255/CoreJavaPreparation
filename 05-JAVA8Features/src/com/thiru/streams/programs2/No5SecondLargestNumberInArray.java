package com.thiru.streams.programs2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
 14) Find second largest number in an integer array?
(45, 12, 56, 15, 24, 75, 31, 89);

Output :
=======

75

===========================reverseOrder()=============================================
List<Integer> list = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
list.stream()
    .sorted(Comparator.reverseOrder())
    .forEach(System.out::println);

89
75
56
45
31
24
15
12
===============================skip(1)=========================================
List<Integer> list = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
list.stream()
    .sorted(Comparator.reverseOrder())
    .skip(1)
    .forEach(System.out::println);

75
56
45
31
24
15
12
=============================skip(2)===========================================
List<Integer> list = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
list.stream()
    .sorted(Comparator.reverseOrder())
    .skip(2)
    .forEach(System.out::println);

56
45
31
24
15

==============================skip(3)==========================================
List<Integer> list = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
list.stream()
    .sorted(Comparator.reverseOrder())
    .skip(3)
    .forEach(System.out::println);

31
24
15
==================================if elements are not present=================================================
	List<Integer> list=Arrays.asList();
		
		Integer secondLargestNo=list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(secondLargestNo);
===================================================================================
Exception in thread "main" java.util.NoSuchElementException: No value present
	at java.base/java.util.Optional.get(Optional.java:143)
	at com.thiru.streams.programs2.No5SecondLargestNumberInArray.main(No5SecondLargestNumberInArray.java:86)
==============================================================================
List<Integer> list = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
Integer firstElement = list.stream()
        .sorted(Comparator.reverseOrder())
        .skip(1)
        .findFirst()
        .orElse(null);

System.out.println(firstElement);



 */
public class No5SecondLargestNumberInArray {

	public static void main(String[] args) {
    
		
		System.out.println("=====================elements is present==============================");
		List<Integer> list=Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		Integer secondLargestNo=list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(secondLargestNo);
		
		System.out.println("=====================elements are not present give null values as result==============================");
		List<Integer> list1 = Arrays.asList();
		Integer firstElement = list1.stream()
		        .sorted(Comparator.reverseOrder())
		        .skip(1)
		        .findFirst()
		        .orElse(null);

		System.out.println(firstElement);
		
		System.out.println("=====================elements are not present give==============================");
		List<Integer> list2 = Arrays.asList();
		Integer firstElement1 = list2.stream()
		        .sorted(Comparator.reverseOrder())
		        .skip(1)
		        .findFirst().get();
		//if element is not present then we will get nullpointre exception so release in 1.8 Optional class
		        

		System.out.println(firstElement1);
	}

}
