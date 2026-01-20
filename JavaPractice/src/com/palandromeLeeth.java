package com;

public class palandromeLeeth {
	
	class Solution {
	    public boolean isPalindrome(int x) {

	        String s = Integer.toString(x);
	        int count = 0;
	        for(int i = 0; i<s.length() ; i++) {
	        	if(s.charAt(i)!=s.charAt(s.length()-i)) {
	        		count ++ ;
	        		
	        	}
	        }if(count == 0) {
	        	return true;
	        }else {
	        	return false;
	        }
	        
	    }
	}

}
