package com.thiru.abc2.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;



/*
 
 MAP:
 ====
 MAP is the data structure holds the data as <key, value> pairs
 
 PROPERTIES:
 ==========
 Keys are unique
 values need not be unique
 
 TYPES OF MAPS:
 =============
 
 
 */
//COUNT NUMBER OF TIMES EACH LETTERS REPEATED
public class ABC1_CountEachCharRep {

	public static void main(String[] args) {
//		String x="ARADHYA";
//		char[] y=x.toCharArray();
//		int len=x.length();
//		
//		Map<Character,Integer> map=new HashMap<>(); //initially emapty HashMap
//		
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
//			
//		i++;
//		}
		
	      
		
//		String name="ARADHYA";
//		char[] x=name.toCharArray();
//		int len=name.length();
//		Map<Character, Integer> map=new HashMap<>();
//		int i=0;
//		
//		while( i != len)
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
//			
//			i++;
//		}
		
		
		
		
		String s="thirumalesh";
		char[] x=s.toCharArray();
		int len=s.length();
		Map<Character, Integer> map=new TreeMap<>();
		int i=0;
		while(i != len)
		{
			if(map.containsKey(x[i])==false)
			{
	            map.put(x[i],1);
	        }
			else
			{
				int oldVal=map.get(x[i]);
				int newVal=oldVal+1;
				map.put(x[i], newVal);
			}
			
			i++;
		} 
		
		
		 Set<Map.Entry<Character,Integer>> set=map.entrySet();
		 
		 for(Map.Entry<Character,Integer>  res:set)
		 {
			 System.out.println(res);
		 }
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
