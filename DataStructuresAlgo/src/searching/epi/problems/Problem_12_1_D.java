package searching.epi.problems;

public class Problem_12_1_D {

	/*
	 * Search in an array of sorted List of String to find the prefix p
	 */
	public static void main(String[] args) {
		String[] arr = {"abbcc", "bgui", "cutie", "doggie", "pingu", "zyan"};
		System.out.println(searchString(arr, "xy"));
		

	}
//compare to -1 for less , 0 for equal and 1 for greater
	private static int searchString(String[] arr, String target) {
		int start =0, end = arr.length-1, result =-1;
		while(start<=end) {
			int mid = start+(end-start)/2;
			String sub = arr[mid].length()>target.length()?arr[mid].substring(0, target.length()): arr[mid];
			int temp = sub.compareTo(target);
			if(temp==0) {
				result = mid;
				break;
			}else if(temp<0) {
				start = mid+1;
			}else {
				end = mid -1;
				
			}
		}
		return result;
	}

}
