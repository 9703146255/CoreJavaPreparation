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
 Addition element in the map 
 ============================
 ==> put() method
 
 Retrieval of keys from the map
 ===============================
 map==>mp.keySet();
 
 Retrieval of values from the map
 ==================================
 mp.values();
 
 Retraeval of value from the map based on a key
 ==============================================
 mp.get(500050) 
 
 Deletion of elements from the map
 ==================================
 mp.remove(key),mp.remove(key,value)
 
 Verification of keys from the map
 =================================
 mp.containsKey(500050) ==>true
 mp.containsKey(500051) ==>false
 
 verification of values from the map
 ===================================
  mp.containsValue("Hyderabad") ==>true
  mp.containsValue("dddddddae") ==>false
 
 updation of elements in the map
 =================================
 int a=10;                           mp.put(500050,"hyderabad")
 a=30;  //override                   mp.put(500050,"kanchi")  //override or update
 syso(a)==>30

 
 
 
 * 
 */






public class Map6 {

	public static void main(String[] args) {
		
		 //CREATION OF MAP
		Map<Integer,String> mp=new Hashtable<>();
		
		//Addition element in the map ==>put();
		mp.put(500050, "Hyderabad");
		mp.put(500060, "chennai");
		mp.put(500070, "delhi");
		
		//Retrieval of keys from the map==>mp.keySet();
		//return set of values
		System.out.println("------------------mp.keySet()------------------");
		Set<Integer> Keys=mp.keySet();
		for(Integer key:Keys)
		{
			System.out.println(key);
		}
		 
		System.out.println();
		
		//Retrieval of values from the map==>mp.values();
		System.out.println("------------------mp.values()------------------");
		Collection<String> values= mp.values();
		for(String val:values)
		{
			System.out.println(val);
		}
		System.out.println();

		// Retraeval of value from the map based on a key
		System.out.println("------------------mp.get(500050)------------------");
	    System.out.println(mp.get(500050));
	    
	    System.out.println();
	    
	    //we will get values ==>mp.get(key) & keys
	    System.out.println("------------------key  +  mp.get(key)=value ------------------");
	    for(Integer key:Keys)
	    {
	    	System.out.println(key+">>>>>>>>>"+mp.get(key));
	    }
	    System.out.println();
	    
	    
	   // updation of elements in the map
	    System.out.println(mp);
	    // mp.put(500050, "kanchi"); //key is override here
	    
	    //if already is there not insert the data
	    System.out.println();
	    System.out.println("----mp.putIfAbsent(500050, \"kanchi\") ==> exists==> not inserted----");
	    mp.putIfAbsent(500050, "kanchi"); //key is not override here
	    System.out.println();
	     System.out.println(mp);
	    
	}

}
