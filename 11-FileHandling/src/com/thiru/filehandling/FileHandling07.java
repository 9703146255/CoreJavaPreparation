package com.thiru.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileHandling07 {

	public static void main(String[] args) throws IOException {


		File file=new File("./thiru.txt"); 

		if(!file.exists()) 

		file.createNewFile(); 

		FileInputStream fis=new FileInputStream(file); 

		System.out.println((char)fis.read());  //by reading single charactor 

		/* 

		 * int asciiCode; 

		 *  while((asciiCode = fis.read()) != -1) { 

		 * System.out.print((char)asciiCode); } 

		 *  

		 * //System.out.print((char)asciiCode); fis.close(); //by reading multiple charactor 

		 */ 

		 } 
	}


