 package com.thiru.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
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

(i1,i2)->(i1<i2)?+1:(i1>i2)?-1:0  ==>DESCENDING ORDER  less --> +, great --> -
(i1,i2)->(i1>i2)?1:(i1<i2)?-1:0  ==>ASCENDING ORDER   less --> -, great --> +
 
 
 *
 */

	public class Streams05 {
		public static void main(String[] args) {
			
			ArrayList<Integer> marks=new ArrayList<>();
			marks.add(1);
			marks.add(35);
			marks.add(44);
			marks.add(50);
			marks.add(8);
			marks.add(9);
			marks.add(10);
			System.out.println("Marks list is :"+marks);
//	        List<Integer> list=marks.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
//	        System.out.println("Number of subjects passed is :"+list);
			
			
			
			
			
//			List<Integer> asc=marks.stream().sorted().collect(Collectors.toList());
//			System.out.println(asc);
//			
//			List<Integer> desc=marks.stream().sorted((I1,I2)->(I1>I2)?-1:(I1<I2)?+1:0).collect(Collectors.toList());
//			System.out.println(desc);
//			List<Integer> asc1=marks.stream().sorted((i1,i2)->(i1<i2)?-1:(i1>i2)?+1:0).collect(Collectors.toList());
//			System.out.println(asc1);
			
			
			
			
			
			
			

			
			
			
//			Comparable interface having compareTo() method
//			==============================================
//			compareTo() --> by default nature is Ascending order
//			(i1,i2)->i1.compareTo(i2) ==> ASCENDING ORDER
//			(i1,i2)->-i2.compareTo(i1) ==> ASCENDING ORDER
//
//			(i1,i2)->i2.compareTo(i1) ==> DESCENDING ORDER
//			(i1,i2)->-i1.compareTo(i2) ==> DESCENDING ORDER
			
			//METHOD-1 ==>sorted()
			//METHOD-2 ==>sorted((I1,I2)->(I1>I2)?1:(I1<I2)?-1:0) 
			//METHOD-3 ==>sorted((I1,I2)->(I1>I2)?-1:(I1<I2)?+1:0)
			//METHOD-4 ==>(i1,i2)->i1.compareTo(i2) ==> ASCENDING ORDER   [comparable interface haveing comapreTo()]
			//METHOD-5 ==>(i1,i2)->i2.compareTo(i1) ==> DESCENDING ORDER  [comparable interface haveing comapreTo()]
			List<Integer> asc1=marks.stream().sorted().collect(Collectors.toList());
			System.out.println(asc1);
			
			
			
			System.out.println();
			
			
			
			List<Integer> asc2=marks.stream().sorted((I1,I2)->(I1>I2)?1:(I1<I2)?-1:0).collect(Collectors.toList());
			System.out.println(" asc2 : "+asc2);
			
			
			System.out.println();
			
			
			
			List<Integer> desc1=marks.stream().sorted((I1,I2)->(I1>I2)?-1:(I1<I2)?+1:0).collect(Collectors.toList());
			System.out.println(desc1);
			
			
			
			System.out.println();
			
			
			List<Integer> asc3=marks.stream().sorted((I1,I2)->I1.compareTo(I2)).collect(Collectors.toList());
			System.out.println(asc3);
			
			
			System.out.println();
			
			
			List<Integer> desc2=marks.stream().sorted((I1,I2)->I2.compareTo(I1)).collect(Collectors.toList());
			System.out.println(desc2);
			
			System.out.println();
			
			
			List<Integer> desc3=marks.stream().sorted((I1,I2)->-I2.compareTo(I1)).collect(Collectors.toList());
			System.out.println(desc3);
			
			
			
			System.out.println();
			
			List<Integer> asc4=marks.stream().sorted((I1,I2)->-I1.compareTo(I2)).collect(Collectors.toList());
			System.out.println(asc4);
			
			
			
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}

}
