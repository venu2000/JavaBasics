package com.roughwork;

public class BreakKeyword {

	public static void main(String[] args) {
		// inner loop
		for(int i =1; i<=5; i++){
			System.out.println(" i--->"+i);
			for(int j =1; j<=5;j++) {
				System.out.println(" j :"+j);
				if(i==2&&j==2) {
					break;
				}
			}
			
		}

	}

}
