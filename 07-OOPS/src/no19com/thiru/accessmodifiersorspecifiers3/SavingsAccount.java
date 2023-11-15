package no19com.thiru.accessmodifiersorspecifiers3;

public class SavingsAccount extends Account{

	String acType;
	
	SavingsAccount(){}
	SavingsAccount(String name,int age,String acType)
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
