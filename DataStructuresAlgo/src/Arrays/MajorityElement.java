package Arrays;

public class MajorityElement {

/**
 * Majority Element is an element that occurs n/2 time in the list
 * This method will only work if the Numbers stored in the list is between 1 to n
 * n is the length of array.
 * @param args
 */
	public static void main(String[] args) {
		int[] a={2,3,3,2,2,5,2,3,1,2,2};
		int n = a.length;
		for(int i =0; i<n; i++){
			int temp = a[i]%n;
			a[temp-1]+=n;
		}
		int m = n/2;
		int index =0, max =0;
		for(int i=0; i<n; i++){
			int freq = a[i]/n;
			if(freq > m && freq>max){
				max = freq;
				index = i;
				/*System.out.println(i+1);
				break;*/
			}
		}
		System.out.println(index+1);
	}

}
