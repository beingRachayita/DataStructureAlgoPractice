package Arrays;

public class LargestSumContiguousSubarray {

	public static void main(String[] args) {
		int[] arr = {-2,-3,4,-1,-2,1,5,-3};
		System.out.println(maxsum(arr));
	}

	private static int maxsum(int[] arr) {
		int max_so_far = Integer.MIN_VALUE, max_end_here =0;
		for(int i =0; i<arr.length; i++) {
			max_end_here+=arr[i];
			if(max_end_here<0) {
				max_end_here =0;
			}
			if(max_so_far <max_end_here) {
				max_so_far = max_end_here;
			}
		}
		
		return max_so_far;
	}
}
