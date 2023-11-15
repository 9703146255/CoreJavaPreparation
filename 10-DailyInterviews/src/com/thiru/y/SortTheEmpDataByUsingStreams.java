package com.thiru.y;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee
{
  private String name;
  private int age;
  private double salary;
public Employee(String name, int age, double salary) {
	super();
	this.name = name;
	this.age = age;
	this.salary = salary;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
} 
  
}





public class SortTheEmpDataByUsingStreams {

	public static void main(String[] args) {
		
		List<Employee> employees=new ArrayList<>();
		employees.add(new Employee("THIRU",27,2000));
		employees.add(new Employee("VINAY",25,25000));
		employees.add(new Employee("KIRAN",22,15000));
		
	//	List<Employee> list=employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).toList();

	}

}
