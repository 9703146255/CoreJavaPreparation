package com.thiru.streams.programs1;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class No3FrequencyOfEachCharacter {

	public static void main(String[] args) {
		
		String inputString="Java Concept Of The Day";
		
		Map<Character,Long> mp=inputString
				.chars()
				.mapToObj(c->(char)c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
       System.out.println(mp);
	}

}
