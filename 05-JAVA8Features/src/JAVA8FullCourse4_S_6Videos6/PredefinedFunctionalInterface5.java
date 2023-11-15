package JAVA8FullCourse4_S_6Videos6;

import java.util.ArrayList;
import java.util.function.Predicate;

/*
 * From 1.8 version  inside interface
 * 
 * Without effecting implementation classes
 * if we want to add new methods to the interface(extending interface funtionality)===>default methods
 * to define general utility methods inside interface with static
 * sum(int a, int b)
 * {
 * sop
 * }
 * 
 * 
 * Pre-defined Funtional interfaces
 * ===============================
 * Predicate 
 * Funtion 
 * Consumer
 * Supplier
 * 
 * Two argument Funtional interfaces
 * =================================
 * BiPredicate 
 * BiFuntion
 * BiConsumer
 * 
 * Premitive Funtional Interfaces
 * ==============================
 * IntPredicate
 * IntFuntion
 * IntConsumer
 * 
 * 
 * public boolean test(Integer I)
 * i
 * {
 * if(I%2==0)
 * {
 * return true;
 * }
 * else
 * {
 * return false;
 * }
 *}
 * (Integer I) ->I%2==0
 * 
	
 * 
 * 
 */


//Write a predicate to check weather length of string is "ODD"





class Employee1
{

    String name;
    double salary;
    Employee1(String l_name,double l_salary)//new Employee(name,sal)
   {
	   this.name=l_name;
	   this.salary=l_salary;
   }
}


public class PredefinedFunctionalInterface5 {

	public static void main(String[] args) {
		
		ArrayList<Employee1> e=new ArrayList<>();
		e.add(new Employee1("Thirumalesh",10000));
		e.add(new Employee1("Charan",2000));
		e.add(new Employee1("Vinay",30000));
		e.add(new Employee1("Chandra",40000));
		e.add(new Employee1("chitra",50000));
		
		Predicate<Employee1> p=i->i.salary>30000;
		
		for(Employee1 e1:e)
		{
			if(p.test(e1))
			{
			System.out.println(e1.name+" : "+e1.salary);
			}
		}
		
	
	}

}
