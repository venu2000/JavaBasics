package comflm.inclasstasksrough;

import java.util.Scanner;

public class CountOfEven {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int count = 0;
		
		for(int i=num ; i>=0; i--) {
			
			if(i == 0) {
				
			}
			else if(i % 2 == 0) {
				
				System.out.println("Even num  - > " + i);
				
			
			count ++;
			}else {
				System.out.println("Odd num   - > " + i);
			}
		} System.out.println("Even number count is :" +count);
	}

}
