package com.thiru.emphasis;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee1
{
	String name;
	int age;
	double salary;
	
	
	public Employee1() {}
	public Employee1(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getSalary() {
		return salary;
	}
}

public class SecondDemo {

	public static void main(String[] args) {
		
		List<Employee1> list=new ArrayList<>();
		list.add(new Employee1("kiran",25,25000));
		list.add(new Employee1("charan",20,30000));
		list.add(new Employee1("chiru",40,22000));
		list.add(new Employee1("samantha",35,33000));
		list.add(new Employee1("thara",18,30000));
		
		List<Employee1> filterEmp=list.stream().filter(e->(e.getAge()==18 && e.getSalary()>20000)).collect(Collectors.toList());
		
		 for(Employee1 e:filterEmp)
		 {
			 System.out.println(e.getName()+"-"+e.getAge()+"-"+e.getSalary());
		 }

	}

}
