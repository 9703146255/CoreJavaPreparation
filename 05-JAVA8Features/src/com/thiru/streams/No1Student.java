package com.thiru.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;



/*
 
 intermediote operation(its will creates a new object)
 =======================================================
 filter, map,flatMap , distinct,sorted, limit,skip ,peek,parallel, sequential, unordered
 
 Intermediate Methods:
 =====================
Method			Description
===========================================================================================
filter			Filters elements based on a given predicate.					filter(predicate)

map				Transforms each element to another using a mapper function.		map(loop) ,perform each object some operation

flatMap			Flattens streams of elements into a "single stream."

distinct		Removes duplicate elements from the stream.

sorted			Sorts the elements based on a comparator or natural ordering.

limit			Truncates the stream to a specified size.

skip			Skips the specified number of elements from the stream.

peek			Allows performing a side effect on each element without changing them.

parallel		Enables parallel processing of the stream.

sequential		Forces sequential processing of the stream.

unordered		Disables the strict encounter order for better performance in parallel.

Terminal Methods:
=====================

forEach, forEachOrdered, toArray, reduce, collect, min, max, count, anyMatch, allMatch, noneMatch, findFirst, findAny, iterator, spliterator



Method			Description
===========================================================================================
forEach			Performs an action on each element of the stream.

forEachOrdered	Performs an action on each element in the encounter order of the stream.

toArray			Collects the elements of the stream into an array.

reduce			Performs a reduction operation on the elements of the stream.

collect			Performs a mutable reduction operation into a collection or string.

min				Finds the minimum element based on the provided comparator.

max				Finds the maximum element based on the provided comparator.

count			Returns the count of elements in the stream.

anyMatch		Checks if any element matches the given predicate.

allMatch		Checks if all elements match the given predicate.

noneMatch		Checks if none of the elements match the given predicate.

findFirst		Returns the first element in the stream.

findAny			Returns any element in the stream.

iterator		Returns an iterator for the elements of the stream.

spliterator		Returns a spliterator for the elements of the stream.
 
====================================================================== 
 
 types of creation of streams
 1)of()
 2)stream()
 
  1)of()
  ======
  Stream s1=stream.of(1,2,3,4)==> we can take directly data and create a stream
 
  2)stream()//if already data is there than we have to use 
  ==========
  ArrayList a=new ArrayList()
  a.add(10);
  a.add(20);
  a.add(30);
  
  a.stream() //ofter taking data
  
 
 
 
 
 
 
 
====================================================================================
collections				Stream()				filter()		   collect()
						_________				map()				count()
obj1					|		|				flatMap()			min()
obj2					|		|				distinct()			max()
obj3					|		|				limit()				forEach()
obj4					|_______|				sorted()		   toArray()

												allMatch()
												anyMatch()
												nonMatch()




obj5				parallelStream()		  non-terminal		terminal methods
												methods
												sl
 ====================================================================================

 
 
 
 
 */

public class No1Student {

//	
//	int marks;
//	String name;
//	
//	No1Student(String name,int marks)
//	{
//		this.name=name;
//		this.marks=marks;
//	}
//	
//	public String getName()
//	{
//	return	this.name;
//	}
//	
//	public int getMarks()
//	{
//		return this.marks;
//	}
//
//	public static void main(String[] args) {
//		
//		
//		List<No1Student> list=Arrays.asList(
//				
//				
//				new No1Student("vijju",90),
//				new No1Student("kiran",25),
//				new No1Student("chandu",60),
//				new No1Student("thiru",60),
//				new No1Student("vinay",65),
//				new No1Student("varun",70),
//				new No1Student("manoj",30)
//				
//			);
//		
//		//using stream()-->sequencial
//		
//		list.stream().filter(s->s.getMarks()>50).limit(1).forEach(stu->System.out.println(stu.getName()+" "+stu.getMarks()));
//		
//		System.out.println();
//		//using parallelStream()-->parallel
//		list.parallelStream().filter(s->s.getMarks()>50).limit(3).forEach(stu->System.out.println(stu.getName()+" "+stu.getMarks()));
//		
//		System.out.println();
//		//Convert stream()-->sequencial to parallelStream()-->parallel
//	
//		list.stream().parallel().filter(s->s.getMarks()>50).limit(3).forEach(stu->System.out.println(stu.getName()+" "+stu.getMarks()));
	
	
		
		
		
		
		
		
		
