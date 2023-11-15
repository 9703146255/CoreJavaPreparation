package com.thiru.day5;
enum Course
{
	Java, python, Spring, Testing
};
public class EnumTest1 {

	public static void main(String[] args) {
		for(Course nit : Course.values())
		{
			System.out.println(nit);
		}
	}

}
