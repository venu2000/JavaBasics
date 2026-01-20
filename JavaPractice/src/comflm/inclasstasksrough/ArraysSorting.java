package comflm.inclasstasksrough;

import java.util.Arrays;

public class ArraysSorting {

	public static void main(String[] args) {
		
		
		int arr[] = {3,1,56,23,73,69};
		
		//Ascending Order using Bubble sort
		for(int i =0; i<arr.length-1; i++) {
			for(int j=0;j<(arr.length-1)-i ; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
					
				}
			}
		}System.out.println(Arrays.toString(arr));

	}

}
