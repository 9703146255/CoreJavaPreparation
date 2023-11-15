package com.thiru.streams.programs2;

import java.util.stream.Collectors;
import java.util.stream.Stream;


/*
step1:
=====
String s1 = "RaceCar";
Stream.of(s1.split(""))
        .forEach(System.out::println);
o/p:

R
a
c
e
C
a
r

step2:
=====
String s1 = "RaceCar";
s1 = Stream.of(s1.split(""))
        .map(String::toLowerCase)
        .collect(Collectors.joining());

System.out.println(s1);

o/p:
racecar

step3:
=====
String s1 = "RaceCar";
s1 = Stream.of(s1.split(""))
        .map(String::toLowerCase)
        .sorted()
        .collect(Collectors.joining());

System.out.println(s1);

o/p:
aaccerr

 */





public class No3CheckTwoStringsAnagramOrNot {

	public static void main(String[] args) {

		String s1="RaceCar";
		String s2="CarRace";

		s1=Stream.of(s1.split("")).map(String::toLowerCase).sorted().collect(Collectors.joining());
		s2=Stream.of(s2.split("")).map(String::toLowerCase).sorted().collect(Collectors.joining());
		
		if(s1.equals(s2))
		{
			System.out.println("Two strings are anagram");
		}
		else
		{
			System.out.println("Two Strings are not anagrams");
		}

	}

}
