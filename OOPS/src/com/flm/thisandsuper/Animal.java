package com.flm.thisandsuper;

public class Animal {
	
	String name;
	String skin;
//	int age;
//	String breed;
	
 	Animal(){
 		System.out.println("Default animal constructor calling....");
		
	}
	Animal(String name,
	String skin)
	{
		System.out.println("paraAnimal constructor calling....");
		
		this.name = name;
		this.skin = skin;
		
		
	}
	
	
	void display() {
		System.out.println("name" + name + " " + "skin" + skin);
	}
	

}
