package com.roughwork;

public class Palandrom {

	public static void main(String[] args) {
		
		String s = "malayalam";
		int count = 0;
		
		for(int i =0; i<s.length()/2; i++) {
			if(s.charAt(i) != s.charAt(s.length()-i-1)) {
				
				count++;
			
			}
				
			}if(count == 0) {
				System.out.println("Its a palandrom");
			}else {
				System.out.println("its not a palandrom");
			}
		}

	}


