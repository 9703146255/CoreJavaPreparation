package com.thiru.filehandling;

import java.io.File;
import java.io.IOException;

public class FileHandling03 {

	public static void main(String[] args) throws IOException {


		
		File f=new File("./charan/");   //it will create the charan folder   .-> . represent current directory

		//System.out.println(f.mkdir()); 

		//File f=new File("./rocky/good/boy/"); //charna-->good-->boy 

		System.out.println(f.mkdirs()); 

		 } 
	}


