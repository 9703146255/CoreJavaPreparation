package com.thiru.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
	count()
	sorted()  ==> DEFAULT NATURRAL SORTING ORDER
	sorted(Comparator) ==>CUSTOM SORTING ORDER
	
		                 
MAX & MIN
============	                 
   max(Comparator)
   min(Comparator)
   
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

 
 
 toArray()
 =======================================
 to convert stream of objects into array
 
 
 Sample::new     -->it is return Sample object
 Integer[]::new  -->it si return Integer array object
 Integer[]::new ==> Constructor reference
 
 Note: Streams concepts applicable for not only Collections(where the group of elements is there that place we have to use
 COLLECTIONS
 ARRAYS .. ETC
 
 
 
 Stream.of():
 ============
 PRINT GRUOP OF VALUES IN THE ARRAY, COLLECTIONS
 
 
 
 
 *
 */

	public class Streams13 {
		public static void main(String[] args) {
			
//			ArrayList<Integer> al=new ArrayList<>();
//			al.add(122);
//			al.add(3);
//			al.add(20);
//			al.add(5);
//			al.add(15);
//			al.add(9);
//			al.add(10);
//			System.out.println("Marks list is :"+al);
//			
//			Stream<Integer> s=Stream.of(9,99,999,9999,99999);
//			s.forEach(System.out::println);
			
//			Stream<Integer> s=Stream.of(1,10,100,1000,10000);
//		    s.forEach(System.out::println);
//		
//			
//			
//			System.out.println();
//			//s=Stream.of(i)
//			//we have to take/print group of elements in the array to display array of streams
//			Integer[] i= {10,20,30,40,50,5,6};
//			Stream.of(i).forEach(System.out::println);
			
			
			
			
//			Stream<Integer> strm1=Stream.of(10,20,30,40,50,60);
//			strm1.forEach(System.out::println);
//			
//			
//			
//			Integer[] array= {1,2,3,4,5,6};
//			Stream.of(array).forEach(System.out::println);
			
			
			ArrayList<Integer> al=new ArrayList<>();
			al.add(122);
			al.add(3);
			al.add(20);
			al.add(5);
			al.add(15);
			al.add(9);
			al.add(10);
			
			//method-1
			System.out.println("method-1");
			al.forEach(s->System.out.println(s));
			
			//method-2
			System.out.println("method-2");
			al.forEach(System.out::println);
			
			
			//method-3
			System.out.println("method-3");
			for (Integer integer : al) {
				
				System.out.println(integer);
			}
			
			//method-4
			System.out.println("method-4");
			al.stream().forEach(s->System.out.println(s));
			
			
			System.out.println();
			Stream<Integer> num = Stream.of(20,50,80,40,60,50);
			num.forEach(n->System.out.println(n));
			
			System.out.println();
			Integer[] nums=new Integer[]{10,20,50,80,40,66};
			
			Stream.of(nums).forEach(System.out::println);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}

}
