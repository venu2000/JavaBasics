package com.roughwork;

public class thirdmax {

	public static void main(String[] args) {
	
		
		int[] arr = {20,30,15,75,89,26,35,78};
		
		int max = arr[0];
		int secmax = arr[0];
		int thmax = arr[0];
		
		
		for(int i = 0 ; i<arr.length; i++) {
			if(arr[i]>max) {
//				thmax = secmax;
				secmax = max;
				max = arr[i];
				
			}else if(arr[i]>secmax && arr[i]!=max){
				thmax = secmax;
				secmax = arr[i];
			
		    }else if(arr[i]>thmax && arr[i]!=secmax && arr[i]!=max) {
		    	thmax = arr[i];
			
		}

   
	}System.out.println(max);
	System.out.println(secmax);
	System.out.println(thmax);
}}