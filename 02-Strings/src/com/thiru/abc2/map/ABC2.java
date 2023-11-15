package com.thiru.abc2.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;



/*
 
 MAP :
 ====
 MAP is the data structure holds the data as <key, value> pairs
 PROPERTIES:
 ==========
 Keys are unique
 values need not be unique
 
 TYPES OF MAPS:
 =============
 
 
 */

public class ABC2 {

	public static void main(String[] args) {
//		String x="ARADHYA";
//		char[] y=x.toCharArray();
//		int len=y.length;
//		
//		Map<Character,Integer> map=new HashMap<>(); //initially emapty HashMap
//		int i=0;
//		while(i != len)
//		{
//			if(map.containsKey(y[i])==false) //initially emapty HashMap so first any letter entry should be false
//			{
//				map.put(y[i], 1);
//			}
//			else
//			{
//				int oldVal=map.get(y[i]);
//				int newVal=oldVal+1;       //if present we can add one(1) only
//				map.put(y[i], newVal);
//			}
//			i++;
//		}
//		
//	      Set<Map.Entry<Character,Integer>> hmap= map.entrySet();
//	      for(Map.Entry<Character,Integer> mp:hmap)
//	      {
////	    	  System.out.println(mp.getKey());
////	    	  System.out.println(mp.getValue());
//	    	 	  System.out.println(mp);
//	      }
		                              

		
//		String s="ARADHYA";
//		char[] x=s.toCharArray();
//		int len=x.length;
//		
//		Map<Character, Integer> map=new HashMap<>();
//		
//		int i=0;
//		while( i != len )
//		{
//			if(map.containsKey(x[i])==false)
//			{
//				map.put(x[i], 1);
//			}
//			else
//			{
//				int oldVal=map.get(x[i]);
//				int newVal=oldVal+1;
//				map.put(x[i], newVal);
//			}
//			i++;
//		}
//		
//		Set<Map.Entry<Character, Integer>> set=map.entrySet();
//		
//		for(Map.Entry<Character, Integer> hm:set)
//		{
//			System.out.println(hm);
//		}
		
		
		
//		String s="ARADHYA";
//		char[] x=s.toCharArray();
//		int len=x.length;
//		
//		Map<Character, Integer> map=new HashMap<>();
//		
//		int i=0;
//		if(i != len)
//		{
//			if(map.containsKey(x[i])==false)
//			{
//				map.put(x[i], 1);
//			}
//			else
//			{
//				int oldVal=map.get(x[i]);
//				int newVal=oldVal+1;
//				map.put(x[i], newVal);
//			}
//			i++;
//		}
//		
//		Set<Map.Entry<Character, Integer>> set=map.entrySet();
//		for(Map.Entry<Character, Integer> mp:set)
//		{
//			System.out.println(mp);
//		}

		
		
		
		
		
//		String s="ARADHYA";
//		char[] x=s.toCharArray();
//		int len=x.length;
//		
//		Map<Character, Integer> map=new LinkedHashMap<>();
//		int i=0;
//		while(i != len)
//		{
//			if(map.containsKey(x[i])==false)
//			{
//				map.put(x[i], 1);
//			}
//			else
//			{
//				int oldVal=map.get(x[i]);
//				int newVal=oldVal+1;
//				
//				map.put(x[i], newVal);
//			}
//			i++;
//		}
//	
//		Set<Map.Entry<Character, Integer>> set=map.entrySet();
//		
//		for(Map.Entry<Character, Integer> hp:set)
//		{
//			System.out.println(hp);
//		}
		
		
		
		
		
		
		
		String name="ABCDE";
		char[] x=name.toCharArray();
		int len=name.length();
		Map<Character, Integer> map=new HashMap<>();
		int i=0;
		while(i != len)
		{
			if(map.containsKey(x[i])==false)
			{
				map.put(x[i], 1);
			}
			else
			{
				int oldVal=map.get(x[i]);
				int newVal=oldVal+1;
				map.put(x[i], newVal);
			}
			i++;
		}
		
		
		Set<Map.Entry<Character, Integer>> set=map.entrySet();
		for(Map.Entry<Character, Integer>  res:set)
		{
			if(res.getValue()>1)
			{
				System.out.println("not having unique values");
				System.exit(0);
			}
		}
		System.out.println("unique values"+set);
				
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
