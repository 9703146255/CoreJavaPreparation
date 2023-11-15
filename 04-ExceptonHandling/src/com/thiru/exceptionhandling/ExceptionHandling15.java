package com.thiru.exceptionhandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
WE HAVE TO RUDUCE THE MEMORY LEAKAGE PROBLEMS f.close() --> if i forgot the close method
//we dont get memory leakage problems
//security problems


 */


//TRY WITH RESOURCES fis,isr,fr,br (resources) -->automatically close
public class ExceptionHandling15 {

	public static void main(String[] args) throws IOException {
	
		File file=new File("./sample.txt");  //FileNotFountException
		if(!file.exists())
		    file.createNewFile();
		
		
		
		
		//AUTOCLOSABLE interfaces
		try(   //RESUORCES

				//ONLY AUTO CLOSABLE INTERFACE IMPLEMTS CLASSES WE HAVE TO MENTION HERE
				FileReader fr=new FileReader(file);
				FileInputStream fis=new FileInputStream(file);
				InputStreamReader isr=new InputStreamReader(fis);		
				BufferedReader br=new BufferedReader(isr);)
		{
			
			String text=new String();
			String line=new String();
			
			int[] arr= {1,2,3};        
			System.out.println(arr[2]/0); //***************//ArithematicException
			
			while((line = br.readLine()) != null)
			{
				text += line+"\n";
			}
			System.out.println(text);
			
		}
		catch(ArrayIndexOutOfBoundsException   e1)
		{
			e1.printStackTrace();
			System.out.println("please we don't divide the number by zero");
		}
		catch(ArithmeticException  e2)
		{
			e2.printStackTrace();
			System.out.println("please check there not avoilable any file");
		}
		catch(FileNotFoundException e3)
		{
			e3.printStackTrace();
			System.out.println("please give the ranges within the given range");
		}
		
		
		

		

	}

}
