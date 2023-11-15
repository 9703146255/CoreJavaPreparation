package com.thiru.methods1;

public class Company {

	public static void main(String[] args) {

		Employee emp1=new Employee();
		emp1.takeInputs("thiru", 27, 800000);
		emp1.printData();
		
		Employee emp2=new Employee();
		emp2.takeInputs("charan", 22, 2500);
		emp2.printData();
	}

}
