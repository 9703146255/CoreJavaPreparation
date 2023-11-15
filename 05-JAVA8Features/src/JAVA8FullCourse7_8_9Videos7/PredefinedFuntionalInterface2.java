package JAVA8FullCourse7_8_9Videos7;


/*
 * 
 * Conditional checks
 * ==================
 * Predicate<Integer> p=i%2==0
 * 
 * 
 * 
 * Function :
 *===========
 *input --> perform operation --> output
 *  4   -->square operation   -->16
 * 
 */


import java.util.function.*;

public class PredefinedFuntionalInterface2 {

	public static void main(String[] args) {
		
		Function<String, Integer> f=i->i.length();
		System.out.println(f.apply("golla thirumalesh"));
		System.out.println(f.apply("thiru"));
		

	}

}
