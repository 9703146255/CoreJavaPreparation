package com.thiru.learnwithsandeep1;



//To print Substring of a given string
/*

a
ab
abc
abcd
abcde
b
bc
bcd
bcde
c
cd
cde
d
de
e


 */
public class N5SubStringsOfGivenString {

	public static void main(String[] args) {
		String msg="abcde";
		
		for(int i=0;i<msg.length();i++)
		{
		 for(int j=i+1;j<=msg.length();j++) //=
		 {
			 System.out.println(msg.substring(i, j));
		 }
		}
		
		

	}

}
