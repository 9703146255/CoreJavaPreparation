package com.thiru.day9c.interfac.defaultmethod2;

public interface HotDrink {
	void prepare();

	default void expressPrepare()     //possible from jdk 1.8 
	{
        System.out.println("Preparing with premium");
	}
}
