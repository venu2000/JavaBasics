package com.arrays;

public class ArraysLargestSmallestNumber {

	public static void main(String[] args) {
		
		int[] arr = {20,30,55,43,22};
		int max = arr[0];
		int min = arr[0];
		
		
			
		//Maximum Number
		for(int i =0;i<arr.length; i++) {
			if(arr[i]>max) {	
				max = arr[i];		
			}	
		}
		
		
		//Minimum Number
		for(int j =0; j<arr.length; j++) {
			if(arr[j]<min) {
				min = arr[j];
			}
		}
		System.out.println("Largest number in an Array is : " +max);
		System.out.println("Smallest number in an Array is : " +min);
		
	}
	}


