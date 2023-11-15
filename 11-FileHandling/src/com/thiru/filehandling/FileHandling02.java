package com.thiru.filehandling;

import java.io.File;
import java.io.IOException;

public class FileHandling02 {

	public static void main(String[] args) throws IOException {


		
		File f=new File("thiru.txt"); 

		if(!f.exists()) 

		f.createNewFile();   //create a text file 

		             //f.delete();             //delete a text file 

		 } 
	}


