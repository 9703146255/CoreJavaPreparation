package com.thiru.streams.programs3;

import java.util.Arrays;
import java.util.List;

/*
24) Given a list of strings, find out those strings which start with a number?

Output :
========
2wo
3hree
5ive
str={"One", "2wo", "3hree", "Four", "5ive", "Six"}
 */
public class No6FirstNumStartWithNum {

	public static void main(String[] args) {
		
		
		
		List<String> list=Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
		
		list.stream().filter(str->Character.isDigit(str.charAt(0))).forEach(System.out::println);

	}

}
