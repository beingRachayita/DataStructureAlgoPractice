package searching.epi.problems;

public class Problem12_2 {

	/*
	 * Given a sorted array with distinct integers, find the element that has value equal to it's index
	 */
	public static void main(String[] args) {
		int[] arr= {-3,-2,-1,2,4,6,7,9};
		System.out.println(find(arr));

	}

	private static int find(int[] arr) {
		int start =0, end = arr.length-1;
		while(start<=end) {
			int mid = start+(end-start)/2;
			if(arr[mid]==mid) {
				return mid;
			}else if (arr[mid]>mid) {
				end=mid-1;
			}else {
				start = mid+1;
			}
		}
		return -1;
	}

}
