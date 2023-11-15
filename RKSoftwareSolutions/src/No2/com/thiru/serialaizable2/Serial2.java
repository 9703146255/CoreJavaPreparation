package No2.com.thiru.serialaizable2;

import java.io.Serializable;

public class Serial2 implements Serializable{
	private static final long serialVersionUID = 1L;
	transient int a;
	static int b;
	String name;
	int age;
	
	// parameteraized constructor
	public Serial2(String name, int age, int a, int b)
	{
	this.name = name;
	this.age = age;
	this.a = a;
	this.b = b;
}}
