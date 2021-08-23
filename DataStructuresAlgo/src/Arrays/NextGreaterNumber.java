package Arrays;

public class NextGreaterNumber {

	public static void main(String[] args) {
		int num = 218765;
		int[] arrN = convertNumtoArray(num);
		int result = nextGreatNumber(arrN);
		System.out.println("The next great number: " + result);

	}

	public static int nextGreatNumber(int[] num) {
		int i = num.length - 2;
		for (; i > 0; i--) {
			if (num[num.length - 1] > num[i]) {
				int temp = num[i];
				num[i] = num[num.length - 1];
				num[num.length - 1] = temp;
				break;
			}
		}
		i++;
		System.out.println(i);
		for (; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[j] < num[i]) {
					int temp = num[j];
					num[j] = num[i];
					num[i] = temp;
				}
			}
		}
		int result = convertArrtoNum(num);
		return result;
	}

	public static int[] convertNumtoArray(int num) {
		String temp = Integer.toString(num);
		int[] arr = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++) {
			arr[i] = temp.charAt(i) - '0';
		}
		return arr;
	}

	public static int convertArrtoNum(int[] arrN) {
		int result = 0;
		for (int i : arrN) {
			result = result * 10 + i;
		}
		return result;
	}
}
