package com.thiru.streams.programs3;

import java.util.stream.IntStream;

/*
 21) Print first 10 even numbers
 Output :

2
4
6
8
10
12
14
16
18
20
 */

public class No3PrintFirst10EvenNumbers {

	public static void main(String[] args) {

		System.out.println("================first 10 even numbers=========================");
		IntStream.rangeClosed(1, 10).map(i->i*2).forEach(System.out::println);
		
		System.out.println("================first 10  10 multiple numbers=========================");
		IntStream.rangeClosed(1, 10).map(i->i*10).forEach(System.out::println);
		
	}

}
