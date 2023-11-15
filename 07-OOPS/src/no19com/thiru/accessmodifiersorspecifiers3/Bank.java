package no19com.thiru.accessmodifiersorspecifiers3;

public class Bank {

	public static void main(String[] args) {
      SavingsAccount svg=new SavingsAccount("charan",26, "Savings account");
      svg.printData();
      
      
      System.out.println();
      
      CurrentAccount ca=new CurrentAccount("thirumalesh", 27, "Current account");
      ca.printData();
	}

}
