package com.collectionsF.mapI;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
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

 key       value     ==> key & value pair called Entry
 =======================================================                             
 101        {name: yada, id: 101, salary: 555555}        Entry<key,value>
 102        {name: jhon, id: 102, salary: 222222}
 500050       hyderabad
 500060       chennai
 
 keySet ==> which is having only keys
 entrySet==> which is having both keys and values
 
 * 
 */






public class Map8 {

	public static void main(String[] args) {
		
		 //CREATION OF MAP
		Map<Integer,String> mp=new HashMap<>();
		
		//Addition element in the map ==>put();
		mp.put(500050, "Hyderabad");
		mp.put(500060, "chennai");
		mp.put(500070, "delhi");
		mp.put(null, null);
		mp.put(200000, null);
		mp.put(null, null);
		mp.put(300000, null);
		
		//Deletion of element in the map
		//mp.remove(500050);
		
		Set<Entry<Integer, String>> entries=mp.entrySet();
		for(Entry<Integer, String> entry:entries)
		{
			Integer key=entry.getKey();
			String val=entry.getValue();
			System.out.println(key+">>>>>>"+val);
		}
		System.out.println("---------------------mp.containsKey(500050)---------------------");
		System.out.println(mp.containsKey(500050));
		System.out.println(mp.containsKey(500051));
		System.out.println("---------------------mp.containsValue(\"delhi\")---------------------");
		System.out.println(mp.containsValue("delhi"));
		System.out.println(mp.containsValue("delhii"));
	}

}
