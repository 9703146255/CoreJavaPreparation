package com.thiru.singleton;

public class MainSingletone {
	
	
	public static void main(String[] args) {
		
		Login l1=Login.getInstance();
		System.out.println(l1.hashCode());
		
		Login l2=Login.getInstance();
		System.out.println(l2.hashCode());
		
		
	}

}
