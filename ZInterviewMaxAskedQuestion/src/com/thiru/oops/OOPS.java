package com.thiru.oops;

/*

// 1]  IPAE==>OOPS
   1) Object
   2) Class
   3) Inheritance        
   4) Polymorphism
   5) Abstraction
   6) Encapsulation
   ===========================================
   2]DIFFERENCE BETWEEN ABSTRACT CLASS AND INTERFACE
   3]METHOD OVERRIDING & METHOD OVELOADING
   4]SUPER KEY WORD
   5]THIS KEY WORD
   
   
   
   1) Object
   =========
   Any entity that has state and behavior is known as an object.
   EX: chair, pen, table, keyboard, bike, etc. 
   It can be physical or real world entity.
 
 
   2) Class
   =========
	=>Collection of objects is called class. 
	->It is a logical entity.
	->A class can also be ==> defined as a "blueprint" of creating individual objects.
	->it is a teplate used to create objects
	
	
	
	3) Inheritance
	===============
Inheritance 
in Java is a mechanism in which child class object acquires all the properties and behaviors of a parent clas object.


==> When you inherit from an existing class, you can reuse methods and fields of the parent class.
==> Moreover, you can add new methods and fields in your current class also.
==> Inheritance represents the IS-A relationship which is also known as a parent-child relationship.

Why use inheritance in java[l app dev  time, l memory, l ex time ,improve perf, reduce red] 
===========================================================================================
Application development time is less.
Application take less memory.
Application execution time is less.
Application performance is enhance (improved).
Redundancy (repetition) of the code is reduced or minimized so that we get consistence results and less storage cost.Terms used in Inheritance

	
	types of inheritence are
	========================
	single inheritence
	multi level inheritence
	hyrarchy inheritence
	
	multiple inheritence
	hibride inheritence
	
	
	
	
	
	
	
	 4) Polymorphism
	 ===============
	If "one task" is performed in "different ways", it is known as polymorphism.
	
	example: to convince the customer differently, to draw something, 
	for example, shape, triangle, rectangle, etc. 
	
	
	 5) Abstraction
	 ==============
	"Hiding internal details" and "showing functionality" is known as abstraction.
 	For example phone call, we don't know the internal processing. 
 	
 	
 	The abstract keyword is a non-access modifier, used for classes and methods:
 	
 	Abastract class
 	================
 	it is a "restricted class" that "cannot be used to create objects" (to access it, it must be inherited from another class).
 	
 	Abstract method:
 	===============
 	Abstract method we can use only inside the "abstract class",
 	and "it does not have a body". The body is provided by the subclass (inherited from).
 	
 	
 	 6) Encapsulation
	 ==============
 	Binding (or wrapping) "code and data" together into a "single unit" are known as encapsulation. 
 	For example, a capsule, it is wrapped with different medicines.

	
	
INHERITENCE: 
==================
A PROCESS OF RECEIVING/ACCESSING OF MEMBERS (INSTANCE FIELDS, METHODS) OF ONE CLASS BY  
OTHER CLASS 

=>TO GET PROPERTIES OF CLASS, EXTENDS KEY WORD IS USED. 

=>A CLASS CAN EXTENDS ONE CLASS AT A TIME( 1 CLASS à EXTENDS 1 CLASS)ONLY 

EXAMPLE 
Class A{     //SUPER CLASS/BASE CLASS/PARENT CLASS (GIVER CLASS) 

Int j; 

} 

Class B extends A{   //SUB CLASS/DERIVED CLASS/CHILD CLASS 

//Int j; by using extends Is possible 

Int j; 

} 
	
	
	
	
	
	
	
	
	
DIFFERENT BETWEEN "ABSTRACT CLASS" AND "INTERFACE"
==================================================
	Abstract class
	==============
1) Abstract class can have abstract and non-abstract methods.//
2) Abstract class doesn't support "multiple inheritance".//
3) Abstract class can have final, non-final, static and non-static variables.(f,nf,s,ns)//
4) Abstract class can provide the "implementation of interface."//
5) The "abstract keyword" is used to declare abstract class.//

6) An abstract class can extend another Java class and implement multiple Java interfaces.
	(extends another java class,implements many interfaces)
	
7) An abstract class can be extended using keyword "extends".





8) A Java abstract class can have class members like private, protected, etc.
9)Example:
public abstract class Shape{
public abstract void draw();
}

Interface
============
Interface can have "only abstract methods". Since Java 8, it can have "default and static" methods also.//
Interface supports "multiple inheritance."//
Interface can has only "static" and "final" variables.//
Interface can't provide the implementation of abstract class.//
The "interface keyword" is used to declare interface.//
An interface can extend another Java interface only.
An interface can be implemented using keyword "implements".
Members of a Java interface are "public by default". 
Example:
public interface Drawable{
void draw();
}


	Abstract class														Interface
	==============														==========
	can have abstract and non-abstract methods						"only abstract methods Since java 1.8 added static and default
	doesn't support "multiple inheritance							supports "multiple inheritance.
	can have final, non-final, static and non-static variables		can have only "static" and "final" variables.
	provide the "implementation of interface						can't provide the implementation of abstract class
	The "abstract keyword" is used to declare abstract class		The "interface keyword" is used to declare interface.
	can be extended using keyword "extends".						interface can be implemented using keyword "implements"


METHOD OVERLOADING(INCRE READA,WITHIN CLASS,DIFFE PAR,EX COMP)
==================
1)	Method overloading is used to increase the readability of the program.
2)	Method overloading is performed within class.
3)	In case of method overloading, "parameter (PM)must be different".
4)	Method overloading[MO] is the example of compile time polymorphism.


MEHOD OVERRIDING(SPCFC IMP METH,TWO CLASS,PAR SAME,RUN POLY)
================
re-define a method in sub-class but already defined in super class
Method overriding occurs in two classes that have IS-A (inheritance) relationship.
In case of method overriding, parameter must be same.
Method overriding is the example of run time polymorphism.


METHOD OVERLOADING											MEHOD OVERRIDING
===================											================
increase readability of program								re-define a method sub class. that method id already defined in super class
performed within the class									performed two classes
diff->parameters											sm->method name
example of compile time polymorphism						example of run time polymorphism




 METHOD OVELOADING AND METHOD OVERRIDING
 =======================================
 METHOD OVERRIDING
 ==================
 RE-DEFINING A METHOD IN SUB CLASS, THAT METHOD ALREADY DEFINED IN THE SUPER CLASS
 
 RULES TO OVERRIDE THE METHOD
 ============================
 1)Method name and parameters must be same(method of super class, can be redefined in the sub class)
 2)Scope or visibility of method can be same or increased, but cannot be decreased
 ===========================================================================================================
 Java Method Overloading example sm,diff par
 ===============================

    class OverloadingExample{  
    static int add(int a,int b){return a+b;}  
    static int add(int a,int b,int c){return a+b+c;}  
    }  
 
 
 Java Method Overriding example  sm,smp
================================
    class Animal{  
    void eat(){System.out.println("eating...");}  
    }  
    class Dog extends Animal{  
    void eat(){System.out.println("eating bread...");}  
    }  
 =========================================================================================================    
    
    
    
    
    
 *******Super key word***********  dc,pc,m,inst var
 ================================
 ==>To call Super class "default constructor" from "sub class Constructor"   
 										==>  super();
 										
 ==>To call Super class "parameteraised constructor" from sub class Constructor 
 										==>  super(11,"adam");
 										
 ==> To call "super class method" from "sub class method".
 
 									    ==> super.print();
 ==>To access "super class instance variables" from sub class "method/constructor"
 
 									   ==>super.id;
 									   ==>super.name;

NOTE:
 ==>In every constructor, compiler adds super()
 ==>Call to constructor using super keyword must be the first statement
 
 
  *******final key word***********
 ================================
 ==>Final variable
 ==>Final method
 ==>Final Class
 
  ==>Final variable
  ==================
 ==> value cannot be changed
 ==>final int days=7;
 ==>final int months=12;
 ==>final float pi=3.14;
 
  ==>Final method
  ===============
  ==>Final method cannot be overriden
  
  class CollegeMember
  {
  final void print()
    {
     syso(this.id);
     syso(this.name);
    }
  }
  
  class Student
  {
       void print()       //we will get error *****************
     {
       super.print(); ////////////////////////////////////////
       syso(this.marks)
      }
 }
  
  
   ==>Final Class
   =============
   Finale class cannot be inherited/extended
   
   final class Student
   {
   
   }
   class CSEStudent extends Student/////////////////////////get error
   {
   
   }
 


THIS KEYWORD IN JAVA: [fan]
=====================

  ==>  To access instance fields/VARIABLES 

  		this.name 

  ==>  To call no argument constructor  

   	   this(); 

  ==>  To call parameterized constructor 

		this(“adam”,20) 

RULE TO USE THIS TO CALL THE CONSTUCTOR: 
========================================

THIS KEYWORD MUST BE THE FIRST STATEMENT 

CONSTRUCTOR CAN BE CALLED FROM ANOTHER CONSTRUCTOR 

CONSTRUCTOR CANNOT BE CALLED FROM METHOD 


Difference between constructor and method 

 

CONSTRUCTOR 								METHOD 
==============================				===============================
CALLED AT THE CREATING OBJECT 				CALLED OFTER THE CREATING OBJECT 
CALLED ONCE FOR EACH OBJECT 				CALLED ANY NUMBER OF TIMES 
EX: EMAIL REGISTRATION (ONLY ONCE) 			EX: EMAIL LOGINE (NUMBER OF TIMES) 


	




	




	













12) Difference between this() and super() in java ?
====================================================
this() is used to access one constructor from another "with in the same class" 
super() is used to access superclass constructor. Either this() or super() exists it must be the first statement in the 
constructor.


WHAT IS CONSTRUCTOR
====================

CONSTRUCTOR  

    =>TO INITIALIZE THE OBJECTS 

RULES 

    =>ONSTRUCTOR NAME CLASS NAME SHOULD BE SAME 

   	=> NO RETURN TYPES OF CONSTRUCTORS  

1)DEFAULT CONSTRUCTOR (AUTOGENERATED CONSTRUCTOR) 

    Person () {//we don’t write code} 

    Compiler creates a default constructor where there is no parameterized constructor (or) no argument constructor  in a class.  

    Compiler does not create a default constructor when there is a parameterized constructor (or) no argument constructor found. 

2)NO-ARGUMENT CONSTRUCTOR (USER DEFINED CONSTRUCTOR) 

    Person () {//we have to write code} 

    To initialize the object with default values 

3)PARAMETERAISED CONSTRUCTOR (USER DEFINED CONSTRUCTOR) 

    To initialize the object with given set of values 




WHAT IS A PACKAGE:  
==================

==>A java package is a group of similar types of classes, interfaces and sub-packages. 

==>Package in java can be categorized in two form, 1)built-in package and 2)user-defined package.  

==>There are many built-in packages such as java.(lang, awt, javax, swing, net, io, util, sql) etc. 


Advantage of Java Package 
==========================


  1)  Avoid naming conflict 

  2)  Modularity 

  3) Re-usability 

  4) Maintainability 

  5) Security 


HOW TO CREATE A PACKAGE 
========================
Package can be created by using “PACKAGE” key word 
package packagename; 

RULES TO USE PACKAGE KEY WORD : 
=============================
 	PACKAGE KEY WORD MUST BE FIRST STATEMENT IN JAVA 

    IT CAN BE USED ONLY ONCE 

IMPORT KEY WORD;  
==============

    TO ACCESSED PACKAGED CLASSES/INTERFACES 

    A CLASS CAN BE IMPORT MULTIPLE PACKAGES AT A TIME 

 












WHAT IS BINDING(TYPE OF OBJ)
===============	
 Connecting a "method call" to the "method body" is known as binding.

There are two types of binding
==============================

    Static Binding (also known as Early Binding).
    Dynamic Binding (also known as Late Binding).




static binding
==============
When "type of the object is" determined at compiled time(by the compiler), it is known as static binding.



//If there is any private, final or static method in a class(PFS), there is static(pvt,st,fnl) binding.//
 
Dynamic binding
================
When type of the object is determined at run-time, it is known as dynamic binding.


What is marker interface?
============================
An interface that does not contain "methods, fields,and constants" is known as marker interface. (MFC) 
(OR)
In other words, an "empty interface" is known as "marker interface" or "tag interface."

 
ex:The "Serializable" and "Cloneable interfaces" are the example of marker interface.























 *
 */

	



public class OOPS {

	public static void main(String[] args) {
		
	}

}
