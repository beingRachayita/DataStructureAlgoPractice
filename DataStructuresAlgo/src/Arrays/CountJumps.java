package Arrays;

public class CountJumps {

	public static void main(String[] args) {
		int[] arr= {1,3,5,8,9,2,6,7,6,8,9};
		int jumps = countJumps(arr);
		System.out.println("The no of jumps: "+ jumps);
	}
	
	public static int countJumps(int[] arr) {
		int a = arr[0];
		int b = arr[0];
		int jump =0;
		for(int i=0; i<arr.length; i++) {
			if(i==arr.length-1) {
				return jump;
			}
			a--;
			b--;
			if(arr[i]>b) {
				b = arr[i];
			}
			if(a==0) {
				jump++;
				a= b;
			}
		}
		return jump;
	}

}
