package com.thiru.streams.programs1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*

8) Given a list of integers, find maximum and minimum of those numbers?
Maximum Element : 89
Minimum Element : 12
i/p
====
(45, 12, 56, 15, 24, 75, 31, 89);
 */
public class No8MaxMin {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		Integer max=list.stream().max(Comparator.naturalOrder()).get();
	    Integer min=list.stream().min(Comparator.naturalOrder()).get();
	    System.out.println("max element is :"+max);
	    System.out.println("min element is :"+min);
	
	
	}

}
