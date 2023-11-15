package com.thiru.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling13 {

	public static void main(String[] args) throws IOException {

		File file=new File("./thiru.txt"); 

		if(file.exists()) 

		file.delete(); 

		file.createNewFile(); 

		String s="hello"; 

		FileOutputStream fos=new FileOutputStream(file); 

		for(char ch:s.toCharArray()) 

		{ 

		fos.write((int)ch); 

		} 

		fos.close(); 

		fos.flush(); 
		} 
	}


