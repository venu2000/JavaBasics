package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array2DDynamicInput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rows size");
		int row = sc.nextInt();

		System.out.println("Enter coloumn size");
		int col = sc.nextInt();

		int[][] arr2d = new int[row][col];

		read2dArrays(row, col, arr2d, sc);
		print2dArray(arr2d);
		print2dArray2(arr2d);

	}

// ---METHOD START---READING 2D Array by USER INPUT VALUES -------------
	static int[][] read2dArrays(int row1, int col1, int arr2d[][], Scanner sc) {
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {

			 System.out.print("R" + i + "," + "C"+ j + "-->" );
				arr2d[i][j] = sc.nextInt();

			}
			System.out.println();
		    }

		    return arr2d;
	       }
// ---METHOD END--- method to READ 2D Array by USER INPUT VALUES -------------
	
	
	
// ---METHOD START---  PRINTING 2D ARRAY USING FOR EACH -------------	
	static int[][] print2dArray(int arr2d[][]) {

		for (int[] row : arr2d) {
			System.out.println(Arrays.toString(row));

		}
		return arr2d;
	    }
// ---METHOD END---  PRINTING 2D ARRAY USING FOR EACH -------------
	
	
// ---METHOD START---  PRINTING 2D ARRAY USING .deepToString inbuild method -------------	
	static int[][] print2dArray2(int arr2d[][]) {

		System.out.println("Printing using .deepToString inbuild method");
		System.out.println(Arrays.deepToString(arr2d));
		return arr2d;

	}
// ---METHOD END---  PRINTING 2D ARRAY USING .deepToString inbuild method -------------
}
