package com.thiru.streamsAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Emp {
	
	int id;
	String name;
	int age;
	String gender;
	String department;
	int yearOfJoining;
	double salary;
	


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public int getYearOfJoining() {
		return yearOfJoining;
	}



	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}




	public double getSalary() {
		return salary;
	}




	public void setSalary(double salary) {
		this.salary = salary;
	}

   

	public Emp(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}
	public Emp() {}

	public static void main(String[] args) {
		
		
		List<Emp> list=new ArrayList<>();
	
		list.add(new Emp(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
		list.add(new Emp(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
		list.add(new Emp(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0));
		list.add(new Emp(4, "Orlen", 28, "Male", "Development", 2014, 32500.0));
		list.add(new Emp(5, "Charles", 27, "Male", "HR", 2013, 22700.0));
		list.add(new Emp(6, "Cathy", 43, "Male", "Security", 2016, 10500.0));
		list.add(new Emp(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0));
		list.add(new Emp(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
		list.add(new Emp(9, "Gita", 24, "Female", "Sales", 2016, 11500.0));
		list.add(new Emp(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5));
		list.add(new Emp(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0));
		list.add(new Emp(12, "Nithin", 25, "Male", "Development", 2016, 28200.0));
		list.add(new Emp(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0));
		list.add(new Emp(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5));
		list.add(new Emp(15, "Ashok", 23, "Male", "Infrastructure", 2018, 12700.0));
		list.add(new Emp(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0));
		
		
		//1. How many male and female employees are there in the organization ?
		
		Map<String,Long> map=list.stream().collect(Collectors.groupingBy(Emp::getGender,Collectors.counting()));
		System.out.println(map);
		
		//2. Print the name of all departments in the organization ?
		
		list.stream().map(Emp::getDepartment).distinct().forEach(s->System.out.println(s));
		
		//3. What is the average age of male and female employees ?
	
		Map<String, Double> map1=list.stream().collect(Collectors.groupingBy(Emp::getGender,Collectors.averagingDouble(Emp::getAge)));
		System.out.println(map1);
	
	
		//4. Get the details of highest paid employee in the organization ?
		Optional<Emp> highest=list.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Emp::getSalary)));
		
		if(highest.isPresent())
		{
			Emp e=highest.get();
			System.out.println(e.getId());
			System.out.println(e.getName());
			System.out.println(e.getAge());
			System.out.println(e.getSalary());
			System.out.println(e.getYearOfJoining());
		}

	
		//5. Get the names of all employees who have joined after 2015 ?
		System.out.println();
		list.stream().filter(names->names.getYearOfJoining()>2015).map(nm->nm.getName()).forEach(s->System.out.println(s));
	
		//6. Count the number of employees in each department ?
		
		Map<String,Long> noOfEmpEachDept=list.stream().collect(Collectors.groupingBy(Emp::getDepartment,Collectors.counting()));
		
		System.out.println(noOfEmpEachDept);
	
		//7. What is the average salary of each department ?
	
		Map<String, Double> avgSal=list.stream().collect(Collectors.groupingBy(Emp::getDepartment,Collectors.averagingDouble(Emp::getSalary)));
		System.out.println(avgSal);
	
		//8. Get the details of youngest male employee in the Development department ?
		
		//Optional<Emp> young=list.stream().filter(yng->yng.getGender().equals("male") && yng.getDepartment().equals("Development").collect(Collections.min(Emp::getAge)));
	
	}
	
	

}
