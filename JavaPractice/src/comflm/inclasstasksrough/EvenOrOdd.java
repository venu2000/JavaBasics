package comflm.inclasstasksrough;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		if(num % 2 ==0) {
			System.out.println("Even num");
		}else {
			System.out.println("Odd num");
		}
		

	}

}
