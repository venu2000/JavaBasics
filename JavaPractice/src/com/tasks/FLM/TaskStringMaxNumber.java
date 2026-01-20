package com.tasks.FLM;

public class TaskStringMaxNumber {

	public static void main(String[] args) {
	
	
		
		String s = "12321";
		
		maxNumberInString(s);
		
		
		
		
	}
	
	static void maxNumberInString(String s) {
		char max = 0;
		for(int i =0; i<s.length(); i++) {
			//System.out.println(s.charAt(i));
			if(s.charAt(i)> max) {
				
				max = s.charAt(i);
			}
			
		}System.out.println(max);
}
}