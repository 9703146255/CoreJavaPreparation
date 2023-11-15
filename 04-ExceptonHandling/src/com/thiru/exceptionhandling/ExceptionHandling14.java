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


TRY WITH RESOURCES
==================
WE HAVE TO REDUCE THE MEMORY LEAKAGE PROBLEMS f.close() --> if i forgot the close method
//we dont get memory leakage problems
//security problems


 */


//TRY WITH RESOURCES fis,isr,fr,br (resources) -->automatically close
public class ExceptionHandling14 {

	public static void main(String[] args) throws IOException {
	
		File file=new File("./sample.txt");
		if(!file.exists())
		    file.createNewFile();
		
		
		
		
		//AUTOCLOSABLE interfaces
		try(   //RESUORCES

				//ONLY AUTO CLOSABLE INTERFACE ==>IMPLEMTS CLASSES WE HAVE TO MENTION HERE
				FileReader fr=new FileReader(file);
				FileInputStream fis=new FileInputStream(file);
				InputStreamReader isr=new InputStreamReader(fis);		
				BufferedReader br=new BufferedReader(isr);
				
			)
		{
			
			String text=new String();  //empty text an sempty line
			String line=new String();
			while((line = br.readLine()) != null)
			{
				text += line+"\n";
			}
			System.out.println(text);
			
		}catch(Exception e)
		{
			
		}
		

		

	}

}
