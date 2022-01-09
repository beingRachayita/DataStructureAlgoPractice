package Arrays;

public class FarthestFromZero {

	public static void main(String[] args) {
		//int[] arr = {-10, 3,4, 10};
		int[] arr = {1,2, 3,4, 6};
		System.out.println(farthestfromZero(arr));
	}

	private static int farthestfromZero(int[] arr) {
		int max =0;
		for(int i=0; i<arr.length; i++) {
			if(Math.abs(arr[i])>Math.abs(max)) {
				max = arr[i];
			}else if(Math.abs(arr[i])==Math.abs(max) && max>arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

}
