package com.thiru.learnwithsandeep1;



//To print middle letter of each word
//step1: split each word
// take one by one word ==> count total/2 get mid val
public class N3PrintLastLetterInEachWord {

	public static void main(String[] args) {
		String msg="hi thiru how are you";
		String[] split=msg.split(" ");
		
		for(int i=0;i<split.length;i++)
		{
			String word=split[i];
			char midVal=word.charAt((word.length()-1)/2);
			System.out.println(midVal);
		}

	}

}
