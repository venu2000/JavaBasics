package com.roughwork;

import java.util.Arrays;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class ArrayReverse {

	public static void main(String[] args) {

		int[] arr = { 2, 5, 10, 67, 1, 23, 46 };
		int[] revarr = new int[arr.length];

		int j = 0;

		for (int i = arr.length - 1; i >= 0; i--) {

			int temp = arr[i];

			revarr[j] = temp;
			j++;

		} // System.out.println(Arrays.toString(revarr));

	//	System.out.println("Reverse Arrays");
	//	System.out.println(Arrays.toString(revArray(arr)));

	//	System.out.println("Sorted Array");
	//	System.out.println(Arrays.toString(sortArray(arr)));

	//	maxArray(sortArray(revarr));
		revArray3(arr);

	}

	static int[] revArray(int[] arr) {

		int start = 0;
		int end = arr.length - 1;
		while (start < end) {

			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;

		}
		return arr;
	}

	static int[] sortArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] < arr[j]) {

					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;

				}

			}
		}
		return revArray(arr);

	}

	static void maxArray(int[] arr) {

		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {

				max = arr[i];

			}
		}
		System.out.println(max);

	}
	
	static void revArray3(int[]arr) {
		
		
		for(int i = 0; i<arr.length/2; i++) {
			
			
			int temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp;
		
		}System.out.println(Arrays.toString(arr));
		
		
		
		
		
	}
}
