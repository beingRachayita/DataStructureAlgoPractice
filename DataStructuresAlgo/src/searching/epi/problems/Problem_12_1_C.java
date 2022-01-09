package searching.epi.problems;

public class Problem_12_1_C {

	/*
	 * Given a sorted array containing duplicates, find the first occurance and last occurance of the given element
	 */
	public static void main(String[] args) {
		int[] arr = {1,2,2,4,4,4,7,11,11,13};
		//int[] result = searchIndex(arr, 3);
		int[] result = searchFirstAndLast(arr, 11);
		System.out.println(result[0]+" "+ result[1]);

	}

	private static int[] searchIndex(int[] arr, int target) {
		int start =0, end = arr.length-1, first =-1, last =-1;
		int temp = search(arr, target, start, end);
		if(temp==-1) {
			return new int[] {first,last};
		}
		if(arr[temp]==target) {
			first = search(arr, target, start, temp-1);
			last = search(arr, target, temp+1, end);
		}
		if(first == -1) {
			first = temp;
		}
		if(last ==-1) {
			last = temp;
		}
		
		return new int[] {first,last};
	}

	
	private static int search(int[] arr, int target, int start, int end) {
		if(start>end) {
			return -1;
		}
		int mid = start+(end-start)/2;
		if(arr[mid]==target) {
			return mid;
		}else if(arr[mid]<target) {
			return search(arr, target, mid+1, end);
		}else {
			return search(arr, target, start, mid-1);
		}
	}


//another Approach
	
	public static int[] searchFirstAndLast(int[] arr, int target) {
		int first =-1, last =-1;
		first = searchFirst(arr, target);
		last = searchlast(arr, target);
		if(first ==-1)
			first = last;
		if(last ==-1)
			last = first;
		return new int[] {first, last};
	}
	
	private static int searchFirst(int[] arr, int target) {
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

	
	private static int searchlast(int[] arr, int target) {
		int start = 0, end = arr.length - 1, result = -1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				result= mid;
				start = mid+1;
			} else if (arr[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return result;
	}
	
	
}
