package no22com.thiru.superkeyword3;

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
		super.printData();
		System.out.println(this.acType);
	}
	
	
	
}
