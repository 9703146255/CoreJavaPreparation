package no10com.thiru.inheritence1;

public class Student extends CollegeMember{
	
	double marks;
	
	Student(){}
	Student(String name,int id, double marks){
		
		this.name=name;
		this.id=id;
		this.marks=marks;
   }
	void printData()
	{
		System.out.println(this.name);
		System.out.println(this.id);
		System.out.println(this.marks);
	}

}
