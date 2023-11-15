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
(i1,i2)->-i1.compareTo(i2) ==> DESCENDING ORDER
 
 
 Comparable interface(BY USING String)
 ======================================
 sorted() ==> by default ascending order it will works integers & string also...
 
 (s1,s2)->s1.compareTo(s2) ==>natural sorting order
 (s1,s2)->-s2.compareTo(s1)
 
 (s1,s2)->s2.compareTo(s1) ==>reverse order
 (s1,s2)->-s1.compareTo(s2)
 
 
 *
 */

	public class Streams07 {
		public static void main(String[] args) {
			

				List<Integer> marks=new ArrayList<>();
				marks.add(60);
				marks.add(77);
				marks.add(80);
				marks.add(70);
				marks.add(75);
				
				//method-1[integer ascenging sorting]
				System.out.println("//method-1[integer ascenging order sorting]");
				marks.stream().sorted().collect(Collectors.toList()).forEach(s->System.out.println(s));
				
				//method-2[integer ascenging sorting]
				System.out.println("//method-2[integer ascenging order sorting]");
				marks.stream().sorted((I1,I2)->(I1>I2)?+1:(I1<I2)?-1:0).collect(Collectors.toList()).forEach(s->System.out.println(s));
				
				//method-3[integer descenging sorting]
				System.out.println("//method-3[integer descenging order sorting]");
				marks.stream().sorted((I1,I2)->(I1>I2)?+1:(I1<I2)?-1:0).collect(Collectors.toList()).forEach(s->System.out.println(s));
				
				//method-4[integer ascenging sorting]
				System.out.println("//method-4[integer ascenging sorting]");
				marks.stream().sorted((I1,I2)->I1.compareTo(I2)).collect(Collectors.toList()).forEach(s->System.out.println(s));
				
				//method-5[integer descenging sorting]
				System.out.println("//method-4[integer descenging sorting]");
				marks.stream().sorted((I1,I2)->-I1.compareTo(I2)).collect(Collectors.toList()).forEach(s->System.out.println(s));
				
				
				List<String> names=new ArrayList<>();
				names.add("thirumala");
				names.add("kiran");
				names.add("vinay");
				names.add("chandu");
				names.add("chinnu");
				names.stream().sorted().collect(Collectors.toList()).forEach(s->System.out.println(s));  //method-1
				//names.stream().sorted((I1,I2)->(I1>I2)?+1:(I1<I2)?-1:0).collect(Collectors.toList()).forEach(s->System.out.println(s));
				System.out.println();
				names.stream().sorted((I1,I2)->I1.compareTo(I2)).collect(Collectors.toList()).forEach(s->System.out.println(s)); //method-2
				System.out.println();
				names.stream().sorted((I1,I2)->-I1.compareTo(I2)).collect(Collectors.toList()).forEach(s->System.out.println(s)); 
		
		
		
		
		
				ArrayList<String> incOrDec=new ArrayList<>();
				incOrDec.add("A");
				incOrDec.add("A");
				incOrDec.add("AAAA");
				incOrDec.add("AAAAAAAA");
				incOrDec.add("AA");
				incOrDec.add("AAA");
				
				
		Comparator<String> comp=(I1,I2)->{
			
			int l1 = I1.length();
			int l2 = I2.length();
			
			if(l1>l2)
				return +1;
			else if(l1<l2)
				return -1;
			else
				return	I1.compareTo(I2);
			
			};
			
			incOrDec.stream().sorted(comp).collect(Collectors.toList()).forEach(s->System.out.println(s));
		
		
		
		Comparator<String> comp1=(I1,I2)->{
			
			int l1 = I1.length();
			int l2 = I2.length();
			
			if(l1<l2)
				return +1;
			else if(l1>l2)
				return -1;
			else
				return I1.compareTo(I2);
			
			
		};
		
		incOrDec.stream().sorted(comp1).collect(Collectors.toList()).forEach(s->System.out.println(s));
		
		
		
		
		
		}

}
