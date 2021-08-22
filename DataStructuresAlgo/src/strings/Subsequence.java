package strings;

public class Subsequence {
	public static void main(String[] args) {
		String s = "hereiamstackerrank";
		String op = "hackerrank";
		int m = s.length();
		int n = op.length();

		char[] ch = s.toCharArray();
		char[] ch1 = op.toCharArray();

		int index = 0;
		// StringBuilder st = new StringBuilder();
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < m; j++) {
				if (ch1[i] == ch[j] && index <= j) {
					count++;
					index = j;
					break;
				}
			}
		}

		if (count == ch1.length) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
