package com.thiru.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling09 {

	public static void main(String[] args) throws IOException {

		//2)BY USING SCANNER(READ THE DATA) 

		// by using buffer reader 

		File file=new File("./thiru.txt"); 

		if(!file.exists()) 

		file.createNewFile(); 

		FileReader fr=new FileReader(file); 

		BufferedReader br=new BufferedReader(fr); 

		  int asciiCode;  

		  String text=" "; 

		  while((asciiCode = br.read()) != -1) { 

		  text+=String.valueOf((char)asciiCode); 

		  } 

		  System.out.println(text); 

		 fr.close(); 

		  br.close(); 
	}
}

