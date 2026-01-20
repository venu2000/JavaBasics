package com.tasks.FLM;

import java.util.Scanner;

public class TaskTernaruOperator {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks");
		int marks = sc.nextInt();
		
	String result = 	(marks>=90 && marks <= 100) ? "Grade A" 
			           :(marks>=80 && marks <= 89) ? "Grade B " 
			           :(marks>=70 && marks <= 79) ? "Grade C"
			           :(marks>=50 && marks <= 69) ? "Grade D"
			           :(marks>=0  && marks <= 49) ? "fails"
	     			   :(marks<=0) ? "Invalid marks" : "Invalid marks"; 
	
	System.out.println(result);
 		
						
		
	}

}
