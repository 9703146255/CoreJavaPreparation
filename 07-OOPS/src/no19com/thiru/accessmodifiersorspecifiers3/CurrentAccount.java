package no19com.thiru.accessmodifiersorspecifiers3;

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
		super.printData();
		System.out.println(this.acType);
	}
	
	

}
