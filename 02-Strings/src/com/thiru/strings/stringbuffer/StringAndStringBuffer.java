package com.thiru.strings.stringbuffer;



/*string is immutable
======================
hello is not concat with thiru
IMMUTABLE: ONCE WE CREATE "STRING OBJECT",
WE CAN'T PERFORM ANY CHANGES OPERATIONS IN THAT OBJECT

IF WE ARE TRYING TO PERFORM ANY CHAGES "OBJECT WILL BE CREAETED", 
THESE UNCHANGABLE NATUR CALLED IMMUTABLE  

StirngBuffer is mutable once object creation
===============================================
MUTABLE: ONCE WE CREATE STRING OBJECT, 
WE CAN PERFORM ANY CHANGES OPERATIONS IN THAT OBJECT



----------------------------------------------------------
string vs string buffer  vs  string builder?
==============================================================================================================================================================================	
string								string buffer													string builder
==================================================================================================================================================
Immutable									Mutable														Mutable
		
Thread Safe									Thread Safe 												Not a Thread safe

Use String when								Use String Buffer when its going  							Use String Buffer when its going 
it is "not going to change" much			to change "often with many thread involved"					to change often with single thread involved
=============================================================================================================================================

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
==>introduced in 1.8
*/



public class StringAndStringBuffer {

	public static void main(String[] args) {

		
		
		  String s=new String("hello");
          s.concat("thiru");
          System.out.println(s); //hello its not changable
          
          
          
          StringBuffer sb=new StringBuffer("hello");
          sb.append("thiru");
          System.out.println(sb); 
          
          
          StringBuilder sb1=new StringBuilder("golla");
          sb1.append("thirumalesh");
          System.out.println(sb1);
          

	}

}
