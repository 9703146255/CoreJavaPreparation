package com.thiru.streams.programs1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class No2RemoveDuplicateElements {

	public static void main(String[] args) {
		
		
		List<String> list=Arrays.asList("Java","Python","C#","Kotlin","Python","Java");

		List<String> uniqueString=list.stream().distinct().collect(Collectors.toList());
		
		System.out.println(uniqueString);
	}

}
