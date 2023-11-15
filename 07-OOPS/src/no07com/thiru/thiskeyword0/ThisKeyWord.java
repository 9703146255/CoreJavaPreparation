package no07com.thiru.thiskeyword0;


/*
THIS KEYWORD[IFIELD,DF,PC]
==========================

THIS KEYWORD IN JAVA:
1)	To access instance fields/VARIABLES
  this.name
2)	To call default constructor 
   this();
3)	To call parameterized constructor
this(“adam”,20)

4)->// Use 'this' to distinguish between instance variables and constructor parameters/vaiables

 	private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        // Use 'this' to distinguish between instance variables and constructor parameters
        this.name = name; // 'this.name' refers to the instance variable
        this.age = age;   // 'this.age' refers to the instance variable
    }


  NOTE : No, you cannot directly call a no-argument constructor (default constructor) 
  from within a parameterized constructor using the this keyword in Java.
  
  BUT WE CAN CALLL  LIKE THIS  
  ===========================
  // Default constructor
    public Person() {
        this("John Doe", 30); // Calls the parameterized constructor
    }
 */

public class ThisKeyWord {

	

}
