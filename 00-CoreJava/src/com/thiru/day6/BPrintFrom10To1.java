package com.thiru.day6;

public class BPrintFrom10To1 {

	public static void main(String[] args) {
		
		System.out.println("============while()====================");
		int start1=10;
		int end1=1;
		while(start1>=end1)
		{
			System.out.println(start1--);
		}
		System.out.println("============do while();====================");
		
		
		int start2=10;
		int end2=1;
		
		do
		{
			System.out.println(start2--);
		}
		while(start2>=end2);
		
		System.out.println("============for() loop;====================");
		
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		}
		
	
	}

}
