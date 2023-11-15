package no13com.thiru.methodoverriding0;

/*
METHOD OVERRING:
===============
RE-DEFINE A METHOD IN SUB CLASS, SUCH A METHOD ALREADY DEFINED IN SUPER CLASS
RULES TO OVERRIDE A METHOD:
•	 METHOD NAME AND PARAMETERES MUST BE SAME
•	{METHOD OF SUPER CLASS RE-DEFINED IN SUB CLASS}
#########SCOPE OR VISIBILITY OF METHOD CAN BE SAME OR INCREASED BUT NOT DECREASED#########
EX: print() method in super class(collegemember)print() method in sub class


ACCESS MODIFIERS OR SPECIFIERS
==============================
1.	PRIVATE
2.	DEFAULT (NO-SPECIFIER) OR PACKAGE PRIVATE
3.	PROTECTED
4.	PUBLIC


########	INCREASING SCOPE	###############	PRIVATE=>DEFAULT==>PROTECTED==>PUBLIC
===============================================================
PRIVATE:
===============================================================
SCOPE OR VISIBILITY			: INSIDE THE CLASS
APPLICABLE              	: FIELDS AND METHODS(FM), Constructors
NOT APPLICABLE      		: CLASS
===============================================================
(DEFAULT) NO-SPECIFIER OR PACKAGE PRIVATE 
===============================================================
SCOPE OR VISIBILITY			: INSIDE THE PACKAGE
APPLICABLE               	: FIELDS, METHODS AND CLASSES(FMC)
APPLICABLE     				: CLASS
===============================================================
PROTECTED 
==============================================================
SCOPE OR VISIBILITY			: INSIDE THE PACKAGE AND SUB CLASS WITH CHILD CLASS OR INHERITENCE
APPLICABLE         			: FILES AND METHODS
NOT APPLICABLE     			: CLASS
===============================================================
PUBLIC
==============================================================
SCOPE OR VISIBILITY			: INSIDE PROJECT ANY WHERE
APPLICABLE               	: FIELDS AND METHODS
APPLICABLE     		   	    : CLASS
===============================================================


+---------------+---------------------------+------------------------+
| Access        | Scope or Visibility      	| Applicable to          |
| Modifier      |                           |                        |
+---------------+---------------------------+------------------------+
| PRIVATE       | Inside the class         	| Fields, Methods,       |
|               |                           | Constructors           |
+---------------+---------------------------+------------------------+
| DEFAULT       | Inside the package       	| Fields, Methods,       |
|               |                           | Constructors, Classes  |
+---------------+---------------------------+------------------------+
| PROTECTED     | Inside the package and    | Fields, Methods,       |
|               | subclasses                | Constructors           |
+---------------+---------------------------+------------------------+
| PUBLIC        | Inside the entire         | Fields, Methods,       |
|               | project (anywhere)        | Constructors, Classes  |
+---------------+---------------------------+------------------------+

 */




public class MethodOverriding {

}
