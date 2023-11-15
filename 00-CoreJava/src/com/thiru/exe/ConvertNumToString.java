package com.thiru.exe;

public class ConvertNumToString {

	public static void main(String[] args) {

		
		int n=90;
		int n1=n,n2=n;
		int b=n1%10 ,a=n2/10;  //b=4 a=0.4==0
		String[] singleDigit=new String[] 
				
		{"zero","one","two","three","four","five","six","seven","eight","nine"};
		String[] twoDigit=new String[] {"","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nighteen"};
		String[] tensMultiple=new String[] {"","","ten","twenty","thirtee","fortee","fiftee","sextee","seventee","eightee","nightee"};
		
		if(a==1)
		{
			System.out.println(twoDigit[b+1]);
		}
		else if(b==0)
		{
			System.out.println(tensMultiple[a]);
		}
		else
		{
			System.out.println(tensMultiple[a]+"-"+singleDigit[b]);
		}
	}

}
