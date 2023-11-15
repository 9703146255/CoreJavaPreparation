package com.thiru.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


//2)FILE WRITER

public class FileHandling14 {

	public static void main(String[] args) throws IOException {

		File file=new File("./thiru.txt"); 

		if(file.exists()) 

		file.delete(); 

		file.createNewFile(); 

		String s="golla thirumalesh"; 

		FileWriter fw=new FileWriter(file); 

		fw.write(s); 

		fw.flush(); 

		fw.close(); 
		} 
	}




