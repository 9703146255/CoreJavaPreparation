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
 * I
 * 
 * 
 * 
 * 
 * 
 */


//Write a predicate to check weather length of string is> 5 or not 

public class PredefinedFunctionalInterface2 {

	public static void main(String[] args) {
		
		String[] s= {"chiru","tharun","vinay","chandan"};
		
		Predicate<String> p1=s1->s1.length()>5;
		
		
		//predicate.test(string irerative var)
		for(String res:s)
		{
			if(p1.test(res))
			{
				System.out.println(res);
			}
		}
	}

}
