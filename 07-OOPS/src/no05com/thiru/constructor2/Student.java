package no05com.thiru.constructor2;

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
	Student(String l_name, int l_age, int l_marks)
	{
		//local variables
		name=l_name;
		age=l_age;
		marks=l_marks;
	}
	void printData()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(marks);
	}

}
