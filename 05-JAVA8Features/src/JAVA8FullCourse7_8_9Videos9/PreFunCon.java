package JAVA8FullCourse7_8_9Videos9;

import java.util.function.Predicate;

/*
 * Predicate:
 * Funtion:
 * Consumer:
 * 
 * then above 3 can take only one input argument
 * Supplier
 * ==============================================
 * BiPredicate
 * BiFuntion
 * BiConsumer
 * 
 * the above 3 can take 2 input arguments
 * 
 * =================================================================================
 *     primitive 						wrappertype					 primitive 
 * 									
 *    int -->                             Integer                   -->int
 *               auto-boxing                         auto-unboxing
 * =================================================================================
 *  
 *  
 */


//Write code to check weather given input is even or not

public class PreFunCon {

	public static void main(String[] args) {

		
		Predicate<Integer> p=i->i%2==0;
		
		System.out.println(p.test(20)); //int --> 20
	}

}
