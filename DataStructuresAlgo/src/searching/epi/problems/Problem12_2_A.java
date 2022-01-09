package searching.epi.problems;

public class Problem12_2_A {

	/*
	 * Given a sorted array with integers may contain duplicates, find the element
	 * that has value equal to it's index
	 */
	public static void main(String[] args) {
		int[] arr = { -1, -1, 2, 2, 4, 4, 7, 9 };
		System.out.println(find(arr, 0, arr.length-1));

	}

	/*
	 * Consider the arr[] = {-10, -5, 2, 2, 2, 3, 4, 7, 9, 12, 13}, arr[mid] = 3 If
	 * elements are not distinct, then we see arr[mid] < mid, we cannot conclude
	 * which side the fixed is on. It could be on left side or on the right side. We
	 * know for sure that since arr[5] = 3, arr[4] couldn’t be magic index because
	 * arr[4] must be less than or equal to arr[5] (the array is Sorted). So, the
	 * general pattern of our search would be:
	 * 
	 * 
	 * Left Side: start = start, end = min(arr[midIndex], midIndex-1) Right Side:
	 * start = max(arr[midIndex], midIndex+1), end = end
	 */

	private static int find(int[] arr, int start, int end) {
		if (start> end)
			return -1;

		int mid = start + (end - start) / 2;
		if (arr[mid] == mid) {
			return mid;
		}	
		int left = find(arr, start, Math.min(arr[mid], mid - 1));
		if (left >= 0)
			return left;
		return find(arr, Math.max(arr[mid], mid + 1), end);
	}

}
