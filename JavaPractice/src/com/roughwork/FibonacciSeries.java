package com.roughwork;

public class FibonacciSeries {

	public static void main(String[] args) {
	
		
		int a = 0;
		int b= 1;
		int temp = 0;
		int n = 10;
		
		for(int i =0; i<=n ; i++) {
			
			 temp = a;
			a = a+b;
			b=temp;
			
			System.out.print(temp + " ");
		}
	    

	}

}
