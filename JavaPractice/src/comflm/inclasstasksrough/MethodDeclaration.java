package comflm.inclasstasksrough;

import java.util.Scanner;

public class MethodDeclaration {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number");
		int b = sc.nextInt();
		
	     int num1 = (int) squareOfnum(a);
	    		// System.out.println(num1);
	    		 
	    int num2 = (int) squareOfnum(b);
	 //   System.out.println(num2);
	    
	    double sumofsqrr = sumOfSquareOfNum(num1, num2);
	    System.out.println(sumofsqrr);
			
		}
	
	static double squareOfnum(int c) {
		double squareOfNumber = (int) Math.pow(c, 2);
		return squareOfNumber;
		
		
	}
	
	static double sumOfSquareOfNum(int a, int b) {
		double additionOfSqr = a+b;
		return additionOfSqr;
		
	}

}