		//list.stream().filter(s->s.getMarks()>50).limit(2).forEach(ss->System.out.println(ss.getName()+">>>>>"+ss.getMarks()));
		
//		list.parallelStream().filter(s->s.getMarks()<80).forEach(ss->System.out.println(ss.getName()+">>>>>"+ss.getMarks()));
		
		
		
//		list.parallelStream().filter(s->s.getMarks()>=35).forEach(ss->System.out.println(ss.getName()+">>>>>>>"+ss.getMarks()));
		
		
	String name;
	int marks;
	No1Student(){}
	No1Student(String name,int marks)
	{
		this.name=name;
		this.marks=marks;
	}
	
	public int getMarks()
	{
		return this.marks;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public static void main(String[] args) {
		
		
		List<No1Student> list=Arrays.asList(
				new No1Student("kishore",70),
				new No1Student("vinay",50),
				new No1Student("chandu",60),
				new No1Student("kiran",70),
				new No1Student("bindu",30),
				new No1Student("kingkong",80),
				new No1Student("thiru",90)
				);
		
		
		//Find the Student with the Highest Marks:
		Optional<No1Student> highestMarks=list.stream().max((s1,s2)->Integer.compare(s1.getMarks(), s2.getMarks()));
		if(highestMarks.isPresent())
		{
			No1Student high=highestMarks.get();
			System.out.println(high.getName()+">>>>>>>>>"+high.getMarks());
		}
		
		
		
		System.out.println();
		//Find the Student with the Lowest Marks:
		Optional<No1Student> min = list.stream().min((s1,s2)->Integer.compare(s1.getMarks(), s2.getMarks()));
		if(min.isPresent())
		{
			No1Student min1=min.get();
			System.out.println(min1.getName()+"   "+min1.getMarks());
		}
		
	
		
		
		System.out.println();
		//Filter Students with Marks Greater Than 65:
		System.out.println("//Filter Students with Marks Greater Than 65:");
		list.stream().filter(s1->s1.getMarks() > 65).forEach(s->System.out.println(s.getName()+"<<<<<<<"+s.getMarks()));
		
		
		System.out.println();
		//Count Students with Passing Marks:
		System.out.println("//Count Students with Passing Marks:");
		long count = list.stream().filter(s->s.getMarks() > 50).count();
		System.out.println(count);
		
		
		System.out.println();
		//Find the First Student with a Specific Name:
		String targetName="chandu";
		Optional<No1Student> findFirst = list.stream().filter(stu->stu.getName().equals(targetName)).findFirst();
		
		if(findFirst.isPresent())
		{
			No1Student fFirst=findFirst.orElse(new No1Student());
			System.out.println(fFirst.getName());
		}
		
		//Filter Students by a Name Prefix:
		System.out.println();
		String prefix="ki";
		
		List<No1Student> collect = list.stream().filter(s->s.getName().startsWith(prefix)).collect(Collectors.toList());
		
		if(!collect.isEmpty())
		{
			collect.forEach(s->System.out.println(s.getName()+" "+s.getMarks()+" "+s.getClass()));
		}
		else
		{
			System.out.println("students are not available who's name start with ki in my college dude");
		}
		
		//Find All Students with Duplicate Marks: XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
		
//		Map<Integer, List<No1Student>> studentMarks = list.stream().collect(Collectors.groupingBy(No1Student::getMarks));
//		
//		
//		studentMarks.forEach((marks,students)->
//		{
//			if(marks.SIZE>1)
//			{
//			    System.out.println("Marks: " + marks);
//			}
//			
//			
//			
//		});
		
		//Retrieve the Names of Top Students:
		int topStudentCount=2;
		List<String> collect2 = list.stream()
		.sorted((s2,s1)->Integer.compare(s1.getMarks(), s2.getMarks()))
		.limit(topStudentCount)
		.map(No1Student::getName)
		.collect(Collectors.toList());
		
		System.out.println(collect2);
		
	}
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
}
