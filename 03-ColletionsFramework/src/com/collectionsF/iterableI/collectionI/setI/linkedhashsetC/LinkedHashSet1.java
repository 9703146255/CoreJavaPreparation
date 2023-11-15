package com.collectionsF.iterableI.collectionI.setI.linkedhashsetC;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;



/*

 follows inserted order
 
 what is the default capacity                   ==>
  what is the initial capacity                  ==>
  does it allows duplicate elements             ==>NO
  does it allows null values                    ==>YES
  does it maintain insertion oreder             ==>YES
  does it maintain sorted order                 ==>NO
  does it offer the random access of elements   ==>
  is it synchronized                            ==>
  what is good at                               ==>
 */
public class LinkedHashSet1 {

	public static void main(String[] args) {
		
		//LinkedHashSet -->LinkedHashMap -->link of nodes(key,value)
		
		// Set<Integer> hs=new LinkedHashSet<>();
		LinkedHashSet<Integer> hs=new LinkedHashSet<>();
	      hs.add(10);
	      hs.add(2);
	      hs.add(85);
	      hs.add(65);
	      hs.add(5);
	      hs.add(5);
	      hs.add(85);
	     hs.add(null); 
	      System.out.println(hs);
	      System.out.println("remove(85) :"+hs.remove(85));
	      System.out.println("remove(8) :"+hs.remove(8));
	      System.out.println(hs);
	      System.out.println("contains(5) :"+hs.contains(5));
	      System.out.println("contains(9) :"+hs.contains(9));
	      for(Integer hst:hs)
	      {
	    	  System.out.println(hst);
	      }
	      
		

	}

}
