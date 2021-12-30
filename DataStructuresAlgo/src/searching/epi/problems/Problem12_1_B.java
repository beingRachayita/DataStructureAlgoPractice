package searching.epi.problems;

public class Problem12_1_B {
	
	/*Given an array where a[0]>=a[1] & a[n-2]<=a[n-1], find the index of local minimum.
	 * An array is called local minimum if it is less than or equal to it's neighbours.
	 * 	 */

	public static void main(String[] args) {
		int[] arr = { 108, 107, 99, 34,30, 45,14, 10, 10, 5};
		System.out.println(binarySearch(arr));

	}

	private static int binarySearch(int[] arr) {
		int start =1, end = arr.length-2; 
		while(start<=end) {
			int mid = start+(end-start)/2;
			if(arr[mid]<=arr[mid+1] && arr[mid]<=arr[mid-1]) {
				return mid;
			}else if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
				start = mid+1;
			}else {
				end = mid-1;
			}
		}
		
		return -1;
	}

}
