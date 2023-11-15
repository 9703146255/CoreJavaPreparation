package com.thiru.start1;

public class S07StringsDuplicateChar {

	public static void main(String[] args) {
		//duplicate characters
//		String s="sandeep";
//		int len=s.length();
//		
//		for(int i=0;i<len;i++)
//		{
//			
//			for(int j=i+1;j<len;j++)
//			{
//					if(s.charAt(i) == s.charAt(j))
//					{
//						System.out.println("duplicate character in the array is: "+(s.charAt(i)) );
//					}
//			}
//		
//			
//		}

		//duplicate characters in a string
//		String s="thiruth";
//		char[] x=s.toCharArray();
//		int len=x.length;
//		for(int i=0;i<len;i++)
//		{
//			for(int j=i+1;j<len;j++)
//			{
//				if(x[i]==x[j])
//				{
//					System.out.println(x[i]);
//				}
//			}
//		}
		
		
		
		//unique characters
		String s="zeebra";
		char[] x=s.toCharArray();
		int len=x.length;
		for (int i = 0; i < len; i++)
		{
			boolean unique=true;
			 for (int j = 0; j < len; j++) 
			 {
				if(i != j && x[i]==x[j])  //remember this
				{
					unique=false;
				}
			 }
			 
			 if(unique)
			 {
				 System.out.println(x[i]);
			 }
		}
		
		
		
		
		
	}

}
