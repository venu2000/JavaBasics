package com.roughwork;

import java.util.Scanner;

public class SumOfSquareOfNum {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  1st number");
		int num1 = sc.nextInt();
		System.out.println("Enter  2nd number");
		int num2 = sc.nextInt();
		
		SumOfSquareOfNum sum = new SumOfSquareOfNum();
		int res = sum.sumOfSquare(num1, num2);
		System.out.println(res);
		

		}
	
	int squareOfNum(int a) {
		
		int sq = (int) Math.pow(a, 2);
		return sq;
		
	}
	
	int sumOfSquare(int b, int c) {
		
		int num1 = squareOfNum(b);
		int num2 = squareOfNum(c);
				return num1+num2;
	}

}
