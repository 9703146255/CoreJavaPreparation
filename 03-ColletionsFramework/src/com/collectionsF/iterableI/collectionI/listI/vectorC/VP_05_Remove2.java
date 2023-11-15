package com.collectionsF.iterableI.collectionI.listI.vectorC;

import java.util.Vector;

/*

Vector is a class we can create object for that
v1.addAll(v2)
=============
-->v1,v2 -->v1.addAll(v2)-->it will add the v2 values in v1

v1.removeAll(v2)
===============
 -->v1,v2-->v1.removeAll(v2)-->it will remove the v2 values in v1
 
v1.contains("raj")
========
-->v1.contains("raj")-->it will return true if data present

v1.containsAll(v2)
==================
==>containsAll-->v1.containsAll(v2) 
--> it will return true if v2 all values is contains in v1

 v1.clear()
 ==========
 --> it will clear the all the data in v1
 
v1.firstElement()
=================
-->it will give the first element in the vector

v1.lastElement()
================
 --> it will give the last element in the vector



 
add()
addAll()
remove()
removeAll()
clear()
contains()
containsAll()
firstElement()
lastElement()
 * 
 */

public class VP_05_Remove2 {

	public static void main(String[] args) {
		
		
		 Vector v1 =new Vector();
		 
		 v1.add("yadagiri");
		 v1.add("jeevan");
		 v1.add(0,"raj");  //it will occupy 1st bed
		 
		 Vector v2 =new Vector();
		 
		 v2.add("yadagiri");
		 v2.add("jeevan");
		
		 
		 
//		  //IT WILL REMOVE THE V2 VALUES IN THE V1 VECTOR
//		  System.out.println("-------------------v1.removeAll(v2)--------------------------------------------");
//		  v1.removeAll(v2);
//		  System.out.println(v1);
		  
		  
//		//IT WILL ADD THE V2 VALUES IN THE V1 VECTOR
//		  System.out.println("-------------------v1.addAll(v2)--------------------------------------------");
//		  v1.addAll(v2);
//		  System.out.println(v1);
		  
		  
		  
		  
//		//Clear() method is used to remove all the value in the vector v1
//		 System.out.println("----------------------v1.clear();------------------------------------");
//		 v1.clear();
//		System.out.println(v1);
		 
		 
//		 //searching the data, if present==>true  if not present ==>false
//		 System.out.println("-----------------------v1.contains(\"raj\")----------------------------------------");
//		 
//		 System.out.println(v1.contains("raj"));
		 
		 
		 
//		//searching the data, if all v2 elements present in v1==>true  if not present ==>false
//		 System.out.println("----------------------v1.containsAll(v2)----------------------------------------");
//		 System.out.println(v1.containsAll(v2));
		 
		 
		 
//		 
//		 //ORDER IS NO PROBLEM HERE
		 System.out.println("--------------------------ORDER IS NOT A PROBLEM HERE------------------");
		 Vector vc1=new Vector();
		 vc1.add("balu");
		 vc1.add("thiru");
		 vc1.add("kiran");
		 Vector vc2=new Vector();
		 vc2.add("thiru");
		 vc2.add("balu");
		 
//		 System.out.println(vc1.containsAll(vc2));
//		 System.out.println("--------------------------UPDATE(Set())------------------------------------");
//		 vc1.set(0, "kiran");
//		 System.out.println("UPDATED AT 0TH POSTITION :"+vc1);
		 
		 System.out.println(vc1);
		 System.out.println("--------------------------firstElement()------------------------------------");
		 System.out.println(vc1.firstElement());
		 System.out.println("--------------------------lastElement()------------------------------------");
		 System.out.println(vc1.lastElement());

	}

}
