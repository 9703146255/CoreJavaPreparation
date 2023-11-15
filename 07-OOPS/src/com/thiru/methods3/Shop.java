package com.thiru.methods3;

public class Shop {

	public static void main(String[] args) {
		System.out.println("********************************");
		Product pdct1=new Product();
		pdct1.takeInputs("Horlicks", 200);
		pdct1.printData();
		
		System.out.println("********************************");
		Product pdct2=new Product();
		pdct2.takeInputs("Shoes", 500);
		pdct2.printData();
		System.out.println("********************************");

	}

}
