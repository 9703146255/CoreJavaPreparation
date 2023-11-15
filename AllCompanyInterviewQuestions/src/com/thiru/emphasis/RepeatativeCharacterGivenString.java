package com.thiru.emphasis;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatativeCharacterGivenString {

	public static void main(String[] args) {
		String name = "golla";

        Map<Character, Long> charRepetition = name.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(charRepetition);
        
        
        Map<Character, Long> duplicateCharRepetition = charRepetition.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(duplicateCharRepetition);
        
        
	}

}
