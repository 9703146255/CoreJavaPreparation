package com.thiru.streams.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/*

toLowerCase(): Converts the string to lowercase.
trim(): Removes leading and trailing whitespace from the string.
charAt(int index): Returns the character at the specified index.
substring(int beginIndex): Returns a new string that is a substring of the original string, starting from the specified index.
substring(int beginIndex, int endIndex): Returns a new string that is a substring of the original string, starting from the specified begin index and ending at the specified end index (exclusive).
length(): Returns the length of the string.
startsWith(String prefix): Checks if the string starts with the specified prefix.
endsWith(String suffix): Checks if the string ends with the specified suffix.
contains(CharSequence sequence): Checks if the string contains the specified sequence of characters.
replace(char oldChar, char newChar): Replaces all occurrences of the old character with the new character.
replaceAll(String regex, String replacement): Replaces all occurrences of the specified regex with the replacement string.
split(String regex): Splits the string into an array of substrings based on the specified regex.


 */
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1)==============String::toUpperCase=====================");
		List<String> listToUpper = Arrays.asList("apple", "banana", "cherry", "date");
		List<String> reslistToUpper = listToUpper
				.stream()
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println(reslistToUpper);


		System.out.println("2)==============String::trim=====================");

		List<String> listToTrim = Arrays.asList("   apple  ", "  banana           ", "  cherry", " date");
		List<String> resToTrim = listToTrim
				.stream()
				.map(String::trim)
				.collect(Collectors.toList());
		System.out.println(resToTrim);


 
		System.out.println("3)==============e.charAt(3)=====================");
		List<String> charlist = Arrays.asList("apple", "banana", "cherry", "date");
		List<Character> result=charlist.stream().map(e->e.charAt(3)).collect(Collectors.toList());
		System.out.println(result);


		System.out.println("4)==============substring(int beginIndex)=====================");
		List<String> substringList = Arrays.asList("apple", "banana", "cherry", "date");
		List<String> resultIndexList=substringList.stream().map(e->e.substring(3)).collect(Collectors.toList());
		System.out.println(resultIndexList);


		System.out.println("5)==============substring(int beginIndex, int endIndex)=====================");
		List<String> subRangeList = Arrays.asList("apple", "banana", "cherry", "date");
		List<String> subRangeRes=subRangeList.stream().map(e->e.substring(1,3)).collect(Collectors.toList());
		System.out.println(subRangeRes);


		System.out.println("6)==============length(): Returns the length of the string.=====================");
		List<String> lengthList = Arrays.asList("apple", "banana", "cherry", "date");
		List<Integer> lengthres=lengthList.stream().map(String::length).collect(Collectors.toList());
		System.out.println(lengthres);




		System.out.println("7)==============startsWith(String prefix)=====================");
		List<String> startList = Arrays.asList("apple", "banana", "cherry", "date");
		List<Boolean> startRes=startList.stream().map(s->s.startsWith("che")).collect(Collectors.toList());
		System.out.println(startRes);




		System.out.println("8)==============endsWith(String suffix)=====================");
		List<String> endsList = Arrays.asList("apple", "banana", "cherry", "date");
		List<Boolean> endsRes=endsList.stream().map(s->s.endsWith("e")).collect(Collectors.toList());
		System.out.println(endsRes);



		System.out.println("9)==============contains(String suffix)=====================");
		List<String> containsList = Arrays.asList("apple", "banana", "cherry", "date");
		List<Boolean> containsRes=containsList.stream().map(s->s.contains("e")).collect(Collectors.toList());
		System.out.println(containsRes);


		System.out.println("10)==============replace(char oldChar, char newChar)=====================");
		List<String> replaceList = Arrays.asList("apple", "banana", "cherry", "date");
		List<String> replaceRes=replaceList.stream().map(s->s.replace("a","THIRU")).collect(Collectors.toList());
		System.out.println(replaceRes);


		System.out.println("11)==============replaceAll(String regex, String replacement)=====================");
		List<String> replaceSpcList = Arrays.asList("apple", "banana", "cherry", "date");
		List<String> replaceSpcRes=replaceSpcList.stream().map(s->s.replaceAll("[aeiou]", "*")).collect(Collectors.toList());
		System.out.println(replaceSpcRes);



		System.out.println("12)==============replaceAll(String regex, String replacement)=====================");
		List<String> replaceSpcList1 = Arrays.asList("apple", "banana", "cherry", "date");
		List<String[]> replaceSpcRes1=replaceSpcList1.stream().map(s->s.split(",")).collect(Collectors.toList());
		System.out.println(replaceSpcRes1);
		for(String[]  res:replaceSpcRes1)
		{
			System.out.println(Arrays.toString(res));
		}



	}



}
