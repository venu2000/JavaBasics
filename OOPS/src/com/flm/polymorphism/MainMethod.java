package com.flm.polymorphism;

public class MainMethod {
	
	public static void main(String[] args) {
		
		
		Animal a1 = new Animal();       // reference: Animal, object: a1
		Animal a2 = new LandAnimal();
		Animal a3 = new DomesticAnimal();
		
		LandAnimal l1 = new LandAnimal();
		LandAnimal l2 = new DomesticAnimal();
		
	    DomesticAnimal d1 = new DomesticAnimal();
	    
	    a1.canEat();
	    a2.canEat();
	    a3.canEat();
	    
	    l1.canEat();
	    l2.canEat();
	    
	    d1.canEat();
	    
		
		
	}

}
