package no11com.thiru.inheritence2;

public class MedicalItems extends ShoppingItems{

	String shopName;
	MedicalItems(){}
	MedicalItems(String name,int price,String shopName){
		this.name=name;
		this.price=price;
		this.shopName=shopName;
	}
	void printData()
	{
		System.out.println(this.name);
		System.out.println(this.price);
		System.out.println(this.shopName);
	}
	
	
	
	
	
	
}
