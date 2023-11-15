package com.thiru.strings;

/*
countHi("abc hi ho") → 1
countHi("ABChi hi") → 2
countHi("hihi") → 2
 */
public class No_02_CountHi {


//	public static int countHi(String str)
//	{
//		int len=str.length();
//		int count=0;
//
//		for (int i = 0; i <len; i++)
//		{
//			if(str.charAt(i)=='h' && str.charAt(i+1)=='i') //check 1st(h) and 2nd char(i)..etc
//			{
//				count++;
//			}
//		}
//		return count;
//
//	}
//
//		public static void main(String[] args) {
//		//		countHi("abc hi ho") → 1
//		//		countHi("ABChi hi") → 2
//		//		countHi("hihi") → 2
//		System.out.println(countHi("abc hi ho"));
//		System.out.println(countHi("ABChi hi"));
//		System.out.println(countHi("hihi"));
//
//	}
	
	
	
	public static int countHi(String s)
	{
		int count=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)=='h' && s.charAt(i+1)=='i')
			{
				count++;
			}
		}
		
		
		return count;
		
	}
	
	public static void main(String[] args) {
		System.out.println(countHi("hi ra hihi hihi hihi hihi"));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
