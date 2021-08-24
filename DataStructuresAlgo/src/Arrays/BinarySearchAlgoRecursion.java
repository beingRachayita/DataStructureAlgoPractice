package Arrays;

public class BinarySearchAlgoRecursion {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int element = 8;
		search(arr, 0, arr.length - 1, element);

		int index = search(arr, 0, arr.length - 1, element);

		if (index == -1) {
			System.out.println("Element not found!");
		} else {
			System.out.println("Element: " + element + " is available at index: " + index);
		}

	}

	public static int search(int[] arr, int low, int high, int element) {
		int mid = -1;
		if (low > high) {
			return -1;
		}
		mid = (low + high) / 2;
		if (arr[mid] == element) {
			return mid;
		} else if (arr[mid] < element) {
			return search(arr, mid + 1, high, element);
		} else if (arr[mid] > element) {
			return search(arr, low, mid - 1, element);
		}
		return -1;

	}
}
