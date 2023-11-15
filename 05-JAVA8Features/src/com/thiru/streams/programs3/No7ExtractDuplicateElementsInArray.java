package com.thiru.streams.programs3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
25) How do you extract duplicate elements from an array? 

input:
=====
(111, 222, 333, 111, 555, 333, 777, 222);

Output :
=======
[333, 222, 111]

 */
public class No7ExtractDuplicateElementsInArray {

	public static void main(String[] args) {

		
		//duplicate elements
		List<Integer> list=Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
		Set<Integer> uniqueElements=new HashSet<>();
		Set<Integer> dupicateElements=list.stream().filter(i-> !uniqueElements.add(i)).collect(Collectors.toSet());
		System.out.println("dupicateElements :"+dupicateElements);
	
		
		//unique elements
//		List<Integer> list=Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
//		Set<Integer> uniqueElements=new HashSet<>();
//		Set<Integer> unique=list.stream().filter(i-> uniqueElements.add(i)).sorted().collect(Collectors.toSet());
//		System.out.println("Unique Elements :"+unique);
		
	}

}
