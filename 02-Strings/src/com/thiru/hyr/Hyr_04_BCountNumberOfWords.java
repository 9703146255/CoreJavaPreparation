package com.thiru.hyr;

import java.util.Scanner;
//Write a java program count number of words  in a string

public class Hyr_04_BCountNumberOfWords {

	public static void main(String[] args) {
		
	    String name="golla thirumalesh hi how are you";
		String[] words=name.split(" ");
		int len=words.length;
		int count=0;
		for(int i=0;i<len;i++ )
		{
			count++;
		}
		System.out.println(count);
	}

}
