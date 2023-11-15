package com.thiru.exceptionhandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*

WHAT IS EXCEPITON:
==================
EXCEPTION IS AN EVENT THAT OCCURES DUTING THE EXECUTION OF PROGRAM 
THAT DISTRUP THE NORMAL FLOW OF THE PROGRAM EXECUTION

AGENDA
=======
TRY WITH RESOURCES
MULTIPLE CATCH BLOCKS
MULTIPLE EXCEPTIONS IN SINGLE CATCH BLOCK
WHEN WILL BE THE FINALLY BLOCK NOT BE EXECUTED	
ECLIPSE SHORTCUT FOR EXCEPION HANDLING
THROW CUSTOM (USER DEFINED EXCEPTION USING THROW KEYWORD



FileReader
File InputStream
InputStreamReader
BufferedReader

 */


//TRY WITH RESOURCES fis,isr,fr,br (resources) -->automatically close
public class ExceptionHandling13 {

	public static void main(String[] args) throws IOException {
	
		File file=new File("./sample.txt");  				//file is there
		if(!file.exists())									//file is not there
		    file.createNewFile();							//than create the file
		
		FileReader fr=new FileReader(file);                 //reading the file gere
		FileInputStream fis=new FileInputStream(file);    
		
		InputStreamReader isr=new InputStreamReader(fis);
		
		BufferedReader br=new BufferedReader(isr);
		
		String text=new String();
		String line=new String();
		while((line = br.readLine()) != null)
		{
			text += line+"\n";
		}
		System.out.println(text);
		fis.close();
		isr.close();
		fr.close();	
		br.close();
		

	}

}
