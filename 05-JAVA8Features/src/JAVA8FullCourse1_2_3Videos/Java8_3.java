package JAVA8FullCourse1_2_3Videos;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Java8_3 {
	
	
 

	/*
	 * 
	
	jAVA8 --> 
	==>	THE MAIN AIM OF THE JAVA8 IS "ENABLING THE FUNTIONS", 
	
	==> TO "WRITE LESS CODE" OR "CONCISE CODE"
	
	==>	A FUNCTION WHICH IS HANDLING "JUST LIKE OBJECT" TO ENABLE THESE TYPE OF FUNCTIONAL PROGRAMMING

	
	JAVA 8 FEATURES ARE[ LE,FI,PFI,DM & SM , ::,STRMS,DT,OPTIONAL,NSCRIPT ENGINE
	=====================================
	1)LAMBDA EXPRESSIONS
	
	2)FUNCTIONAL INTERFACES
	
	3)DEFAULT METHODS AND STATIC METHODS
	
	4)PREDEFINED FUNCTIONAL INTERFACES
	
	    1)PREDICATE   -->GIVE BOOLEAN VALUE           -->test()
	    2)FUNCTION    TAKE INPUT AND DISPLAY OUTPUT   --> apply()
	    3)CONSUMER    NO INPUT WILL GIVE              -->accept()
	    4)SUPPLIER    NO INPUT WILL GIVE ONLY SUPPY	  --> get()
	    ETC.	
	5)DOUBLE COLON OPERATORS( : : )
	   -->METHOD REFERENCE PURPOSE
	   -->CONSTRUCTOR REFERENCE
	   
	6)STREAMS
	
	7)DATE AND TIME API
	
	8)OPTIONAL CLASS
	
	9)NASHRORN JAVASCRIPT ENGINE
	
	10)MetaSpace
	
	1)LAMBDA EXPRESSION
	-------------------------------
	1930 (IN MATHS)
	
	FIRST LANGUAGE USED LAMBDA EXPRESSION ->LISP LANGUAGE
	----------------------------------------------
	LANGUAGES USED LAMBDA EXPRESSIONS IS
	LISP
	PYTHON
	JAVA
	C
	C++
	RUBY 
	SCALE
	FINALLY IN JAVA ALSO
	
	THE MAIN OBJECTIVE OF THE JAVA8:
	TO BRING BENIFITS OF "FUNTIONAL PROGRAMMING"  INTO JAVA
	-------------------------------------------------------
	WHAT IS LAMBDA EXPRESSION:  (NRA) babu
	-------------------------------------------------------
	IT IS ANONYMOUS(NAMELESS)  FUNTION
	WITHOUT NAME
	WITHOUT RETURN TYPE
	WITHOUT ACCESS MODIFIER
	
	VERY VERY VERYYYYYYYYYYYYYYYYY EASY CONCEPT
	
	 FI:FUNCTIONAL INTERFACE
	 =======================
	 ( A INTERFACE WHICH IS HAVING ONLY ONE ABSTRACT METHOD CALLED FUNCTIONAL INTERFACE)
	 
	 
	 INTERFACES              SINGLE/ONE METHODS(RB,CB,CT,AL,CLBL)
	 =============         ===================
	 1)Runnable            --> run()
	 2)Comparable          -->compareTo() ==>bUUUUUUUUUUUUUUUUUTU
	 3)Comparator          -->compare()
	 4)ActionListener      -->actionPerformed()
	 5)Callable            -->call()
	 
	 
	 These all are functional interfaces
	 ======================================
	 all these methods contains "single ABSTRACT method" only
	 
	 //AN INTERFACE WHICH CONTAINS SINGLE ABSTRACT METHOD THAT FI CALLED FUNCTIONAL INTERFACE
	 
	    //WITHOUT CURLY BRACES WE CANNOT USE RETURN KEY WORD 
	   //COMPILER WILL CONSIDERED RETURN VALUE AUTOMATICALLY
	-->WITHIN CURLY BRACES IF WE WANT TO RETURNS SOME VALUE COMPOLSORY WE SHOULD USE RETURN STATEMENT
	 
	 {}   <-->   return    
	 
	 
	 n->n*n;
	 m->System.out.println(m);
	 n->{return n*n;};  ===>valid
	 
	 n->return n*n;     ===>invalid(if we are using return must be curly braces
	 n->{return n*n;};  ===>valid
	 n->{return n*n};   ===>invalid(semicolons missing)
	 n->{n*n;};         ===>invalid (return) if we are written some value in the curly braces must be use RETURN statement
==============================================================================================================================
1)Single-Parameter Lambdas:

n -> n * n; (No curly braces, explicit return)
n -> { return n * n; }; (Curly braces, explicit return)
n -> { n * n; }; (Curly braces, no explicit return; this doesn't return a value)


2)Mutiple-Parameter Lambdas:l
==============================================================================================================================
(a, b) -> a + b; (No curly braces, explicit return)
(a, b) -> { return a + b; }; (Curly braces, explicit return)
(a, b) -> { a + b; }; (Curly braces, no explicit return; this doesn't return a value)


3)Lambdas with No Parameters:
==============================================================================================================================
() -> "Hello, World!"; (No parameters, no curly braces, explicit return)
() -> { return "Hello, World!"; }; (No parameters, curly braces, explicit return)
() -> { "Hello, World!"; }; (No parameters, curly braces, no explicit return; this doesn't return a value)


4)Lambdas with Complex Expressions:
==============================================================================================================================
(x, y) -> x * x + y * y; (Performing complex calculations)
==============================================================================================================================
	 
	 ONCE WE WRITE LAMBDA EXPRESSIONS
	 ---------------------------------------------------------
	 NOTE:WE CAN INVOKE/CALL LAMBDA EXPRESSIONS NEED TO USE -->FUNCTIONAL INTERFACES
	 
	 FUNCTIONAL INTERFACE: 
	 =====================
	 ==> A FUNCTIONAL INTERFACES IS WHICH IS CONTAINS  SINGLE ABSTRACT METHOD(SAM)
	 
	 ==>Any no of"default methods" and "static methods"
	 
	 
==============================================================================================================================
1)Predicate, 
2) Function, 
3) Supplier, 
4)and Consumer.
==============================================================================================================================
Predicate<T>:
===========
    The Predicate functional interface represents a predicate (boolean-valued function) of a single argument.

    java

Predicate<Integer> isEven = num -> num % 2 == 0;

System.out.println(isEven.test(4));  // Output: true
System.out.println(isEven.test(7));  // Output: false
==============================================================================================================================
Function<T, R>:
==============================================================================================================================
The Function functional interface represents a function that takes one argument and produces a result.



Function<Integer, String> intToString = num -> "The number is: " + num;

System.out.println(intToString.apply(42));  // Output: The number is: 42


==============================================================================================================================
Supplier<T>:
==============================================================================================================================
The Supplier functional interface represents a supplier of results, without taking any argument.

java

Supplier<Double> randomDouble = () -> Math.random();

System.out.println(randomDouble.get());  // Output: 0.7324587167877892



==============================================================================================================================
Consumer<T>:
==============================================================================================================================
The Consumer functional interface represents an operation that accepts a single argument and returns no result.

java

Consumer<String> printMessage = message -> System.out.println(message);

printMessage.accept("Hello, World!");  // Output: Hello, World!
==============================================================================================================================	
	
 */
	
	
	
	
	
	public static void main(String[] args) {
		//check given number is even or odd
		
//		Predicate<Integer> p=i->i%2==0;
//		System.out.println("The number is even number :"+p.test(10));
//		System.out.println("The number is even number :"+p.test(5));
//		
		
		
		
		
		
		
		
//		//predicate   give boolean result
//		//==========
//		Predicate<Integer> even=i->i%2==0;
//		System.out.println(even.test(20));
//		System.out.println(even.test(21));
//		
//		System.out.println();
//		
//		
//		//Function    take int input/display int o/p
//		//=========
//		Function<Integer,Integer> fun=f->f+f+f;
//		System.out.println(fun.apply(20));
//		
//		
//		Function<Integer,String> f=x->"squaring of the given number is:"+x*x; //o/p
//		System.out.println(f.apply(20)); //i/p
//		
//		
//		//supplierrandom()
//		//=========
//		Supplier<Double> sup=()->Math.random();
//		System.out.println(sup.get());
//		
//		//consumer
//		Consumer<String> con=message->System.out.println(message);
//		con.accept("Hello thirumalesh how are u what are you doing");
		
		
		//FI-1:by using predicate FI
		
//		Predicate<Integer> pred=s-> s>10;
//		System.out.println(pred.test(100));
//		
//		Predicate<Integer> pred1=s->s%10==5;
//		System.out.println(pred1.test(100));
//		
//		
//		//FI-1:by using Funtion FI
//		
//		
//		Function<Integer, Integer> fun=s->s+s+s;
//		System.out.println(fun.apply(20));
		
		
//		Function<Integer,Integer> fun1=s->s*s*10;
//		System.out.println(fun1.apply(20));
		
		
		Supplier<Double> sup=()->Math.random();
		System.out.println(sup.get());
		
		 
		Consumer<String> name=s->System.out.println(s);
	
		
		name.accept("hi this is thirumalesh how are you dude...");
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
