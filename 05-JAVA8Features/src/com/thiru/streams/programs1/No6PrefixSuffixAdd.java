package com.thiru.streams.programs1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 6) Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?
 i/p==>("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn")
 o/p==>[Facebook, Twitter, YouTube, WhatsApp, LinkedIn] 
 (",","[","]")
(delemeter,prefix,suffix)
 */
public class No6PrefixSuffixAdd {

	public static void main(String[] args) {

		List<String> list=Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
		
		String joiningString=list.stream().collect(Collectors.joining(",","[","]"));
		System.out.println(joiningString);
		
	}

}
