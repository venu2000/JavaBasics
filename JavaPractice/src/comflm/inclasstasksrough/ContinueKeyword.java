package comflm.inclasstasksrough;

public class ContinueKeyword {

	public static void main(String[] args) {
		
		for(int i =0; i<=30; i++) {
			
			// it skips factors of 5 -> 5,10,15 etc
			if(i%5==0) {
				continue;
			}
			System.out.println("i : " + i);
		}
	}

}
