package com.thiru.day7.abstractclass;

abstract class Car
{
	int speed = 120;
    	public Car()
	{
		System.out.println("Car class Constructor!!!");
	}

	public void carDetails()
	{
		System.out.println("It has 4 wheels!!!!");
	}

	public abstract void run();
}

class Honda extends Car
{
	@Override
	public void run()
	{
		System.out.println("Honda Car is Running");
	}
}

public class IQ {

	public static void main(String[] args) {


		Car c = new Honda();
		System.out.println("Car speed is :"+c.speed);
		c.carDetails();
		c.run();

	}

}
