package com.collectionsF.iterableI.collectionI.setI.treesetC;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


/*

follows inserted order

what is the default capacity                   ==>
 what is the initial capacity                  ==>
 does it allows duplicate elements             ==>no
 does it allows null values                    ==>no
 does it maintain insertion oreder             ==>
 does it maintain sorted order                 ==>ascending order
 does it offer the random access of elements   ==>
 is it synchronized                            ==>
 what is good at                               ==>
 
 
 first()		 ==>get first value
 last() 		 ==> get last value
 pollFirst()	 ==> remove first value
 pollLast() 	 ==> remove last value
 subSet(4,65)	 ==>inbetween values display
 descendingSet() ==> descending order
 
 ---------------------------------------------------------------------------------
                     	DC     IC	    AD     	AN		IO		SO		RA		SYNC |
 --------------------------------------------------------------------------------           		 			
 HashSet            	 0		16		NO		YES		NO		NO		NO		NO 	 |
 --------------------------------------------------------------------------------
 LinkedHashSet[NI]		 16		16		NO		YES		YES		NO		NO		NO
 --------------------------------------------------------------------------------
  TreeSet				 0		0		NO		NO		NO		YES/asc		NO		NO
 ---------------------------------------------------------------------------------
 
 DC --> DEFAULT CAPACITY        IO-->INSERTION ORDER
 IC -->INITIOL CAPACITY			SO-->SORTED ORDER
 AD --> ALLOW DUPLICATE			RA-->RANDOM ACCESS
 AN--> ALLOW NULL VALUES 		SYNC-->SYNCHRONISATION
 
 
 
 
 
 
*/

public class TreeSet1 {

	public static void main(String[] args) {


		//LinkedHashSet -->LinkedHashMap -->link of nodes(key,value)
		
		//TreeSet -->TreeMap --> Binary Tree
		
				//sorted or ascending
				//Set<Integer> hs=new TreeSet<>();
		          TreeSet<Integer> hs=new TreeSet<>();
			      hs.add(10);
			      hs.add(100);
			      hs.add(2);
			      hs.add(85);
			      hs.add(65);
			      hs.add(5);
			      hs.add(5);
			      hs.add(85);
			   
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
