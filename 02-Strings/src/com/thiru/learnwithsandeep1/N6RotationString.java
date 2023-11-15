package com.thiru.learnwithsandeep1;



//To print Substring of a given string
/*
step-1: contains same length
step-2:contains the same character
step-3: rotate the around of the character

abcd==>take two times==>tempstr="abcdabcd"
bcda cdab dabc 
str="abcd"
tempstr="abcdabcd"



step1: check (str1==null,str2==null) if any one str having null values not rotated
step2: check (str1 != str2) if str1 one is not equal to string2 not rotation
step3: concate string  and check rotate string is present or not
 */





public class N6RotationString {

	public static void main(String[] args) {

		
		//System.out.println(isRotation("abcd","bcda"));
		System.out.println(isRotation("abcd","bcda"));

	}
	public static boolean isRotation(String str,String rotatedStr)
	{
		//not having null values
		if(str==null || rotatedStr==null) {
			return false;
		}
		//string must be equal otherwise false
		else if(str.length() != rotatedStr.length())
		{
			return false;
		}
		else
		{
			String concatinated=str+str; 		//concatinated==>abcdabcd
			return concatinated.contains(rotatedStr);//rotated==>bcda
		}
}

}