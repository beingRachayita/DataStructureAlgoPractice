package Arrays;

public class BinarySearchAlgo {
	public static void main(String[] args) {
		int[] arr={2,3,4,5,6,7,8,9,10};
		int element=1;
		
		int index = search(arr, arr.length, element);
		
		if(index == -1){
			System.out.println("Element not found!");
		}else {
			System.out.println("Element: "+element+ " is available at index: "+index );
		}
	}
	
	public static int search(int[] arr, int len, int element){
		int low = 0, high= len-1;
		int mid = (low+high)/2;
		int index=-1;
		for(; low<high; mid=(low+high)/2){
			if(arr[mid]==element){
				index = mid;
				return index;
			}else if(arr[mid]<element){
				low = mid+1;
			}else if(arr[mid]> element){
				high= mid-1;
			}
		}
		return index;
	}
}
