package com.thiru.streams.programs2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
 15) Given a list of strings, sort them according to increasing order of their length?
 ("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");

 Output :
 =======
C
C#
C++
Java
HTML
COBOL
Python
Kotlin

=================================================================================================
List<String> list = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
list.stream()
    .map(String::length)
    .forEach(System.out::println);

4
6
2
4
6
3
5
1
=========================================sorted ascending order===============================================================

List<String> list = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
list.stream()
    .map(String::length)
    .sorted()
    .forEach(System.out::println);

1
2
3
4
4
5
6
6
================================================================================================================================
 */
public class No6PrintIncreasingOrderOfWord {

	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
		list.stream().sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);

	}

}
