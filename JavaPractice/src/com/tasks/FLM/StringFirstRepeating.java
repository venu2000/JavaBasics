package com.tasks.FLM;

public class StringFirstRepeating {

	public static void main(String[] args) {
		
		String s = "appleball";
		int count = 0;
		for(int i =0 ; i<s.length() ; i++) {
			
			for(int j= 0; j<i; j++) {
				if(s.charAt(i)==s.charAt(j)) {
					
					System.out.println(s.charAt(i));
					
					break; // remove break to get repeate chars 
				}
			}

		}	for(int i =0 ; i<s.length()-1 ; i++) {
			for(int j = i+1 ; j<s.length()-1 ; j++) {
				
				if(s.charAt(i) == s.charAt(j)) {
					
					System.out.println(s.charAt(i));
					break;
				}
			}
		}

	}

}
