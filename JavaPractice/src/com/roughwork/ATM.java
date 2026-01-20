package com.roughwork;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Options");
		int input = sc.nextInt();
		
		while(input != 4) {
			
			if(input == 1) {
				System.out.println("1. Deposite");
			}else if(input == 2) {
				System.out.println("2. withdraw");
			}else if(input == 3) {
				System.out.println("History");
			}else {
				System.out.println("Invaid number");
			}
			System.out.println("Enter Options again");
			 input = sc.nextInt();
		
		}
	    System.out.println("You are Exit");

	}       
}

