package com.thiru.day6;




public abstract class Student {
	
	protected String studentName;
    protected String studentClass;
    protected static int totalNoOfStudents = 0;
    public abstract int getPercentage();

    public static int getTotalNoStudents() {
        return totalNoOfStudents;
    }
    
    public Student() {
        totalNoOfStudents++;
    }
    public Student(String name, String studentClass) {
        this.studentName = name;
        this.studentClass = studentClass;
        totalNoOfStudents++;
    }

}

//ScienceStudent class
class ScienceStudent extends Student {
 private int physicsMarks;
 private int chemistryMarks;
 private int mathsMarks;

 public ScienceStudent(String name, String studentClass, int physicsMarks, int chemistryMarks, int mathsMarks) {
     super(name, studentClass);
     this.physicsMarks = physicsMarks;
     this.chemistryMarks = chemistryMarks;
     this.mathsMarks = mathsMarks;
 }

 @Override
 public int getPercentage() {
     int totalMarks = physicsMarks + chemistryMarks + mathsMarks;
     return (totalMarks * 100) / 300;
 }
}


//HistoryStudent class
class HistoryStudent extends Student {
 private int historyMarks;
 private int civicsMarks;

 public HistoryStudent(String name, String studentClass, int historyMarks, int civicsMarks) {
     super(name, studentClass);
     this.historyMarks = historyMarks;
     this.civicsMarks = civicsMarks;
 }

 @Override
 public int getPercentage() {
     int totalMarks = historyMarks + civicsMarks;
     return (totalMarks * 100) / 200;
 }
}