package com.thiru.day3a;

//1.Print given number is Positive or Negative
//2. Print given number is divisible by 3 or not
//3. Print square if given number is even otherwise print cube
//4. Print next even number if given number is odd otherwise print the same number
//5. Print true, if all digits in two-digit number are even otherwise print false.


public class TwoDigEvenTrueOtherwiseFalse {

	public static void main(String[] args) {
		int n=-99;
		
		if((n>=10 && n<=99) || (n<=-10 && n>=-99))
		{
			if(n%2==0)
			{
				System.out.println(n);
				System.out.println("true");
				System.exit(0);
			}
			else
			{
				System.out.println(n);
				System.out.println("false");
				System.exit(0);
			}
		}
		System.out.println("please enter only two digit numbers");

	}

}
