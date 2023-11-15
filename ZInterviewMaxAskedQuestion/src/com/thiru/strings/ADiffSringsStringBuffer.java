package com.thiru.strings;



/*



String
===============================================================================
String str = "Hello";
str += " World"; // This creates a new string, "Hello World", and assigns it to str
System.out.println(str); // Output: Hello World

 
 DIFFERENCE BETWEEN String AND StringBuffer (Immutable,slow execution,length static,less efficient, consume high memory,to store val in string const pool)
 ================================================
String
=========
1	String is immutable.//
2	It is slow in terms of executing the concatenation task.//
3	Here the length of the string class is static.//
4	It is less efficient.
5	String consumes more memory as compared to the stringbuffer.//
5	It utilises a string constant pool to store the values.
6	It overrides both equal() and hashcode() techniques of object class.


StringBuffer
=============
It is mutable.//
It is fast in terms of executing the concatenation task.//
Here the length can be modified whenever required, as it is dynamic in behaviour.//
It is more efficient in nature as compared to the string class.//
StringBuffer uses less memory as compared to the string.
It prefers heap memory to store the objects.
It cannot override equal() and hashcode() methods.




DIFFERENCE BETWEEN StringBuffer AND StringBuilder
=================================================
StringBuilder is same as StringBuffer(Including methods and constructors)


StringBuffer
============
==>Synchronaised(one thread needs to wait until completion of the another thread)
==>Thread Safe
==>Relatively performance is low
==>introduced in 1.0


StringBuilder
============
==>Not Synchronaised(one thread need not to wait until completion of the another thread)
==>No Thread Safe
==>Relatively performance is high
==>introduced in 1.5




----------------------------------------------------------
string vs string buffer  vs  string builder?
==============================================================================================================================================================================	
string								string buffer													string builder
==================================================================================================================================================
Immutable									Mutable														Mutable
		
Thread Safe									Thread Safe 												Not a Thread safe

Use String when								Use String Buffer when its going  							Use String Buffer when its going 
it is "not going to change" much			to change "often with many thread involved"					to change often with single thread involved


 
 





WHEN WE USE String, StringBuffer, StringBuilder
==============================================
String
=======
If the content is fixed and wont change frequently
 than we should go for  String.
 
 
StringBuffer
============
If the content is "not fixed" "keep on changing" But "thread saftey" required 
than we should go for  StringBuffer.
 
StringBuilder
============
If the content is "not fixed" "keep on changing" But "thread saftey" not required 
than we should go for  StringBuilder.






 */



public class ADiffSringsStringBuffer {

	public static void main(String[] args) {
		

		//Difference between string and StringBuffer
		
		
		//STRING CONCATINATION
		String s=new String("THIRUMALESH ");
		s.concat("GOLLA");
		System.out.println(s);
		
		
		
		//StringBuffer
		StringBuffer s1=new StringBuffer("APJ ");
		s1.append("KALAM");
		System.out.println(s1);
		
		
		//StringBuilder
		StringBuilder sbr=new StringBuilder("RAM ");
		sbr.append("RAM");
		System.out.println(sbr);
		
			
		
		
		
		
	}

}
