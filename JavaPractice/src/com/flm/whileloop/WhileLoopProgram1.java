package com.flm.whileloop;

import java.util.Scanner;

public class WhileLoopProgram1 {

	public static void main(String[] args) {
		
		//Q. Keep reading input until user types exit
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Text");
		String text = sc.next();
		
		while(!text.equalsIgnoreCase("exit")) {
			
		System.out.println("Enter Text again");
		     text = sc.next();
			
		}
		

	}

}
