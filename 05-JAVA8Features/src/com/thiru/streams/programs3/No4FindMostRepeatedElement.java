package com.thiru.streams.programs3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class No4FindMostRepeatedElement {

	public static void main(String[] args) {
			List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
//			Map<String, Long> elementCountMap = listOfStrings.stream()
//                                                         .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//																							//input string        output values
//			System.out.println(elementCountMap);                                             
//			Entry<String, Long> mostFrequentElement=elementCountMap.entrySet().stream().max(Map.Entry.comparingByValue()).get();
//			System.out.println(mostFrequentElement);
			
//			Map<String, Long> frequancyCount=listOfStrings.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//			
//			System.out.println(frequancyCount);
//			
//			
//			Entry<String, Long> highestFreqWord=frequancyCount.entrySet().stream().max(Map.Entry.comparingByValue()).get();
//			 System.out.println(highestFreqWord);
//			
			
			
			Map<String, Long> freqWord=listOfStrings.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
			
			Entry<String, Long> maxRepeatedWord=freqWord.entrySet().stream().max(Map.Entry.comparingByValue()).get();
			
			System.out.println(maxRepeatedWord);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
