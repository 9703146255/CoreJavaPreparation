package com.thiru.practice;

import java.util.Iterator;
import java.util.Scanner;

public class N22TheNumOfOccurenceOfCharString {

	public static void main(String[] args) {

//		String msg="hello world";
//		char[] c=msg.toCharArray();
//
//		int len=c.length;
//		char search='o';
//
//		for (int i = 0; i < len; i++) {
//
//			for (int j = 0; j < len; j++) 
//			{
//				if(search==c[i])
//				{
//					System.out.println(c[i]);
//					break;
//				}
//
//			}
//			if(search==c[i])
//			{
//				System.out.println("present");
//				break;
//			}
//		}
		
		//find the number of occurence of the character
		//===============================================
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter the string");
		String str1=sc1.nextLine();   //hello   s1.length
		
		int firstLength=str1.length();
		
		Scanner sc2=new Scanner(System.in);
		System.out.println("enter the character");
		String str2=sc2.next();  //l
		
		str1=str1.replace(str2,"");  //(l ,"")==>5-3(rem char)==>
		
		int lastLength=str1.length();           // s1.length
		
		System.out.println("Total number of occurence of a character:"+str2+" "+(firstLength-lastLength));
		
		
		
		
		
		
		
		

	}

}
