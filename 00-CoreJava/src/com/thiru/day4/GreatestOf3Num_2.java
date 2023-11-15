package com.thiru.day4;

public class GreatestOf3Num_2 {

	public static void main(String[] args) {
		//GreatestOf3Num_2
		int n1=20,n2=20,n3=30;
		if(n1>n2 && n1>n3)
		{
			System.out.println("n1 is greater"+n1);
		}if(n2>n1 && n2>n3)
		{
			System.out.println("n2 is greater"+n2);
		}
		if(n3>n1 && n3>n2)
		{
			System.out.println("n3 is greater"+n3);
		}
		else
		{
			System.out.println("N1=N2=N3");
		}

	}

}
