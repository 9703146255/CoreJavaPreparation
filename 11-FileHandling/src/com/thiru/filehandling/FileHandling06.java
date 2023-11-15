package com.thiru.filehandling;

import java.io.File;
import java.io.IOException;

public class FileHandling06 {

	public static void main(String[] args) throws IOException {


File f=new File("C:\\Users\\findm\\eclipse-workspace\\Practice"); 

        //System.out.println(Arrays.toString(f.list())); 

        //System.out.println(Arrays.toString(f.listFiles())); 

System.out.println(f.getName());  //IT WILL RETURN PACKAGE NAME 

System.out.println(f.getAbsolutePath()); 

System.out.println(f.getFreeSpace()); 

System.out.println(f.getParent()); 

System.out.println(f.getCanonicalPath()); 

System.out.println(f.getUsableSpace()); 

System.out.println(f.getClass()); 

System.out.println(f.getPath()); 

File f1=new File(f.getParent()+"./chitti.docx"); 

System.out.println(f1.createNewFile()); 

		 } 
	}


