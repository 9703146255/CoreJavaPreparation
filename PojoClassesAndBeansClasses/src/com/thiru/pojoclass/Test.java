package com.thiru.pojoclass;

public class Test {

	public static void main(String[] args) {
		
		
		// we are callign here default constructor
		Employee e1=new Employee();   //we created object for --> NO-ARGS CONSTRUCTOR
		e1.setId(1001); //we are setting he values to the setter method
		e1.name="thirumalesh";
		e1.salary=10000;
		
		Employee e2=new Employee();   //we created object for --> NO-ARGS CONSTRUCTOR
		e2.setId(1002); //we are setting he values to the setter method
		e2.name="karansing";
		e2.salary=20000;
		
		Employee e3=new Employee();   //we created object for --> NO-ARGS CONSTRUCTOR
		e3.setId(1003); //we are setting he values to the setter method
		e3.name="chaithusing";
		e3.salary=30000;
		
		System.out.println(e1.getId());  //getting -->private value
		System.out.println(e1.name);     //getting --> public value
		System.out.println(e1.salary);  //getting --> protected value
		System.out.println();
		
		System.out.println(e2.getId());  //getting -->private value
		System.out.println(e2.name);     //getting --> public value
		System.out.println(e2.salary);  //getting --> protected value
		System.out.println();
		
		System.out.println(e3.getId());  //getting -->private value
		System.out.println(e3.name);     //getting --> public value
		System.out.println(e3.salary);  //getting --> protected value
		System.out.println();
		
		Employee[] employees=new Employee[] {e1,e2,e3};
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
		

	}

}
