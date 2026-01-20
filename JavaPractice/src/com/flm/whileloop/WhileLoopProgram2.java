package com.flm.whileloop;

import java.util.Scanner;

public class WhileLoopProgram2 {

	public static void main(String[] args) {
		
		// Q. Menu / Bank ATM
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Option");
		int option = sc.nextInt();
		
		  while (option != 4) {
			  
			  if(option ==1) {
	            System.out.println("\n1. Balance");}
			  else if(option ==2){
				  System.out.println("2. Deposit");
			  }
			  else if(option ==3){
				  System.out.println("3. Withdraw");
			  }
			  System.out.print("Choose option: ");

	            option = sc.nextInt();
	        }
		  
		  
	             System.out.println("Thank you!");
			  }
	           
	          
	          
	           
	    }
		
		


