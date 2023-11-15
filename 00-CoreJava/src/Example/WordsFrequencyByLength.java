package Example;

import java.util.HashMap;
import java.util.Map;

public class WordsFrequencyByLength {
	 public static void main(String[] args) {
	        String input = "My name is ABC. I am a full stack developer.";

	        // Remove punctuation and convert to lowercase
	        String cleanedInput = input.replaceAll("[^a-zA-Z ]", "").toLowerCase();

	        // Split the string into words
	        String[] words = cleanedInput.split("\\s+");

	        // Create a map to store word lengths and their frequencies
	        Map<Integer, Integer> wordLengthFrequency = new HashMap<>();

	        // Count the frequency of each word length
	        for (String word : words) {
	            int length = word.length();
	            wordLengthFrequency.put(length, wordLengthFrequency.getOrDefault(length, 0) + 1);
	        }

	        // Display the results
	        for (Map.Entry<Integer, Integer> entry : wordLengthFrequency.entrySet()) {
	            System.out.println("Length " + entry.getKey() + ", Frequency " + entry.getValue());
	        }
	    }
	}

