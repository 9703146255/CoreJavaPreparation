package com.thiru.iterator_listiterator_enumerator;

import java.util.Enumeration;
import java.util.Hashtable;
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
 * 1.0V -> called legacy classes{ HashTable, Vector,Stack ,Dictionary and stack, and properties
 * 1.2V -> new classes	
 * 
 * Enumaration we have to iterate the collection objects
 * 2-methods
 * =========
 * elements()
 * e.hasMoreElements()
 * e.nextElement()
 * 
 * It is Omni/Forward  directional iterator
 * We Cannot perform add/sub/mul/---on enumatation
 */


public class Enumaration2 {

	public static void main(String[] args) {
		
		Hashtable<String, Integer> ages=new Hashtable<>();
		ages.put("India", 600);
		ages.put("pak", 500);
		ages.put("bangla", 400);
		
		//Enumeration<String> e=ages.elements();
		Enumeration<Integer> e=ages.elements();
		// enumaration it will return only  "values" not get any keys
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
	

	}

}
