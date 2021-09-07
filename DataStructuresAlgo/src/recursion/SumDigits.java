package recursion;

import java.util.Objects;

public class SumDigits {

	/**
	 * Given a non-negative int n, return the sum of its digits recursively (no loops). 
	 * @param args
	 */
	public static void main(String[] args) {
		boolean success = true;

		success = success && Objects.equals(9, sumDigits(126));
		success = success && Objects.equals(13, sumDigits(49));
		success = success && Objects.equals(1, sumDigits(10));
		success = success && Objects.equals(3, sumDigits(12));
		success = success && Objects.equals(10, sumDigits(730));
		success = success && Objects.equals(4, sumDigits(1111));
		success = success && Objects.equals(0, sumDigits(0));
		
		if(success){
			System.out.println("All testcases Passed");
		}else{
			System.out.println("testcases failed");
		}
		
	}
	
	public static int sumDigits(int n) {
		  if(n==0){
		    return 0;
		  }
		  return n%10+sumDigits(n/10);
		}


}
