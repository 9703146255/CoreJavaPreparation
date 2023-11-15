package com.thiru.streams;

import java.util.ArrayList;
import java.util.Comparator;
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


Stream()  --> to get the stream
filter()  --> to filter the values(predicate) or condition
map()-->      to perform each object(funtions)
collect()
count()---> how many elements are there in your stream

SORTED METHOD 
=============
==> sorted() ==> by default it will follow ASCENDING order==> sorted() ==> by default it will follow ascending order
 
==> sorted(comparator) ==> CUSTOMIZE ORDER
(i1,i2)->(i1<i2)?1:(i1>i2)?-1:0  ==>DESCENDING ORDER
(i1,i2)->(i1>i2)?1:(i1<i2)?-1:0  ==>ASCENDING ORDER

Comparable interface(BY USING INTEGER)
=====================
compareTo() --> by default nature is Ascending order
(i1,i2)->i1.compareTo(i2) ==> ASCENDING ORDER
(i1,i2)->-i2.compareTo(i1) ==>ASCENDING ORDER

(i1,i2)->i2.compareTo(i1) ==> DESCENDING ORDER
(i1,i2)->-i2.compareTo(i1) ==> DESCENDING ORDER
 
 
 Comparable interface(BY USING String)
 ======================================
 (s1,s2)->s1.compareTo(s2) ==>natural sorting order
 (s1,s2)->-s2.compareTo(s1)
 
 (s1,s2)->s2.compareTo(s1) ==>reverse order
 (s1,s2)->-s1.compareTo(s2)
 
 (s1,s2)->{ int l1=s1.length();
		                 int l2=s2.length();      
		                 if(l1<l2) return -1;       //less
		                 else if(l1>l2) return +1;  //greater
		                 else return s1.compareTo(s2); //equal case
           
  (s1,s2)->{ int l1=s1.length();
		                 int l2=s2.length();      
		                 if(l1<l2) return +1;          //less
		                 else if(l1>l2) return -1;     //greater
		                 else return s1.compareTo(s2); //equal case
		                 
		                 
		                 
	
	stream()
	filter()
	map()
	collect()
	count()  ==========> filter/map after count is used
	sorted()  ==> DEFAULT NATURRAL SORTING ORDER
	sorted(Comparator) ==>CUSTOM SORTING ORDER
	
		                 
MAX & MIN
============	                 
   max(Comparator).get()
   min(Comparator).get()
   
   [5,3,10,15,4]
   ASC --> [3,4,5,10,15]
   DESC-->[15,10,5,4,3]
		                 
		                 
l===>10 elements
 for(Integer i1:l)
 {
 System.out.println(i1);		                 
 }

		                 or 
l.stream.forEach(Function);
l.stream.forEach(System.out::println);  ==> for each elemente in the l.stream CAN apply System.out.println() funtion

 
 *
 */

	public class Streams10 {
		public static void main(String[] args) {
			
			ArrayList<Integer> al=new ArrayList<>();
			al.add(122);
			al.add(3);
			al.add(20);
			al.add(5);
			al.add(15);
			al.add(9);
			al.add(10);
			System.out.println("Marks list is :"+al);
			System.out.println();
			//al.stream().forEach()
			
			//streams
			al.stream().forEach(System.out::println);
			System.out.println();
			
			//lambda exptressions
			al.forEach(i->System.out.println(i));
			
		
			
		}

}
