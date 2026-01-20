package comflm.inclasstasksrough;

import java.util.Scanner;

public class ReverseStringManual {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.next();

		ReverseStringManual rs = new ReverseStringManual();
		System.out.println(rs.revString(s));

	}

	String revString(String s) {
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {

			char temp = s.charAt(i);
			rev += temp;
		}
		return rev;

	}
}