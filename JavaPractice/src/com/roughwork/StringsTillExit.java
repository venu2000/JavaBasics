package com.roughwork;

import java.util.Scanner;

public class StringsTillExit {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter word");
		
		String s = sc.nextLine();
		
		while(!s.equalsIgnoreCase("exit")) {
			
			System.out.println("Enter word again");
			
		     s= sc.nextLine();
			System.out.println(s);
			
			
		}System.out.println("---------You are Exited--------");
		
	}

}
