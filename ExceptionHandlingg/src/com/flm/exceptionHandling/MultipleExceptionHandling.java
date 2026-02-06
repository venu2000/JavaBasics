package com.flm.exceptionHandling;

import java.util.Scanner;

public class MultipleExceptionHandling {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		
		try {
			for(int i =0;i<arr.length;i++) {
				System.out.println("Enter num index of " + i);
				arr[i] = sc.nextInt();
				
			}
		}catch (ArithmeticException e) {
	           System.out.println(e);
		}catch (IndexOutOfBoundsException e) {
			   System.out.println(e);
		}catch (Exception e) {
		       System.out.println("Some other Exception " + e);
		}finally {
			System.out.println("Thanks You.....");
			sc.close();
		}
	

	}
	
	
	

}
