package com.collectionsF.iterableI.collectionI.listI.vectorC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class VP_09_DifferentLoops {

	public static void main(String[] args) {
		
		/*
		 
	1) for each loop
	2) normal for loop  ==> get()
	3) ListIterator(both forwared and backword)  [hasNext,next], [hasPrevious,previous]
	4) Iterator	[hasNext,next]
	5) 2.2 method references
	6) lambda expression with streams	 
		 


		 */
		
		
//		Vector<Integer> v1=new Vector<>();
//		v1.add(10);
//		v1.add(20);
//		v1.add(30);
//		v1.add(40);
//		v1.add(50);
//		v1.add(60);
		
		
//		System.out.println("------------------------------------1)FOR u EACH LOOP-->NONE USEE------------------------------------");
//		for(Integer num : v1)  
//        {  
//            System.out.println(num);  
//        } 
//		
//		System.out.println("------------------------------------2)FOR LOOP-->GET()------------------------------------");
//		for(int i=0; i< v1.size();i++)
//		{
//			System.out.println(v1.get(i));
//		}
//		
//		System.out.println("------------------3)Iterator WHILE loop-->hasNext()-->next()--------------------------------");
//		
//		Iterator<Integer> iterator = v1.iterator();
//		while(iterator.hasNext())
//		{
//			System.out.println(iterator.next());
//		}
//	
//	
//		System.out.println("------------------------------------4)ListIterator using WHILE loop------------------------------------");
//		/*
//		 * it is used for list interface implemented classes only.
//		 * ListIterator<Integer> litr=v1.listIterator();
//		while(litr.hasNext())
//		{
//			System.out.println(litr.next());
//		}
//		
//		
//		List<Integer> list=new ArrayList<Integer>();
//		list.add(1);
//		list.add(3);
//		list.add(8);
//		list.add(10);
//		
//	    ListIterator<Integer> litr=list.listIterator();
//		while(litr.hasNext())
//		{
//			System.out.println(litr.next());
//		}
//		
//		*/
//		
//		
//		System.out.println("------------------------------------5)ListobjVar.forEach(print)------------------------------------");
//		
//		v1.forEach(System.out::println);
//	    
//		System.out.println("------------------------------------6)stream().forEach()------------------------------------");
//		//Vector<String> city1 = (Vector<String>) Arrays.asList("Boston", "San Diego", "Las Vegas", "Houston", "Miami", "Austin");  
//		//iterate List using forEach loop  
//		//city1.stream().forEach((c) -> System.out.println(c));  
//		
//		//streams and lambda expressions
//		v1.stream().forEach((c)->System.out.println(c));
	
//		Vector<Integer> v1=new Vector<>();
//		v1.add(10);
//		v1.add(20);
//		v1.add(30);
//		v1.add(40);
//		v1.add(50);
//		v1.add(60);
	
//		1) for each loop
//		2) normal for loop
//		3) method reference
//		4) ListIterator(both forwared and backword)  [hasNext,next], [hasPrevious,previous]
//		5) Iterator	[hasNext,next]
//		6) 2.2 method references
//		7) lambda expression with streams	
		
		
		
		
//		System.out.println("============//1) for each loop=================");
//		for(int val:v1)
//		{
//			System.out.println(val);
//		}
//			
//		
//		System.out.println("=======//2) normal for loop===========");
//		for(int i=0;i<v1.size();i++)
//		{
//			System.out.println(v1.get(i));
//		}
//	
//		System.out.println("==============3) method reference================");
//	
//	     v1.forEach(System.out::println);
//	     
//	     System.out.println("==============4) list iterator forward================");
//	     ListIterator<Integer> litf=v1.listIterator();
//	     while(litf.hasNext())
//	     {
//	    	 System.out.println(litf.next());
//	     }
//	     
//	     System.out.println("==============5) list iterator backword================");
//	
//	     ListIterator<Integer> litbck=v1.listIterator();
//	     while(litbck.hasPrevious())
//	     {
//	    	 System.out.println(litbck.previous());
//	     }
//	 
//	     System.out.println("==============6) iterator ================");
//	     Iterator<Integer> itr=v1.iterator();
//	     while(itr.hasNext())
//	     {
//	    	 System.out.println(itr.next());
//	     }
//	     
//	     System.out.println("=======lambda expressions==========");
//	     v1.stream().forEach(s->System.out.println(s));
//	
		
//		1) for each loop
//		2) normal for loop
//		3) ListIterator(both forwared and backword)  [hasNext,next], [hasPrevious,previous]
//		4) Iterator	[hasNext,next]
//		5) 2.2 method references
//		6) lambda expression with streams	
		
		
//		Vector<Integer> v1=new Vector<>();
//		v1.add(10);
//		v1.add(20);
//		v1.add(30);
//		v1.add(40);
//		v1.add(50);
//		v1.add(60);
//		
//		System.out.println("1) for each loop");
//		for(int v:v1)
//		{
//			System.out.println(v);
//		}
//		System.out.println("2) normal for loop");
//		for (int i = 0; i < v1.size(); i++) {
//			
//			System.out.println(v1.get(i));
//		}
//		
//		System.out.println("3) ListIterator(both forwared and backword)  [hasNext,next], [hasPrevious,previous]");
//		
//	    ListIterator<Integer> list=v1.listIterator();
//	    
//	    while(list.hasNext())
//	    {
//	    	System.out.println(list.next());
//	    }
//	    
//	    System.out.println("and previous===============");
//	    
//	    
//	    while(list.hasPrevious())
//	    {
//	    	System.out.println(list.previous());
//	    }
//		
//	    System.out.println("5) 2.2 method references");
//	    
//	    v1.stream().forEach(System.out::println);
//	    
//	    System.out.println("6) lambda expression with streams");
//	    
//	    v1.forEach(p->System.out.println(p));

//		1) for each loop
//		2) normal for loop
//		3) method reference
//		4) ListIterator(both forwared and backword)  [hasNext,next], [hasPrevious,previous]
//		5) Iterator	[hasNext,next]
//		6) 2.2 method references
//		7) lambda expression with streams	
		
//		Vector<Integer> v1=new Vector<>();
//		v1.add(40);
//		v1.add(10);
//		v1.add(60);
//		v1.add(20);
//		v1.add(10);
//		v1.add(50);
//		
////		1) for each loop
//		for(Integer v:v1)
//		{
//			System.out.println(v);
//		}
////		2) normal for loop
//		for (int i = 0; i < v1.size(); i++) {
//		System.out.println(v1.get(i));	
//		}
////		3) method reference
//		v1.forEach(System.out::println);
////		4) ListIterator(both forwared and backword)  [hasNext,next], [hasPrevious,previous]
//		ListIterator<Integer> litertot = v1.listIterator();
//		while(litertot.hasNext())
//		{
//			System.out.println(litertot.next());
//		}
//		while(litertot.hasPrevious())
//		{
//			System.out.println(litertot.previous());
//		}
////		5) Iterator	[hasNext,next]
//		Iterator<Integer> iterator = v1.iterator();
//		while(iterator.hasNext())
//		{
//			System.out.println(iterator.next());
//		}
////		6) 2.2 method references
//	
////		7) lambda expression with streams	
		
//		Integer productId=2;
//			
//		  StringBuilder sql = new StringBuilder("SELECT * FROM product product_info");
//		  System.out.println(sql.hashCode());
//		  if (productId != null) {
//	            // If productId is provided, add a WHERE clause to the SQL query
//	            sql.append(" WHERE product_info.product_id = ?");
//	        }
//		  System.out.println(sql);
//		  System.out.println(sql.hashCode());
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
	}

}
