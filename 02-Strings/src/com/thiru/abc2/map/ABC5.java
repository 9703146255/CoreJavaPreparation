package com.thiru.abc2.map;

import java.util.LinkedHashMap;
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
 
 
 //1) Find if the string has all UNIQUE CHARACTERS in it
 
             if(data.getValue()>1)
			{
				System.out.println("doesnot contain all unique values");
				System.exit(0);
			}
			System.out.println("contain all unique values");
			
			
2)Find ALL THE NON-REPEATED CHARATERS in a string

           if(data.getValue()==1)
	    	{
	    		System.out.println(data.getKey());
	    	}



 */


//1) Find if the string has all UNIQUE CHARACTERS in it//print all the unique character
public class ABC5 {

	public static void main(String[] args) {
		String x="SILLYSPIDER";
		char[] y=x.toCharArray();
		int len=y.length;
		Map<Character,Integer> map=new LinkedHashMap<>(); 
	    int i=0;
	    while(i != len)
	    {
	    	if(map.containsKey(y[i])==false)
	    	{
	    		map.put(y[i], 1);
	    	}
	    	else
	    	{
	    		int oldVal=map.get(y[i]);
	    		int newVal=oldVal+1;
	    		map.put(y[i], newVal);
	    	}
	    	i++;
	    }
	    
	    Set<Map.Entry<Character,Integer>> hmap=map.entrySet();
	    for(Map.Entry<Character, Integer> data:hmap)
	    {
	    	if(data.getValue()==1) //PRINTING UNIQUE CHARACTERS VALUES
	    	{
	    		System.out.println(data.getKey());
	    		System.exit(0);
	    	}
	    }
	    
	    

	}

}
