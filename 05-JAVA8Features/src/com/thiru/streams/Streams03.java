package com.thiru.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 
COLLECTIONS: IF WE WANT TO REPRESENTS GROUP OF OBJECTS AS A SINGLE ENTITY THAN WE SHOULD GO FOR COLLECTIONS
STREAMS: IF WE WANT TO PROCESS OBJECTS FROM THE COLLCTIONS-->STREAMS

NOTE: IO STREMS DIFFERENT , JAVA.UTIL.STREAMS ARE DIFFERENT

IO STREMS DIFFERENT : STREAM OF DATA
java.util.stream  : STREAM OF OBJECTS

Stream s=c.stream();

FILTER METHOD
==============
TO FILTER THE ELEMENTS BASED ON CONDITION THEN WE GO FILTER CONDITOIN

FILTER                               MAP
======                              =====
input -->10 elements            input -->10 elements
output -->0 to 10  or <=10      output -->10


Stream()  --> to get the stream OF DATA
filter()  --> to filter the values(predicate) or condition
map()-->      to perform each object(funtions) SOME OPERATION
collect()


count()---> how many elements are there in your stream
======================================================
filter(i->i>35).count()


 *
 */
//count()---> how many elements are there in your stream 
//I WANT TO COUNT THE NUMBER OF SUBJECT IS PASSED
	public class Streams03 {
		public static void main(String[] args) {
			
			ArrayList<Integer> marks=new ArrayList<>();
			marks.add(1);
			marks.add(80);
			marks.add(44);
			marks.add(50);
			marks.add(80);
			marks.add(9);
			marks.add(80);
//			System.out.println("Marks list is :"+marks);
//			long list=marks.stream().filter(i->i>35).count();   //filter-->count
//	        System.out.println("Number of subjects passed is :"+list);
//	        
//	        long list1=marks.stream().map(i->i+20).count();
//	        System.out.println("Number of subjects attended is :"+list1);
			
			
			
			
			
			
			
//			//ADD 20 MARKS TO EACH STUDENT
//			List<Integer> add20Marks=marks.stream().map(n->n+20).collect(Collectors.toList());
//			System.out.println(add20Marks);
//			
//			//PRINT PASS STUDENTS IN A CLASS
//			
//			List<Integer> pass=marks.stream().filter(n->n>=35).collect(Collectors.toList());
//			System.out.println(pass);
//			
			
			
			
			//ADD 20 MARKS TO EACH STUDENT
			List<Integer> collect = marks.stream().map(s->s+20).collect(Collectors.toList());
			System.out.println(collect);
			
			//PRINT PASS STUDENTS IN A CLASS
			List<Integer> pass = marks.stream().filter(s->s>60).collect(Collectors.toList());
			System.out.println(pass); 
			
			//COUNT PASS STUDENTS IN OUR CLASS ROOM
			
			long count = marks.stream().filter(s->s>60).count();
			System.out.println(count);
			
			
	        
	       
			
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
		}

}
