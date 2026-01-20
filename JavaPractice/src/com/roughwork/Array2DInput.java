package com.roughwork;

import java.util.Arrays;
import java.util.Scanner;

public class Array2DInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Rows");
		 int row = sc.nextInt();
	     int col = 0;
		 
		int[][] arr = new int[row][];
		
	for(int i =0;i<row; i++) {
		
		System.out.println("Enter Coloumn for R" + i);
		col = sc.nextInt();
	    arr[i]=new int[col];
	    
	
	}
		for(int i =0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length; j++) {
				
				System.out.println("R"+i+"C"+j);
				arr[i][j] = sc.nextInt();
			}
		}System.out.println(Arrays.deepToString(arr));

	}

}
