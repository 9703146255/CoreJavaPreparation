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
 ============================================
 IF EMPLOYEE CLASS HAS EMPLOYEE ID AND SALARY THAN HOW TO FIND SECOND HIGHEST SALARY BASED ON  EMPLOYEE ID
 
 
 

 
 
 
 */


class Employee1
{
	String name;
	int  eno;
	
	//PARAMETERAISED CONATRUCTOR
	Employee1(String name,int eno)
	{
		this.name=name;
		this.eno=eno;
	}
	//TO STRING METHOD
	public String toString()
	{
		return eno +"  :  "+ name ;
	}
}


public class Java8_LambdaExp_Fi2 {
	// I WANT TO SORT ALL EMPLOYEES BASED ON EMPLOYEE ID

	public static void main(String[] args) {
		//we are printed single employee data
	
		ArrayList<Employee1> al=new ArrayList<Employee1>();
		al.add(new Employee1("durga",101));
		al.add(new Employee1("charan",102));
		al.add(new Employee1("kiran",1088));
		al.add(new Employee1("vijay",104));
		al.add(new Employee1("manju",100));
		al.add(new Employee1("chennai",106));
		System.out.print(al);
		
		//SORT THE VALUES IN ASCENDING ORDER
	 //Collections.sort(al,c)
	  Collections.sort(al,(o1,o2)->(o1.eno>o2.eno)?1:(o1.eno<o2.eno)?-1:0);
	  System.out.println(al);
		
	}

}


