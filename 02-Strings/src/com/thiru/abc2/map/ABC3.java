package com.thiru.abc2.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;



/*
 * 
 
 1) Find if the string has all UNIQUE CHARACTERS in it
 
 2)Find ALL THE NON-REPEATED CHARATERS in a string
 
 3)Find  FIRST NON-REPEATED CHARACTER in a string
 
 4)Find MAX OCCURING CHARACTER in a string
 
 5)Print DUBLICATE CHARACTERS in a string
 
 6)REMOVE DUPLICATE CHARACTERS in a string	
 
 
 
 
 
 
 
 
 MAP :
 ====
 MAP is the data structure holds the data as <key, value> pairs
 PROPERTIES:
 ==========
 Keys are unique
 values need not be unique
 
 TYPES OF MAPS:
 =============
 
 SPIDER_WEB_OF_LIES
 
 Map<Character,Integer> map=new HashMap<>();
 ================================================
 HashMap       ==> Stores the data in random order  
 
          map
          ===
   key           value
   ===================
   P				1
   R				1
   B				1	
   S				3
   D				1
   E				3
   F				1
   W				1
   I				2
   L				1	
   -				3
   O				1
  =====================
 
  Map<Character,Integer> map=new HashMap<>();
 ================================================       
 LinkedHashMap ==> Stores the data in same sequence as the input
 
         map
          ===
   key           value
   ===================
   S			3
   P			1
   I			2
   D			1
   E			3
   R			1
   -			3
   W			1
   B			1
   O			1
   F			1
   L			1
   
  Map<Character,Integer> map=new HashMap<>();
 ================================================
 TreeMap       ==> Stores the data in ascending order
 
        map
          ===
   key           value
   ===================
   B			1
   D			1	
   E			3
   F			1
   I			2
   L			1	
   O			1
   P			1
   R			1
   S			3				
   W			1		
   -			3
 ===================
 
 
 
 */

public class ABC3 {

	public static void main(String[] args) {
		String x="ARADHYAA";
		char[] y=x.toCharArray();
		int len=y.length;
		
		Map<Character,Integer> map=new HashMap<>(); //initially emapty HashMap
		int i=0;
		while(i != len)
		{
			if(map.containsKey(y[i])==false) //initially emapty HashMap so first any letter entry should be false
			{
				map.put(y[i], 1);
			}
			else
			{
				int oldVal=map.get(y[i]);
				int newVal=oldVal+1;       //if present we can add one(1) only
				map.put(y[i], newVal);
			}
			i++;
		}
		
		
		//ENTRY SET WHICH IS HAVING KEY AND VALUE PAIR
	      Set<Map.Entry<Character,Integer>> hmap= map.entrySet();
	      for(Map.Entry<Character,Integer> mp:hmap)
	      {
	    	  System.out.println(mp);
//	    	  System.out.println(mp.getKey());
//	    	  System.out.println(mp.getValue());
	      }
		                              

	}

}
