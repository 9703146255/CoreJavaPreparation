package com.thiru.day7a.abstractclass;

public class Circle extends Shape{
	private double radius;
	 private final double PI = 3.14;

	@Override
	public void input(double... x) {
		radius = x[0];
		
	}

	@Override
	public void area() {
		double areaOfCircle = PI * radius * radius;
		System.out.println("Area of Circle is :"+areaOfCircle);
		
	}

}
