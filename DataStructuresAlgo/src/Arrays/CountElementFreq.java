package Arrays;

public class CountElementFreq {
	
	/**
	 * This method is to find the freq of all the elements in an array
	 * The array contains elements from 1 to n
	 * n is the length of array.
	 * @param args
	 */

	public static void main(String[] args) {
		int[] a = { 5, 2, 7, 7, 5, 5, 2 };
		int n = a.length;
		for (int i = 0; i < n; i++) {
			if (a[i] > n) {
				int temp = a[i] % n;
				a[temp - 1] += n;
			} else {
				a[a[i] - 1] += n;
			}
		}

		for (int i = 0; i < n; i++) {
			int freq = 0;
			freq = a[i] / n;
			System.out.println(i + 1 + "->" + freq);

		}
	}

}
