package recursion;

import java.util.Objects;

public class Count8 {

	/**
	 * Given a non-negative int n, return the count of the occurrences of 7 as a
	 * digit, so for example 717 yields 2
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		boolean success = true;

		success = success && Objects.equals(9, count8(88888));
		success = success && Objects.equals(2, count8(818));
		success = success && Objects.equals(0, count8(123));
		success = success && Objects.equals(3, count8(188));
		success = success && Objects.equals(0, count8(7123));
		success = success && Objects.equals(6, count8(887688));

		if (success) {
			System.out.println("All testcases Passed");
		} else {
			System.out.println("testcases failed");
		}

	}

	public static int count8(int n) {
		return check8(n, 0);

	}

	private static int check8(int n, int prev) {
		if (n == 0) {
			return 0;
		}
		if (n % 10 == 8 && prev == 8) {
			return 2 + check8(n / 10, n % 10);
		} else if (n % 10 == 8 && prev != 8) {
			return 1 + check8(n / 10, n % 10);
		} else {
			return check8(n / 10, n % 10);
		}
	}

}
