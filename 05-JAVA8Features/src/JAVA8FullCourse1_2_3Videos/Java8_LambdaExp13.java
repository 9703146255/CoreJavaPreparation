package JAVA8FullCourse1_2_3Videos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//BY USING COMPARATOR INTERFACE 
// WE CAN USE IN COMPARATOR ONLY ONE ABSTRACT METHOD  compare()
//we can use by collections

//Comparator
//int compare(Object obj1,Object obj)
//return -ve if obj1 has to come before obj2
//return +ve if obj1 has to come after obj2
//return 0 if obj1 and obj2 are equal

public class Java8_LambdaExp13
{
	public static void main(String[] args) 
  {
  ArrayList<Integer> al=new ArrayList<Integer>();
  al.add(10);
  al.add(40);
  al.add(30);
  al.add(10);
  al.add(50);
  al.add(1);
  System.out.println("before sort :"+al);
  
  List<Integer> even=al.stream().filter(i->i%2==0).collect(Collectors.toList());
  System.out.println("EVEN NUMBERS LIST IS  :"+even);
  
  List<Integer> odd=al.stream().filter(i->i%2==1).collect(Collectors.toList());
  System.out.println("odd NUMBERS LIST IS  :"+odd);
  
   //al.stream() --> for every element present in the stream we can apply System.out::println function
  //al.stream().forEach(System.out::println); ->streams concept which comes 1.8
 //System.out::println -->method reference concept
  //:: --> method reference
			
}}



