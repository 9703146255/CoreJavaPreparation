package com.collectionsF.mapI;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
/*
 HashMap
 ========
random order printed	=> based on the hashing() funtion
It will not allow the duplicates null keys but it will allows any no of dublicate null values
It will not allow the duplicates keys but it will allows any no of dublicate values
 
HashTable
=========
it will print randome order
it will not allow "null values" and "null keys" [NullpointerException if we use keys or values will null]
it will not allowed duplicates keys but it will allow duplicate values

TreeMap
=======
printed in ascending order
it will not allow null keys//get NullPointerException********
it will allow null values **************** or duplicate null values
it will  not allows duplicate keys , it will allow duplicates values 

 
LinkedHashMap
==============
it will print same order
it will allow only one null 21key, it will allow any no of null values
it will not allowed duplicates keys and it will  allowed duplicates values


 */

public class Map0 {

	public static void main(String[] args) {
		//Map<Integer,String> mp=new HashMap<>();
		//Map<Integer,String> mp=new LinkedHashMap<>();
		Map<Integer,String> mp=new TreeMap<>();
		//Map<Integer,String> mp=new Hashtable<>();
		
		//int[] a= {10,20,30,40,50};
	
		
//		mp.put(500050, "Hyderabad");
//		mp.put(500060, "chennai");
//		mp.put(500070, "delhi");
//		mp.put(500080, "delhi"); 
		
		
//HashMap
//========
//		mp.put(500080, "delhi");  //xxxxxxx allows not printed on console
//		mp.put(500080, "delhi"); //xxxxxxxx only one time print we can take any no of times
//		
//		mp.put(12, null); 
//		mp.put(null, "delhi");    //xxxxxx it will allow but printed single time null, delhi
//		
//		mp.put(500080, null); 
//		mp.put(500080, null);     //xxxxxxxx any number of duplicate values print singel time only
//		
//		mp.put(500080, null); 
//		mp.put(50000, null);  //it will allow any number of null values
		
		
//hash table
//==========
		
//		mp.put(500080, "delhi");  //xxxxxxx duplicate values are not allowed
//		mp.put(500080, "delhi"); //xxxxxxxx only one time print we can take any no of times
//		
//		mp.put(null, "delhi"); 
//		mp.put(null, "delhi");    //xxxxxx not allow "null keys" we get null pointer exception
//		
//		mp.put(500080, null); 
//		mp.put(500080, null);     //xxxxxxxx not allow "null values" we will get null pointer exception
		

		//treemap [null keys not allow , allow null values] keys should be unique,values may be douplicate
		//==========
				
//				mp.put(500080, "delhi");  //xxxxxxx duplicate values are not allowed
//				mp.put(500080, "delhi"); //xxxxxxxx only one time print we can take any no of times
				
//				mp.put(null, "delhi"); 
//				mp.put(null, "delhi");    //xxxxxx not allow "null keys" we get null pointer exception/////////////////
				
//				mp.put(500080, null); 
//				mp.put(50008, null);     //xxxxxxxx it will allow any no of null values
		
		
		
		
		//LinkedHashMap 
		//=============
				
//				mp.put(50008, "delhi");  //xxxxxxx duplicate keys not are  allowed/single time printed,  
//				mp.put(500080, "delhi"); //xxxxxxxx duplicate values are allowed////////////////////////////
				
//				mp.put(null, "delhi"); 
//				mp.put(null, "delhi");    //xxxxxx it will allow only one null key
				
//				mp.put(500080, null); 
//				mp.put(50008, null);     //xxxxxxxx it will allow any no of null values
		
		
		
		
		System.out.println(mp);
		

	}

}
