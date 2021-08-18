package Array2D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrixMultiplication {

	public static void main(String[] args) throws IOException {
		/**
		 * To multiple a m*n matrix with n*p matrix the n must be equal & the
		 * resultant matrix is m*p
		 */
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		// Initialize two input arrays
		int m, n;
		String[] input;
		System.out.println("Enter Dimensions for 1st Array: mxn \n");
		input = rd.readLine().split("x");
		m = Integer.parseInt(input[0]);
		n = Integer.parseInt(input[1]);
		int[][] a = new int[m][n];

		System.out.println("Enter the data for 1st Array: \n");
		for (int i = 0; i < m; i++) {
			input = rd.readLine().split(",");
			for (int j = 0; j < n; j++) {
				a[i][j] = Integer.parseInt(input[j]);
			}
		}

		System.out.println("Enter Dimensions for 2st Array: mxn \n");
		input = rd.readLine().split("x");
		m = Integer.parseInt(input[0]);
		n = Integer.parseInt(input[1]);
		int[][] b = new int[m][n];

		System.out.println("Enter the data for 2nd Array: \n");
		for (int i = 0; i < m; i++) {
			input = rd.readLine().split(",");
			for (int j = 0; j < n; j++) {
				b[i][j] = Integer.parseInt(input[j]);
			}
		}

		System.out.println("The 1st Array: \n");
		display(a);

		System.out.println("The 2nd Array: \n");
		display(b);

		int[][] result = multiply(a, b);
		if (result == null) {
			System.out.println("Invalid Dimensions");
		} else {
			System.out.println();
			display(result);
		}
	}

	private static int[][] multiply(int[][] a, int[][] b){
		int m = a.length;
		int n= b.length;
		int p = b[0].length;
		int[][] result = null;
		if(a[0].length == n){
			result= new int[m][p];
			for(int i =0; i<m; i++){
				for(int j=0; j<p; j++){
					result[i][j]=0;
					for(int k =0; k<n; k++){
						result[i][j]+= a[i][k]*b[k][j];
					}
				}
				
			}
		}
		
		
		return result;
		
	}

	private static void display(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
