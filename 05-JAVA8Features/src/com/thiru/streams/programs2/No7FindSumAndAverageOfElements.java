package com.thiru.streams.programs2;

import java.util.Arrays;

/*
 16) Given an integer array, find sum and average of all elements?Sum = 347
Average = 43.375
{45, 12, 56, 15, 24, 75, 31, 89}
 */
public class No7FindSumAndAverageOfElements {

	public static void main(String[] args) {
		int[] a=new int[] {45, 12, 56, 15, 24, 75, 31, 89};
		int sum=Arrays.stream(a).sum();
		System.out.println(sum);
		
		double average=Arrays.stream(a).average().getAsDouble();
		System.out.println(average);
		
		//power
		
		double powerResult = Math.pow(Arrays.stream(a).skip(0).findFirst().getAsInt(), Arrays.stream(a).skip(1).findFirst().getAsInt());
		System.out.println("Power Result: " + powerResult);

		// Subtraction
		int subtractionResult = Arrays.stream(a).skip(2).limit(2).reduce((x, y) -> x - y).orElse(0);
		System.out.println("Subtraction Result: " + subtractionResult);

		// Multiplication
		int multiplicationResult = Arrays.stream(a).skip(4).limit(2).reduce((x, y) -> x * y).orElse(0);
		System.out.println("Multiplication Result: " + multiplicationResult);

		// Division
		double divisionResult = Arrays.stream(a).skip(6).limit(2).mapToDouble(Double::valueOf).reduce((x, y) -> x / y).orElse(0);
		System.out.println("Division Result: " + divisionResult);

	}

}
