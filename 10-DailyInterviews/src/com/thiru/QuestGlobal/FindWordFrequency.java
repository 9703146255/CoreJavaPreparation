package com.thiru.QuestGlobal;

import java.util.HashMap;
import java.util.Map;

/*
 1)Write a program to display the frequency of words based on their length.

For example, Input : "My name is ABC. I am a full stack developer."

Output:

Length 1, Frequency 2
Length 2, Frequency 3
Length 3, Frequency 1
Length 4, Frequency 2
Length 5, Frequency 1
Length 9, Frequency 1

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyByLength {
    public static void main(String[] args) {
        String input = "My name is ABC. I am a full stack developer.";

        // Remove punctuation and convert to lowercase
        String cleanInput = input.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        // Split the input into words
        String[] words = cleanInput.split(" ");

        // Create a map to store the word length frequency
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Calculate the frequency of words based on their length
        for (String word : words) {
            int length = word.length();
            frequencyMap.put(length, frequencyMap.getOrDefault(length, 0) + 1);
        }

        // Display the word length frequency
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int length = entry.getKey();
            int frequency = entry.getValue();
            System.out.println("Length " + length + ", Frequency " + frequency);
        }
    }
}

 */
public class FindWordFrequency {

	public static void main(String[] args) {
		
		  String input = "My name is ABC. I am a full stack developer.";

	        // Remove punctuation and convert to lowercase
	        String cleanInput = input.replaceAll("[^a-zA-Z ]", "").toLowerCase();

	        // Split the input into words
	        String[] words = cleanInput.split(" ");

	        // Create a map to store the word length frequency
	        Map<Integer, Integer> frequencyMap = new HashMap<>();

	        
	        
	        // Calculate the frequency of words based on their length
	        for (String word : words) {
	            int length = word.length();
	            frequencyMap.put(length, frequencyMap.getOrDefault(length, 0) + 1);
	        }
	        
	        

	        // Display the word length frequency
	        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
	            int length = entry.getKey();
	            int frequency = entry.getValue();
	            System.out.println("Length " + length + ", Frequency " + frequency);
	        }
		

	}

}
