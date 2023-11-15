package com.thiru.day5;


enum Season
{
	WINTER, SUMMER, SPRING, RAINY,HOT,THIRU;   //All are object of type enum

	Season()
	{
		System.out.println("Constructor is executed....");
	}
}
public class EnumTest7 {

	public static void main(String[] args) {
		System.out.println(Season.THIRU);

	}

}
