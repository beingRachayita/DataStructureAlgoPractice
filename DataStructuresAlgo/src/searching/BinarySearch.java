package searching;

//https://www.youtube.com/watch?v=f6UU7V3szVw&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=10
public class BinarySearch {

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 5, 6, 8, 9, 11, 23, 45, 78 };
		System.out.println(findBinarySearchLoop(num, 5));
	}

	private static int find(int[] num, int i) {
		int s = 0, e = num.length - 1;
		return findBinarySearch(num, i, s, e);
	}

	private static int findBinarySearch(int[] num, int i, int s, int e) {
		if (s > e) {
			return -1;
		}
		int m = (s + e) / 2;
		if (num[m] == i) {
			return m;
		} else if (num[m] < i) {
			return findBinarySearch(num, i, m + 1, e);
		} else {
			return findBinarySearch(num, i, 0, m - 1);
		}

	}

	public static int findBinarySearchLoop(int[] num, int target) {
		int start = 0, end = num.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (num[mid] == target) {
				return mid;
			} else if (num[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}

	public static int orderAgnosticBS(int[] num, int target) {
		int start = 0, end = num.length - 1;
		boolean isAsc = start < end;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (num[mid] == target) {
				return mid;
			}

			if (isAsc) {
				if (num[mid] > target) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {
				if (num[mid] > target) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}
		}
		return -1;
	}
}
