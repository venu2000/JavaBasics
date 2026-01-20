package com.flm.constructor;

public class Dog extends LandAnimal {
	
	String breed;
	
	Dog(){
     this("Sizu");
		
	}
	
	Dog(String breed){
		this.breed = breed;
		System.out.println("breed " + this.breed);
	}
	
	
	
}
