package no22com.thiru.superkeyword3;

public class Account {
	
	String name;
	int age;
	
	Account()
	{
	
	}
	Account(String name,int age)
	{
	this.name=name;
	this.age=age;
	}
	
     void printData(){
	
        System.out.println(this.name);
        System.out.println(this.age);
	}

}
