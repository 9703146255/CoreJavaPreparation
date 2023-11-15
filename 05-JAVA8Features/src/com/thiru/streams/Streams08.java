package com.thiru.streams;

import java.util.ArrayList;
import java.util.Collections;
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
 
 =================================================================
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
 
 *
 */

	public class Streams08 {
		public static void main(String[] args) {
			
//			ArrayList<String> name=new ArrayList<>();
//			name.add("A");
//			name.add("A");
//			name.add("AAAA");
//			name.add("AAAAAAAA");
//			name.add("AA");
//			name.add("AAA");
//			System.out.println("Before sorting :"+name);
//			 
//			Comparator<String> c=(s1,s2)->{
//				//here taking strings
//				int l1=s1.length();
//				int l2=s2.length();
//				
//				if(l1<l2) return +1;
//				else if(l1>l2)  return -1;
//				else return s1.compareTo(s2);
//				
//			};
//		           
//		           
//		           
//	        List<String> list=name.stream().sorted(c).collect(Collectors.toList());
//	        System.out.println("After sorting :"+list);
//	        
//	        Comparator<String> c2=(s1,s2)->{
//				//here taking strings
//				int l1=s1.length();
//				int l2=s2.length();
//				
//				if(l1>l2) return +1;
//				else if(l1<l2)  return -1;
//				else return s1.compareTo(s2);
//				
//			};
//			
//			List<String> list1=name.stream().sorted(c2).collect(Collectors.toList());
//	        System.out.println("After sorting :"+list1);
			
			
			
//			ArrayList<String> name=new ArrayList<>();
//			name.add("A");
//			name.add("A");
//			name.add("AAAA");
//			name.add("AAAAAAAA");
//			name.add("AA");
//			name.add("AAA");
			
//			Comparator<String> cmp=(s1,s2)->{
//				int l1=s1.length();
//				int l2=s2.length();
//				if(l1>l2) return +1;
//				else if(l1<l2) return -1;
//				else return s1.compareTo(s2);
//			};
//			
//		  List<String> lst=name.stream().sorted(cmp).collect(Collectors.toList());
//		  System.out.println(lst);
			
			
			ArrayList<String> name=new ArrayList<>();
			name.add("A");
			name.add("A");
			name.add("AAAA");
			name.add("AAAAAAAA");
			name.add("AA");
			name.add("AAA");
			
			//comparator is a funtional interface which is having compareTo method
			Comparator<String> cmp1=(s1, s2)->{
				
				int l1=s1.length();
				int l2=s2.length();
				if(l1>l2) return -1;
				else if(l1<l2) return +1;
				else return s1.compareTo(s2);
				
				
				
			};
			
			List<String> lst=name.stream().sorted(cmp1).collect(Collectors.toList());
			System.out.println(lst);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}

}
	
	
	
	
	
	
	
//	Comparator<String> c=(s1,s2)->{ 
//        int l1=s1.length();
//        int l2=s2.length();      
//        if(l1<l2) return -1;       //less
//        else if(l1>l2) return +1;  //greater
//        else return s1.compareTo(s2); //equal case
//  };
