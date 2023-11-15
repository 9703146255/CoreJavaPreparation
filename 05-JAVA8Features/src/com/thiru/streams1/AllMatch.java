package com.thiru.streams1;

import java.util.Arrays;
import java.util.List;

public class AllMatch {
	
public static void main(String[] args) {
	

	
	
	//ALL MATCH (if all true--> true otherwise false)
	System.out.println("-----------------ALL MATCH---------------------");

	
	List<Integer> allMatch=Arrays.asList(33,27);
	boolean allMatch2 = allMatch.stream().allMatch(s->(s%3==0));
	
	System.out.println(allMatch2);
	
	
	//ANY MATCH 
	
	System.out.println("===============anyMatch=============");
	
	 List<Integer> anyMatch=Arrays.asList(4,1,6,7,8,9,33);
	 
	 boolean anyMatch2 = anyMatch.stream().anyMatch(s->s%5==0);
	 System.out.println(anyMatch2);
	 
	//NON-MATCH 
	 
	 
	 System.out.println("===================Non-match==========================");
	 List<Integer> asList = Arrays.asList(22,33,44,55,66,77,88);
	 
	

	 boolean noneMatch = asList.stream().noneMatch(s->s%99==0);
	 
	 System.out.println(noneMatch);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	List<Integer> list1F=Arrays.asList(3,6,6,12,20);
//	boolean result1F=list1F.stream().allMatch(i-> i%3==0);
//	System.out.println(result1F);
//	
//	
//	//ANY MATCH  (if any true--> true otherwise false)
//	System.out.println("-----------------ANY MATCH---------------------");
//    List<Integer> list2T=Arrays.asList(3,5,6,12,20);
//	 boolean result2T=list2T.stream().anyMatch(i-> i%3==0);
//	System.out.println(result2T); 
//	
//	List<Integer> list2F=Arrays.asList(1,5,7,11,20);
//	 boolean result2F=list2F.stream().anyMatch(i-> i%3==0);
//	System.out.println(result2F); 
//	
//	
//	//NONE MATCH (if none true--> true otherwise false)
//	System.out.println("-----------------NONE MATCH---------------------");
//	List<Integer> list3T=Arrays.asList(1,5,7,11,20);
//	boolean result3T=list3T.stream().noneMatch(i-> i%3==0);
//	System.out.println(result3T); 
//	
//	List<Integer> list3F=Arrays.asList(3,5,6,12,20);
//	 boolean result3F=list3F.stream().noneMatch(i-> i%3==0);
//	System.out.println(result3F);
	
	
	
}
}
