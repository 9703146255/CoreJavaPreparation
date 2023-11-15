package no11com.thiru.inheritence2;
/*
 1)CollegeMember
     Student
    Employee
College(main class)
2)ShoppingItem
   MedicalItem
   ElectronicItem
Shop(main class)
3)Account
   SavingsAccount
  CurrentAccount
Bank(main class)

 */
public class Shop {

	public static void main(String[] args) {

		ElectricalItems eit=new ElectricalItems("wire", 500, "thiru electornics");
		eit.printData();
		
		System.out.println();
		MedicalItems mit=new MedicalItems("Horlicks", 600, "PHARAMA EASY");
		mit.printData();
		
	}

}
