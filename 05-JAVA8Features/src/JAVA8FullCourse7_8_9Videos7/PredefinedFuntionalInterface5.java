package JAVA8FullCourse7_8_9Videos7;

import java.util.function.Function;

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
 *  >=80 ==>A [Distinction]
 *  >=60 ==>B [FC]
 *  >=50 ==>C [SC]
 *  >=35 ==>D [TC]
 * ==>E [Failed]
 * 
 * Student --> find grade --> return grade
 * 
 * Funtion chaining 
 * ================
 * f1.andThan(f2).apply(i) ==> first f1 is followed by f2
 * f1.compose(f2).apply(i) ==> first f2 is followed by f1(first f2 and than f1
 */
public class PredefinedFuntionalInterface5 {

	public static void main(String[] args) {
		
		Function<Integer, Integer> f1=i->i*2;
		Function<Integer, Integer> f2=i->i*i*i;
		System.out.println(f1.andThen(f2).apply(4)); //4x2= 8=>8*8*8=512
		System.out.println(f1.compose(f2).andThen(f1).apply(5)); //5*5*5=125=>125*2=250
		
		
		//f1.andThen(f2).andThen(f1).andThen(f2).apply(10);
			
			

		
		
		

	}

}
