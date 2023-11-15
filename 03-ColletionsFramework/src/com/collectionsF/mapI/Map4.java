package com.collectionsF.mapI;

import java.util.Collection;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/*
 What is map:
 ===========
 Hierarchy of MAP interface in java
 ==================================
 Major operation performed on Map object.
 =======================================
 
 CREATION OF MAP
 Addition element in the map ==> put() method
 Retrieval of keys from the map
 Retrieval of values from the map
 Retraeval of value from the map based on a key
 Deletion of elements from the map
 Verification of keys from the map
 verification of values from the map
 updation of elements in the map

 
 
 
 * 
 */






public class Map4 {

	public static void main(String[] args) {
		
		 //CREATION OF MAP
		Map<Integer,String> mp=new Hashtable<>();
		
		//Addition element in the map ==>put();
		mp.put(500050, "Hyderabad");
		mp.put(500060, "chennai");
		mp.put(500070, "delhi");
		
		//Retrieval of keys from the map==>mp.keySet();
		//return set of values
		
		Set<Integer> Keys=mp.keySet();
		for(Integer key:Keys)
		{
			System.out.println(key);
		}
		
		System.out.println();
		
		//Retrieval of values from the map==>mp.values();
		Collection<String> values= mp.values();
		for(String val:values)
		{
			System.out.println(val);
		}
		System.out.println();

		// Retraeval of value from the map based on a key
		
	    System.out.println(mp.get(500050));
	    
	    System.out.println();
	    
	    //we will get values ==>mp.get(key) & keys
	    for(Integer key:Keys)
	    {
	    	System.out.println(key+">>>>>>>>>"+mp.get(key));
	    }
		 
	}

}
