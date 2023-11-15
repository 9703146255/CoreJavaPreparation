package JAVA8FullCourse1_2_3Videos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//BY USING COMPARATOR INTERFACE 
// WE CAN USE IN COMPARATOR ONLY ONE ABSTRACT METHOD  compare()
//we can use by collections

//Comparator
//int compare(Object obj1,Object obj)
//return -ve if obj1 has to come before obj2
//return +ve if obj1 has to come after obj2
//return 0 if obj1 and obj2 are equal

public class Java8_LambdaExp10
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
  
  //ASCENDING ORDER
  Comparator<Integer> c1=(o1,o2)-> (o1<o2)?-1:(o1>o2)?1:0;
  Collections.sort(al,c1);
  System.out.println("ASCENDING ORDER:"+al);
  //(o1,o2)-> (o1<o2)?-1:(o1>o2)?1:0;
  
  
  Comparator<Integer> c2=(o1,o2)-> (o1<o2)?+1:(o1>o2)?-1:0;
  Collections.sort(al,c2);
  System.out.println("DESCENDING ORDER:"+al);

		
}}



