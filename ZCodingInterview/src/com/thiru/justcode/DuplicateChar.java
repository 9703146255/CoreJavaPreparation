package com.thiru.justcode;

public class DuplicateChar {

	public static void main(String[] args) {
		String s="sandeep";
		int len=s.length();
		
		for(int i=0;i<len;i++)
		{
			
			for(int j=i+1;j<len;j++)
			{
					if(s.charAt(i) == s.charAt(j))
					{
						System.out.println("duplicate character in the array is: "+(s.charAt(i)) );
					}
			}
		
			
		}

	}

}
