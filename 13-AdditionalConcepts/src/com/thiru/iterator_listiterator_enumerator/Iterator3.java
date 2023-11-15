package com.thiru.iterator_listiterator_enumerator;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Properties;
import java.util.Vector;

/*Iterator:,ListIterator,Enumerator--> interfaces
 * 1]Enumerator
 * ========
 *2]Iterator:
 * ============
 *3]ListIterator
 * ==========
 * 
 * =============================================================================================
 * 1]Enumeration:
 * =============================================================================================
 * Interface
 * Introduced for iterating legacy collection objects
 * 1.0V -> called legacy classes{ HashTable, Vector,Stack ,Dictionary and stack, and properties
 * 1.2V -> new classes	
 * 
 * Enumaration we have to iterate the collection objects
 * 2-methods
 * =========
 * e.hasMoreElements()
 * e.nextElement()
 * 
 * It is Omni/Forward  directional iterator
 * We Cannot perform add/sub/mul/---on enumatation
 * =============================================================================================
 * 2]Iterator:
 * =============================================================================================
 * Iterator==> interface
 * introduced for iterating the all collections objects
 * ((1.0)legacy collection+(1.1)new collections)
 * one direction, read only with special permission for "removing" the elements
 * Methods are: 1) hasNext() 2) next()
 */


public class Iterator3 {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(100);
		al.add(300);
		al.add(600);
		al.add(600);
		
		Iterator<Integer> i= al.iterator();
		//we are removing one elements at a time
		
		System.out.println("from starting :"+al);
		i.next();
		i.remove();
		System.out.println("first element remove :"+al);
		i.next();
		i.remove();
		System.out.println("second element removed  :"+al);
		
	}

}
