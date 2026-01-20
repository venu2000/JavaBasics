package com.flm.inheritance;

public class WildAnimal extends LandAnimal {
	
	
	void liveIn() {
		System.out.println("Wild Animal Live in Forest");
	}
	
	void hunt() {
		System.out.println("Wild Animals Can hunt");
		
	}
	
	void sound() {
		System.out.println("can Roar");
		
	}
	
    void showDetails() {
		
		System.out.println("name -> " + name + "\n"
				          + "Age -> " + age + "\n"
				        + "Colour ->" + colour + "\n" 
				        + "weight ->"  + weight + "\n"
				        + "Breed  ->" + breed + "\n");
	}

}
