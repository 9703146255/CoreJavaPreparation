package JAVA8FullCourse4_S_6Videos;

import java.util.ArrayList;
import java.util.Collections;

class Employee3
{
	String name;
	int  eno;
	
	Employee3(String name,int eno)
	{
		this.name=name;
		this.eno=eno;
	}
	public String toString()
	{
		return eno +"  :  "+ name ;
	}
}

public class Java8_LambdaExp_Fi4 {
	// I WANT TO SORT ALL EMPLOYEES BASED ON EMPLOYEE ID

	public static void main(String[] args) {
		//we are printed single employee data
	
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(new Employee("durga",101));
		al.add(new Employee("charan",102));
		al.add(new Employee("kiran",1088));
		al.add(new Employee("vijay",104));
		al.add(new Employee("manju",100));
		al.add(new Employee("chennai",106));
		
		
		//SORT THE ASCENDING ORDER BASED ON INTEGER VALUES
	    //Collections.sort(al,(o1,o2)->(o1.eno>o2.eno)?1:(o1.eno<o2.eno)?-1:0);
		//SORT THE ASCENDING ORDER BASED ON STRING TEXT
	  System.out.print("original arraylist"+al);
		System.out.println();
		
	  Collections.sort(al,(e1,e2)-> e1.name.compareTo(e2.name));
	  System.out.println("array list names in ascending order :	"+al);
	  
	  Collections.sort(al,(o1,o2)->(o1.eno>o2.eno)?1:(o1.eno<o2.eno)?-1:0);
	  System.out.println("array list values in ascending order :	"+al);
		
	}

}

/*
 compare(Object o1,Object o2)
 return  -ve iff obj1 has to come before obj2
 return  +ve iff obj1 has to come After obj2
 return  0 iff obj1 and Obj2 equal
 
 COMPARABLE AND COMPARATOR SORTING
 
 based on ascending order of employee number
 (e1,e2)->(e1.eno>e2.eno)?1:(e1.eno<e2.eno)?-1:0;
 
 
 
 
 
 
 */
