package comflm.inclasstasksrough;

public class ArrayReverse {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };

		int[] arrr = revArray2(arr);
		for (int i : arrr) {
			System.out.println(i);

		}

	}

	static int[] reverse(int[] arr) {
		int[] reverseArray = new int[arr.length];
		int j = 0;
		for (int i = arr.length - 1; i >= 0; i--) {

			int temp = arr[i];
			reverseArray[j] = temp;
			j++;

		}
		return reverseArray;
	}

	static int[] revArray2(int[] arr) {

		int starting = 0;
		int ending = arr.length - 1;

		while (starting < arr.length / 2) {
			int temp = arr[starting];
			arr[starting] = arr[ending];
			arr[ending] = temp;
			starting++;
			ending--;

		}
		return arr;

	}

}
