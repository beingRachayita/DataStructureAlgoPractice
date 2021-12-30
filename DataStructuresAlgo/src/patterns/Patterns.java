package patterns;

public class Patterns {

	public static void main(String[] args) {
		pattern13(5);

	}

	private static void pattern1(int n) {
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void pattern2(int n) {
		for (int row = 0; row < n; row++) {
			for (int col = 0; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void pattern3(int n) {
		for (int row = 0; row < n; row++) {
			for (int col = n - 1; col >= row; col--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void pattern4(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(col);
			}
			System.out.println();
		}
	}

	private static void pattern5(int n) {
		for (int row = 1; row < 2 * n; row++) {
			int totalCol = row > n ? 2 * n - row : row;
			for (int col = 1; col <= totalCol; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void pattern6first(int n) {
		for (int row = 1; row <= n; row++) {
			// int totalCol = row>n?2*n-row:row;
			for (int blank = row; blank < n; blank++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void pattern6(int n) {
		for (int row = 1; row <= n; row++) {
			int blank = n - row;
			for (int col = 1; col <= n; col++) {
				if (col <= blank) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	private static void pattern7(int n) {
		for (int row = n; row >= 1; row--) {
			int blank = n - row;
			for (int col = 1; col <= n; col++) {
				if (col <= blank) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	private static void pattern8(int n) {
		for (int row = 0; row < n; row++) {
			int blank = n - (row + 1);
			for (int col = 1; col <= n + row; col++) {
				if (col <= blank) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	private static void pattern9(int n) {
		for (int row = n; row > 0; row--) {
			int blank = n - row;
			for (int col = 1; col < n + row; col++) {
				if (col <= blank) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	private static void pattern10(int n) {
		for (int row = 0; row < n; row++) {
			int blank = n - (row + 1);
			for (int col = 1; col <= n; col++) {
				if (col <= blank) {
					System.out.print(" ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

	private static void pattern11(int n) {
		for (int row = n; row > 0; row--) {
			int blank = n - row;
			for (int col = 1; col <= n; col++) {
				if (col <= blank) {
					System.out.print(" ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

	private static void pattern12opt(int n) {
		int blank = 0;
		for (int row = 2 * n; row > 0; row--) {
			for (int col = 1; col <= n; col++) {
				if (col <= blank) {
					System.out.print(" ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();

			blank = row > n + 1 ? blank + 1 : blank - 1;

		}
	}

	private static void pattern12(int n) {
		for (int row = n; row > 0; row--) {
			int blank = n - row;
			for (int col = 1; col <= n; col++) {
				if (col <= blank) {
					System.out.print(" ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		for (int row = 0; row < n; row++) {
			int blank = n - (row + 1);
			for (int col = 1; col <= n; col++) {
				if (col <= blank) {
					System.out.print(" ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}

	}

	private static void pattern13(int n) {
		int bwblank =0;
		for (int row = 0; row < n; row++) {
			int blank = n - (row + 1);
			for (int col = 1; col <= n - row; col++) {
				if (col <= blank) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
	}
}
