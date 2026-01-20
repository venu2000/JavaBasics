package com.roughwork;

import java.util.Scanner;

public class Primenums {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		Primenums p = new Primenums();
		int res = p.limit(num);
       
	}
	
	
	boolean isPrime(int n) {
		
		for(int i =2; i<=Math.sqrt(n); i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
		
		
	}

	int limit(int num) {
		for(int i =2; i<num ; i++) {
			if(isPrime(i)) {
				System.out.println(i + " ");
			}
		}
		return num;
	}	

}

