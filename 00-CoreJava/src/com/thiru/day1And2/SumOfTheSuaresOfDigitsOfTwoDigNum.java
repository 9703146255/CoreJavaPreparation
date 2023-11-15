package com.thiru.day1And2;

import java.util.Scanner;

public class SumOfTheSuaresOfDigitsOfTwoDigNum {

	public static void main(String[] args) {

//		int n=25;
//		int first=n/10;
//		int last=n%10;
//		int square=(first*first)+(last*last);
//		int sum=square+square;
//		System.out.println(sum);
		
		
		  Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a two-digit number: ");
	        int number = scanner.nextInt();

	        if (number >= 10 && number <= 99) {
	            int firstDigit = number / 10;
	            int secondDigit = number % 10;

	            int sumOfSquares = (firstDigit * firstDigit) + (secondDigit * secondDigit);
	            System.out.println("Sum of the squares of the digits: " + sumOfSquares);
	        } else {
	            System.out.println("Invalid input. Please enter a valid two-digit number.");
	        }

	        scanner.close();
	}

}

/*
import java.util.Scanner;

public class SumOfSquaresOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a two-digit number: ");
        int number = scanner.nextInt();

        if (number >= 10 && number <= 99) {
            int firstDigit = number / 10;
            int secondDigit = number % 10;

            int sumOfSquares = (firstDigit * firstDigit) + (secondDigit * secondDigit);
            System.out.println("Sum of the squares of the digits: " + sumOfSquares);
        } else {
            System.out.println("Invalid input. Please enter a valid two-digit number.");
        }

        scanner.close();
    }
}

*/