package com.roughwork;

import java.util.Scanner;

public class NoOfDigitsinNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int num = sc.nextInt();
		int count = 0;
		int revnum=0;
		int sum = 0;
		while(num!=0) {
			

		   revnum = num%10;
			
			sum = sum + revnum;
			num = num/10;
			System.out.println(revnum);
			
			 count ++;
		}
		
		System.out.println("Count ->" +count);
		System.out.println("Additon -->" + sum);
		

	}

}
