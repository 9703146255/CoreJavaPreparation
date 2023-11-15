package com.thiru.day7a.abstractclass;

public class Rectangle extends Shape{
	
	private double length,width;

	@Override
	public void input(double... x) {
		length = x[0];
		width = x[1];
		
	}

	@Override
	public void area() {
		double areaOfRect = length * width;
		System.out.println("Area of Rectangle is :"+areaOfRect);
		
	}

}
