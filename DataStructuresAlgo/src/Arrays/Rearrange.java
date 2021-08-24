package Arrays;
public class Rearrange {

	public static void main(String[] args) {
		int arr[] = { -1, -1, 6, 1, 9, 3, 2, -1, 4, -1 };
		int l = arr.length;
		int temp, i, j;
		for (i = 0; i < l; i++) {
			boolean flag = true;
			for (j = 0; j < l; j++) {
				if (i == arr[j]) {
					flag = false;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					break;
				}
			}
			if (flag) {
				
				temp = arr[i];
				arr[--j]=temp;
				arr[i] = -1;
			}
		}

		for (int k = 0; k < l; k++) {
			System.out.print(arr[k] + " ");
		}

	}

}
