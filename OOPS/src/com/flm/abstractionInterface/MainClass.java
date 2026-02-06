package com.flm.abstractionInterface;

public class MainClass {
	
	public static void main(String[] args) {
		
		OnePlus oneplus = new OnePlus();
		
		oneplus.calling();
		oneplus.data();
		oneplus.SMS();
		
		oneplus.RAM();
		oneplus.ROM();
		oneplus.OS();
		
		System.out.println();
		System.out.println("----- Using Interface Reference -----");
		SmartPhoneAuthority sp = oneplus;
		sp.RAM();
		sp.ROM();
		sp.OS();
		
		
		
	}

}
