package com.thiru.streamsAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Employeee {
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

	
	
	
	public Employeee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}

	public static void main(String[] args) {
		
		List<Employeee> employeeList=new ArrayList<>();
		employeeList.add(new Employeee(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employeee(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
		employeeList.add(new Employeee(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employeee(4, "Orlen", 28, "Male", "Development", 2014, 32500.0));
		employeeList.add(new Employeee(5, "Charles", 27, "Male", "HR", 2013, 22700.0));
		employeeList.add(new Employeee(6, "Cathy", 43, "Male", "Security", 2016, 10500.0));
		employeeList.add(new Employeee(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0));
		employeeList.add(new Employeee(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
		employeeList.add(new Employeee(9, "Gita", 24, "Female", "Sales", 2016, 11500.0));
		employeeList.add(new Employeee(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5));
		employeeList.add(new Employeee(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employeee(12, "Nithin", 25, "Male", "Development", 2016, 28200.0));
		employeeList.add(new Employeee(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0));
		employeeList.add(new Employeee(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5));
		employeeList.add(new Employeee(15, "Ashok", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employeee(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0));
		
		
		//1. How many male and female employees are there in the organization ? names==>string, count==> long
		Map<String, Long> MF=employeeList.stream().collect(Collectors.groupingBy(Employeee::getGender,Collectors.counting()));
		System.out.println(MF);
		
		//2. Print the name of all departments in the organization ?
		System.out.println();
		employeeList.stream().map(name->name.getDepartment()).forEach(s->System.out.println(s));
		
		//3. What is the average age of male and female employees ?
		System.out.println();
		Map<String, Double> avgMF=employeeList.stream().collect(Collectors.groupingBy(Employeee::getGender,Collectors.averagingDouble(Employeee::getSalary)));
		System.out.println(avgMF);
		
		
		//4. Get the details of highest paid employee in the organization ?
		Optional<Employeee> hEmp=employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employeee::getSalary)));
		
		if(hEmp.isPresent())
		{
			Employeee employeee=hEmp.get();
			System.out.println("Details of highest paid employee is :");
			System.out.println(" id 	: "+employeee.getId());
			System.out.println(" name 	: "+employeee.getName());
			System.out.println(" age 	: "+employeee.getAge());
			System.out.println(" gender : "+employeee.getGender());
			System.out.println(" salary : "+employeee.getSalary());
		}
		
		//5. Get the names of all employees who have joined after 2015 ?
		
		employeeList.stream().filter(j->j.getYearOfJoining() > 2015).map(names->names.getName()).forEach(s->System.out.println(s));
		
		//6. Count the number of employees in each department ?
		
		
		System.out.println();
		Map<String, Long> CntNoEmpEachDept=employeeList.stream().collect(Collectors.groupingBy(Employeee::getDepartment,Collectors.counting()));
		System.out.println(CntNoEmpEachDept);
		
		
		//7. What is the average salary of each department ?
		Map<String, Double> avgEachDept=employeeList.stream().collect(Collectors.groupingBy(Employeee::getDepartment,Collectors.averagingDouble(Employeee::getSalary)));
		System.out.println(avgEachDept);
	

		//8. Get the details of youngest male employee in the Development department ?
	
	   Optional<Employeee> yngMale=employeeList.stream().filter(young->young.getGender().equals("Male") && young.getDepartment().equals("Development")).collect(Collectors.minBy(Comparator.comparing(Employeee::getAge)));
	     if(yngMale.isPresent())
	     {
	    	 Employeee empYngMale=yngMale.get();
	    	 System.out.println(" ID 		:"+empYngMale.getId());
	    	 System.out.println(" Name 		:"+empYngMale.getName());
	    	 System.out.println(" Gender 	:"+empYngMale.getGender());
	    	 System.out.println(" Department:"+empYngMale.getDepartment());
	    	 System.out.println(" Age is    :"+empYngMale.getAge());
	     }
	     
	     System.out.println();
	     //9. Who has the most working experience in the organization ?
	     Optional<Employeee>  mostExpEmp=employeeList.stream().collect(Collectors.minBy(Comparator.comparing(Employeee::getYearOfJoining)));
	     if(mostExpEmp.isPresent())
	     {
	    	 Employeee mostExpEmpres=mostExpEmp.get();
	    	 int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
	         int experience = currentYear - mostExpEmpres.getYearOfJoining();
	    	
	         	System.out.println("Employee with the most working experience:");
	            System.out.println("Name: " + mostExpEmpres.getName());
	            System.out.println("Years of Experience: " + experience);
	            System.out.println("Department: " + mostExpEmpres.getDepartment());
	    }
	

	     //10. How many male and female employees are there in the Sales team ?
	     
	     Map<String, Long> MFSales=employeeList.stream().filter(dept->dept.getDepartment().equals("Sales")).collect(Collectors.groupingBy(Employeee::getGender,Collectors.counting()));
	     System.out.println(MFSales);
	     
	     
	     //11.  What is the average salary of male and female employees ?
	     
	     Map<String, Double> avgMf=employeeList.stream().collect(Collectors.groupingBy(Employeee::getGender,Collectors.averagingDouble(Employeee::getSalary)));
	     System.out.println(avgMf);
	     
	     
	     
	     //12. List down the names of all employees in each department ?
	     
	     
	     employeeList.stream().map(empNames->empNames.getName()).forEach(name->System.out.println(name));
	     
	     //
	     //13.  What is the average salary and total salary of the whole organization ?
	     
	     double totalSalary = employeeList.stream()
	                .mapToDouble(Employeee::getSalary)
	                .sum();

	        double averageSalary = totalSalary / employeeList.size();

	        System.out.println("Total salary of the whole organization: " + totalSalary);
	        System.out.println("Average salary of the whole organization: " + averageSalary);
	     
	     
	     
	        // 14.  Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years ?
	        
	        List<Employeee> youngerOrEqual25 = employeeList.stream()
	                .filter(employee -> employee.getAge() <= 25)
	                .collect(Collectors.toList());

	        List<Employeee> olderThan25 = employeeList.stream()
	                .filter(employee -> employee.getAge() > 25)
	                .collect(Collectors.toList());

	        System.out.println("Employees younger or equal to 25 years:");
	        for (Employeee employee : youngerOrEqual25) {
	            System.out.println("Name: " + employee.getName() + ", Age: " + employee.getAge());
	        }

	        System.out.println("\nEmployees older than 25 years:");
	        for (Employeee employee : olderThan25) {
	            System.out.println("Name: " + employee.getName() + ", Age: " + employee.getAge());
	        }
	     
	     
	        
	        
	        
	    //15 Find the oldest employee in the organization
	        Optional<Employeee> oldestEmployee = employeeList.stream()
	                .max(Comparator.comparingInt(Employeee::getAge));

	        if (oldestEmployee.isPresent()) {
	            Employeee employee = oldestEmployee.get();
	            System.out.println("Oldest employee in the organization:");
	            System.out.println("Name: " + employee.getName());
	            System.out.println("Age: " + employee.getAge());
	            System.out.println("Department: " + employee.getDepartment());
	        } else {
	            System.out.println("No employees found.");
	        }
	}

}
