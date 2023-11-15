package com.thiru.filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


//2)FILE WRITER

public class FileHandling15 {

	public static void main(String[] args) throws IOException {

		File file=new File("./thiru.txt"); 

		if(file.exists()) 

		file.delete(); 

		file.createNewFile(); 

		String s="golla thirumalesh how are you dfsf"; 

		/* 

		 * FileWriter fw=new FileWriter(file); BufferedWriter bw=new BufferedWriter(fw); 

		 */ 

		//or 

		 BufferedWriter bw=new BufferedWriter(new FileWriter(file)); 

		bw.write(s); 

		bw.flush(); 

		bw.close(); 
		} 
	}




