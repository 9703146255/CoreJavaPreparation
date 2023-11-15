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
 int a=10;                 mp.put(500050,"hyderabad")
 a=30;                     mp.put(500050,"kanchi")
 syso(a)==>30

 
 
 
 * 
 */






public class Map7 {

	public static void main(String[] args) {
		
		 //CREATION OF MAP
		Map<Integer,String> mp=new Hashtable<>();
		
		//Addition element in the map ==>put();
		mp.put(500050, "Hyderabad");
		mp.put(500060, "chennai");
		mp.put(500070, "delhi");
		
		System.out.println(mp); 
		System.out.println();
		System.out.println(mp.size());
		//clear method
		mp.clear();
		System.out.println();
		System.out.println(mp);
		System.out.println();
		System.out.println(mp.size());
	    
	}

}
