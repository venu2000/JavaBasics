package com.roughwork;

import java.util.Scanner;

public class Dice {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
		int dice = (int) ((Math.random() * 6) +1);
       String enter = "";
        System.out.println(dice);
		while(dice!=6) {
			
			System.out.println("Roll again" +dice);
			dice = (int) ((Math.random() * 6) +1);
			
			System.out.println("Enter to roll the dice");
			enter = sc.nextLine();
			
			
		}
		System.out.println(dice);
		System.out.println("Game Over");

	}

}
