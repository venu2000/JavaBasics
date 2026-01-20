package com.roughwork;

public class BreakLable {

	public static void main(String[] args) {
		
		outer :
		for(int i =1; i<=5; i++){
			System.out.println(" i--->"+i);
			
			inner:
			for(int j =1; j<=5;j++) {
				
			//	System.out.println(" j :"+j);
			if(i==2&&j==2) {
				
					break;
				}System.out.println(" j :"+j);
			}
		}

	}

}
