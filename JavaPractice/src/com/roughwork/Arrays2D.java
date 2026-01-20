package com.roughwork;

import java.util.Arrays;

public class Arrays2D {

	public static void main(String[] args) {
	
		int[][] arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
				};
		int array2D = 0;
		
		for(int i =0; i<arr.length; i++) {
			for(int j =0; j<arr.length; j++) {
				
				 array2D = arr[i][j];
				 System.out.print(array2D);
				
			}System.out.println();
		}
		

	}

}
