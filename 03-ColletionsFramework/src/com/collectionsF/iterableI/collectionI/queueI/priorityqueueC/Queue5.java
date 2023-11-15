package com.collectionsF.iterableI.collectionI.queueI.priorityqueueC;

import java.util.ArrayDeque;
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
 
 
 priorityqueue
 arrayDequeue
 LinkedList 
 ========================(all classes having these methods)
 Addition ==>offer , add
 Retrieval==>peek
 Removal ==>poll, remove
 
 
 duplicates ==> allows
 null values==> allows
 order      ==> not follow order(lowest value give highest priority
 
 
0	1	2	3	4	5	6	7	8	9	10	 
| 2	|	|	|	|	|	|	|	|	|	|	     default storage value=11
      
head                                  tail

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
 */





public class Queue5 {

	public static void main(String[] args) {
		
		//Queue<Integer> q=new PriorityQueue<>() ;
	     //Queue<Integer> q=new ArrayDeque<>() ;
		//Queue<Integer> q=new LinkedList<>() ;
		Queue<Integer> q=new PriorityQueue<>() ;
		
		
		// q.offer(1);
		  q.offer(2); 
		   q.offer(5);
		 q.offer(8);
		 q.offer(1);
		 
		
		
		//its not follow the priority order
		System.out.println("PriorityQueue elements :"+q);
		for (Integer integer : q) {
			System.out.println(integer);
		}
		


	}

}
