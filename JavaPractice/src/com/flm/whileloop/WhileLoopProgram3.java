package com.flm.whileloop;

import java.util.Scanner;

public class WhileLoopProgram3 {

	public static void main(String[] args) {
		
		//Rolling a Dice
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "";
	    int dice = (int) ((Math.random() * 6) + 1);
	    System.out.println(dice);
	    
		while(dice != 6) {
			
			System.out.println("Role again = " + dice);
			dice = (int) ((Math.random() * 6) + 1);
			
			
			System.out.println("Press Enter to Roll again");
			choice = sc.nextLine(); 
		
			
		}
		System.out.println( "Your Dice = " + dice + " Game Over");
		

	}

}
