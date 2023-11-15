package com.thiru.strings1;

/*
The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".

makeTags("i", "Yay") → "<i>Yay</i>"
makeTags("i", "Hello") → "<i>Hello</i>"
makeTags("cite", "Yay") → "<cite>Yay</cite>"
=============================================
return "<"+s1+">"+s2+"</"+s1+">";
=============================================
 */
public class No_03_MakeTags {

	public static String makeTags(String s1, String s2)
	{
		return "<"+s1+">"+s2+"</"+s1+">";
		
	}
	public static void main(String[] args) {
		System.out.println(makeTags("i", "Yay"));
		System.out.println(makeTags("i", "Hello"));
		System.out.println(makeTags("cite", "Yay"));

	}

}
