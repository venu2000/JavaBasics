package comflm.inclasstasksrough;

import java.util.Scanner;

public class DigitsInANumber {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int count = 0 ;
		while(num != 0) {
			
			//int number = num%10;
			//System.out.println(number);
			num = num/10;
			
			
			 count ++;
		
		}
		System.out.println("Digits in a number is --->" +count);
	}

}
