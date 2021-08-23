package Arrays;

public class SortArray1 {
	public static void main(String[] args) {
		int[] arr= {1,3,0,0,4,0,9};
		int low =0, mid =0, temp;
		while(low< arr.length) {
			if(arr[low]==0) {
				low++;
			}else if(arr[low]!=0 && arr[mid]==0) {
				temp = arr[mid];
				arr[mid]=arr[low];
				arr[low] = temp;
				mid++;
			}else {
				mid++;
				low++;
			}
		}
		
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}
	

}
