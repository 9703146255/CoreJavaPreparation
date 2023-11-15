package com.thiru.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling10 {

	public static void main(String[] args) throws IOException {

		//3) FileReader (read data) 

		File file=new File("./thiru.txt"); 

		if(!file.exists()) 

		file.createNewFile(); 

		FileReader fis=new FileReader(file); 

		//System.out.println((char)fis.read()); 

		  int asciiCode;  

		  while((asciiCode = fis.read()) != -1)  

		  { 

		 System.out.print((char)asciiCode); 

		 } 

		  fis.close(); 


		}}



