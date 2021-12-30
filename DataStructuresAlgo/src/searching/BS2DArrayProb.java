package searching;

import java.util.Arrays;

public class BS2DArrayProb {

	public static void main(String[] args) {
		int[][] arr = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 28, 29, 37, 49 }, { 33, 34, 39, 50 } };
		
		System.out.println(Arrays.toString(findBS(arr, 14)));

	}

	private static int[] findBS(int[][] arr, int i) {
		int row =0;
		int col =arr.length-1;
		while(row<arr.length&& col>=0) {
			if(arr[row][col]==i) {
				return new int[] {row,col};
			}else if(i<arr[row][col]) {
				col--;
			}else {
				row++;
			}
		}
		return new int[] {-1, -1};
	}

}
