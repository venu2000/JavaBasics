package com.flm.whileloop;

public class ReverseANumber {

	public static void main(String[] args) {
		
		int num = 152620;
	    int digit = 0;
	    int rev = 0;
	  while(num!=0) {
		  
		  
		  digit = num%10;
		  
		  System.out.println(digit);
		  rev = (rev*10)  + digit;
		  num = num/10;
		  
	  }

	  System.out.println("rev ----> " + rev);
	}

}
