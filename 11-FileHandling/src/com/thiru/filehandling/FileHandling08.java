package com.thiru.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileHandling08 {

	public static void main(String[] args) throws IOException {


		//4 ways to we have read the data 

		// 1)BY USING --> FileInputStream 	==> WE CAN READ ONE CHARACTER AT A TIME 

		//2)by using  -->Scanner() 

		///3)by using   --> FileReade() 

		//4)By using    -->BufferReader() ==> WE CAN READ ONE LINE AT A TIME

		// 1)BY USING --> FileInputStream  

		File file=new File("./thiru.txt"); 

		if(!file.exists()) 

		file.createNewFile(); 

		FileInputStream fis=new FileInputStream(file); 

		//System.out.println((char)fis.read()); 

		  int asciiCode;  

		  while((asciiCode = fis.read()) != -1) { 

		 System.out.print((char)asciiCode); 

		  } 

		 fis.close(); 

		 } 
	}


