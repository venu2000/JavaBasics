package com.flm.abstraction;

public abstract class Car extends Vehical{
	
	// we cant create an Object for Abstract class
	int gears = 6;
	
	public abstract void start();     //abstract method
	public abstract void stop();      //abstract method
	
	public void gears() {             //concrete method, is not mandatory in 
		System.out.println("Gears should be -> " +gears ); //child class implementation
		                                                   //So abstract class is not fully abstraction
	}
	
	
	
}
