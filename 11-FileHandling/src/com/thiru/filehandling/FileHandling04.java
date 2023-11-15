package com.thiru.filehandling;

import java.io.File;
import java.io.IOException;

public class FileHandling04 {

	public static void main(String[] args) throws IOException {


		File f=new File("C:\\TestFiles\\thiru.txt"); 

		if(f.exists()) 

		f.delete(); 

		System.out.println(f.createNewFile()); 

		 } 
	}


