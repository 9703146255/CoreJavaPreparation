package com.thiru.iterator_listiterator_enumerator;

import java.util.Enumeration;
import java.util.Vector;

/*Iterator:,ListIterator,Enumerator--> interfaces
 * Iterator:
 * ========
 * ListIterator:
 * ============
 * Enumerator
 * ==========
 * 
 *
 * Enumeration:
 * ==========
 * Interface
 * Introduced for iterating legacy collection objects
 * 1.0V -> called legacy classes{ HashTable, Vector,Stack ,Dictionary, and properties
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
 */


public class Enumaration1 {

	public static void main(String[] args) {
		
		Vector<String> v=new Vector<>();
		v.add("thiru");
		v.add("charan");
		v.add("vinay");
		v.add("king");
		
		Enumeration<String> e=v.elements();
		//e.hasMoreElements(),e.nextElement()
		//another way of accessing the elements 
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}

	}

}
