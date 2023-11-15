package no11com.thiru.inheritence2;

public class ShoppingItems {
	String name;
	int price;

	ShoppingItems(){}
	ShoppingItems(String name,int price)
	{
		this.name=name;
		this.price=price;
	}
    void printData()
    {
    	System.out.println(this.name);
    	System.out.println(this.price);
    }




}
