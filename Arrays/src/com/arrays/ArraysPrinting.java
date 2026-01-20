package com.arrays;

import java.util.Scanner;

public class ArraysPrinting {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i =0; i<arr.length; i++) {
			
			System.out.println("Enter" + i);
			arr[i] = sc.nextInt();
		}
		
		for(int j =0; j<arr.length; j++) {
			System.out.print(arr[j]);
		}

	}

}
