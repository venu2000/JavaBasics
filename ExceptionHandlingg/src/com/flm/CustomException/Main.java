package com.flm.CustomException;

import java.io.PrintStream;

public class Main {

	 double balance = 500000;
	
	public static void main(String[] args)  {
			

		try {
			withdraw(4550000);
		} catch (InvalidAmountException e) {
		
			System.out.println(e.getMessage());
		}
	}
	
	static void withdraw(int WDAmount) throws InvalidAmountException {
		Main m = new Main();
		 System.out.println("Balance " +m.balance);
		if(WDAmount>m.balance) {
			
			 throw new InvalidAmountException("Enter Amount less than balance");
				
		}m.balance = m.balance - WDAmount;
		System.out.println("Withdrawed amount " + WDAmount);
		System.out.println("Remaining Balance " + m.balance);

	}
}
