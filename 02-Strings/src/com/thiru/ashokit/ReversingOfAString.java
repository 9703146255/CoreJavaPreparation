package com.thiru.ashokit;

public class ReversingOfAString {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("xxxxxxxxxxxxxxxmethod-1xxxxxxxxxxxxxxxx");
		String s="thiru";
		char[] x=s.toCharArray();
		int len=x.length;
		String sum="";
		String sum1="";
		for (int i = len-1; i >= 0; i--)
		{
			sum=sum+x[i];
		}
		System.out.println(sum);
		
		
		System.out.println("xxxxxxxxxxxxxxxmethod-2xxxxxxxxxxxxxxxx");
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());
		
		
		System.out.println("xxxxxxxxxxxxxxxmethod-3xxxxxxxxxxxxxxxx");
		StringBuilder sbr=new StringBuilder(s);
		System.out.println(sbr.reverse());
		
		System.out.println("xxxxxxxxxxxxxxxmethod-4xxxxxxxxxxxxxxxx");
		
		for(int j=len-1;j>=0;j--)
		{
			sum1=sum1+s.charAt(j);
			
		}
		System.out.println(sum1);
		
     }



}
