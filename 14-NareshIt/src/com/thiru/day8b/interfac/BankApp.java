package com.thiru.day8b.interfac;

interface Bank
{
	void deposit(double bal);
	void withdraw(double bal);
}

class Customer implements Bank
{
	private double balance = 10000;
	@Override
	public void deposit(double bal) {
		if(bal <= 0)
		{
			System.out.println("Amount cannot be deposited!!!");
		}
		else
		{
			this.balance = this.balance + bal;
		System.out.println("Balance after deposit "+bal+ "amount is"+this.balance);
		}
		
	}

	@Override
	public void withdraw(double bal) {
		if(bal > balance)	
		{
			System.out.println("Balance is less");
		}
		else
		{
			balance = balance - bal;
			System.out.println("Available balance after withdraw "+bal+ " amount is :"+balance);
		}
		
	}
	
}



public class BankApp {

	public static void main(String[] args) {
		Customer ram = new Customer();
		ram.deposit(25000);
		ram.withdraw(5000);
	}

}
