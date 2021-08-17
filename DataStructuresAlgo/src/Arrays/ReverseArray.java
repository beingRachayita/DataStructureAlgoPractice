package Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = {1, 3, 78, 12, 123, 6, 0, 3, 2};
		int[] result = reverseArrayrec(arr, 0);
		
		for(int i:result){
			System.out.print(i+ " ");
		}
	}
	
	public static int[] reverseArray(int[] arr){
		int n = arr.length;
		for(int i =0; i<n/2; i++){
			int temp = arr[i];
			arr[i] = arr[n-i-1];
			arr[n-i-1] = temp;
		}
		return arr;
		
	}
	
	public static int[] reverseArrayrec (int[] arr, int index){
		if(index == arr.length/2){
			return arr;
		}else{
			int temp = arr[index];
			arr[index]= arr[arr.length-1-index];
			arr[arr.length-1-index]= temp;
			reverseArrayrec(arr, index+1);
		}
		return arr;
	}
}
