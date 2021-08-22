package Arrays;

public class SearchRotatedArray {
	public static void main(String[] args) {
//		int[] arr = { 6, 9, 15, 25, 35, 50, 41,29, 23, 8 };
		// int[] arr = { 6,7,8,9,1, 2, 3, 4, 5};
		int[] arr = { 5, 6, 7, 3, 4 };
		int index = binarySearch(arr, 0, arr.length - 1, 1);

		if (index == -1) {
			System.out.println("Element not found");
		} else {
			System.out.println("The element in the array is: " + arr[index] + " present at index: " + index);
		}

	}

	public static int binarySearch(int[] arr, int low, int high, int element) {
		int mid = -1;
		if (low > high) {
			return -1;
		}
		mid = (low + high) / 2;

		if (element == arr[mid]) {
			return mid;
		}
		if (arr[low] <= arr[mid]) {
			if (element >= arr[low] && element <= arr[mid]) {
					return binarySearch(arr, low, mid - 1, element);
			}
					return binarySearch(arr, mid + 1, high, element);
			}
			if (element >= arr[mid] && element <= arr[high]) {
				return binarySearch(arr, mid + 1, high, element);
			}
			return binarySearch(arr, low, mid - 1, element);
		}
	
}
