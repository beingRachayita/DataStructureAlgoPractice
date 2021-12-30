package searching.epi.problems;

import java.util.Arrays;

public class Problem12_1 {

	/**
	 * Given an array of sorted integers. Find the first occurrence of the element k.
	 * @param args
	 */
	
	public static void main(String[] args) {
		int[] arr = { -14, -10, 2, 108, 108, 243, 285, 285, 285, 401 };
		System.out.println(binarySearch(arr, 285));
		//System.out.println(Arrays.binarySearch(arr, 108));//built-in method
	}

	//My attempted.
	private static int binarySearchfirst(int[] arr, int target) {
		int start = 0, end = arr.length - 1, mid = -1;
		while (start <= end) {
			mid = start + (end - start) / 2;
			if (mid == 0 && arr[mid] == target) {
				return mid;
			} else if (arr[mid] == target && arr[mid - 1] < target) {
				return mid;
			} else if (arr[mid] == target && arr[mid - 1] == target) {
				int temp = start + ((mid - 1) - start) / 2;
				start = arr[temp] < target ? temp + 1 : temp;
				end = mid - 1;
			} else if (arr[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}
	
	//book solution
	private static int binarySearch(int[] arr, int target) {
		int start = 0, end = arr.length - 1, result = -1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				result= mid;
				end = mid-1;
			} else if (arr[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return result;
	}

}
