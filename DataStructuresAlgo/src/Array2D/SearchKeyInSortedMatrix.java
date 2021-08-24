package Array2D;

public class SearchKeyInSortedMatrix {

	public static void main(String[] args) {
		int[][] mx ={
				{10,20,30, 40},
				{15, 25,36, 46},
				{28, 29,37, 48},
				{32,33,39,50}
		};
		
		String r = searchKey(mx, 37);
		
		System.out.println(r);

	}

	private static String searchKey(int[][] mx, int key) {
		int i = 0, j = mx.length - 1;
		boolean flag = false;
		while (i < mx.length && j>=0) {
			if (mx[i][j] > key) {
				j--;
			} else if (mx[i][j] < key) {
				i++;
			} else {
				flag = true;
				break;
			}
		}
		String result;
		if (flag) {
			result = "Found the element :" + mx[i][j] + " at row: " + i + " and col: " + j;
		} else {
			result = "not Found";
		}
		return result;
	}

}
