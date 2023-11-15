package com.collectionsF.iterableI.collectionI.setI.hashsetC;

import java.util.HashSet;
import java.util.Set;

/*
What is Set  : 
============
set is a datastructure which only stores the unique type of data 
its not allow duplicate type of data


                  COLLECTION(Interface)
                  class   ===  class      extends
              interface   ===  interface      extends
               interface  ===    class     implements

      ============     SET        ===========
      |              (Interface)            |
      |                   |                 |
      |                   |                 |
                    
   HashSetN <========LinkedHashSet       SortedSet            
   (class)            (class)           (Interface) SON
   [0,16]              [16,16]               |
                                        NavigableSet
                                         (Interface)
                                            |
                                         TreeSet
                                         (class)
                                          [0, 0 ]
   
   
   
   Creation of a Set
   Addition of elements in a Set
   Retraival of elements in a Set
   Deletion of elements from the Set
   Verification of elements from the Set 
   
   
=====================================================================================   
   NOTE:
   ==============
   //HashSet(keys only used) -->HashMap(key,value) --> 	Array of nodes(key, value)
	//(internally used)
	//(DATA STORAGE PURPOSE)
	 
	HashMap(key,value) [HASH MAP FOLLOWS  (KEY-->unique) & (set --> unique)
	  key --> set(it will be use internally)
	  value--> by default Dummy object is created (new Object();)  
	 	
	 
	ArrayList
	==========
	ArrayList-->internally used(Dynamic arrays)
	
	
	LinkedList
	==========
	linked list==>internally used(nodes)
   
=====================================================================================   
what is the default capacity                    ==>
  what is the initial capacity                  ==>
  does it allows duplicate elements             ==>NO
  does it allows null values                    ==>YES
  does it maintain insertion oreder             ==>NO
  does it maintain sorted order                 ==>NO
  does it offer the random access of elements   ==>
  is it synchronized                            ==>
  what is good at                               ==>
  






 */

public class Set1 {
	
	//HashSet(keys only used) -->HashMap(key,value) --> 	Array of nodes(key, value)
	//(internally used)
	//(DATA STORAGE PURPOSE)
	
	
	//not follow order
	
	public static void main(String[] args) {
		
		//HashSet<Integer> hs=new HashSet<>();
	      Set<Integer> hs=new HashSet<>();
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
