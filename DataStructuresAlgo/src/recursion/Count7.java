
package recursion;

import java.util.Objects;

public class Count7 {

	/**
	 * Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2
	 * @param args
	 */
	public static void main(String[] args) {
		boolean success = true;

		success = success && Objects.equals(2, count7(717));
		success = success && Objects.equals(1, count7(7));
		success = success && Objects.equals(0, count7(123));
		success = success && Objects.equals(2, count7(77));
		success = success && Objects.equals(1, count7(7123));
		success = success && Objects.equals(3, count7(427890787));
		
		if(success){
			System.out.println("All testcases Passed");
		}else{
			System.out.println("testcases failed");
		}
		
	}
	
	public static int count7(int n) {
		  if(n==0){
		    return 0;
		  }
		  if(n%10==7){
		    return 1+count7(n/10);
		  }else{
		    return count7(n/10);
		  }
		}


}
