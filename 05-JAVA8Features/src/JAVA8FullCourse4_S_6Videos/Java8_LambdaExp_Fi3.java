package JAVA8FullCourse4_S_6Videos;

import java.util.ArrayList;
import java.util.Collections;

/*
 * instance varialbles
 * constructor
 * to string
 
 compare(Object o1,Object o2)
 return  -ve iff obj1 has to come before obj2
 return  +ve iff obj1 has to come After obj2
 return  0 iff obj1 and Obj2 equal
 
 
 sort based on employee number==> ascending order 
 ============================================
 (e1,e2)->(e1.eno>e2.eno)?1:(e1.eno<e2.eno)?-1:0;
 
 
sort based on employee names==> ascending order 
 ============================================
 
 s1.compareTo(s2) ==> it will sort the names
 
 
 
 COMPARABLE AND COMPARATOR SORTING
 
 ANONYMOUS INNER CLASSES VS LAMBDA EXPRESSIONS
 IF EMPLOYEE CLASS HAS EMPLOYEE ID AND SALARY THAN HOW TO FIND SECOND HIGHEST SALARY BASED ON  EMPLOYEE ID
 

 
 */









class Employee2
{
	String name;
	int  eno;
	
	Employee2(String name,int eno)
	{
		this.name=name;
		this.eno=eno;
	}
	public String toString()
	{
		return eno +"  :  "+ name ;
	}
}


public class Java8_LambdaExp_Fi3 {
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
		//==================================================
	    //Collections.sort(al,C)
		
		//SORT THE ASCENDING ORDER BASED ON STRING TEXT/NAME
		//===================================================
		// Collections.sort(al,C)
		
		
//	  System.out.print("original arraylist"+al);
//		System.out.println();
//		
//	//-->SORTING BASED ON NAMES
//	  Collections.sort(al,(e1,e2)-> (e1.name).compareTo(e2.name));
//	  System.out.println("array list names in ascending order :	"+al);
//	  
//	  //SORTING BASED ON VALUES
//	  Collections.sort(al,(o1,o2)->(o1.eno>o2.eno)?1:(o1.eno<o2.eno)?-1:0);
//	  System.out.println("array list values in ascending order :	"+al);
		
   
		//based on emp no sorting
		System.out.println(al);
	Collections.sort(al,(o1,o2)->(o1.eno>o2.eno)?+1:(o1.eno<o2.eno)?-1:0);
  System.out.println(al);
  
//based on emp name sorting
  System.out.println();
  Collections.sort(al,(o1,o2)->(o1.name).compareTo(o2.name));
  System.out.println(al);
	
	
	
	
	
	
	
	
	
	
	
	
	}

}


