package no12com.thiru.inheritence3;

public class CurrentAccount extends Account{
	
	String acType;
	
	CurrentAccount(){}
	CurrentAccount(String name,int age,String acType)
	{
		this.name=name;
		this.age=age;
		this.acType=acType;
	}
	void printData()
	{
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.acType);
	}
	
	

}
