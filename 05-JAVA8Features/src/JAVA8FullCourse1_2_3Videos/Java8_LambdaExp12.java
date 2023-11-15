package JAVA8FullCourse1_2_3Videos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//BY USING COMPARATOR INTERFACE 
// WE CAN USE IN COMPARATOR ONLY ONE ABSTRACT METHOD  compare()
//we can use by collections

//Comparator
//int compare(Object obj1,Object obj)
//return -ve if obj1 has to come before obj2
//return +ve if obj1 has to come after obj2
//return 0 if obj1 and obj2 are equal

public class Java8_LambdaExp12
{
	public static void main(String[] args) 
  {
  ArrayList<Integer> al=new ArrayList<Integer>();
  al.add(10);
  al.add(40);
  al.add(30);
  al.add(10);
  al.add(50);
  al.add(10);
  
  //ORIGINAL LIST
    System.out.println("before sort :"+al);
  
  
  //SORTING ARRAY ELEMENTS IN ASCENDING ORDER
  //NOTE: COMPARATOR(TERNERY OPERATOR)-->COLLECTIONS.SORT()-->AL.STREAM.FOREACH(SYSO)
  Comparator<Integer> c=(o1,o2)-> (o1<o2)?-1:(o1>o2)?1:0;   //<Integer> --> we are using integer values here (o1,o2)
   Collections.sort(al,c);
   al.stream().forEach(System.out::println);
   
  
   //GET EVEN VALUES FROM THE GIVEN ARRAYLIST
  List<Integer> li=al.stream().filter(i->i%2==0).collect(Collectors.toList());
  System.out.println("EVEN NUMBERS LIST IS  :"+li);
  
   //al.stream() --> for every element present in the stream we can apply System.out::println function
  //al.stream().forEach(System.out::println); ->streams concept which comes 1.8
 //System.out::println -->method reference concept
  //:: --> method reference
			
}}




