package com.thiru.learnwithsandeep1;



//To print first letter of each word
public class N1PrintFirstLetterOfEachWord {

	public static void main(String[] args) {
		String msg="hi thiru how are you";
		String[] split=msg.split(" ");
		
		for(int i=0;i<split.length;i++)
		{
			String word=split[i];
			System.out.println(word.charAt(0));
			
		}
		
		//FIRST LETTER==>word.charAt(0)
		//SECOND LETTER==>word.charAt(1)
		//THIRD LETTER==>word.charAt(2)........etc
		
	
	}

}
