package com.thiru.iterator_listiterator_enumerator;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;
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
 * e.hasMoreElements()
 * e.nextElement()
 * 
 * It is Omni/Forward  directional iterator
 * We Cannot perform add/sub/mul/---on enumatation
 * 
 * setProperties() method
 * 
 * 
 */


public class Enumaration3Property {

	public static void main(String[] args) {
		
		Properties prop=new Properties();
		prop.setProperty("url", "localhost");
		prop.setProperty("username", "admin");
		
		
		
		Enumeration<Object> e=prop.elements();
		// enumaration it will get only  values not get any keys
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
	

	}

}
