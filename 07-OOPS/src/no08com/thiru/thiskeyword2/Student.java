package no08com.thiru.thiskeyword2;

/*
 2.Create "Student" class
      --instance fields
         name,age,marks
      --Methods
         -takeInputs
         -printData
Create a main class "College"
        -Create Student object
        -call methods

 */
public class Student {
	//instance variables
	String name;
	int age;
	int marks;
	
	Student(){}
	Student(String name, int age, int marks)
	{
		//local variables
		this(); // to call the default constructor
		this.name=name;
		this.age=age;
		this.marks=marks;
	}
	void printData()
	{
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.marks);
	}

}
