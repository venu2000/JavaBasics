package com.flm.inheritance;

public class LandAnimal extends Animal {

	static int countOfLegs = 4; // static Variable
	static String living = "Survive only on land";

	static void canRun() {

		System.out.println("Can Run with " + countOfLegs + "Legs");
	}
     
	@Override
	void canSurvive() {
		System.out.println(living); // Static Variable Accessed without
									// object in Native Class Method
	}

	void breath() {
		System.out.println("can breath on Land only");
	}

}
