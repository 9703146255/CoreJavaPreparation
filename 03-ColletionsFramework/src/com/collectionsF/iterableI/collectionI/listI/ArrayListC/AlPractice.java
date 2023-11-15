 package com.collectionsF.iterableI.collectionI.listI.ArrayListC;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

public class AlPractice {

	public static void main(String[] args) {
		
/*
 (DC,IC)
    
                              		  	Iterable(I)
                              			  	|
             --------------------------Collection(I)-----------------------------
             |                 				|									|
         	List(I)        LinkedList(c)--Queue(I) -->PriorityQueue(C)(11,11)   Set(I) ------>SortedSet(I)-->TreeSet(0,0)
         	 |								|									|	
  		---ArrayList(C)	(0,10)	 			|						        	HashSet(C)(0,16)
        ---LinkedList(C)(0,0) 	ArrayDeque(C)<--DEQUE(I)			           	LinkedHashSet(C)(16,16)
        ---Vector(C)(10,10)			(17,17)
             |
         Stack(C)(10,10)
 
 
 
 
 
 AL/LL==>SO/SO XXXXXXXXXXXXXXX
 V/S ==>SO XXXXXXXXXXXXXXXX                     //DC,IC,AD,AN,IO,SO,RA,SY
---------------------------------------------------------------------------------
                  DC     IC	    AD     	AN		IO		SO		RA		SYNC |
 --------------------------------------------------------------------------------           		 			
ArrayList  50%    0		10		YES		YES		YES		NO//	YES		NO////	 | /   INTERNALLY USES "dynamic array" to store the elements.
 --------------------------------------------------------------------------------
LinkedList		  0		0		YES		YES		YES		NO//	YES		NO///          "doubly linked list" to store the elements.
 --------------------------------------------------------------------------------
Vector	100%	 10		10		YES		YES		YES		no		YES		YES    / MULTITHREDDING |SEQUENTIOAL GROWTH VSW
---------------------------------------------------------------------------------
Stack			 10		10		YES		YES		YES		NO		YES		YES    /Yes  because vector is synchronised
---------------------------------------------------------------------------------
 
 DC --> DEFAULT CAPACITY        IO-->INSERTION ORDER
 IC -->INITIOL CAPACITY			SO-->SORTED ORDER
 AD --> ALLOW DUPLICATE			RA-->RANDOM ACCESS
 AN--> ALLOW NULL VALUES 		SYNC-->SYNCHRONISATION
 




PQ ==>4/4 DC,IC,AD,ID
AD==>DC,IC,AD
LI==>SO/SO
---------------------------------------------------------------------------------
                     DC     IC	    AD     	AN		IO		SO		RA		SYNC |
 --------------------------------------------------------------------------------           		 			
P4riorityQueue (DI)  11		11		YES		NO		YES		NO		NO		NO 	 |  
 --------------------------------------------------------------------------------
Array"3D"equeue		 17		17		YES		NO		NO		NO		NO		NO
 --------------------------------------------------------------------------------
LinkedList			 0		0		YES		YES		YES		NO		YES		NO
 ---------------------------------------------------------------------------------
 
---------------------------------------------------------------------------------
                     DC     IC	    AD     	A N		IO		SO		RA		SYNC |
 --------------------------------------------------------------------------------           		 			
 HashSetN             0		16		NO		YES		NO		NO		NO		NO 	 |
 --------------------------------------------------------------------------------
 L in kedHashSet	16		16		NO		YES//  YES//		NO		NO		NO
 --------------------------------------------------------------------------------
 TreeSet			 0		0		NO		NO		NO		YES//ASC		NO		NO
 ---------------------------------------------------------------------------------



 ---------------------------------------------------------------------------------
				DC		IC		AD		AN		IO		SO		RA		SYNC
 ---------------------------------------------------------------------------------	
HashMap			16		-		YES		YES		NO		NO		NO		NO
 ---------------------------------------------------------------------------------

HashTable		16		-		YES		NO		NO		NO		NO		YES
 ---------------------------------------------------------------------------------

SortedMap		-		-		YES		YES		YES		YES		YES		NO
 ---------------------------------------------------------------------------------

TreeMap			-		-		YES		YES		ASC		YES		YES		NO
 ---------------------------------------------------------------------------------

LinkedHashMap	16		-		YES		YES		INSERT	NO		NO		NO
 ---------------------------------------------------------------------------------
 
 
 
 WHEN WE SHOUDL GO FOR
 =====================
 LinkedList[DOUBLE LINKED LIST]:
 ===========
 LinkedList should be used where modifications to a collection are frequent like "addition/deletion" operations.
 ArrayList[DYNAMIC ARRAY]:
 =========
 ArrayList "when data reading scenarios" are more common than adding or removing data.[DATA SEARCHING AND RETRIEVING SCENARIO]
 

1) forEach loop
2) normal for loop  => get
3) method refernce  alvar.forEach(syso:println)
4) lambda expressions
5) ListIterators   hasNext, next method
6) Iterator






 */


		//vector follows the synchronaization concepts --> 2ND thread needs to wait until completion of the FIRST thread
		//ex: in railway counter follows the synchronaization concept
		//so performance is low
		
		//VECTOR: IT WILL INCREMENT EVERY TIME 100%
		//IF OUR DATA IS EXPONENTIOLLY INCREASE THAN GO VECTOR
		//IF OUR DATA NOT EXPONENTIALLY INCREASE THEA GO ARRAY LIST
		//VECTOR AND ARRAYLIST ALL MAXIMUM SAME OPERATIONS 
		
		//ARRAYLIST: IT WILL INCREMT O, 10,15---> IT WILL INCREMENT EVERY TIME 50%
		//WE WILL SAVE THE MEMORY HERE
		//WHAT EVER THE DISADVANTAGES IS THERE IN VECTOR AL IS TAKES AS A ADVANTAGE
		
		
		
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(10);
		al.add(10); //duplicates
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(80);
		al.add(90);
		al.add(100);
		al.add(120);
		al.add(80);
		al.add(90);
		al.add(100);
		al.add(null);
		
		System.out.println(al.size());
		System.out.println(al);
		
		System.out.println("------------------------------------foreach --> direct-------------------------------------------");
		for (Integer integer : al) {
			System.out.println(integer+" ");
			}
		
		 
		
		System.out.println("------------------------------------forloop --> get-------------------------------------------");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i)+ " ");
		}
		System.out.println("------------------------------------al.forEach(System.out::println);-----------------------------------------");

		
		
		al.forEach(System.out::println);         //al ->: & forEach->:// method reference
		
		
		//BY USING STREAMS 
		System.out.println("------------------------------------al.stream().forEach((c)->System.out.println(c));-----------------------------------------");
		al.stream().forEach((c)->System.out.println(c));
		
		
		
		// ListIterator can perform both forward and backword
		
		System.out.println("------ListIterator forward-------------------------");
		ListIterator<Integer> li1=al.listIterator();
		while(li1.hasNext())
		{
			System.out.println(li1.next());
		}
		
		
		System.out.println("------ListIterator backword-------------------------");
		ListIterator<Integer> li2=al.listIterator();
		while(li2.hasPrevious())
		{
			System.out.println(li2.previous());
		}
		
		
		
		
		// only forward
		System.out.println("------iterator-------------------------");
		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("------enumeration (1.0)v possible-------------------------");
		
	
	}
}
