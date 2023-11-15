package JAVA8FullCourse4_S_6Videos;



class Employee
{
	String name;
	int  eno;
	
	Employee(String name,int eno)
	{
		this.name=name;
		this.eno=eno;
	}
	public String toString()
	{
		return name+"  :  "+eno ;
	}
}






public class Java8_LambdaExp_Fi {
	// I WANT TO SORT ALL EMPLOYEES BASED ON EMPLOYEE ID

	public static void main(String[] args) {
		//we are printed single employee data
		Employee e=new Employee("Thiru",1001);
		System.out.println(e);
			
	}

}
