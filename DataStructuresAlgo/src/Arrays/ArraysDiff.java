package Arrays;

import java.util.Objects;

public class ArraysDiff {

	public static int[] arrayDiff(int[] a, int[] b) {
		int an = a.length;
		int[] temp = new int[an];
		//System.out.println(temp[0]);
		int count = 0, j;
		for (int i = 0; i < b.length; i++) {
			for (j = 0; j < an; j++) {
				if (b[i] == a[j] && temp[j] == 0) {
					temp[j]++;
					count++;
				}
			}
		}
		// int n = an >= count ? a.length - count : count - a.length;
		int[] y = new int[an - count];
		j = 0;
		for (int i = 0; i < an; i++) {
			if (temp[i]==0) {
				y[j] = a[i];
				j++;
			}
		}

		return y;
	}

	public static void main(String[] args) {
		boolean success = true;
		/**
		 * success = success && Objects.equals("",
		 * isPanagram("Abcdefghijklmnopqrstuvwxyz")); success = success &&
		 * Objects.equals("", isPanagram("The quick brown fox jumps over a lazy dog"));
		 * success = success && Objects.equals("", isPanagram("How vexingly quick daft
		 * zebras jump!")); success = success && Objects.equals("cgjkmnpqrsvxz",
		 * isPanagram("How beautiful Day!")); success = success &&
		 * Objects.equals("djkqwx", isPanagram("Amazing, beautiful, very charming
		 * person")); success = success && Objects.equals("abcdefghijklmnopqrstuvwxyz",
		 * isPanagram(""));
		 **/
		// arrayDiff(new int[] { 1, 2 }, new int[] { 1 });

		//success = success && Objects.equals(new int[] { 2 }, arrayDiff(new int[] { 1, 2 }, new int[] { 1 }));
		//success = success && Objects.equals(new int[] { 2, 2 }, arrayDiff(new int[] { 1, 2, 2 }, new int[] { 1 }));
		success = success && Objects.equals(new int[] { 1 }, arrayDiff(new int[] { 1, 2, 2 }, new int[] { 2 }));
		success = success && Objects.equals(new int[] { 1, 2, 2 }, arrayDiff(new int[] { 1, 2, 2 }, new int[] {}));
		success = success && Objects.equals(new int[] {}, arrayDiff(new int[] {}, new int[] { 1, 2 }));
		success = success && Objects.equals(new int[] { 3, 3, 0 },
				arrayDiff(new int[] { 1, 2, 2, 3, 3, 0 }, new int[] { 4, 5, 6, 7, 8, 9, 1, 2 }));

		if (success) {
			System.out.println("testcases passed");
		} else {
			System.out.println("testcases Failed");
		}

	}

}
