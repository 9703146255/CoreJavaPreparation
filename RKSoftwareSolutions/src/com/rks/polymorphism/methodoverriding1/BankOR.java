package com.rks.polymorphism.methodoverriding1;

class Bank
{
	public int getRateOfInterest()
	{
		return 0;
	}
}

class SBI extends Bank
{
	public int getRateOfInterest()
	{
		return 1;
	}
}

class ICICI extends Bank
{
	public int getRateOfInterest()
	{
		return 2;
	}
}

class CANARA extends Bank
{
	public int getRateOfInterest()
	{
		return 3;
	}
}






public class BankOR 
{
  public static void main(String[] args) 
  {
	Bank b1=new ICICI();
	Bank b2=new CANARA();
	Bank b3=new SBI();
	
	System.out.println(b3.getRateOfInterest());
	System.out.println(b1.getRateOfInterest());
	System.out.println(b2.getRateOfInterest());
	
	
  }
}
