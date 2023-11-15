package com.thiru.streamsAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Employer {

	
	int id;
	String name;
	int age;
	String gender;
	String department;
	int yearOfJoining;
	double salary;
	
	

	public Employer(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}



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



	public static void main(String[] args) {
	   List<Employer> employeeList=Arrays.asList(new Employer(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0),
			   									new Employer(2, "Smith", 25, "Male", "Sales", 2015, 13500.0),
			   									new Employer(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0),
			   									new Employer(4, "Orlen", 28, "Male", "Development", 2014, 32500.0),
			   									new Employer(5, "Charles", 27, "Male", "HR", 2013, 22700.0),
			   									new Employer(6, "Cathy", 43, "Male", "Security", 2016, 10500.0),
			   									new Employer(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0),
			   									new Employer(8, "Suresh", 31, "Male", "Development", 2015, 34500.0),
			   									new Employer(9, "Gita", 24, "Female", "Sales", 2016, 11500.0),
			   									new Employer(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5),
			   									new Employer(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0),
			   									new Employer(12, "Nithin", 25, "Male", "Development", 2016, 28200.0),
			   									new Employer(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0),
			   									new Employer(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5),
			   									new Employer(15, "Ashok", 23, "Male", "Infrastructure", 2018, 12700.0),
			   									new Employer(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0));
	   
	   
	   
	   

	   	//1. How many male and female employees are there in the organization ?
	   // names:values==> keys:values
	   //How many male and female ==>counting()
	   
	   Map<String, Long> countMF=employeeList.stream().collect(Collectors.groupingBy(Employer::getGender,Collectors.counting()));
	   System.out.println(countMF);
	   
	   
	  // 2. Print the name of all departments in the organization ?
	   //only departmenet ==> forEach
	   employeeList.stream().distinct().map(Employer::getDepartment).forEach(s->System.out.println(s));
	   
	   
	   //3. What is the average age of male and female employees ?
	   //mf:avg==> key:values
	   // Double==>  averagingDouble(Employer::getAge)
	   Map<String, Double> mFAvg=employeeList.stream().collect(Collectors.groupingBy(Employer::getGender,Collectors.averagingDouble(Employer::getAge)));
	   
        System.out.println(mFAvg);
        
        
       // 4. Get the details of highest paid employee in the organization ?
        //highest or lowest optional class we can use
        
       Optional<Employer> highEmp=employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employer::getSalary)));
       System.out.println(highEmp.orElse(null));
       
       
      // 5. Get the names of all employees who have joined after 2015 ?
       
      //only names than use forEach
       System.out.println("// 5. Get the names of all employees who have joined after 2015 ?");
       
       employeeList.stream().filter(s->s.getYearOfJoining()>2015).map(name->name.getName()).forEach(s->System.out.println(s));
    		  

       System.out.println("6. Count the number of employees in each department ?\r\n");// no of emp each dept  ==> key:value==> dept:no of person
       
       Map<String,Long> cntNoEmpEachDept=employeeList.stream().collect(Collectors.groupingBy(Employer::getDepartment,Collectors.counting()));
       
       System.out.println(cntNoEmpEachDept);
       
       System.out.println("7. What is the average salary of each department ?");
       
       Map<String,Double> salEachDept=employeeList.stream().collect(Collectors.groupingBy(Employer::getDepartment,Collectors.averagingDouble(Employer::getSalary)));
       
       System.out.println(salEachDept);
       
       System.out.println("8. Get the details of youngest male employee in the Development department ?\r\n");
       
      Optional<Employer> young=employeeList.stream().filter(name->name.getGender().equals("male") && name.getDepartment().equals("Development")).collect(Collectors.minBy(Comparator.comparing(Employer::getAge)));
	
      System.out.println(young);
	
	
	
	}

}
