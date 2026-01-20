package comflm.inclasstasksrough;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		primeNum(num);
	}
	
	
	   		
		static void primeNum(int num) {
			
	    int count =0;
	    
		for(int i =2; i<num; i++) {
			if(num % i == 0) {
			//	System.out.println(i);
				count ++; 
			}
		}
		
	//	System.out.println(count);
		
		if(count == 0) {
			System.out.println("It is Prime");
		}else {
			System.out.println("Non Prime");
		}
		
		
		}

	}

