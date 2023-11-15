package com.thiru.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling11 {

	public static void main(String[] args) throws IOException {

		//2)BY USING SCANNER(READ THE DATA) 

		File file=new File("./thiru.txt"); 

		if(!file.exists()) 

		file.createNewFile(); 

		Scanner sc=new Scanner(file); 

		while(sc.hasNext()) 

		{ 

		System.out.println(sc.next()); 

		}}
	}


