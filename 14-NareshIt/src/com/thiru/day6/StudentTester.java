package com.thiru.day6;

public class StudentTester {

	public static void main(String[] args) {
        ScienceStudent scienceStudent = new ScienceStudent("John", "Class 10", 80, 90, 75);
        HistoryStudent historyStudent = new HistoryStudent("Alice", "Class 12", 85, 95);

        System.out.println("Total Students: " + Student.getTotalNoStudents());

        System.out.println("Science Student Percentage: " + scienceStudent.getPercentage() + "%");
        System.out.println("History Student Percentage: " + historyStudent.getPercentage() + "%");
	}

}
