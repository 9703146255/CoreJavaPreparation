package com.collectionsF.iterableI.collectionI.listI.vectorC;

import java.util.Vector;





/*              

      
  (DC,IC) 
    
                              		  	Iterable(I)
                              			  	|
             --------------------------Collection(I)-----------------------------
             |                 				|									|
         	List(I)              		 Queue(I) -->PriorityQueue(C)(11,11)   Set(I) ------>SortedSet(I)-->TreeSet(0,0)
         	 |								|									|	
  	---ArrayList(C)	(0,10)	 				|						        	HashSet(C)(0,16)
    ---LinkedList(C)(0,0) ArrayDeque(C)<--DEQUE(I)			           			LinkedHashSet(C)(16,16)
    ---Vector(C)(10,10)			(17,17)
             |
         Stack(C)(10,10)    
      
      
      
      
      
      
      
      
 DI,DN,IS,RS    
      
        DC,IC,AD,AN,IO,SO,RA,SYNCH
 AL/LL==>SO/SO XXXXXXXXXXXXXXX
 * V/S ==>SO XXXXXXXXXXXXXXXX                     //DC,IC,AD,AN,IO,SO,RA,SY
---------------------------------------------------------------------------------
                  DC  di  IC	 AD   Dn  AN	IO	is	SO		RA		SYNC |
 --------------------------------------------------------------------------------           		 			
ArrayList  50%    0		10		YES		YES		YES		NO		YES		NO////	 | /   INTERNALLY USES "dynamic array" to store the elements.
 --------------------------------------------------------------------------------
LinkedList(4)	 0		0		YES		YES		YES		NO		YES		NO///          "doubly linked list" to store the elements.
 --------------------------------------------------------------------------------
Vector	100%	 10		10		YES		YES		YES		no		YES		YES    / MULTITHREDDING |SEQUENTIOAL GROWTH VSW
---------------------------------------------------------------------------------
Stack			 10		10		YES		YES		YES		NO		YES		YES    /Yes  because vector is synchronised
---------------------------------------------------------------------------------
Vector==>10   10
Stack==> 10   10
AL   ==> 0    10
LL   ==> 0     0
 
 
 
 DC --> DEFAULT CAPACITY        IO-->INSERTION ORDER
 IC -->INITIOL CAPACITY			SO-->SORTED ORDER
 AD --> ALLOW DUPLICATE			RA-->RANDOM ACCESS
 AN--> ALLOW NULL VALUES 		SYNC-->SYNCHRONISATION
 




PQ ==>4/4 DC,IC,AD,ID                 De-queue  -->ArrayDequeue
AD==>DC,IC,AD						  Queue		-->PriorityQueue
LI==>SO/SO
---------------------------------------------------------------------------------
                     DC     IC	    AD     	AN		IO		SO		RA		SYNC |
 --------------------------------------------------------------------------------           		 			
P4riorityQueue{DI}   11		11		YES/	NO		YES/	NO		NO		NO 	 |   (11,11,dupli,io) priority pilla DI
 --------------------------------------------------------------------------------
Array"3D"equeue		 17		17		YES/	NO		NO		NO		NO		NO		(17,17,ad,)       array 3 - from 20
 --------------------------------------------------------------------------------
LinkedList			 0		0		YES		YES		YES		NO		YES		NO     (0,0,ad,an,io,ra)
 ---------------------------------------------------------------------------------
 

 
 DC --> DEFAULT CAPACITY        IO-->INSERTION ORDER
 IC -->INITIOL CAPACITY			SO-->SORTED ORDER
 AD --> ALLOW DUPLICATE			RA-->RANDOM ACCESS
 AN--> ALLOW NULL VALUES 		SYNC-->SYNCHRONISATION
 
 
 
 
 
 -----------------------------------------------------------------------------------------------
   set->16                  	DC     IC	    AD     	AN		IO		SO		RA		SYNC |
 ---------------------------------------------------------------------------------------------           		 			
 HashSetN(0,16,n)  			   0		16		NO		YES		NO		NO		NO		NO 	 |
 -------------------------------------------------------------------------------------------- 
 L"in"kedHashSet(16,16,in)	  16		16		NO		YES//  YES//	NO		NO		NO
 -------------------------------------------------------------------------------------------- 
  TreeSet(0,0,so)		   		0		0		NO		NO		NO		YES//	NO		NO
 --------------------------------------------------------------------------------------------- 
 
add()
addAll()

remove()
removeAll()
clear()


contains()
containsAll()

firstElement()
lastElement() 


 
capacity()
size()
 
 
 Vector is a class we can create object for that
v1.addAll(v2)
=============
-->v1,v2 -->v1.addAll(v2)-->it will add the v2 values in v1

v1.removeAll(v2)
===============
 -->v1,v2-->v1.removeAll(v2)-->it will remove the v2 values in v1
 
  v1.clear()
 ==========
 --> it will clear the all the data in v1
 
v1.contains("raj")
========
-->v1.contains("raj")-->it will return true if data present

v1.containsAll(v2)
==================
==>containsAll-->v1.containsAll(v2) 
--> it will return true if v2 all values is contains in v1


 
v1.firstElement()
=================
-->it will give the first element in the vector

v1.lastElement()
================
 --> it will give the last element in the vector



 

 * 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 */

public class VP_01_AddCheckSize {

	public static void main(String[] args) {
		
		
		/*
		//Vector is a class we can create object for that
		//we can use those methods
		 -->it will follow -->synchronization (MOVIE TICKET ROW)( A THREAD NEED TO WAIT UNTIL COMPLETION OF THE ANOTHER THREAD
		 -->increment every time -->100%
		 */
		
		/* Vector v1 =new Vector();
		 
		 v1.add("yadagiri");
		 v1.add("jeevan");
		 v1.add(0,"raj");  //it will occupy 1st bed
		 
		 System.out.println(v1);
		 */
		
//		Vector v1 =new Vector(5);  // we fixed size here
//		                           // it will increse the capacity everytime 100%  10-->20-->40...........
//		 v1.add("yadagiri");
//		 v1.add("jeevan");
//		 v1.add(0,"raj");          //it will occupy 1st bed
//		 
//		 System.out.println(v1);
//		 System.out.println(v1.size());      //how many values are inserted 
//		 System.out.println(v1.capacity()); //total capacity\
		
		
		
		
		
		Vector v=new Vector();
		System.out.println(v.size());
		v.add("thiru");
		v.add("100");
		v.add("charan");
		v.add("charan");
		v.add(null);
		v.add(null);
		
		v.add(0,20);
		
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
		System.out.println("getting the value : "+v.get(0));
		
		
		System.out.println("getting the value : ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
