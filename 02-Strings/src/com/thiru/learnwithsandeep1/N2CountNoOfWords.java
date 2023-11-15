package com.thiru.learnwithsandeep1;



//To print first letter of each word
public class N2CountNoOfWords {

	public static void main(String[] args) {
		
		String msg="hi thiru how are you";
		String[] split=msg.split(" ");
		int count=0;
		
		for(int i=0;i<split.length;i++)
		{
	         count=count+1;
		}
		System.out.println(count);

	}

}
