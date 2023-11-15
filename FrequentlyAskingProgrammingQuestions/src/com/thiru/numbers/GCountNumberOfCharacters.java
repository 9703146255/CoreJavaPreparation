package com.thiru.numbers;

public class GCountNumberOfCharacters {

	public static void main(String[] args) {

		
		String name="ABCDEF";
		char[] x=name.toCharArray();
		int len=x.length;
		int count=0;
		for(int i=0;i<len;i++)
		{
			count++;
		}
		System.out.println(count);
	}

}
