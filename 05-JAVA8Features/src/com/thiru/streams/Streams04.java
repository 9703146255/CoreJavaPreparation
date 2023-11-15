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


Stream()  --> to get the stream
filter()  --> to filter the values(predicate) or condition
map()-->      to perform each object(funtions)
collect()
count()---> how many elements are there in your stream

SORTED METHOD 
=============
==> sorted() ==> by default it will follow "ascending order"
==> sorted(comparator)

 */

	public class Streams04 {
		public static void main(String[] args) {
			
			ArrayList<Integer> marks=new ArrayList<>();
			marks.add(1);
			marks.add(35);
			marks.add(44);
			marks.add(50);
			marks.add(8);
			marks.add(9);
			marks.add(10);
			/*
			 * System.out.println("Marks list is :"+marks); List<Integer>
			 * list=marks.stream().sorted().collect(Collectors.toList());
			 * System.out.println("Number of subjects passed is :"+list);
			 */
//			
//		 List<Integer> sortedM=marks.stream().sorted().collect(Collectors.toList());
//		 System.out.println(sortedM);
			
			List<Integer> sort = marks.stream().sorted().collect(Collectors.toList());
			sort.forEach(sort1->System.out.println(sort1));
			
			List<Integer> collect = marks.stream().sorted((I1,I2)->(I1>I2)?1:(I1<I2)?-1:0).collect(Collectors.toList());
			collect.forEach(S->System.out.println(S));
			
			List<Integer> collect1 = marks.stream().sorted((I1,I2)->(I1>I2)?-1:(I1<I2)?1:0).collect(Collectors.toList());
			collect1.forEach(S->System.out.println(S));

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}

}
