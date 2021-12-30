package searching.epi.problems;

public class Problem12_1_A {
	
	/*Given a sorted array, find the index of first occurrence of an element greater than an the target
	 * 	 */

	public static void main(String[] args) {
		int[] arr = { -14, -10, 2, 108, 108, 243, 285, 285, 285, 401 };
		System.out.println(binarySearch(arr, -13));

	}

	private static int binarySearch(int[] arr, int target) {
		int start =0, end = arr.length-1, result=-1;
		while(start<=end) {
			int mid = start+(end-start)/2;
			if(arr[mid]>target) {
				result = mid;
				end = mid-1;
			}else {
				start = mid+1;
			}
		}
		
		return result;
	}

}
