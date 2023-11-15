package com.thiru.streams.programs3;

import java.util.stream.IntStream;

public class No1SumOf1ONaturalNumbers {

	public static void main(String[] args) {

		
		int sum=IntStream.range(1, 11).sum();
		System.out.println(sum);
	}

}
