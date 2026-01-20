package com.roughwork;

public class ArraysMaxMin {

	public static void main(String[] args) {
	
		
		
		int[] arr = {22,54,60,70,87,78};
		
		int max = arr[0];
		int secMax = arr[0];
		int thrdMax = arr[0];
		
		for(int i =0; i<arr.length; i++) {
			if(arr[i] > max) {
				thrdMax = secMax;
				secMax = max;
				max = arr[i];
				
			}else if(arr[i]>secMax && arr[i]!=max) {
				
				secMax = arr[i];
				
				
		}

		}System.out.println(max);
		System.out.println(secMax);
	
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}else if(arr[i] > secMax && arr[i]!=max) {
				secMax = arr[i];
			}
		}System.out.println(max);
		System.out.println(secMax);
		
		
		for(int i =0; i<arr.length ; i++) {
			if(arr[i]>thrdMax && arr[i]!=secMax && arr[i]!=max) {
				thrdMax = arr[i];
			}
		}System.out.println("Third max " + thrdMax);
		
		
		
		
		
		
	}

}
