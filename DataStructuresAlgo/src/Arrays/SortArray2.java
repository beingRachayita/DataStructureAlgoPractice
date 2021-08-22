package Arrays;

public class SortArray2 {
	public static void main(String[] args) {
		int[] arr= {2,1, 1, 0,1,2,1,2, 0,0,0,1};
		int low =0, mid =0, high = arr.length-1, temp;
		while(mid<=high) {
			if(arr[mid]==2) {
				temp = arr[mid];
				arr[mid]= arr[high];
				arr[high]= temp;
				high--;
			}else if(arr[mid]==0) {
				temp = arr[mid];
				arr[mid]= arr[low];
				arr[low]= temp;
				low++;
				mid++;
			}else {
				mid++;
			}
		}
		
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}
	

}
