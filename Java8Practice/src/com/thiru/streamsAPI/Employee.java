package com.thiru.streamsAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Employee {

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




	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}
	public String getGender()
	{
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
	
	

	
	public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
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
		List<Employee> employeeList=new ArrayList<>();
		employeeList.add(new Employee(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
		employeeList.add(new Employee(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(4, "Orlen", 28, "Male", "Development", 2014, 32500.0));
		employeeList.add(new Employee(5, "Charles", 27, "Male", "HR", 2013, 22700.0));
		employeeList.add(new Employee(6, "Cathy", 43, "Male", "Security", 2016, 10500.0));
		employeeList.add(new Employee(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0));
		employeeList.add(new Employee(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
		employeeList.add(new Employee(9, "Gita", 24, "Female", "Sales", 2016, 11500.0));
		employeeList.add(new Employee(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5));
		employeeList.add(new Employee(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(12, "Nithin", 25, "Male", "Development", 2016, 28200.0));
		employeeList.add(new Employee(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0));
		employeeList.add(new Employee(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5));
		employeeList.add(new Employee(15, "Ashok", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0));
		

		
		
		//1. How many male and female employees are there in the organization ?
		
//		Map<String, Long> Mf=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
//		System.out.println(Mf);
			
		
		
//		//how many male and female employees is there in a class
//		Map<String, Long> mf=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
//		System.out.println(mf);

		
	
		//2. Print the name of all departments in the organization ?
//		employeeList.stream().map(s->s.getDepartment()).forEach(s->System.out.println(s));
		
		

			
		//3. What is the average[double] age of male and female employees ?
//		Map<String, Double> avgmf=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getAge)));
//		System.out.println(avgmf);
		
			
		
		//4. Get the details of highest paid employee in the organization ?
		//note highest,smallest ==> optional class
		//comparator & comparing
//	         System.out.println("higest payed employee");
//		 Optional<Employee> highest=employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
////		 if(highest.isPresent())
////		 {
////			 Employee emp=highest.get();
////			 
////			 System.out.println(emp.toString());
////		 }
//		 
//		 // or
//		 highest.ifPresent(emp -> System.out.println(emp.getSalary()));
		 
		 
		 
		//5. Get the names of all employees who have joined after 2015 ?
//		 employeeList.stream().filter(n->n.yearOfJoining > 2015).map(n->n.department).forEach(n->System.out.println(n));
		
		 
		
		
		
//		//6. Count[long] the number of employees in each department ?
//		Map<String, Long> map= employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
//		
//		System.out.println(map);
//		
//		//7. What is the average salary of each department ?
//		
//		Map<String,Double> avgEachDept=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
//		
//		System.out.println(avgEachDept);
//		
//		//8. Get the details of youngest male employee in the Development department ?
//		Optional<Employee> min=employeeList.stream().filter(e->e.getGender().equals("Male") && e.getDepartment().equals("Development")).collect(Collectors.minBy(Comparator.comparing(Employee::getAge)));
//		System.out.println(min.get());
//
//		
//		//9. Who has the most working experience in the organization ?
//
//		
//		//10. How many male and female employees are there in the Sales team ?
//	
//		Map<String, Long> sales=employeeList.stream().filter(e->e.getDepartment().equals("Sales")).collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
//		System.out.println(sales);
//		
//		Map<String,Long> sales1=employeeList.stream().filter(e->e.getDepartment().equals("Finance")).collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
//		System.out.println(sales1);
//		
//
//		//11.  What is the average salary of male and female employees ?
//		
//		Map<String, Double> mapAvg=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
//		System.out.println(mapAvg);
//		
//		//12. List down the names of all employees in each department ?
//		employeeList.stream().map(e->e.name).forEach(s->System.out.println(s));
//		
//		
//		
//		//13.  What is the average salary and total salary of the whole organization ?
//		
//		double sum1=employeeList.stream().mapToDouble(Employee::getSalary).sum();
//		System.out.println("total salary of whole org is :"+sum1);
//		
//		OptionalDouble avg=employeeList.stream().mapToDouble(Employee::getSalary).average();
//		System.out.println(avg.getAsDouble());
//		
//		
//		
//		
//		//14.  Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years ?
//		List<Employee> youngEqula25=employeeList.stream().filter(e->e.getAge()<=25).collect(Collectors.toList());
//		List<Employee>  greaterThan25=employeeList.stream().filter(e->e.getAge()>25).collect(Collectors.toList());
//		youngEqula25.forEach(age1->System.out.println("youngEqula25 :"+age1.getName()));
//	    greaterThan25.forEach(age2->System.out.println("greaterThan25 :"+age2.getName()));
//		
//		
//		
//		
//		//15.  Who is the oldest employee in the organization?
//	     Employee oldestEmployee = employeeList.stream()
//	                .max(Comparator.comparingInt(Employee::getAge))
//	                .orElse(null);
//
//	     System.out.println("Age: " + oldestEmployee.getAge());
		
		//1. How many male and female employees are there in the organization ?
		
//		Map<String, Long> mf=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
//		System.out.println(mf);
		
		
		
		//2. Print the name of all departments in the organization ?
		
		//employeeList.stream().map(s->s.getDepartment()).forEach(s->System.out.println(s));
		
		//3. What is the average age of male and female employees ?
		
//		Map<String, Double> map=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
//		System.out.println(map);
		
		

//4. Get the details of highest paid employee in the organization ?
		
//		Optional<Employee> highest=employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
//		if(highest.isPresent())
//		{
//			Employee emp=highest.get();
//			System.out.println(emp.getName());
//			System.out.println(emp.getSalary());
//		}
		
		
		//5. Get the names of all employees who have joined after 2015 ?
		
		//employeeList.stream().filter(s->s.getYearOfJoining()>2015).map(s->s.getName()).forEach(s->System.out.println(s));
		
	//	6. Count the number of employees in each department ?
		
//		Map<String, Long> countEachDept=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
//		System.out.println(countEachDept);
		
	//	7. What is the average salary of each department ?
		
//		Map<String, Double> avgSalEachDept=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
//		System.out.println(avgSalEachDept);
		
		//8. Get the details of youngest male employee in the Development department ?
		
		  Optional<Employee> minEmp=employeeList.stream().filter(s->s.getGender().equals("Male") && s.getDepartment().equals("Development")).min(Comparator.comparing(Employee::getAge));
		  if(minEmp.isPresent())
		  {
			  Employee emp=minEmp.get();
			  System.out.println(emp.getName());
			  System.out.println(emp.getId());
			  System.out.println(emp.getAge());
		  }
	}
}
