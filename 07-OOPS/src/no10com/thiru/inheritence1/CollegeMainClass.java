package no10com.thiru.inheritence1;

public class CollegeMainClass {

	public static void main(String[] args) {

		
		Employee emp=new Employee("thirumalesh",18,20000);
		emp.printData();
		
		System.out.println();
		
		Student sdt=new Student("thirumalesh",18,99);
		sdt.printData();
		
		System.out.println();
		
		CollegeMember cmObj=new CollegeMember("thirumalesh",18);
		cmObj.printData();
		
		
		
	}

}
