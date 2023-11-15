package com.thiru.strings;

import java.util.Iterator;

/*
Return true if the string "cat" and "dog" appear 
the same number of times in the given string.
catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true
 */

public class No_03_CatAndDogCountEqualOrNot {
//	public static boolean catDog(String str)
//	{
//		int catCount=0;
//		int dogCount=0;
//		for (int i = 0; i < str.length()-2; i++)  //str.length()-2 ==>if dont keep get index out of bound excepiton
//		{
//		    String subStr=str.substring(i, i+3);
//		    if(subStr.equals("cat"))
//		    {
//		    	catCount++;
//		    }
//		    else if(subStr.equals("dog"))
//		    {
//		    	dogCount++;
//		    }
//			
//		}
//	
//		return catCount==dogCount;
//		
//	}
//	
//	public static void main(String[] args) {
//		/*
//catDog("catdog") → true
//catDog("catcat") → false
//catDog("1cat1cadodog") → true
//		 */
//		System.out.println(catDog("catdog"));
//		System.out.println(catDog("catcat"));
//		System.out.println(catDog("1cat1cadodog"));
//		
//
//	}
	
	public static boolean catDog(String str)
	{
		int catCount=0;
		int dogCount=0;
		for(int i=0;i<str.length()-2;i++)
		{
			String subStr=str.substring(i, i+3);
			if(subStr.equals("cat"))
			{
				catCount++;
			}
			else if(subStr.equals("dog"))
			{
				dogCount++;
			}
		}
		return catCount==dogCount;
		
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(catDog("catdog"));
		System.out.println(catDog("catcat"));
		System.out.println(catDog("1cat1cadodog"));
	}
	
	

}
