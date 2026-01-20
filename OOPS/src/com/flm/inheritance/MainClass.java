package com.flm.inheritance;

public class MainClass {

	public static void main(String[] args) {
		
		
		//Obj creating for DomAnimal As Dog
		DomesticAnimal dog = new DomesticAnimal();
		
		dog.name = "Dog";           //Animal Class Variable
		dog.age = 5;				//Animal Class Variable
		dog.breed = "Suzu";			//Animal Class Variable
		dog.colour = "White";		//Animal Class Variable
		dog.weight = 10;			//Animal Class Variable
		
		
		dog.canEat();                //Animal class Method
		dog.canSurvive();            //Animal class & LandAnimal Method, 
		                             //but,it will override only LandAnimal Method
		
		
		
		dog.canRun();                // LandAnimal Class Method
		dog.breath();                // LandAnimal Class Method
		
		
		
		dog.liveIn();                //DomesticAnimal Class Method
		dog.showDetails();           //DomesticAnimal Class Method    
		dog.sound();                 //DomesticAnimal Class Method
		
		
		//Obj creating for WildAnimal As tiger
		WildAnimal tiger = new WildAnimal();
		
		tiger.name = "Tiger";             //Animal Class Variable
		tiger.age = 17;				    //Animal Class Variable
		tiger.breed = "Bengal Tiger";			//Animal Class Variable
		tiger.colour = "Golden";		    //Animal Class Variable
		tiger.weight = 100;			    //Animal Class Variable
		
		
		tiger.canEat();                //Animal class Method
        tiger.canSurvive();            //Animal class & LandAnimal Method, 
		                               //but,it will take only LandAnimal Method
		
		tiger.canRun();                // LandAnimal Class Method
		tiger.breath();                // LandAnimal Class Method
		
		tiger.liveIn();                //WildAnimal Method
		tiger.hunt();                  //WildAnimal Method
		tiger.showDetails();		   //WildAnimal Method
		tiger.sound();                 //WildAnimal Method
		
		

		
		
	    
	     
	     
	    
	     
	     

	}
}
