package com.thiru.day3a;
//1.Print given number is Positive or Negative
//2. Print given number is divisible by 3 or not
//3. Print square if given number is even otherwise print cube
//4. Print next even number if given number is odd otherwise print the same number
//5. Print true, if all digits in two-digit number are even otherwise print false.

public class EvenSquareOtherCube {

	public static void main(String[] args) {
		int n=3;
		
		if(n%2==0)
		{
			System.out.println(n);
			System.out.println("even square :"+(n*n));
		}
		else
		{
			System.out.println(n);
			System.out.println("even square :"+(n*n*n));
		}

	}

}
