package com.roughwork;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		
		
		int [] arr = {22,67,59,55,32,56,45,31};
		
		for(int i =0; i<arr.length;i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i]<arr[j] ){
					
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;

					
				}
			}
		}System.out.println(Arrays.toString(arr));

	}

}
