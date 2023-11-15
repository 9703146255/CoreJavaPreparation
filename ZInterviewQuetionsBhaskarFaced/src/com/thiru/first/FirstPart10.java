package com.thiru.first;



/*
 ===========
What is Java (1991,1995)        prog lag,dev sun1991,james gosling lead for team,first ver 1995,oracle acuired from sunmicrosystem, now ora,
===========

-> Java is a  programming language

-> Java language developed by Sun Microsystem in 1991  (OAK)

-> James Gosling is the lead for the team, who developed Java Language

-> The first version of java came into market in 1995 

Note: "Oracle Corporation acquired"  "Sun Microsystem"          oc-->ac[sm]

-> Now java is under license of Oracle corporation

-> Java is a free  & open source software

 
2)what are the features of java?
================================  
-------------------------------------------------------------------
OOPS features?   Simple,Platform Independent,Robust,OOPS, Secure , Distributed ,Portable , Dynamic
------------------------------------------------------------------
==============
Java Features  oops,simple,secure,pi,robust
==============

1) Simple : The complex topics of C & C++ are eliminated in Java[oo,ptrs,mm]

	Ex: Operators overloading, pointers, memory mgmt etc...

2) Platform Independent

	-> Java programs can be executed on "any machine"
	-> JVM made java as platform independent
	-> JVM stands for Java Virtual Machine
	-> JVM is responsible to run/execute java programs

3) Robust (Strong)

	-> Automatic Memory Management
	-> Exception Handling

4) OOPS (Object Oriented Programming System)

	-> Everything will be represented in objects format
	-> Code Re-Usability

5) Secure

6) Distributed
	distributed programming in Java means creating applications that can run on multiple computers or
    devices and work together by sharing data and processing tasks over a network.

7) Portable
Java programs can be written once and run on different platforms (such as Windows, macOS, Linux) without any changes. 

written once==>run on different platforms


8) Dynamic

dynamic" refers to the ability of the language to perform operations and decisions at runtime rather than compile time,
 providing flexibility and adaptability.

Java Slogan : WORA (Write Once Run Anywhere)


===============(ica)
Translators
===============

-> It is used to convert from one format to antoher format

-> 3 types of translators available

		1) Interpreter
	
		2) Compiler

		3) Assembler


-> Interpreter will convert the program line by line  ( performance is slow )

-> Compiler will convert all the lines of program at a time ( performance is fast )

-> Assembler is used to convert "assembler programming languages" into "machine language" APL==>(AM)


6)what is static? ma
--------------------------------------------------------------------------------------------------------
The static keyword is a non-access modifier used for "methods and attributes".MA
 Static methods/attributes can be accessed without creating an object of a class.
 



 1)public
 =========
 To call be JVM anywhere.
    
 2) static
 ==========
"Makes it class method" so that, it can be called class name without creating object
3) void
========
main method does not return value to JVM

4)Main()
========
Name of the method wich is called by jvm


5)(String[] args) 
 ==============
 the main method "accepts one argument" of type string array
 
 
 
 
==============================================================
7) Why main() method is public, static and void in java ?

public : “public” is an access specifier which can be used outside the class. When main method is declared 
public it means it can be used outside class.

static : To call a method we require object. Sometimes it may be required to call a method without the 
help of object. Then we declare that method as static. JVM calls the main() method without creating 
object by declaring keyword static.

void : void return type is used when a method does’nt return any value . main() method does’nt return 
any value, so main() is declared as void.

Signature : public static void main(String[] args) {


8) Explain about main() method in java ?
==========================================
Main() method is starting point of execution for all java applications.

public static void main(String[] args) {}

String args[] are ==>array of string objects ==>we need to pass from command line arguments.

Every Java application must have atleast one main method 


 =====
 JDK
 =====
 java development kit 
 it is a physically existance
 it contains contains (JRE + DEVELOMENTS TOOLS)
 It is having .java file
 
DEVELOPMENT TOOLS=javac,java..etc 
JRE= JVM + LIBRARIES + OTHER FILES

====
JRE
====

JRE:Java Runtime Environment. 
      It is also known as "Java RUN TIME ENVIRONMENT" (JRTE). 
      The Java Runtime Environment is a "set of software tools"
      It is a physical existance
      which are used for "developing Java applications".
      It is having .class file

========
JVM
======== we can't see,part of jre,resp java prog exe,

-> JVM stands for Java Virtual Machine (We can't see with our eyes)

-> JVM will be "part of JRE"

-> JVM is responsible for "executing java programs"

-> JVM will "allocate memory required for program execution" & de-allocate memory when it is not used

-> JVM will convert "byte code" into "machine understandable format"


What is JIT compiler ?         byte==>execu
=======================
JIT compiler stands for Just in time compiler. JIT compiler compiles "byte code in to executable code". 
JIT a part of JVM .JIT cannot convert complete java program in to executable code it converts as and 
when it is needed during execution.




what is volatile?
================
Volatile keyword is used to "modify the value of a variable" by "different threads".   int a=10; a=30, a=40
It is also used to make "classes thread safe".





what are classloaders?(BES) -->abststract class java.lang,loads classes from diff resources,,its load at runtime
------------------------------------------------------------------------------
Java ClassLoader is an "abstract class." It belongs to a "java.lang" package.

It loads classes from "different resources". 

Java ClassLoader is used to "load the classes at run time". In other words, 

Classes are loaded into the JVM according to need

1)Bootstrap Class Loader 	==> its loads the classes from ==> jre/lib/rt.jar files
2)Extensions Class Loader 	==> its loads the classes from ==> jre/lib/ext directory
3)System Class Loader:		==> its loads the classes from ==> classpath,-cp or -classpath


WHAT IS MEMORY MANAGEMENT:
=============================
which is used to allocate or De-allocate the memory "to the members(var/refvar/obj)" called memory management
members=variable,methods,objects,strings... etch


3 TYPES OF MEMORIES IS THERE 																			
============================
1)HEAP MEMORY
2)STACK MEMORY
3)META SPACE OR PERMGEN

1)HEAP MEMORY (all app,default size,we stre obj,string,arrays,customaise, java.lang.stackOverFlowError)
===============
"all the parts
ds ==>768mb
heap memory ==> OBJECTS,STRINGS,ARRAY...etc data (SOA)
cust=>-Xss2m or -Xss5m	

=>Heap memory is used by "all the parts of the application "

=>The default size of the heap memory is "768mb"

=>Inside the "heap memory" it will stores the OBJECTS,STRINGS,ARRAY...etc data (SOA)

=>If we want to customise the "heap memory size" we can give ==> -Xss2m or -Xss5m	

=>When ever Heap memory will be full we will get ==>java.lang.StackOverFlowError.

 
2)STACK MEMORY
================
==>one thread of execution"
==>dc==>1024kb
==>stack memory==>l var,ref var
==>cust ==>-Xmx500m or -Xmx1000m


=>stack memory is used only by "one thread of execution"

=>The default size of the stack memory is 1024kb

=>Inside the "stack memory" it will stores the LOCAL VARIABLE, REF VARIABLES AND METHODS  ...etc values

=>If we want to customise the stack memory size we can give ==> -Xmx500m or -Xmx1000m

=>When ever stack memory will be full we will get ==>java.lang.OutOfMemoryError

=>IT Will follow the lifo order




	1)HEAP MEMORY(ROM)						2)STACK MEMORY(RAM)
	===============							================	
  >  It will store Objects,strings,arrays...values			> It will store variables,refereance variables values

  > Size is ==>768mb										> Size is ==>1024kb	

  > It will works like a ROM 								>  It will works like a RAM
	
  > perfermance is slow										>perfermance is speed

  >JVM throws the java.lang.StackOverFlowError(sofe)	   >JVM throws the java.lang.OutOfMemoryError
 
    if the stack size is greater than the limit.

  >It is done manually "by the programmer."				    It is done "automatically by the compiler."	

  >Its cost is less.						                >Its cost is more in comparison to stack.

  >Its implementation is easy					           >Its implementation is hard. 
	
  >Memory allocated in random order.				       >Memory allocation is continuous. 

> It Will not  follow the any order becouse of dynamic memory allocation. > it will follow the  LIFO order

========													
for Heap
========
Right click ==>run as ==> Run configurations =>click on arguments ==> in vm(-Xss2m) or (-Xss5m)


========													
for Stack
========
Right click ==>run as ==> Run configurations =>click on arguments ==> in vm (-Xmx500m) or 


permGen space and MetaSpace.
==========================
BEFORE JAVA 1.8 PERMGEN MEMORY, NOW METASPACE
which is having runtime constant pool
class structure
static variables 
static methods
static block


Simply put, Metaspace is a new memory space – starting from the Java 8 version;
it has replaced the older PermGen memory space.
The most significant difference is "how it handles memory allocation." 
Specifically, this native memory region grows automatically by defaultIt is used to manage memory for class metadata.
Class metadata are allocated when classes are loaded.


Difference between PermGen space and MetaSpace.
================================================
PermGen Space
=================================================
Used in Java 7 and earlier.

PermGen always has a fixed "maximum size."

part Java Heap Memory

Max size can be set using	==> XX:MaxPermSize

Comparatively ineffiecient Garbage collection. 



==================================================================================
MetaSpace
===================================================================================
Introduced in Java 8 and used in later versions.	

Metaspace by default auto increases its size depending on the underlying OS.

Not part of the Java heap; allocated from native memory.

Max size can be set using ==> XX:MetaspaceSize

Comparatively effiecient Garbage collection.

	






why java is not pure object oriented programming language?
--------------------------------------------------------------------------------------------------------
-->Java is not a pure object oriented language because 
-->it Desnt support "Primitive datatype" such as int, byte, long etc, 
-->we can't create object for this

--------------------------------------------------------------------------------------------------------
what is immutable?
--------------------------------------------------------------------------------------------------------
Once we create a "string object" we cannot perform any changes in "existing object"
if we are trying to "perform any changes", with those changes "new object will created"
this non changeable behavior nothing but immutable

String str=new String("thiru")
str.concat("mallesh")


--------------------------------------------------------------------------------------------------------
what are access modifiers and what are they?
--------------------------------------------------------------------------------------------------------
Access Modifier	within class	within package	outside package by subclass only	outside package
Private			Y	N	N	N
Default			Y	Y	N	N
Protected		Y	Y	Y	N
Public			Y	Y	Y	Y

Private: The access level of a private modifier is only within the class. It cannot be accessed from outside the class

Default: The access level of a default modifier is only within the package. It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.

Protected: The access level of a protected modifier is within the package and outside the package through child class. If you do not make the child class, it cannot be accessed from outside the package.

Public: The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, within the package and outside the package.



---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
can we overload static methods?
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
The answer is Yes. We can overload static methods. But remember that the "method signature must be different."
---------------------------------------------------------------------------------------------------------------
public class OverloadStaticMethodExample1  
{   
//static method  
public static void display()        ////////                                                                                                                                                       m1
{   
System.out.println("Static method called.");   
}   


//overloaded static method  
public static void display(int x)    ////////                                                                                                                                            m2
{   
System.out.println("An overloaded static method called.");   
} 
  
  
//main method  
public static void main(String args[])   
{ 
  //calling static method by using the class name  
OverloadStaticMethodExample1.display();   
OverloadStaticMethodExample1.display(160);   
}   
}


------------------------------------------------------------------------------
can we override static methods?
------------------------------------------------------------------------------
Static methods cannot be overridden 
since they are "bonded at compile time"
and method overriding relies on "dynamic binding at runtime"


Constructors in Java
====================
It is a special type of method which is used to initialize the object or 

constructor is a block of codes similar to the method. 

It is called when an instance/object of the class is created
    
    
  
Wrapper classes in Java
========================
pre-->obj
obj-->pre

The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive.


Since J2SE 5.0, autoboxing and unboxing feature convert primitives into objects and objects into primitives automatically. 
The automatic conversion of primitive into an object is known as autoboxing and vice-versa unboxing. 
    
    
    
---------------------------------------------------------------------------------------------------------------
What is type casting?        bscilfd
---------------------------------------------------------------------------------------------------------------
Convert a "value" from one data type to another data type is known as type casting.
Types of Type Casting

There are two types of type casting:
===================================

    Wide'n'ing Type Casting
    Narrowing Type Casting
    
  Widening Type Casting(l==>h)
  ======================
Converting a lower data type into a higher one is called widening type casting. 
It is also known as "implicit conversion" or "casting down". 
It is done automatically. It is safe because there is no chance to lose data. It takes place when:
byte -> short -> char -> int -> long -> float -> double (bscilfd)


 Narrowing Type Casting(h==>l)
 ======================
onverting a higher data type into a lower one is called narrowing type casting.
 It is also known as explicit conversion or casting up. 
 Itm is done manually by the programmer. 
 If we do not perform casting then the compiler reports a compile-time error.

    double -> float -> long -> int -> char -> short -> byte  

    
    
---------------------------------------------------------------------------------------------------------------
can we create object for interface?  
---------------------------------------------------------------------------------------------------------------
Like "abstract classes", "interfaces" cannot be used to create objects direcly we can create indirectly
(in the example below, it is not possible to create an "Animal" object in the MyMainClass) 
Interface methods do not have a body - the body is provided by the "implement" class.



// Interface
interface Animal {
  public void animalSound(); // interface method (does not have a body)
  public void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Pig implements Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
  public void sleep() {
    // The body of sleep() is provided here
    System.out.println("Zzz");
  }
}

class Main {
  public static void main(String[] args) {
    Pig myPig = new Pig();  // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}  
 
 constructor
 ============cannot
 interface
---------------------------------------------------------------------------------------------------------------
can we create constructor for abstract class?///////////////////////////
---------------------------------------------------------------------------------------------------------------
Yes, abstract class have constructors in java. 
But it is not used, to "instantiate abstract class". 
It is used in "constructor chaining" or to "initialize abstract class common variables."

---------------------------------------------------------------------------------------------------------------
can we create constructor for //////////interface? ////////////
---------------------------------------------------------------------------------------------------------------
NO, An interface cannot contain a constructor (as it cannot be used to create objects)


---------------------------------------------------------------------------------------------------------------
can we make interface ///////////final?///////////
---------------------------------------------------------------------------------------------------------------
No. We can't declare final methods in interface. 
We can have abstract methods.
---------------------------------------------------------------------------------------------------------------


can we make constructor final?
---------------------------------------------------------------------------------------------------------------
No, a constructor can't be made final. A final method cannot be overridden by any subclasses. 
 
 NOTE: intefaces and constructors not make finale(ic)
 


##diff b/w Abstract class & Interface
====================================
Abstract class														Interface
	==============														==========
	can have abstract and non-abstract methods						"only abstract methods Since java 1.8 added static and default
	doesn't support "multiple inheritance							supports "multiple inheritance.
	can have final, non-final, static and non-static variables		can have only "static" and "final" variables.
	provide the "implementation of interface						can't provide the implementation of abstract class
	The "abstract keyword" is used to declare abstract class		The "interface keyword" is used to declare interface.
	can be extended using keyword "extends".						interface can be implemented using keyword "implements"

 
 
 Core java Interview questions on Coding Standards
 ==================================================
## Explain Java Coding Standards for classes or Java coding conventions for classes?
======================================================================================
Sun has created Java Coding standards or Java Coding Conventions . It is recommended highly to follow 
java coding standards.

##Classes
======
=>start with capital letter
=>names should be the nouns
=>if CName having mulple words==> first letter of the inner word is capital
Ex : Employee, EmployeeDetails, ArrayList, TreeSet, HashSet


## Explain Java Coding standards for interfaces?
================================================
=>start with uppercase letters
=>names should be adjectives
Example : Runnable, Serializable, Marker, Cloneable


## Explain Java Coding standards for Methods?
==============================================
1) Method names should start with small letters.
2) Method names are usually verbs
3) If method contains multiple words, every inner word should start with uppercase letter.
Ex : toString()
4) Method name must be combination of verb and noun
Ex : getCarName(),getCarNumber()


## Explain Java Coding Standards for variables ?
==================================================
1) Variable names should start with small letters.
2) Variable names should be nouns
3) Short meaningful names are recommended.
4) If there are multiple words every innerword should start with Uppecase character.
Ex : string,value,empName,empSalary


##Explain Java Coding Standards for Constants?
================================================
Constants in java are created using static and final keywords.
1) Constants contains only uppercase letters.
2) If constant name is combination of two words it should be separated by underscore.
3) Constant names are usually nouns.
Ex:MAX_VALUE, MIN_VALUE, MAX_PRIORITY, MIN_PRIORITY
 
 
 
 
 
 
//What is ‘IS-A ‘ relationship in java?
//====================================
//‘is a’ relationship is also known as inheritance. We can implement ‘is a’ relationship or inheritance in java 
//using extends keyword. The advantage of inheritance or is a relationship is reusability of code instead of 
//duplicating the code.
//Ex : Motor cycle is a vehicle
//
//Car is a vehicle Both car and motorcycle extends vehicle.
//
//
//33) What is ‘HAS A’’ relationship in java?
//============================================
//‘Has a ‘ relationship is also known as “composition or Aggregation”. As in inheritance we have ‘extends’ 
//keyword we don’t have any keyword to implement ‘Has a’ relationship in java. The main advantage of 
//‘Has-A‘ relationship in java code reusability.
 

 
 --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
IS-A vs Has-A relationship?
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
A relationship in Java means, different relations between two or more classes. For example, 
if a class Bulb inherits another class Device, then we can say that Bulb is having is-a relationship with Device,
which implies Bulb is a device.  

class Device
		{
		}
class Bulb inherits Device{}

In Java, we have two types of relationship:

    Is-A relationship: 
    =================
    Whenever "one class" inherits "another class", it is called an IS-A relationship.
    
    class Device
		{
		}
	class Bulb inherits Device
	
    Has-A relationship:
    ==================
     Whenever "an instance/object of one class" is used in "another class", it is called HAS-A relationship.
    
    class Device
		{
		void add(int a,int b) return a+b;
		}
	class Bulb inherits Device{
	Device d=new Device();//an instance of one class
	d.add(10,20);
	}

 What is Composition[OD]?  (Simple obj + data type)
 ====================
Composition is a method of "wrapping the simple objects or data types" into a single unit.
 It is a type of association used to represent the relationship between two classes.
 
What is Aggregation?
====================
Aggregation is "another type of association" that is used to represent the "relationship between two classes". 
Aggregation is different from an "ordinary composition" because it gives information about a "collection", and "not about a mixture". 
 













===============================================================================================
Key	 				Co'm'position
===============================================================================================

Basic				Composition is a way to wrap "simple objects" or "data types" into a single unit.

RelationshipIn 		composition, parent entity owns child entity.

Tells about			Composition tells about a mixture.

UML Notation		It is denoted by a "filled diamond."

Life cycle			Child doesn't have their own life time.

Association			It is a strong association.
===============================================================================================


===============================================================================================
 Key			Aggregation->c
 ===============================================================================================
	
Basic			Aggregation differs from "ordinary composition" in that "it does not imply ownership."

Relationship	In Aggregation, parent Has-A relationship with child entity.	

Tells about		Aggregation tells about a collection.

UML Notation	It is denoted by an "empty diamond." 	

Life cycle		Child can have their own life time.

Association		It is a weak association.
===============================================================================================




















what is auto boxing and auto unboxing?
============================
Autoboxing and Unboxing:

The automatic conversion of "primitive data types" into its "equivalent Wrapper type" is known as boxing
and opposite operation is known as unboxing. This is the new feature of Java5.
So java programmer doesn't need to write the conversion code.

Advantage of Autoboxing and Unboxing:
=====================================
No need of conversion between primitives and Wrappers manually so less coding is required.

class BoxingExample1{  
  public static void main(String args[]){  
    int a=50;  
        Integer a2=new Integer(a);//Boxing  
  
        Integer a3=5;//Boxing  
          
        System.out.println(a2+" "+a3);  
 }   
}  



String											StringBuffer
=============									=============
immutable										mutable
slow +											fast +
length static									length dynamic
less efficient.									more efficient
uses String constant pool						heap memory
overrides equal() and hashcode()				cannot override equal() and hashcode()





=========
immutable
==========
slow +
length static
less efficient.
uses String constant pool
overrides equal() and hashcode()




DIFFERENCE BETWEEN String AND StringBuffer 
=================================================
String(collection of sequantial characters or collection of alphanumeric text)
=========
immutable
slow +
length static
less efficient.
uses String constant pool
overrides equal() and hashcode()



1	String is immutable.
2	It is slow in terms of executing the concatenation task.
3	Here the length of the string class is static.
4	It is less efficient.
5	String consumes more memory as compared to the stringbuffer.
5	String class uses String constant pool.
6	It overrides both equal() and hashcode() techniques of object class.


StringBuffer
=============
mutable
fast +
length dynamic
StringBuffer
heap memory
cannot override equal() and hashcode()



1)	It is mutable.
2)	It is fast in terms of executing the concatenation task.
3)  Here the length can be modified whenever required, as it is dynamic in behaviour.
4)  It is "more efficient in nature" as compared to the string class.
5)  StringBuffer uses less memory as compared to the string.
6)  It prefers heap memory to store the objects.
7)  It cannot override equal() and hashcode() methods.


DIFFERENCE BETWEEN StringBuffer AND StringBuilder
=================================================
StringBuilder is same as StringBuffer(Including methods and constructors)


StringBuffer
============
==>Synchronaised(one thread needs to wait until completion of the another thread)
==>Thread Safe
==>Relatively performance is low/slower
==>introduced in 1.0


StringBuilder
============
==>Not Synchronaised(one thread need not to wait until completion of the another thread)
==>No Thread Safe
==>Relatively performance is high/faster
==>introduced in 1.5


----------------------------------------------------------
string vs string builder vs string buffer?
==============================================================================================================================================================================	
string								string buffer													string builder
==================================================================================================================================================
Immutable									Mutable														Mutable
		
Thread Safe									Thread Safe 												Not a Thread safe

																										  
it is "not going to change" much			to used when with "single thread involved"				it is used when many thread involved"	


--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
what is an exception and how you handle?
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
an unwanted or un expected event occur during the execution of program,that will effect to stop the normal flow of the program

Exception Handling: is a mechanism "to handle runtime errors" such as ClassNotFoundException, IOException, SQLException, RemoteException, etc.


==================
Garbage Collection
==================

GC->Removing un-us or un-ref
GC->inbuilt process
in JVM->GC available(to perform GC)
GC->Diemen thread run/back



-> Garbage Collection is the process of removing un-used / un-referenced objects from JVMs heap area.

-> Garbage Collection is  an in-built process in JVM

-> In JVM, "garbage collector" available to perform Garbage Collection.

-> Garbage Collector is a daemon thread (runs in background)


package in.ashokit;

public class Student {

	public static void main(String[] args) {

		// Object created
		Student s1 = new Student();

		// nullifying (making obj eligible for GC)
		s1 = null;

		System.gc();

	}

	protected void finalize() throws Throwable {
		System.out.println("finalize( ) called...");
	}

}


=> When we assign s1=null then s1 become un-referenced object and it is elgible for GC

=> When GC identify un-referenced obj then it will call finalize ( ) method 
and it will remove that object from HEAP area (memory clean up)

========================
How to invoke GC in java?
========================

-> In java we have 2 ways to invoke GC

		System.gc();

		Runtime.getRuntime().gc();

Note: Even if we call a bove methods there is no gaurantee that JVM will start GC immediatley.
GC execution process will be managed by JVM only.


===============================
How GC works internally in JVM ?
===============================


GC--> TRIGGER(STOP)
GC--> HEAP MEMORY(identify objects)-->mark
GC--> SWEEP MARK OBJECT
GC--> OFTER SWEEPING HOLES CREATED GC COMPACTIN
GC--> GC GIVE SIGNAL TO JVM TO CONTINUE



-> Garbage Collection works in below phases

GC(Stop the world)-->HA[Identify unref obj][m for swp]-->Sweep[mem holes crtd]-->compaction

1) Stop the world
2) Marking
3) Sweeping
4) Compaction

-> When GC starts it will trigger STOP THE WORLD (all running threads will be stopped for few milli secs)

-> GC will go to JVM Heap area and it will identify un-referenced objects and it will mark them for sweep. 

-> GC will sweep marked objects

-> After sweeping completed "memory holes will be created in Heap area" to clear that GC will perform Compaction (it will adjust memory holes).


-> After Compaction, GC will give signal to JVM to continue the execution.


Note: GC process will slow down our program execution hence Sun Microsystem didn't give the chance for programmers to perform Garbage Collection. It will be managed by JVM.



--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
what is multithreading?
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Multithreading in Java is a process of executing multiple threads simultaneously/paralally.
A thread is a "lightweight sub-process", 
thred is the "smallest unit" of processing.
Multiprocessing and multithreading, both are used to achieve multitasking.


--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
thread lifecycle?
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
======================
What is Thread Life Cycle
======================

-> Thread Life cycle contains several phases of Thread execution

1) New

2) Runnable

3) Running

4) Blocked

5) Terminated


New--> begine its life cycle, thread remain new state untill call start()

Runnable->after call start method ==>new state to runnable state

running--> A thread comes to running state "Thread Schedular will pick


New: A thread begins its life cycle in the new state. Thread remains in the new state until we will call start ( ) method.

Runnable : After calling start ( ) method, thread comes from new state to runnable state.

Running : A thread comes to running state when "Thread Schedular will pick" up that thread for execution.

Blocked  :( serialliazation) A thread is in waiting state if it waits for another thread to complete its task.

Terminated : A thread enters into terminated state "once it completes its task".




// Java Program on Thread Sleep

package in.ashokit;

public class Demo implements Runnable {

	public void run() {
		System.out.println("run () method started...");

		try {
			Thread.sleep(5000); // blocked state
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("run () method ended...");
	}

	public static void main(String... args) {
		Demo d = new Demo();

		Thread t = new Thread(d); // new state
		t.start(); // runnable state
	}
}


// Java program to start mutliple threads to perform same activity

package in.ashokit;

public class Demo implements Runnable {

	public void run() {
		System.out.println("run () method started..." + Thread.currentThread().getName());
		try {
			Thread.sleep(15000); // blocked state
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("run () method ended..." + Thread.currentThread().getName());
	}

	public static void main(String... args) {
		Demo d = new Demo();

		Thread t1 = new Thread(d);
		t1.setPriority(Thread.MAX_PRIORITY); // 10
		t1.setName("Thread-1");

		Thread t2 = new Thread(d);
		t2.setPriority(Thread.NORM_PRIORITY); // 5
		t2.setName("Thread-2");

		Thread t3 = new Thread(d);
		t3.setPriority(Thread.MIN_PRIORITY); // 1
		t3.setName("Thread-3");

		t1.start(); // runnable state
		t2.start(); // runnable state
		t3.start(); // runnable state
	}
}

Note: We shouldn't start "more than one time".

public static void main(String... args) {
		Demo d = new Demo();

		Thread t1 = new Thread(d);

		t1.start();
		t1.start(); // java.lang.IllegalThreadStateException
	}

 
 
================================
start  ( ) method  vs run ( ) method
================================

-> To start "thread execution" we will call start ( ) method

			t.start ( )

-> once start ( ) method is called then "Thread Schedular will come into picture" to execute our thread

-> start ( ) method will call run ( ) method internally

-> inside run ( ) method we will write the logic which should be executed by the thread.

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
sleep vs yield vs wait?
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
sleep:-
========
This method causes" the "currently executing thread" to sleep for the specified number of milliseconds, 

Thread.sleep(1000)==>1s   1000ms-->1sec

yield :-
=======
It "causes to pause" the currently executing thread" to give the chance for waiting thread of same priority. If there are no waiting threads or all waiting threads have low priority then the same thread can continue its execution

 t	t1-->                 t-->
 couse(pause)		to give chance of wtng trd sm pryrt

==============
yield ( ) method
===============

-> yield ( ) method is used to give chance for other "equal priority threads" to execute


// Java program with yield ( ) method

package in.ashokit;

public class YieldDemo {

	public static void main(String[] args) {
		Thread producer = new Producer();
		Thread consumer = new Consumer();

		producer.start();
		consumer.start();
	}
}

class Producer extends Thread {
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Producer : Produced Item " + i);
			Thread.yield();
		}
	}
}

class Consumer extends Thread {
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Consumer : Consumed Item " + i);
			Thread.yield();
		}
	}
}

-----------------------------------
what is join in threads?
-----------------------------------

=============
join ( ) method(synchronaisation
=============

-> join ( ) method is used to hold second thread execution until first thread execution got completed

->join() method is following the synchronaisation concept, one thread needs to wait until compeletion of next thread.

package in.ashokit;

public class Demo {

	public static void main(String[] args) throws Exception {

		Thread t1 = new Thread() {
			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.println(Thread.currentThread().getName() + " => " + i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		t1.setName("Thread-1");

		Thread t2 = new Thread() {
			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.println(Thread.currentThread().getName() + " => " + i);
					try {
						Thread.sleep(100);
						Thread.yield();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		t2.setName("Thread-2");

		t1.start();
		t1.join();
		t2.start();
	}
}


----------------------------------------------------
how many ways to create a thread and what are they?
----------------------------------------------------
There are two ways to create a thread:

1)    extends "Thread class".
2)   implement "Runnable interface".


--------------------------
what is synchronization?
------------------------
one thread needs to wait until completion of next thread
its is a thread 
its release one thead at a time


-------------------------------------------------------------
class level locking and object level locking?
-----------------------------------------------------------
static mtd mark(syncronaized)-->call(thread)
non-static mtd mark(syncronaized)-->call(thread)


Class Lock - If a "static method is marked as Synchrnozied" and called by a Thread, 
the "whole Class will be locked until the method execution completed".



Object Lock - If a "non-static method is marked as Synchronzied and called by a Thread",
 the current instance (Object) will be locked util the method execution completed.



--------------------------
what is synchronization?
------------------------
one thread needs to wait until completion of next thread
its is a thread safe
its release one thead at a time
it is slow


===========================
How to achieve synchronization
===========================

-> Using  'synchronized' keyword we can implement synchronization

-> synchronized keyword we can use at two places

1)  At method level

2)  At block level

--------------------------------------------
Syntax For Synchronized Block:
--------------------------------------------

public void m1( ){

	// pre-logic

	synchronized ( object ) {
		// imp business logic
	}	
	
	// post-logic

}


--------------------------------------------
Syntax For Synchronized Method :
--------------------------------------------

public synchronized void m1( ) {

	// important business logic

}



// Java Program with Synchronized Method

public class Demo implements Runnable {

	public synchronized void printNums() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + "=> " + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void run() {
		printNums();
	}

	public static void main(String[] args) {
		Demo d = new Demo();

		Thread t1 = new Thread(d);
		t1.setName("Thread-1");
		t1.start();

		Thread t2 = new Thread(d);
		t2.setName("Thread-2");
		t2.start();
	}
}

Note: In the above program we are starting 2 threads. two threads will access printNums ( ) method to print the numbers from 1 to 10.

-> If printNums ( ) method having synchronized keyword then two threads will execute the method sequentially one after other .

-> if we remove synchronized keyword from the printNums ( ) method then two threads will access that method at a time.

Note: We can see the difference in the output.



--------------------------------------
serialization and deserialization?			converting the "state of an object into a byte stream".
--------------------------------------
Serialization is a mechanism of converting the "state of an "ob"ject into a byte stream".   object==>byte stream
Deserialization is the reverse process where the "byte stream is used to recreate the actual Java object in memory."  byte stream==>object
This mechanism is used to persist the object.

====================================================
What is the difference between Runnable & Callable interfaces
====================================================

-> Runnable is a functional interface which contains run ( ) method
-> Callable is a functional interface which contains call ( ) method
       no
-> Run na ble run ( ) method returns "void" (no return type)
-> Callable call ( ) method returns "Object"

-> Runnable interface present in java.lang package
-> Callable interface present in java.util.concurent package

Cloning in Java
===============
process   => exact copy 	 <== original 

							copying(data,attributes)
process   => exact/new obj   <== original

Object cloning in Java is the process of creating an exact copy of the original object. In other words, 
it is a way of creating a new object by copying all the data and attributes from the original object. 


Types of Cloning in Java
=========================
Cloning in Java can be grouped into two categories:

    Shallow Cloning
    Deep Cloning

Shallow Cloning
===============
In Java, when the cloning process is done by invoking/calling the clone() method it is called Shallow Cloning.
It is the default cloning process in Java where a shallow copy of the "original object will be created with exact field".

Deep Cloning in Java
====================
In Java, when the cloning process is done by implementing the "Cloneable interface" it is called Deep Cloning. 
In this type of cloning, an exact copy of all the fields of the original object will be created. 


 Marker Interfaces(CM)
===================
A marker interface is an interface that doesn't have any methods or constants inside it. 

It provides 'run-time type information about objects', so the compiler and JVM have additional information about the object.

A marker interface is also called a tagging interface.


what is an array?
=================
Arrays is nothing but Object in java which is contains similar type of data.
Fixed in size
It does not have grovable nature
its not have any ready mate methods/predefined methods
two types arrays is there

1) single dimention array	 ==>one subscript
2) 2d array					 ==> 2 subscript
3) multidimential array


Differce between array and array list
=====================================
Arrays 																ArrayList
=======																==========
Static														Dynamic

Fixed Length												Variable length

Not a Type safe											    Type safe

Fast 														Slow

Single and multidimetianla									Single dimetianal



Difference between arraylist and linked list
============================================
ArrayList
=========
1) ArrayList internally uses a "dynamic array" to store the elements.
2) Manipulation with ArrayList is slow because it internally uses an array. If any element is removed from the array, all the other elements are shifted in memory.
3) An ArrayList class can act as a list only because it implements List only.
4) ArrayList is better for "storing and accessing data".
5) The memory location for the elements of an ArrayList is contiguous.
6) Generally, when an ArrayList is initialized, a default capacity of 10 is assigned to the ArrayList.
7) To be precise, an ArrayList is a resizable array.

LinkedList
==========
LinkedList internally uses a doubly linked list to store the elements.
Manipulation with LinkedList is faster than ArrayList because it uses a doubly linked list, so no bit shifting is required in memory.
LinkedList class can act as a list and queue both because it implements List and Deque interfaces.
LinkedList is better for manipulating data.
The location for the elements of a linked list is not contagious.
There is no case of default capacity in a LinkedList. In LinkedList, an empty list is created when a LinkedList is initialized.
LinkedList implements the doubly linked list of the list interface.



 */






public class FirstPart10 {

}
