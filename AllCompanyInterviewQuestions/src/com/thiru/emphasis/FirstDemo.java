package com.thiru.emphasis;

import java.util.stream.Stream;

/*
 * 
 *  sal>20000 and age=18 using streams
	=============================
 * 
 * 
 */
class Employee
{
	String name;
	int age;
	double salary;
	public Employee() {}
	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	
}



public class FirstDemo {

	public static void main(String[] args) {
		
		Employee e1=new Employee("thiru",26,25000);
		Employee e2=new Employee("kiran",44,50000);
		Employee e3=new Employee("mallesh",16,50000);
		Employee e4=new Employee("vinay",15,35000);
		Employee e5=new Employee("chand",18,25000);
		Employee e6=new Employee("maruthi",18,40000);
		
		Stream<Employee> stream=Stream.of(e1,e2,e3,e4,e5,e6);
		
		stream.filter(e->e.salary>20000 && e.age==18).map(e->e.name+"-"+e.age+"-"+e.salary).forEach(e->System.out.println(e));

	}
	
	
	

}
