package com.tasks.FLM;

public class CountOfSubStringOccurs {

	public static void main(String[] args) {
		
//		ab
//		ac
//		ad
//		bc
//		bd
//		cd
//		------->6
		
		
		String s = "abcd";
		int count = 0;
		for(int i =0; i<=s.length()-1; i++) {
			for(int j=i+1; j<=s.length()-1; j++) {
				
//				String pair = s.substring(i,i+1) + s.substring(j,j+1);
//				count++;
//				System.out.println(pair);
				System.out.println(s.charAt(i) +""+ s.charAt(j) );
				count ++;
			
		//    System.out.println(s.substring(i, j));
			
			}System.out.println();
			
		}System.out.println("------->"+count);

	}

}
