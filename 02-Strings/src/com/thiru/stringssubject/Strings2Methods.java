package com.thiru.stringssubject;

import java.util.Arrays;

public class Strings2Methods {

	public static void main(String[] args) {

     String s1="thiru";
     String s2="thiRU";
     String s3="THIRU";	
     String s4="   Hello thiru ";

    //equals( we can compare the DATA or CONTENT
     System.out.println("-------------------------------------------------------------------------------");
     System.out.println("s1 s2 -->equals()  :"+s1.equals(s2));
     System.out.println("-------------------------------------------------------------------------------");
     //equalsIsIgnoreCase() -->It will compare the data UPPER CASE OR LOWER CASE NO PROBLEM
     System.out.println("s1 s2 -->equalsIsIgnoreCase() :"+s1.equalsIgnoreCase(s2));
     System.out.println("s1 s3 -->equalsIsIgnoreCase() :"+s1.equalsIgnoreCase(s3));
     System.out.println("-------------------------------------------------------------------------------");
     //contains() -->It will check the data existing or not !) full data or 2) partial data
     System.out.println("s1.contains(\"ru\") :"+s1.contains("ru"));
     System.out.println("s1.contains(\"thi\") :"+s1.contains("thi"));
     System.out.println("s1.contains(\"THI\") :"+s1.contains("THI"));
     System.out.println("s1.contains(\"THI\") :"+s1.contains("7"));
     System.out.println("-------------------------------------------------------------------------------");
     //Length() --> how many letters is there(in the given string)
     System.out.println("s1.length() : "+ s1.length());
     System.out.println("s2.length() : "+ s2.length());
     System.out.println("-------------------------------------------------------------------------------");
     //trim() --> it will remove the leading(frient) and trailing(ending spaces) it will remove not remove middile space
     System.out.println("before trimming : "+ s4.length());
     System.out.println("s4.trim() : "+s4.trim().length());
     System.out.println("after trimming : "+ s4.length());
     System.out.println("-------------------------------------------------------------------------------");
     //toLowerCase()  --> It will convert the all letters into lower case
     System.out.println("s3.toLowerCase() : "+ s3.toLowerCase());
     System.out.println("-------------------------------------------------------------------------------");
     //toUpperCase()  --> It will convert the all letters into uppercase case
     System.out.println("toUpperCase() : "+ s4.toUpperCase());
     System.out.println("-------------------------------------------------------------------------------");
     //toCharArray() --> it will convert string into charactor array  [t, h, i, r, u]
     System.out.println(s1.toCharArray()); 
     System.out.println("-------------------------------------------------------------------------------");
     // indexOf("t") -->index is start with 0   if given word or letter is "not present" than its shows -1
     System.out.println(s1.indexOf("i"));  
     System.out.println("-------------------------------------------------------------------------------");
     String s5="hello world";
     System.out.println("-------------------------------------------------------------------------------");
     //s5.indexOf("o")  s5.lastIndexOf("o") it will return the first/start "O" index value
     System.out.println(s5.indexOf("o"));    //from starting or first occurrence
     System.out.println(s5.lastIndexOf("o"));  // from endingvor from last occurrence
     System.out.println("-------------------------------------------------------------------------------");
     //we can take one string from given string called sustring 
     //we can tell from where to where
     System.out.println(s5.substring(6,11));  //start form 6th to 11th
     System.out.println(s5.substring(6));  //start with 6th index to unlimited
     System.out.println("-------------------------------------------------------------------------------");
     
     //s6.split("") we can split the word given spaces,words,special characters,numbers ...
     String s6="hello ^guys ^how are^ you";
     System.out.println(s6.split("")); //it will print array so we will take loop than iterate
     System.out.println(Arrays.toString(s6.split("")));  //without space split
     System.out.println(Arrays.toString(s6.split(" "))); //with spaces split
     System.out.println(Arrays.toString(s6.split("o"))); //with letters(o) split
     System.out.println(Arrays.toString(s6.split("\\^"))); //with letters(o) split some time special characters are escaped
     System.out.println("-------------------------------------------------------------------------------");
     
     //charAt(6) i want to print index position characters throw/passing numbers
     String s7="thiru7";
     System.out.println(s7.charAt(4));
     System.out.println("-------------------------------------------------------------------------------");
     
     // replace() this method is used to replace all the (alphanumericetext)
     System.out.println("s7.replace(\"ru\",\"mu\") :"+s7.replace("ru","mu"));
     
     // Integer.valueOf() it will convert String number to integer number
     String s8="1000";
     System.out.println(Integer.valueOf(s8));
     //System.out.println(Integer.valueOf(s1));
     //NOTE: if I am trying to convert from stirng to integer it will get an error
     
     System.out.println("-------------------------------------------------------------------------------");
     
     //String.valueOf(s9)   CONVERT FROM INTEGER TO STRING
     String s9="963258147";
     System.out.println("String.valueOf(s9) :"+String.valueOf(s9));
     
     System.out.println("-------------------------------------------------------------------------------");
     
     String st1="";
     String st2=" ";
     String st3;
     System.out.println(" st1.isEmpty() :"+st1.isEmpty());
     System.out.println(" st1.isBlank() :"+st1.isBlank());
     System.out.println();
     //IT IS BASED ON THE LENGTH VERIFY
     System.out.println(" st1.isEmpty() :"+st2.isEmpty()); //something is there //blank data is there
     //IT IS BASED ON TEH TRIM VERIFY
     System.out.println(" st1.isBlank() :"+st2.isBlank()); //bank is-->s2.trim().isEmpty()
      
     
     
     
     
 
	}

}
