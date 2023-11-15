package com.thiru.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * 
COLLECTIONS:    (O1,O2,03,04...)---->SINGLE ENTITY
===========
 >IF WE WANT TO REPRESENTS "GROUP OF OBJECTS AS A SINGLE ENTITY" 
 THAN WE SHOULD GO FOR COLLECTIONS.

STREAMS:
=======
> IF "WE WANT TO PROCESS OPERATIONS ON OBJECTS" FROM THE COLLCTIONS-->STREAMS

> JAVA.IO   ==> files
> JAVA.UTIL  ==> DATA(OBJECTS)

IO STREMS : FILES
java.util.stream  : STREAM OF OBJECTS

Stream s=c.stream();  c-->collections

FILTER METHOD
==============
>TO FILTER THE "ELEMENTS" "BASED ON CONDITION" THEN WE GO FILTER CONDITOIN

MAP METHOD
==========

>IF WE WANT TO PERFORM "EVERY OBJECT" SOME ACTION THAN WE GO MAP METHOD

NOTE: filter(predicate)fp, map(function)mf



FILTER                               MAP
======                              =====
input -->10 elements            input -->10 elements
output -->0 to 10  or <=10      output -->10


Stream()  --> The Java Stream API provides a method called stream() that converts a collection or array into a stream. collections/arrays=>streams
filter()  --> to filter the values(predicate) or condition   TO FILTER THE VALUES BASED ON THE CONDITION
map()	  --> to perform each object(functions)
flatMap() -->The flatMap method in the Java Stream API is used to flatten "a stream of streams" into a single stream. 

collect()
count()---> how many elements are there in your stream
sorted()--> by default ascending order follow
List<Integer> list=marks.stream().map(i->i+10).collect(Collectors.toList());

 ===========================================================================================================================================                                   
                                    map()
============================================================================================================================================
The/one function passed to "map() operation" ==>returns a single value for a single input.
One-to-one mapping occurs in map().
Only perform the mapping.
Produce a stream of value.
map() is used only for transformation.

===========================================================================================================================================                                   
                                     flatMap()
============================================================================================================================================                                       
The function/task you pass to flatmap() operation returns an "arbitrary number of values as the output".
One-to-many mapping occurs in flatMap().
Perform mapping as well as flattening.
Produce a stream of stream value.
flatMap() is used both for transformation and mapping.



					map										flatMap()
=============================================		===================================================
>(STREAM)The function passed to "map() operation" 	(STREAMThe function/task you pass to flatmap() operation
==>returns a single value for a single input.		returns an "arbitrary number of values as the output".

>One-to-one mapping occurs in map().				>One-to-many mapping occurs in flatMap().

>Only perform the mapping.							>Perform mapping as well as flattening.

>Produce a stream of value.							>Produce a stream of stream value.

>map() is used only for transformation.				>flatMap() is used both for transformation and mapping.



*/












public class Streams01 {
	public static void main(String[] args) {
		
//        List<Integer> marks=new ArrayList<>();
//        marks.add(50);
//        marks.add(80);
//        marks.add(70);
//        marks.add(88);
//        marks.add(77);
//        marks.add(95);
//        
//        List<Integer> map=marks.stream().map(m->m+3).collect(Collectors.toList());
//        System.out.println(map);
//        
//        Set<Integer> filter=marks.stream().filter(f->f>70).collect(Collectors.toSet());
		
		
		
		
//		List<Integer> list=new ArrayList<>();
//		list.add(20);
//		list.add(51);
//		list.add(60);
//		list.add(21);
//		list.add(80);
//		list.add(90);
		
		//ADD 5  MARKS TO EACH STUDENT
		
//		list.stream().map(s->s+5).forEach(s->System.out.println(s));
//		list.stream().filter(s->s>60).forEach(s->System.out.println("\n"+s));

//       List<Integer>  lst=list.stream().filter(s->s>50).collect(Collectors.toList());
//	   System.out.println(lst);
//	   
//		
//	   List<Integer>  lst1=list.stream().map(s->s+5).collect(Collectors.toList());
//	   System.out.println(lst1);
//	   
//	   
//	   List<Integer>  even=list.stream().filter(s->s%2==0).collect(Collectors.toList());
//	   System.out.println(even);
//	   
//	   List<Integer>  odd=list.stream().filter(s->s%2==1).collect(Collectors.toList());
//	   System.out.println(odd);
		
		//RETRIEVE MARKS MORE THAN 50 MARKS STUDENT
//		List<Integer> moreThan50=list.stream().filter(marks->marks>50).collect(Collectors.toList());
//		System.out.println(moreThan50);
//		
//		
//		//ADD 5 MARKS TO EACH STUDENT
//		
//		List<Integer> add5M=list.stream().map(marks->marks+5).collect(Collectors.toList());
//		System.out.println(add5M);
//		//PRINT EVEN VALUES MARKS
//		
//		List<Integer> evenVal=list.stream().filter(marks->marks%2==0).collect(Collectors.toList());
//		System.out.println(evenVal);
//		
//		//PRINT ODD VALUES MARKS
//		List<Integer> oddVal=list.stream().filter(marks->marks%2==1).collect(Collectors.toList());
//		System.out.println(oddVal);
//		
//		String str="hi";
//		str.concat("thiru");
//		System.out.println(str);
//		
//		String str1=new String("hello");
//		str1.concat("man");
//		System.out.println(str1);
		
		
		
		
		//01 : by using map 
		//adding grace marks to the all the students...
		
		List<Integer> list=new ArrayList<>();
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(75);
		list.add(62);
		list.add(70);
		
		List<Integer> map = list.stream().map(s->s+6).collect(Collectors.toList());
		System.out.println(map);
		
		List<Integer> map1 = list.stream().map(s->s+10).collect(Collectors.toList());
		System.out.println(map1);
		
		
		List<Integer> filter = list.stream().filter(s->s>70).collect(Collectors.toList());
		System.out.println(filter);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
















