package com.thiru.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 
COLLECTIONS: IF WE WANT TO "REPRESENTS" GROUP OF OBJECTS AS A SINGLE ENTITY THAN WE SHOULD GO FOR COLLECTIONS
STREAMS: IF WE WANT TO "PROCESS OBJECTS" FROM THE COLLCTIONS-->STREAMS

NOTE: IO STREMS DIFFERENT , JAVA.UTIL.STREAMS ARE DIFFERENT

IO STREMS DIFFERENT : STREAM OF DATA
java.util.stream  : STREAM OF OBJECTS

Stream s=c.stream();

FILTER METHOD
==============
TO FILTER THE ELEMENTS BASED ON CONDITION THEN WE GO FILTER CONDITOIN




 * 
 */
	public class Streams02 {
		public static void main1(String[] args) {
//			
//			ArrayList<Integer> al=new ArrayList<>();
//			al.add(1);
//			al.add(3);
//			al.add(2);
//			al.add(5);
//			al.add(8);
//			al.add(9);
//			al.add(10);
//			System.out.println(al);
		//PRINT EVEN VALUES
//	        List<Integer> list=al.stream().filter(i->i%2==0).collect(Collectors.toList());
//	        System.out.println("Even values in the list :"+list);
////	        
////	        List<Integer> list1=al.stream().filter(i->i%2==1).collect(Collectors.toList());
////	        System.out.println("Even values in the list :"+list1);
//		
//		
//		
	}

		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		public static void main(String[] args) {
			
			List<Integer> list=new ArrayList<>();
			list.add(20);
			list.add(45);
			list.add(25);
			list.add(50);
			list.add(40);
			list.add(32);
			list.add(0);
			
//			List<Integer> even=list.stream().filter(i->i%2==0).collect(Collectors.toList());
//			System.out.println(even);
//			
//			
//			
//			List<Integer> odd=list.stream().filter(i->i%2==1).collect(Collectors.toList());
//			System.out.println(odd);
			
			
			
			
			
//			List<Integer> list1=list.stream().filter(s->s%2==0).collect(Collectors.toList());
//			System.out.println(list1);
			
			
			//EVEN VAL
			List<Integer> evenVal=list.stream().filter(n->n%2==0).collect(Collectors.toList());
			System.out.println(evenVal);
			
			//ODD VAL
			
			List<Integer> oddVal=list.stream().filter(n->n%2==1).collect(Collectors.toList());
			System.out.println(oddVal);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
}
