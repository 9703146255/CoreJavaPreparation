package JAVA8FullCourse1_2_3Videos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/*
 * BY USING COMPARATOR FI INTERFACE
 * WE CAN USE COMPARATOR ALSO ONLY ONE ABSTRACT METHOD  compare()
 * we can use by collections
 * 	
		 * ASCENDING ORDER
		 * if(o1>o2) { return +1; } else if(o1<o2) { return -1; } else { return 0; }
		 * DESCENDING ORDER
		 * if(o1>o2) { return -1; } else if(o1<o2) { return +1; } else { return 0; }
		 
 */



class MyComparator1 implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		//BY USING IF CONDITION
		//=======================
		if(o1>o2)
		{
			return -1;
		}
		else if(o1<o2)
		{
			return +1;
		}
		else
		{
			return 0;
		}
	}
	
}

public class Java8_LambdaExp08
{
	public static void main(String[] args) 
  {
		
		//TAKING AL 
  ArrayList<Integer> al=new ArrayList<Integer>();
  al.add(10);
  al.add(40);
  al.add(30);
  al.add(10);
  al.add(50);
  al.add(10);
  System.out.println("before sort :"+al);
  //SORTING OF ARRAY LIST HERE
  //Collections.sort(arraylist,new className())
  Collections.sort(al,new  MyComparator1());
  System.out.println("after sort:"+al);
 
			
}}



