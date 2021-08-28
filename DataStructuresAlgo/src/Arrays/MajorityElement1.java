package Arrays;

public class MajorityElement1 {
	
	/**
	 * The Majority element appears more than n/2 times. 
	 * If that is the case the majority element count will be >0 at the end of the loop.
	 * @param args
	 */

	public static void main(String[] args) {
		int[] arr= {2,3,3,2,2,5,2,3,1,2,2};
		int majority = arr[0];
		int count =1;
		
		for(int i=1; i<arr.length;i++) {
			if(majority==arr[i]) {
				count++;
			}else {
				count--;
			}
			if(count==0) {
				majority=arr[i];
				count=1;
			}
		}
		
		System.out.println(majority);

	}

}
