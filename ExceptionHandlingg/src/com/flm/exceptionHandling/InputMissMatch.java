package com.flm.exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMissMatch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		try {
	    System.out.println("Enter Your Phonenumber");
		int phoneNumber = sc.nextInt();
		System.out.println(phoneNumber);
//		}
//		catch (Exception e) {
			System.out.println("Enter Valid Phone Number again");
//		}
	
	}

}
