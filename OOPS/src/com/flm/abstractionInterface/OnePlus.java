package com.flm.abstractionInterface;


//------------Mutiple Inheritance is Achieved through Interfaces----           
public class OnePlus implements TeleComAuthority, SmartPhoneAuthority {
//                              --------------------------------------   
	// we will give full implementation of abstract methods 
	//of interfaces 
	
	@Override
	public void RAM() {             
		System.out.println("RAM ->16GB DDR5X");
		
	}

	@Override                    
	public void OS() {
		System.out.println("OS installed is -> Android 16");
		
	}

	@Override
	public void ROM() {            
		System.out.println("ROM is  -> 526GB");
		
	}

	@Override
	public void calling() {
		System.out.println("Allowed 5G calling");
		
	}

	@Override
	public void data() {
		System.out.println("Allowed 5G ");
		
	}

	@Override
	public void SMS() {
		System.out.println("Allowed SMS ability");
		
	}

}
