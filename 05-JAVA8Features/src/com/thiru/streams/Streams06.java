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
==> sorted() ==> by default it will follow ASCENDING order==> sorted() 
 
==> sorted(comparator) ==> CUSTOMIZE ORDER

//by using ternery operator
 * ========================
(i1,i2)->(i1<i2)?1:(i1>i2)?-1:0  ==>DESCENDING ORDER
(i1,i2)->(i1>i2)?1:(i1<i2)?-1:0  ==>ASCENDING ORDER

Comparable interface having compareTo() method
==============================================
compareTo() --> by default nature is Ascending order
(i1,i2)->i1.compareTo(i2) ==> ASCENDING ORDER
(i1,i2)->-i2.compareTo(i1) ==> ASCENDING ORDER

(i1,i2)->i2.compareTo(i1) ==> DESCENDING ORDER
(i1,i2)->-i1.compareTo(i2) ==> DESCENDING ORDER
 
 
 *
 */

	public class Streams06 {
		public static void main(String[] args) {
			
			ArrayList<Integer> marks=new ArrayList<>();
			marks.add(1);
			marks.add(35);
			marks.add(44);
			marks.add(50);
			marks.add(8);
			marks.add(9);
			marks.add(10);
//			System.out.println("Marks list is :"+marks);
//	        List<Integer> list=marks.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
//	        System.out.println("Number of subjects passed is :"+list);
			
			
		
//			System.out.println("//ASCENDING ORDER SORTING by using condition");
//			marks.stream().sorted((i1,i2)->(i1>i2)?+1:(i1<i2)?-1:0).collect(Collectors.toList()).forEach(s->System.out.println(s));
//			
//			
//			
//			
//			
//			System.out.println("//DESCENDING ORDER SORTING");
//			marks.stream().sorted((i1,i2)->(i1>i2)?-1:(i1>i2)?+1:0).collect(Collectors.toList()).forEach(s->System.out.println(s));
//			
//			
//			System.out.println("//ASCENDING ORDER SORTING by using condition By using comparator FI");
//			
//			marks.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList()).forEach(s->System.out.println(s));
//			
//			System.out.println("//DESCENGIN ORDER SORTING by using condition By using comparator FI");
//			
//			marks.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList()).forEach(s->System.out.println(s));
			
			
			//METHOD-1 : BY DEFAULT sorted() method having ==> ascending order
			System.out.println("method-1");
			marks.stream().sorted().collect(Collectors.toList()).forEach(s->System.out.println(s));
			
			//METHOD-2 : BY using ternery operator and  sorted() method having ==> ascending order and also  descending order
			System.out.println("method-2 ascending order...");
			marks.stream().sorted((I1,I2)->(I1>I2)?+1:(I1>I2)?-1:0).collect(Collectors.toList()).forEach(s->System.out.println(s));
			
			//METHOD-3 : BY using ternery operator and  sorted() method having ==> ascending order and also  descending order
			System.out.println("method-3 descednig order...");
			marks.stream().sorted((I1,I2)->(I1>I2)?-1:(I1>I2)?+1:0).collect(Collectors.toList()).forEach(s->System.out.println(s));
			
			
			
			//METHOD-4 : BY using ternery operator and  sorted() method having ==> ascending order and also  descending order
			System.out.println("method-4 ascending order...");
			marks.stream().sorted((I1,I2)->I1.compareTo(I2)).collect(Collectors.toList()).forEach(s->System.out.println(s));
			
			
			//METHOD-4 : BY using ternery operator and  sorted() method having ==> ascending order and also  descending order
			System.out.println("method-5 descending order...");
			marks.stream().sorted((I1,I2)->-I1.compareTo(I2)).collect(Collectors.toList()).forEach(s->System.out.println(s));
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}

}
