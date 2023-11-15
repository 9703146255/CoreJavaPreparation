package JAVA8FullCourse1_2_3Videos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


/*
 * BY USING COMPARATOR INTERFACE 
 *  WE CAN USE IN COMPARATOR ONLY ONE ABSTRACT METHOD  compare()
 *  we can use by collections
 *  Comparator
 *  ===========
 * int compare(Object obj1,Object obj2)
 * return -ve if obj1 has to come before obj2
 * return +ve if obj1 has to come after obj2return 0 if obj1 and obj2 are equal
 *
 * 
 * al.stream() --> for every element present in the stream we can apply System.out::println function
 * l.stream().forEach(System.out::println); ->streams concept which comes 1.8
 * System.out::println -->method reference concept
 * :: --> method reference
 * 
 * 
 * 
 * 
 * 
 * 
 */


public class Java8_LambdaExp09
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
  System.out.println("before sort :"+al);
  
  
  //SORTING LIST BY USING COMPARATOR  AND TERNERY OPERATOR
  Comparator<Integer> c=(o1,o2)-> (o1<o2)?-1:(o1>o2)?1:0;
  Collections.sort(al,c);  //<Integer> --> we are using integer values here (o1,o2)
  al.stream().forEach(System.out::println);
  
 
			
}}



