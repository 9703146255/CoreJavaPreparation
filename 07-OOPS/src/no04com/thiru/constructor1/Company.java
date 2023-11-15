package no04com.thiru.constructor1;

public class Company {

	public static void main(String[] args) {

		Employee emp1=new Employee("thiru", 27, 800000);
		emp1.printData();
		
		Employee emp2=new Employee("charan", 22, 2500);
		emp2.printData();
	}

}
