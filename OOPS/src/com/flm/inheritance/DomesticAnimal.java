package com.flm.inheritance;

public class DomesticAnimal extends LandAnimal {
	
	
	
	void liveIn() {
		System.out.println("Animal Can Live with Human");
	}
	
	void sound() {
		System.out.println("Can Bark");
	}
	
	void showDetails() {
		
		System.out.println("name -> " + name + "\n"
				          + "Age -> " + age + "\n"
				        + "Colour ->" + colour + "\n" 
				        + "weight ->"  + weight + "\n"
				        + "Breed  ->" + breed + "\n");	
	}
}
