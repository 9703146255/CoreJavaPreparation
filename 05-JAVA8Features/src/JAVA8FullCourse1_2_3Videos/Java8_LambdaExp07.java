package JAVA8FullCourse1_2_3Videos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//BY USING COMPARATOR INTERFACE 
// WE CAN USE IN COMPARATOR ONLY ONE ABSTRACT METHOD  compare()
//we can use by collections

// our class should be implement Comparator

/*
  ASCENDING ORDER
  ===============
  IF CONDITION
  ==============
  if(o1>o2) 
  { 
  return +1;
   } 
	else if(o1<o2) 
	{
	 return -1; 
	 } 
	 else 
	 { 
	 return 0;
	  }
  
  
  if(o1>02)
  {
 	{return +1};
  }
  else if(o1>02)
  {
  return -1};
  }
  else
  {
  	return 0};
  }
  
  
  TERNERY OPERATOR
  ================
  (o1,o2)-> (o1<o2)?-1:(o1>o2)?1:0;
  
  
  (o1, o2)->(o1>o2)?+1:(o1<o2)?-1:0
  
   
  
  DESCENDING ORDER
  ================
  if(o1>o2) { return -1; } else if(o1<o2) { return +1; } else { return 0; }
  TERNERY OPERATOR
  ================
  (o1,o2)-> (o1<o2)?+1:(o1>o2)?-1:0;
  
  
  step-1: our class will implements Comprator FI
  step-2: we will compare FI
  step-3: create one collctions list
  step-4: Collections.sort(al,new MyComparator(class name)
  
  
  
  
 */

//class MyComparator implements Comparator<Integer> // <Integer> --> WE ARE USING INTEGER VALUES HERE
//{
//	@Override
//	public int compare(Integer o1, Integer o2) {
//		
//		//by USING TERNERY OPERATOR SORT ASCENDING ORDRE
//				return (o1<o2)?-1:(o1>o2)?1:0;	
//	}
//	
//}
//
//public class Java8_LambdaExp7
//{
//	public static void main(String[] args) 
//  {
//  ArrayList<Integer> al=new ArrayList<Integer>();
//  al.add(10);
//  al.add(40);
//  al.add(30);
//  al.add(10);
//  al.add(50);
//  al.add(10);
//  System.out.println("before sort :"+al);
//  Collections.sort(al,new  MyComparator());
//  System.out.println("afTer sort:"+al);
// 
//			
//}}



class Java8_LambdaExp07 implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {

		return (o1 > o2) ? +1 : (o1 < o2) ? -1 : 0;
	}

}

class MyComparator
{
	public static void main(String[] args) 
	{
		
	}
}

