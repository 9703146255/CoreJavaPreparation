package no10com.thiru.inheritence1;

/*
Home work questions
1)CollegeMember(super)==>name,id
    Student(sub)
    Employee(sub)
College(main class)

 */




public class CollegeMember {
	
	String name;
	int id;
	
	CollegeMember(){}
	
	CollegeMember(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	void printData()
	{
		System.out.println(this.name);
		System.out.println(this.id);
	}
	
	

}
