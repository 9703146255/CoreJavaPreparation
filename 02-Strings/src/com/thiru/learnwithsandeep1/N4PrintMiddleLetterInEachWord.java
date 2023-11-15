package com.thiru.learnwithsandeep1;



//To print last letter of each word
//word.charAt(word.length()-1)
public class N4PrintMiddleLetterInEachWord {

	public static void main(String[] args) {
		String msg="hi thiru how are you";
		String[] split=msg.split(" ");
		
		for(int i=0;i<split.length;i++)
		{
			String word=split[i];
			System.out.println(word.charAt(word.length()-1));
		}

	}

}
