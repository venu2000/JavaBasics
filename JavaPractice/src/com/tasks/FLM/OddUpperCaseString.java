package com.tasks.FLM;

import java.util.Scanner;

public class OddUpperCaseString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Word");
		String s = sc.nextLine().toLowerCase();
		String res = "";
		char Odd = 0;

		for (int i = 0; i <= s.length() - 1; i++) {

			char Ord = s.charAt(i);
			if (i % 2 == 0) {

				res = (res + Character.toUpperCase(Ord));

			} else {
				res = res + Character.toLowerCase(Ord);
			}
		}

		System.out.println(res);

	}

}
