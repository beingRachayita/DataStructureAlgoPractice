package recursion;

import java.util.Objects;

public class StringPalindrome {

	public static void main(String[] args) {
		boolean success = true;

		success = success && Objects.equals(true, isPalindrome("abcba"));
		success = success && Objects.equals(false, isPalindrome("life"));
		success = success && Objects.equals(true, isPalindrome("madam"));
		success = success && Objects.equals(true, isPalindrome("abccba"));
		success = success && Objects.equals(false, isPalindrome("abxdefba"));
		//success = success && Objects.equals(true, isPalindrome(" "));

		if (success) {
			System.out.println("testcases passed");
		} else {
			System.out.println("testcases Failed");
		}

	}
	
	public static boolean isPalindrome(String input) {
		input = input.trim().toLowerCase();
		if(input.length()<=1) {
			return true;
		}else {
			return checkPalindrome(input, 0, input.length()-1);
		}
	}

	private static boolean checkPalindrome(String input, int s, int e) {
		if (s == e) {
			return true;
		} 
		if (input.charAt(s) != input.charAt(e)) {
			return false;
		}
		if (s < e + 1)
			return checkPalindrome(input, s + 1, e - 1);
		
		return true;
	}

}
