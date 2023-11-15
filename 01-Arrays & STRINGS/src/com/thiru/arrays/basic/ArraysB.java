package com.thiru.arrays.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysB {
	
	//Adding Elements to a String Array

     //1)Using Pre-Allocation of the Array
    //  2)Using the Array List
   //  3)By creating a new Array

	
	
	
	//1)Using Pre-Allocation of the Array
	public static void main(String[] args) {
		
		
		
		
		String[] s=new String[5];
		s[0]="a";
		s[1]="b";
		s[2]="c";
		s[3]="d";
		s[4]="e";
		System.out.println(Arrays.toString(s));
		
		String add="thiru";
		List<String> list=new ArrayList<>(Arrays.asList(s));
		
		list.add(add);
		System.out.println(list);
		
		
		
		

	}

}
