package JAVA8FullCourse7_8_9Videos7;


/*
 * 
 * Conditional checks
 * ==================
 * Predicate<Integer> p=i%2==0
 * 
 * 
 * 
 * Function :
 *===========
 *input --> perform operation --> output
 *  4   -->square operation   -->16
 *  
 *  >=80 ==>A [Distinction]
 *  >=60 ==>B [FC]
 *  >=50 ==>C [SC]
 *  >=35 ==>D [TC]
 * ==>E [Failed]
 * 
 * Student --> find grade --> return grade
 */


import java.util.function.*;

class Student{
	String name;
	int marks;
    Student(String name,int marks)
    {
    	this.name=name;
    	this.marks=marks;
    }
}

public class PredefinedFuntionalInterface4 {

	public static void main(String[] args) {
		
		Function<Student,String> f=s->{
			
			
			int marks=s.marks;
			String grade="";
			if(marks >= 80) grade="A[DISTINCTION]";
			else if(marks >= 60) grade="B[FIRST CLASS]";
			else if(marks >= 50) grade="B[SECOND CLASS]";
			else if(marks >= 35) grade="B[THIRD CLASS]";
			else grade="E[Failed]";
			return grade;
			
		};
		Student[] s= {new Student("Durga",100),
			         new Student("Charan",20),
			         new Student("manasa",75),
			         new Student("Durga",80),
			         new Student("Charan",66),
			         new Student("manasa",30),
				
		
		};
		
		Predicate<Student> p=m->m.marks>= 60;
		for(Student s1:s)
		{   if(p.test(s1))
		{
			System.out.println("Student name :"+s1.name);
			System.out.println("Student marks :"+s1.marks);
			System.out.println("Student rank"+f.apply(s1));
		}
		}
		
		

	}

}
