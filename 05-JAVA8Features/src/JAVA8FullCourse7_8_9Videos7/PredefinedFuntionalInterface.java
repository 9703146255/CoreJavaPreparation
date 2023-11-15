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

public class PredefinedFuntionalInterface {

	public static void main(String[] args) {
		
		Function<Integer, Integer> r=i->i*i;
		System.out.println("predefined funtion square of 10 is: "+r.apply(10));
		System.out.println("predefined funtion square of 6 is: "+r.apply(6));
		

	}

}
