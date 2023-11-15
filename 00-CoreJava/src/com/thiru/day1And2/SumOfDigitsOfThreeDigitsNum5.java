package com.thiru.day1And2;

public class SumOfDigitsOfThreeDigitsNum5 {

	public static void main(String[] args) {

		int n=123;
		int last=n%10;
		int first=(n/10)/10;
		int mid=(n/10)%10;
		System.out.println(first);
		System.out.println(mid);
		System.out.println(last);
		System.out.println(first+mid+last+": sum");
		
	}

}
