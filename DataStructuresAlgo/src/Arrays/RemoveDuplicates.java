package Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] arr = {1,2,2,3,4,4,4,5,5};
		int len = removeDuplicates(arr);
		for(int i=0; i<len; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static int removeDuplicates(int[] arr) {
		int j =0;
		int num = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>num) {
				num = arr[i];
				j++;
				arr[j]=num;
			}
		}
		for(int i=j; i<arr.length;i++) {
			arr[i]=0;
		}
		return j+1;
	}

}
