package binary.bitwise;

public class BitwiseOperators {

	public static void main(String[] args) {
		/*
		 * System.out.println(isOdd(6)); System.out.println(isNthDigit1(1011001,
		 * 4));//true System.out.println(isNthDigit1(1011001, 3));//false
		 */
		int[] num = { 2, 3, 4, 3, 4, 5, 2, 3, 5 };
		// System.out.println(findOddOccuringNum(num));
		//System.out.println(isSignOpposite(1, 100));
		//System.out.println(addOnetoNumber(12));
		System.out.println(turnOffrightbitOptimized(12));
	}

	public static boolean isOdd(int n) {
		if ((n & 1) == 1)
			return true;
		else
			return false;
	}

	// any number & 1 will return the digit.
	public static boolean isNthDigit1(int num, int i) {
		if ((num & (1 << (i - 1))) == (1 << (i - 1))) {
			return true;
		}
		return false;
	}

	// A^A = 0. If it occurs 3 times, it should be available
	public static int findOddOccuringNum(int[] num) {
		int oddNum = 0;
		for (int i = 0; i < num.length; i++) {
			oddNum ^= num[i];
		}
		return oddNum;
	}

	// XOR of x and y will be negative number number iff x and y have opposite signs
	public static boolean isSignOpposite(int a, int b) {
		return (a ^ b) < 0;
	}

	public static int addOnetoNumber(int a) {
		int m =1;
		while((a&m)>=1) {
			a = a^m;
			m<<=1;
		}
		a= a^m;
		return a;
	}
	
	public static int turnOffrightbit(int num) {
		int m =1;
		while((num&m)<=0) {
			m<<=1;
		}
		m<<=1;
		num = num&m;
		return num;
	}
	
	/**
	 * n = 12 =>1100
	 * n-1 = 11 =>1011 +1 = 1100
	 * n&n-1 => 1000 
	 * @param num
	 * @return
	 */
	
	public static int turnOffrightbitOptimized(int num) {
		return num & (num-1);
	}
}
