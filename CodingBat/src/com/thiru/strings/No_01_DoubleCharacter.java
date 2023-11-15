package com.thiru.strings;

/*
doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
 */
public class No_01_DoubleCharacter {



//	public static String doubleChar(String str)
//	{
//		 StringBuilder sbr=new StringBuilder();
//		 for(char  c:str.toCharArray())
//		 {
//			 sbr.append(c).append(c);
//			// sbr.append(c).append(c).append(c); 3 times printed
//		 }
//		 return sbr.toString();
//	}
//	
//	public static void main(String[] args) {
//		System.out.println(doubleChar("The"));
//		System.out.println(doubleChar("AAbb"));
//		System.out.println(doubleChar("Hi-There"));
//		
//		
//	}

	
	
	public static String doubleChar(String s) {
		StringBuilder sbr = new StringBuilder();
		for(char  charector:s.toCharArray())
		{
			sbr.append(charector).append(charector).append(charector);
		}
		return sbr.toString();
	}

	public static void main(String[] args) {

		System.out.println(doubleChar("thiru"));
	}
}
