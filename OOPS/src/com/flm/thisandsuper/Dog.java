package com.flm.thisandsuper;

public class Dog extends Animal {
	
	
	Dog(){
	
		this("Huskt","brownnn");
		System.out.println("Default Dog constructor calling....");
	}
	
	Dog(String name, String skin){
		
		super(name, skin);
		System.out.println("para Dog constructor calling....");
	
	}
	

	   void display() {
		   super.display();
		   
		   System.out.println("name" + " " +name + "skin" + skin);
	   }
}
