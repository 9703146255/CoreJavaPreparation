package no09com.thiru.thiskeyword3;
/*
 3.Create "Product" class
      --instance fields
         name,price
      --Methods
         -takeInputs
         -printData
Create a main class "Shop"
        -Create Product object
        -call methods

 */
public class Product {

	String pName;
	double pPrice;
	
	Product(){}
	Product(String pName, double pPrice )
	{
		this.pName=pName;
		this.pPrice=pPrice;
	}
	void printData()
	{
		System.out.println(this.pName);
		System.out.println(this.pPrice);
		
	}
	
	
}
