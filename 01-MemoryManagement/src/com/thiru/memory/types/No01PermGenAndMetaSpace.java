package com.thiru.memory.types;

public class No01PermGenAndMetaSpace {

/*



3 TYPES OF MEMORIES IS THERE 																			
============================
1)HEAP MEMORY
2)STACK MEMORY
3)META SPACE OR PERMGEN

1)HEAP MEMORY (all app,default size,we stre obj,string,arrays,customaise, java.lang.stackOverFlowError)
===============
=>Heap memory is used by "all the parts of the application "

=>The default size of the heap memory is "768mb"

=>Inside the "heap memory" it will stores the OBJECTS,STRINGS literal,ARRAY...etc data (SOA)

=>If we want to customise the "heap memory size" we can give ==> -Xss2m or -Xss5m	

=>When ever Heap memory will be full we will get ==>java.lang.OutOfMemoryError 

 
2)STACK MEMORY
================

=>stack memory is used only by "one thread of execution".

=>The default size of the stack memory is 1024kb.

=>Inside the "stack memory" it will stores the LOCAL VARIABLE, REF VARIABLES AND METHODS  ...etc values  LOC ,REF METHODSd

=>If we want to customise the stack memory size we can give ==> -Xmx500m or -Xmx1000m

=>When ever stack memory will be full we will get ==>java.lang.StackOverFlowError.

=>IT Will follow the lifo order




	1)HEAP MEMORY(ROM)												2)STACK MEMORY(RAM)
	===============													================	
  >  It will store Objects,strings literals,arrays...values			> It will store variables,refereance variables values

  > Size is ==>768mb												> Size is ==>1024kb	

  > It will works like a ROM 										>  It will works like a RAM
	
  > perfermance is slow												> perfermance is speed

  > JVM throws the java.lang.OutOfMemoryErrorJ 						> JVM throws the java.lang.StackOverFlowError(sofe)
 
    if the stack size is greater than the limit.

  >It is done manually "by the programmer."				   			> It is done "automatically by the compiler."	

  >Its cost is less.						              			>Its cost is more in comparison to Heap.

  >Its implementation is easy					          			>Its implementation is hard. 
	
  >Memory allocated in random order.				       			>Memory allocation is continuous. 

> It Will not  follow the any order becouse of dynamic memory allocation. > it will follow the  LIFO order

========													
for Heap
========
Right click ==>run as ==> Run configurations =>click on arguments ==> in vm (-Xmx500m) or   -Xmx600m       [X==> Rom big x big

========													
for Stack
========
Right click ==>run as ==> Run configurations =>click on arguments ==> in vm(-Xss2m) or (-Xss5m)			   [ small==> ram small s small


permGen space and MetaSpace.
==========================
which is having runtime constant pool
class structure
static variables 
static methods
static block


Simply put, Metaspace is a new memory space – starting from the Java 8 version;
it has replaced the older PermGen memory space.==>The most significant difference is "how it handles memory allocation." 

Difference between PermGen space and MetaSpace.
================================================
PermGen Space
=================================================
PermGen always has a fixed "maximum size."
Contiguous Java Heap Memory
Max size can be set using	==> XX:MaxPermSize
Comparatively ineffiecient Garbage collection. Frequent GC pauses and no concurrent deallocation.

==================================================================================
MetaSpace
===================================================================================
Metaspace by default auto increases its size depending on the underlying OS.
Native Memory(provided by underlying OS)
Max size can be set using ==> XX:MetaspaceSize
Comparatively effiecient Garbage collection. Deallocate class data concurrently and not during GC pause.

PermGen Space				MetaSpace
=====================================
==>fixed in size            auto increases
==>store heap 				 Native Memory:
==>max size set:			 max size set:	
   XX:MaxPermSize			 XX:MetaspaceSize


 */
}
