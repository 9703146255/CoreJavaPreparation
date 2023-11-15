package com.thiru.abc;

import java.util.LinkedHashSet;
import java.util.Set;

/*
first non-repeated character
*/

public class ABC12 {

	public static void main(String[] args) {
		/* method-1 */
		
//		String name = "hello";
//		StringBuffer sbfr = new StringBuffer();
//
//		name.chars()
//		    .distinct()
//		    .mapToObj(s -> (char) s)
//		    .findFirst()
//		    .ifPresent(sbfr::append);
//
//		System.out.println(sbfr);

		
		
		
		
		
		
		//method-2
		
//		String name = "hello";
//		StringBuffer sbfr = new StringBuffer();
//
//		Set<Character> uniqueChars = new HashSet<>();
//
//		for (char c : name.toCharArray()) {
//		    if (uniqueChars.add(c)) {
//		        sbfr.append(c);
//		        break; // Stop after the first unique character is added
//		    }
//		}
//
//		System.out.println(sbfr);



		// method-3

//		String name = "hellohello";
//		char[] x = name.toCharArray();
//		StringBuffer sbfr = new StringBuffer();
//
//		for (int i = 0; i < name.length(); i++) {
//			
//			boolean unique = true;
//
//			for (int j = i+1; j < name.length(); j++) {
//				if (i != j && x[i] == x[j]) {
//					unique = false;
//				}
//
//			}
//
//			if (unique)
//			{
//				sbfr.append(x[i]);
//				break;  //8888888888888888888888888888888888888
//			}
//
//		}
//
//		System.out.println(sbfr);

		
	//method-4
		
		
		String name="kirankiran";
		StringBuffer sbfr = new StringBuffer();
		
		for (int i = 0; i < name.length(); i++) 
		{
			char ch = name.charAt(i);
			int indx = name.indexOf(ch,i+1);
			
			if(indx == -1)
			{
				sbfr.append(ch);
				System.out.println(sbfr); //first unique character
				System.exit(0);
			}
		}
		
		//System.out.println(sbfr);
		
		//method-5
		
//		String name="vinayavinayaz";
//		StringBuffer sbfr = new  StringBuffer();
//		Set<Character> set=new LinkedHashSet<>();
//		
//		for (int i = 0; i < name.length(); i++)
//		{
//			set.add(name.charAt(i));
//		}
//
//        for(Character ch:set)
//        {
//        	sbfr.append(ch);
//        	break;
//        }
//		
//        System.out.println(sbfr);
		
		
		
		
		
		
		
		
	}

}
