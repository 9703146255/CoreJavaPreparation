package com.thiru.streams.programs1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 ("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil")
 4) How do you find frequency of each element in an array or a list?
  o/p {Pen=2, Stapler=1, Pencil=2, Note Book=2, Eraser=1}
 */

public class No4CountWordFrequency {

	public static void main(String[] args) {

		List<String> list=Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
	
		Map<String, Long> stationaryCountMap=list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(stationaryCountMap);
	}

}
