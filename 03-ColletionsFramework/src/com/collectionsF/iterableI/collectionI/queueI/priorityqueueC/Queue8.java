package com.collectionsF.iterableI.collectionI.queueI.priorityqueueC;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/*
 QUEUE: QUEUE IS AN INTERFACE THAT IS PROVIDED BY COLLECTIONS FRAMEWORK,
 ==>IT IS A DATA STRUCTURE ITS FOLLOWS THE FIFO(FIRST IN FIRSTOUT PRINCIPLE)
 IT WILL EXTENDS THE COLLECTION,ITERABLE INTERFACE 
 
 EX1:TICKET IN MOVIE THEATRE --> FIRST ENTRY PERSON --> FIRST EXIT
 EX2:ORDER IN HOTEL --> FIRST ORDER PERSON --> FIRST GET MEELS
 EX3:DOCTOR PATIALNS -->FIRST NO TOKEN --> FIRST ENTRY
 
 
 PRIORITY QUEUE: BASED ON THE PRIORITY WE CAN RETREAVE THE DATA 
 IF NOT GIVEN ANY PRIORITY IT WILL FOLLOW THE FIFO
 
 Creation of Queue
 Addition of elements in queue
 Retrieval of elements in a queue
 Deletion of Elements in a queue
 Verification of elements in a queue
 
 
 1)priorityqueue(single ended queue) 
 2)arrayDequeue(double ended queue) or single ended queue
 3)LinkedList 
 
 
 1)priorityqueue(single ended queue) 
 ===================================================================================
 (all classes having these methods)
 Addition ==>offer , add
 Retrieval==>peek
 Removal ==>poll, remove
 
 
 duplicates ==> allows
insertion order ==> allow
 order      ==> not follow order(lowest value give highest priority
 
 
0	1	2	3	4	5	6	7	8	9	10	 
| 2	|	|	|	|	|	|	|	|	|	|	     default storage value=11
      
head                                  tail
deletion                              insertion



8,2,5,7
lowest value it will give high priority
8,2,5,7 ==>2(HIGHEST PRIORITY)HEAD
1,8,9,6 ==>1(HIGHEST PRIORITY)HEAD
100,8,9,6 ==>6(HIGHEST PRIORITY)HEAD

ADDING ELEMENTS
===============
Add(),offer()

RETRIEVAL
=========
peak()

//search//verify the element 
 ==========================
 q.contains(number)
 
 
 IF YOU DON'T WANT TO FOLLOW THE PRIORITY ORDER THENA ONLY WE CAN USE ==>FOREACH LOOP
 IF YOU  WANT TO FOLLOW THE PRIORITY ORDER THENA ONLY WE CAN USE ==>while LOOP
 
 
 befere small value get high priority

 
 MAKE REVERSE PRIORITY
 ====================
 Comparator.reverseOrder()
 
  now high value get high prioritys
  
  
  what is the default capacity                  ==>11
  what is the initial capacity                  ==>11
  does it allows duplicate elements             ==>yes
  does it allows null values                    ==>no
  does it maintain insertion orede              ==>no
  does it maintain sorted order                 ==>no(highest priority to head)
  does it offer the random access of elements   ==>no
  is it synchronized                            ==>in queue not synchronaised every thing
  what is good at                               ==>priority based operations good
  
  
  
  
  
  
  
  

 ArrayDequeue(die-twoway)
  ==================================================================================
  0	1	2	3	4	5	6	7	8	9	10	11	12	13	14	15	16 
| 2	|	|	|	|	|	|	|	|	|	|	|	|	|	|	|	|	     default storage value=17
      
head                                                           tail
deletion                                                       insertion
insertion                                                       deletion
   
 Addition ==>offer, offerFirst, offerLast , add,addFirst,addLast,addAll
 Retrieval==>peek,peekFirst,peekLast
 Removal ==>pollFirst, removeLast 
 
 
   what is the default capacity                  ==>17
  what is the initial capacity                  ==>17
  does it allows duplicate elements             ==>yes
  does it allows null values                    ==>no
  does it maintain insertion orede              ==>no
  does it maintain sorted order                 ==>no==>in queue no everything(highest priority to head)
  does it offer the random access of elements   ==>no
  is it synchronized                            ==>no in queue not synchronaised every thing
  what is good at                               ==>
  
  
  
  
  LinkedList
  =================================================================================
   what is the default capacity                  ==>0
  what is the initial capacity                  ==>0
  does it allows duplicate elements             ==>yes
  does it allows null values                    ==>yes
  does it maintain insertion orede              ==>yes
  does it maintain sorted order                 ==>no(highest priority to head)
  does it offer the random access of elements   ==>yes
  is it synchronized                            ==>no in queue not synchronaised every thing
  what is good at                               ==>priority based operations good
  
  
 
 

//offer(), offerFirst(),offerLast()  
//add(), addFirst(),addLast() 
//peek(), peekFirst(),peekLast(),
//poll(), pollFirst(),pollLast()
//remove(), removeFirst(), removeLast()











 */





public class Queue8 {

	public static void main(String[] args) {
		
		//Queue<Integer> q=new PriorityQueue<>() ;
	     //Queue<Integer> q=new ArrayDeque<>() ;
		//Queue<Integer> q=new LinkedList<>() ;
		ArrayDeque<Integer> q=new ArrayDeque<>() ;
		
		
		 q.offer(1); //last it will add==> offer()
		  q.add(2); //last it will add==> add()
		   q.offer(5);
		 q.offer(8);
		 q.offer(7);
		 
		System.out.println(q);
		q.offerFirst(55);
		System.out.println(q);   
		q.addLast(66);			
		System.out.println(q);	
		q.offerFirst(44);		
		System.out.println(q);
		q.offerLast(77);
		System.out.println(q);
		q.offerLast(77);
		System.out.println(q);
		
		System.out.println(q.peekFirst());  
		System.out.println(q.peekLast());
		System.out.println(q.pollFirst());
		System.out.println(q.pollLast());
		System.out.println(q);
		//add() & offer() added at end
		q.add(222);
		System.out.println(q);
		q.offer(10000);

	}

}
