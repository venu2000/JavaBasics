package comflm.inclasstasksrough;

import java.util.Scanner;

public class PrintDigitsInANumber {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int count = 0 ;
		int number=0;
		String rev ="";
		int sum = 0;
		
		while(num != 0) {
			
			number = num%10;
	
			 
			sum = sum+number;
			System.out.println(number);
			rev = number + " " + rev;
			num = num/10;
		
			 count ++;
		
		}
		System.out.println("Sum of Digits is --->" +sum);
		System.out.println("Digits in a number is --->" +count);
		System.out.println("reverse : " + rev);
		

	}}
		
		