package com.roughwork;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Num");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd Num");
		int num2 = sc.nextInt();

		limitOf(num1, num2);

	}
	static boolean isPrime(int n) {

		if(n<=1) {
			return false;
		}
		
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
	    }
		}   
		return true;
	    }

	static void limitOf(int num1, int num2) {
		
		
		System.out.println("Prime Numbers between " + num1 + " to " + num2 + " -->");

		for (int i = num1; i <= num2; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");

			}

		}

	}

}
