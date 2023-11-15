package com.collectionsF.mapI;

import java.util.Collection;
import java.util.HashMap;
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
 Addition element in the map ==> put() method
 Retrieval of keys from the map
 Retrieval of values from the map
 Retraeval of value from the map based on a key
 Deletion of elements from the map
 Verification of keys from the map
 verification of values from the map
 updation of elements in the map

 HashMap
 ========
 -->non synchronized, not-thread safe
 --> "one null key" and "multiple null values"
 -->new class introduced in JDK 1.2
 HashMap is "fast".
 We can make the HashMap as synchronized by calling	==> Map m = Collections.synchronizedMap(hashMap);
 
1) HashMap is non synchronized. It is not-thread safe and can't be shared between many threads without proper synchronization code.
2) HashMap allows "one null key" and "multiple null values".
3) HashMap is a new class introduced in JDK 1.2.
4) HashMap is "fast".
5) We can make the HashMap as synchronized by calling this code
Map m = Collections.synchronizedMap(hashMap);
6) HashMap is traversed by "Iterator."
7) Iterator in HashMap is fail-fast.
8) HashMap inherits AbstractMap class.
 
 Hashtable
 =========
Hashtable is synchronized. It is thread-safe and can be shared with many threads.
Hashtable doesn't allow any null key or value.
Hashtable is a "legacy class".
Hashtable is slow.
Hashtable is internally synchronized and can't be unsynchronized.
Hashtable is traversed by "Enumerator and Iterator".
Enumerator in Hashtable is not fail-fast.
Hashtable inherits Dictionary class.

HashMap	/////////////////////						HashTable============
========											=========
HashMap is non synchronized, not-thread safe		synchronized, thread-safe
								
one null key" and "multiple null values".	       doesn't allow any null key or value.

introduced in JDK 1.2.						       "legacy class".
fast 											     slow
traversed by Iterator							   traversed by "Enumerator and Iterator".[EI]


 HM					HT
 ===				===
 NS,NTSF          S,T
 1NK, MN V		  N NK,N NV
 JDK 1.2          LEGACY  1.0	
 FAST 			 SLOW
 ITERATOR		  ENUMERATOR, ITERATOR
 
 
 HashMap:
 =======

    A HashMap is a key-value pair data structure where each element is stored as a combination of a key and a value.
    It uses hashing techniques to store and retrieve elements quickly.
    The keys in a HashMap are unique, meaning that you cannot have duplicate keys. However, the values can be duplicate.
    HashMap allows null keys and null values.
    The order of elements in a HashMap is not guaranteed, and it may change over time, as it depends on the hash codes and the internal implementation.
    HashMap provides efficient retrieval and insertion of elements based on their keys, making it suitable for scenarios where you need fast access to data based on specific keys.

HashSet:
========

    A HashSet is a collection of unique elements, where duplicates are not allowed.
    It also uses hashing techniques to store elements efficiently.
    Unlike HashMap, it only stores the elements (values) and doesn't have key-value pairs.
    HashSet does not maintain any specific order of elements, and the order may change during operations like insertion and deletion.
    HashSet does not allow duplicate elements. If you attempt to add a duplicate element, it will not be added to the set.
    Similar to HashMap, HashSet allows null elements, but only once (as duplicates are not allowed).
    HashSet is useful when you need to store a collection of unique elements and perform operations such as checking for membership, adding elements, or removing elements efficiently.

In summary, the key differences between HashMap and HashSet are that HashMap stores key-value pairs, allows duplicate values but unique keys, and provides fast access based on keys. HashSet, on the other hand, stores only unique values, does not maintain any order, and is suitable for scenarios where uniqueness is a requirement.



   KeySet()==> to retrive the keys from the object
   
   values()==> to retrive the values from the object
   
   EntrySet()==> to retrieve both keys and values at a time	==>Set<Entry<Integer, String>> entries=mp.entrySet();
  
   Note: combination of keys and values called one entry






 */






public class Map1 {

	public static void main(String[] args) {
		
		//CREATION OF MAP(we can perform any opearation any map)
		//Map<Integer,String> mp=new Hashtable<>();
		Map<Integer,String> mp=new HashMap<>();
		//Map<Integer,String> mp=new LinkedHashMap<>();
		//Map<Integer,String> mp=new TreeMap<>();
		
		
		
		
		
		
		//Addition element in the map ==>put();
		mp.put(500050, "Hyderabad");
		mp.put(500060, "chennai");
		mp.put(500070, "delhi");
		mp.put(500080, "delhi");  //key ==> unique values /allow duplicate
		

		
//		//to retrieve the keys we can use keySet() method
//		System.out.println("Set interaface having keySet() method");
//		Set<Integer> kst=mp.keySet();
//		
//		for(Integer   kst1:kst)
//		{
//			System.out.println(kst1);
//		}
//		
//		
//		//to retrieve the values we can use values() 
//		System.out.println("Collection interface having values() method");
//		Collection<String> col=mp.values();
//		
//		for(String col1:col)
//		{
//			System.out.println(col1);
//		}
//		
//		
//		
//		System.out.println(" by using entrySet() we can access both key and values at time");
//		//retrieve both key and values
//		Set<Map.Entry<Integer, String>> mps=mp.entrySet();
//		
//		for(Map.Entry<Integer, String> mps1:mps)
//		{
//			System.out.println(mps1);
//		}
//		
//		System.out.println("normal for each lop");
//		
//		
//		for(Integer keys:kst)
//		{
//			System.out.println(keys+">>>>>>>>>>"+mp.get(keys));
//		}
//	
//		
//		System.out.println("by using entry set");
//		
//		
//		
//		
//		
//		
//		Set<Entry<Integer, String>> entries=mp.entrySet();
//		for(Entry<Integer, String> entry:entries)
//		{
////			Integer key=entry.getKey();
////			String val=entry.getValue();
////			System.out.println(key+">>>>>>"+val);
//			System.out.println(entry);
//		}
		
		
//		Set<Integer> set=mp.keySet();
//		for(Integer set1:set)
//		{
//			System.out.println("keys :"+set1);
//		}
//		 
//		Collection<String> val=mp.values();
//		for(String  val1:val)
//		{
//			System.out.println("values :"+val1);
//		}
//		
//		Set<Map.Entry<Integer,String>> entry=mp.entrySet();
//		for(Map.Entry<Integer,String> mp1:entry)
//		{
//			System.out.println(mp1);
//		}
		
		
		
		 
		Set<Integer> set=mp.keySet();
		for(Integer set1:set)
		{
			System.out.println(set1);
		}
		
		Collection<String> col=mp.values();
		for(String col1:col)
		{
			System.out.println(col1);
		}
		
		Set<Map.Entry<Integer, String>> entry=mp.entrySet();
				for(Map.Entry<Integer, String> entry1:entry)
				{
					System.out.println(entry1.getKey()+">>>>>"+entry1.getValue());
					
				}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
