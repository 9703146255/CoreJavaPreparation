package com.thiru.strings;


/*
 Return the number of times that the string "code" appears anywhere in the given string,
 except we'll accept any letter for the 'd', so "cope" and "cooe" count.
countCode("aaacodebbb") → 1
countCode("codexxcode") → 2
countCode("cozexxcope") → 2
 */
public class No_04_CountcoxeHowManyTimesForm {
	
	public static int countCode(String str)
	{
		int len=str.length();
		int count=0;
		for(int i=0;i<len-3;i++) //1st/2nd/4th
		{
			if(str.charAt(i)=='c' && str.charAt(i+1)=='o' && str.charAt(i+3)=='e')
			{
				count++;
			}
		}
		return count;
		
	}

	public static void main(String[] args) {
		System.out.println(countCode("aaacodebbb"));
		System.out.println(countCode("codexxcode"));
		System.out.println(countCode("cozexxcope"));

	}

}
