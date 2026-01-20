package com.roughwork;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysJagged {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	   System.out.println("Enter Rowes size");
		int rows = sc.nextInt();
		int cols=0;
		int[][] jarr = new int[rows][];
	
		//Reading  Different length of Cols for each ROW
		for(int i =0; i<rows; i++) {
			System.out.print("Enter number of columns for row " + i + ": ");
             cols = sc.nextInt();
			jarr[i] = new int [cols] ;
		}
		
		//Reading elements from User dynamically
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<jarr[i].length; j++) {
				System.out.println("R" + i + "C" + j);
				jarr[i][j] = sc.nextInt();
				
			}
			
		//Printing with ForEach Loop	
		}for(int[] js : jarr) {
			System.out.println(Arrays.toString(js));
		}
		

	}

}
