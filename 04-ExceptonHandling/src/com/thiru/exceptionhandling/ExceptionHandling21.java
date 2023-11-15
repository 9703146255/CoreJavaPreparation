package com.thiru.exceptionhandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.imageio.IIOException;

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



//ECLIPSE SHORTCUT FOR EXCEPION HANDLING
//select exception executable part ==> RIGHT CLICK ==>SURROUNDING WITH ==> TRY CATCH 
                                                                            TRY MULTI CATCH 
                                                                            TRY WITH RESOURCES BLOCK

*/







                                                                        

public class ExceptionHandling21 {

	public static void main(String[] args) throws IIOException {
	
	
	
		
			try {
				int[] arr= {1,2,3};
				System.out.println(arr[1]/0);
			} catch (Exception e) {
				e.printStackTrace();
			}          //RISKY CODE
		
		

	}

}
