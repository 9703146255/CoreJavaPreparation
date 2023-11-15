package JAVA8FullCourse4_S_6Videos6;

import java.util.function.Predicate;

/*
 * From 1.8 version  inside interface
 * 
 * Without effecting implementation classes
 * if we want to add new methods to the interface(extending interface funtionality)===>default methods
 * to define general utility methods inside interface with static
 * sum(int a, int b)
 * {
 * sop
 * }
 * 
 * 
 * Pre-defined Funtional interfaces
 * ===============================
 * Predicate 
 * Funtion 
 * Consumer
 * Supplier
 * 
 * Two argument Funtional interfaces
 * =================================
 * BiPredicate 
 * BiFuntion
 * BiConsumer
 * 
 * Premitive Funtional Interfaces
 * ==============================
 * IntPredicate
 * IntFuntion
 * IntConsumer
 * 
 * 
 * public boolean test(Integer I)
 * i
 * {
 * if(I%2==0)
 * {
 * return true;
 * }
 * else
 * {
 * return false;
 * }
 *}
 * (Integer I) ->I%2==0
 * 
 * Two conditions
 * ==================
 * p1 ==> To check weather the number is even or not 
 * p2 ==> To check the number is  > 10 or not
 * 
 * Predicate joining
 * =================
 * p1.and(p2)
 * p1.or(p2)
 * p1.negate ==> opposite of p1
 * 	//  .or(), .and(), .negate()
 */



public class PredefinedFunctionalInterface6 {

	public static void main(String[] args) {
		
		int[] x= {10,20,3,40,5,6,9,90};
		
		Predicate<Integer> p1=e1->e1%2==0;
		Predicate<Integer> p2=e1->e1>50;
	
		
		for(int x1:x)
		{
			if(p1.and(p2).test(x1));
			{
				System.out.println(x1);
			}
		}
	}

}
