package others;

public class CountFour {

	public static void main(String[] args) {
		int n = 328;
		int count = 0;
		int temp = 0;
		for (int i = 1; i <= n; i++) {
			temp = i;
			while (temp != 0) {
				int digit = temp % 10;
				if (digit == 4) {
					count++;
					break;
				}
				temp = temp/ 10;
			}
		}

		System.out.println(count);
	}
}
