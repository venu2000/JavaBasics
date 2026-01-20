package comflm.inclasstasksrough;

import java.util.Scanner;

public class StringTraversalwithNextedFor {

	public static void main(String[] args) {
		
//======================================================		
//		Enter String
//		VENU
//		V
//		VE
//		VEN
//		VENU
//		E
//		EN
//		ENU
//		N
//		NU
//		U
//		U
//======================================================
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.nextLine();
		
		StringTraversalwithNextedFor rs = new StringTraversalwithNextedFor();
	    System.out.println(rs.travString(s));	
		

}
	
	
	String travString(String s) {
		
		String trav ="";
		for(int i =0; i<=s.length()-1; i++) {
			System.out.println("-------");
			for(int j=i; j<=s.length()-1; j++) {
				
				 trav =s.substring(i, j+1);
				System.out.println(trav);
			}
		}
	
		return trav;


	
	}

}
