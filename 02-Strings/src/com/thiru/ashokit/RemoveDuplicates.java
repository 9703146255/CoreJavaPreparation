package com.thiru.ashokit;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String str="programming";
		System.out.println("xxxxxxxxxxxx METHOD-1 xxxxxxxxxxxxxxxx");
		StringBuilder sb=new StringBuilder();
		str.chars().distinct().forEach(s->sb.append((char)s));
		System.out.println(sb);
		
		System.out.println("xxxxxxxxxxxx METHOD-1 xxxxxxxxxxxxxxxx");
		StringBuilder sb1=new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			int idx=str.indexOf(ch,i+1);
			if(idx==-1)
			{
				sb1.append(ch);
			}
			
		}
		System.out.println(sb1);
		
		

	}

}
