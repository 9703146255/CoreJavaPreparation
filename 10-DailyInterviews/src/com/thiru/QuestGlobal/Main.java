package com.thiru.QuestGlobal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Person
{
	private String name;
	private int age;
	private int salary;
	public Person(String name, int age, int salary) {
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
	
	
	
	
}






public class Main {
	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
        people.add(new Person("John", 48, 50000));
        people.add(new Person("Alice", 45, 60000));
        people.add(new Person("Mark", 50, 55000));
        people.add(new Person("Jane", 47, 70000));
        people.add(new Person("Michael", 49, 45000));
        
        // Requirements 1: Apply the age range between 45 to 50 and sort by name
        List<String> sortedNames = people.stream()
                .filter(person -> person.getAge() >= 45 && person.getAge() <= 50)
                .map(Person::getName)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedNames);

        // Requirements 2: Apply the average on age
        double averageAge = people.stream()
                .mapToInt(Person::getAge)
                .average()
                .orElse(0.0);
        System.out.println(averageAge);

        // Requirements 3: Find the total salary of the members
        int totalSalary = people.stream()
                .mapToInt(Person::getSalary)
                .sum();
        System.out.println(totalSalary);

	}

}
