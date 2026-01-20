package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysMaxMinNumbers {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int size = sc.nextInt();
		int [] arr = new int[size];
		
		
		for(int i =0; i<arr.length; i++) {
			
			System.out.println("enter intereger of " + i + "index of array");
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
		int max = arr[0];
		int min = arr[0];
		int secmax = arr[0];
		int secmin = arr[0];
		
		for(int j = 0; j<arr.length; j++) {
			
			if(arr[j] > max) {
				
				max = arr[j];
				
			}
		}System.out.println("Maximum number in arrays is ---> " + max);
		
		
//   -----------   code to find Second max number --------------		
		for(int i =0; i<arr.length ; i++) {
			if(arr[i]>secmax && arr[i]!=max) {
				secmax = arr[i];
			}
		}System.out.println("Second max " + secmax);
//   -----------   code to find Second max number --------------		
		

		
// ----------   code to find mininum number -------------		
		for(int k = 0; k<arr.length; k++) {
			if(arr[k] < min) {
				
				min = arr[k];
				
			}
			
		}System.out.println("Minimu, number in arrays is ---> " + min);
		

// ------- code to find 2nd minimum number in Array -------
		for(int k = 0; k<arr.length; k++) {
			if(arr[k] < secmin && arr[k]!=min) {
				
				secmin = arr[k];
				
			}
			
		}System.out.println("2nd Minimu, number in arrays is ---> " + secmin);
		
		
		
	}

}
