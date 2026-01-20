package comflm.inclasstasksrough;

import java.util.Scanner;

public class PrimeNumbersUptoN {

	public static void main(String[] args) {
		
		
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
	
		primeNum(num);
	}
	
		
		static void primeNum(int num) {
		
	    for(int i = 2; i<num; i++) {
	    	
	    	 int count =0;
	    	for(int j=2; j<i; j++) {
	    		
	    		if(i%j==0) {
	    			count++;
	    				    		}
	    	}

	    	if(count==0) {
	    		System.out.print(i + " ");
	    	}
	    
	    }
	    
	    
		}}