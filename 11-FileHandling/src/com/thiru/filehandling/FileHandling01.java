package com.thiru.filehandling;

import java.io.File;
import java.io.IOException;

public class FileHandling01 {

	public static void main(String[] args) throws IOException {


		
		//
		 File f=new File("thiru.txt"); 

		 System.out.println("file created success fully: "+f.createNewFile()); 

		 //System.out.println("file deleted success fully: "+f.delete()); 

		 System.out.println("file is existing: "+f.exists()); 
	}

}
