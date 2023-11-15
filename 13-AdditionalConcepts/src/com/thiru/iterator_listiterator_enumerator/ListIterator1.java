package com.thiru.iterator_listiterator_enumerator;

import java.util.ArrayList;
import java.util.ListIterator;

/*
 * ListIterator -> Interface
 * Introduced for iterating the only "list" type of collections objects
 * Legacy classes(1.0)V +  new classes(1.2)V
 * BI-direction(forward and backword , Read and write 
 */

public class ListIterator1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(100);
		al.add(90);
		al.add(600);
		al.add(700);
		
		ListIterator<Integer> li=al.listIterator();
		while(li.hasNext())
		{
			System.out.println("forward : "+li.next());
		}
		System.out.println();
		li.add(1000);
      while(li.hasPrevious())
      {
    	  System.out.println("previous :"+li.previous());
      }
      li.remove();
      System.out.println(al);
	}

}
