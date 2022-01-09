package Arrays;

public class findMid {

	public static void main(String[] args) {
		int[] arr= {2,7,4,6,5,8,10,11,9,20};
		//int[] arr= {6, 2, 5,4,7,9,11,8,10};
		int[] left = new int[arr.length];
		left[0] =Integer.MIN_VALUE;
		//System.out.println(Integer.MAX_VALUE+" "+Integer.MIN_VALUE);
		for(int i =1; i<arr.length;i++) {
			left[i]=Math.max(left[i-1], arr[i-1]);
		}
		
		int[] right = new int[arr.length];
		right[arr.length-1] = Integer.MAX_VALUE;
		for(int i =arr.length-2; i>=0;i--) {
			right[i]=Math.min(right[i+1], arr[i+1]);
		}
		
		for(int i: right) {
			System.out.println(i);
		}
		for(int i = arr.length-1; i>=0; i--) {
			//right = Math.min(right, arr[i]);
			if(left[i]<arr[i] && right[i]>arr[i]) {
				System.out.println(arr[i] +" at index: "+ i);
				break;
			}
			
			
		}
		System.out.println("Not found: -1");

	}

}
