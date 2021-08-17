package Arrays;

public class ArrayRotation {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int[] result = rotate(arr, 2, arr.length);
		for (int i : result) {
			System.out.print(i+" ");
		}
	}

	/**
	 * This function would rotate the array with d
	 * 
	 * @param arr:
	 *            Array d: number of rotation n: the size of Array
	 */

	public static int[] rotate(int[] arr, int d, int n) {
		int i, j, temp;
		for (i = 0; i < d; i++) {
			temp = arr[0];
			for (j = 1; j < n; j++) {
				arr[j - 1] = arr[j];
			}
			arr[j - 1] = temp;
		}
		return arr;
	}

}
