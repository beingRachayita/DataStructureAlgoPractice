package recursion;

import java.util.Objects;

public class NumberPalindrome {

	public static void main(String[] args) {
		boolean success = true;

		success = success && Objects.equals(false, isPalindrome(1234));
		success = success && Objects.equals(true, isPalindrome(1));
		success = success && Objects.equals(false, isPalindrome(10));
		success = success && Objects.equals(true, isPalindrome(2002));
		success = success && Objects.equals(true, isPalindrome(12321));
		//success = success && Objects.equals(true, isPalindrome(" "));

		if (success) {
			System.out.println("testcases passed");
		} else {
			System.out.println("testcases Failed");
		}	// TODO Auto-generated method stub

	}

	public static boolean isPalindrome(int number) {
		if(number<10) {
			return true;
		}
		int revNum = rev(number, 0);
		if(revNum == number) {
			return true;
		}
		return false;
	}

	public static int rev(int number, int temp) {
		if(number ==0) {
			return temp;
		}
		temp = temp*10+ (number%10);
		
		return rev(number/10, temp);
	}
}
