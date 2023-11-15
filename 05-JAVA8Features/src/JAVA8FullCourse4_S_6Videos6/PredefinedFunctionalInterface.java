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
 * Predicate --> test
 * Funtion/job   --> apply
 * Consumer  --> accept
 * Supplier  -->get
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
 * I
 * 
 * 
 * 
 * 
 * 
 */










public class PredefinedFunctionalInterface {

	public static void main(String[] args) {
		
//		Predicate<Integer> p1= i-> i%2==0;
//		System.out.println(p1.test(100));
//		System.out.println(p1.test(99));
		
		
		Predicate <Integer> p1=i->i%2==0 && i%3==0;
		System.out.println(p1.test(30));
		System.out.println(p1.test(21));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
