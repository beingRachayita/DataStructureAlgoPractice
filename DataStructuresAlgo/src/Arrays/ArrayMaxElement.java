package Arrays;

public class ArrayMaxElement {
	public static void main(String[] args) {
//		int[] arr = { 6, 9, 15, 25, 35, 50, 41,29, 23, 8 };
		int[] arr = {5,6,7,3,4 };
		int index = binarySearch(arr, 0, arr.length-1);
		
		if(index==-1) {
			System.out.println("Element not found");
		}else {
			System.out.println("The Maximum element in the array is: "+ arr[index]+" present at index: "+ index);
		}

	}

	public static int binarySearch(int[] arr, int low, int high) {
		int mid = -1;
		if (low == high) {
			return low;
		}
		if(high==low+1) {
			if(arr[low]>=arr[high]) {
				return low;
			}else {
				return high;
			}
		}
		mid = (low + high) / 2;
		if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
			return mid;
		} else if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) {
			return binarySearch(arr, mid, high);
		} else {
			return binarySearch(arr, low, mid);
		}
		
	}
}
