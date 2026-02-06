package com.flm.abstraction;

//cannot perform Multiple Inheritance
public class Benz extends Car{

	@Override
	public void start() {
		System.out.println("Benz Car Started...");
			
	}

	@Override
	public void stop() {
		System.out.println("Benz Car stopped..");
	
	}
	public void fuelType() {               //native method
		System.out.println("Petrol");
	}

	@Override
	void wheels() {
		System.out.println("4 wheels");
		
	}

	



}
