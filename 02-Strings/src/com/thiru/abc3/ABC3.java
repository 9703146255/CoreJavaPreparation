package com.thiru.abc3;
//HOW TO REMOVE WHITE SPACES IN A STRING


public class ABC3 {

	public static void main(String[] args) {
		/*
		s = s.replace("\\s", "");  ==> IT WILL REMOVE TAB SPACES AND NORAML SPACES
		s = s.replace("\\t", "");  ==> IT WILL REMOVE ONLY TAB SPACES.
		s = s.replace(" ", "");  ==> IT WILL REMOVE ONLY normal SPACES.
		 */

		//some tab spaces are present and some nomal spaces
		String s = "JOIN ABC GET SKILLED GET PLACED OR TAKE COMPLETE REFUND";
        s = s.replace("\\s", "");
       
        System.out.println(s);;
		
		
	}

}
