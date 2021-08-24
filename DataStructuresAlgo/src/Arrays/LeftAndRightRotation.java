package Arrays;

public class LeftAndRightRotation {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		/*int[] result = leftRotation(arr, 2, arr.length);
		System.out.println("-- Left Rotation --");
		display(result);*/
		int[] result = rightRotation(arr, 2, arr.length);
		System.out.println("-- Right Rotation --");
		display(result);
	}

	public static int[] leftRotation(int[] arr, int d, int n) {
		int i, j, temp;
		for (i = 0; i < d; i++) {
			temp = arr[0];
			for (j = 1; j < n; j++) {
				arr[j - 1] = arr[j];
			}
			arr[j - 1] = temp;
		}
		return arr;

	}

	public static int[] rightRotation(int[] arr, int d, int n) {
		
		int i, j, temp;
		for (i = n-1; i>n-1-d; i--) {
			temp = arr[n-1];
			for (j = n-1; j> 0; j--) {
				arr[j] = arr[j-1];
			}
			arr[0] = temp;
		}
		return arr;
	}
	
	private static void display(int[] arr){
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
}

