package com.thiru.day8c.interfac;

public class Main {

	public static void main(String[] args) {
Restaurant rr = new Restaurant();
		
		rr.createObject(new Tea());
		rr.createObject(new Coffee());
		rr.createObject(new Horlicks());
		rr.createObject(new Boost());

	}

}
