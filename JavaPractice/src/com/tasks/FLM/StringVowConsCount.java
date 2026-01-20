package com.tasks.FLM;

import java.util.Scanner;

public class StringVowConsCount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Word");
		String s = sc.nextLine().toLowerCase();
		char Ord = 0;
		int countOfVowels =0;
		int countOfConsonents =0;
				
				for(int i =0; i<=s.length()-1; i++) {
				
					Ord = s.charAt(i);
					if(Ord == 'a'|| Ord == 'e' || Ord == 'i' ||
							 Ord == 'o' || Ord == 'u') {
						countOfVowels ++;
						
					}else {
						countOfConsonents++;
					}
				
				}System.out.println("Vowels --> "+ countOfVowels);
				System.out.println("Consonents --->" + countOfConsonents);

	}

}
