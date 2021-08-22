package Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr = {8, 4, 3,12, 25, 6, 13, 10};
		mergeSort(arr, 0, arr.length-1);
		
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}
	
	//define merge method
	public static void merge(int[] arr, int low, int mid, int high) {
		int[] result= new int[high+1];
		int i =low,k=low, j = mid+1;
		//compare two sub arrays
		while(i<=mid && j<=high) {
			if(arr[i]<=arr[j]){
				result[k++]=arr[i++];
			}else {
				result[k++]= arr[j++];
			}
		}
		//insert the remaining sub array
		while(i<=mid) {
			result[k++]=arr[i++];
		}
		while(j<=high) {
			result[k++]=arr[j++];
		}
		//updating the actual array
		for(i=low; i<=high; i++) {
			arr[i]=result[i];
		}
	}
	
	//define merge sort method
	public static void mergeSort(int[] arr, int low, int high) {
		if(low==high) {
			return;
		}
		int mid = (low+high)/2;
		
		mergeSort(arr, low, mid);
		
		mergeSort(arr, mid+1, high);
		
		merge(arr, low, mid, high);
	}
}
