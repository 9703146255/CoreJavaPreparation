package com.thiru.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling12 {

	public static void main(String[] args) throws IOException {

		//2)BY USING SCANNER(READ THE DATA) 

		File file=new File("./thiru.txt"); 

		if(file.exists()) 

		file.delete(); 

		file.createNewFile(); 

		FileOutputStream fos=new FileOutputStream(file); 

		fos.write(116); 

		fos.write(104); 

		fos.write(105); 

		fos.write(114); 

		fos.write(117); 

		fos.write(109); 

		fos.write(97); 

		fos.write(101); 

		fos.write(108); 

		fos.write(104); 

		fos.flush(); 

		fos.close(); 

		} 
	}


