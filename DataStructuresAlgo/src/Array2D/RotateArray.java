package Array2D;

public class RotateArray {

	public static void main(String[] args) {
		int[][] mx= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		
		mx = rotateWithoutSpace(mx);
		
		for(int i =0; i<mx.length; i++) {
			for(int j =0; j<mx[0].length; j++) {
				System.out.print(mx[i][j]+" ");
			}
			System.out.println();
		}

	}
	
	public static int[][] rotateArray(int[][] mx){
		int n = mx.length;
		int[][] result = new int[n][n];
		int i, j, k;
		
		for(i=n-1, k=0; i>=0 && k<n; i--, k++) {
			for(j=0; j<n; j++) {
				result[j][k] = mx[i][j];
			}
		}
		
		return result;
	}
	
	
	public static int[][] rotateWithoutSpace(int[][] mx){
		int n = mx.length;
		int i, j, temp;
		
		for(i=0; i<n/2; i++) {
			for(j=0; j<n-i-1; j++) {
				temp = mx[j][n-1-i];
				mx[j][n-1-i] = mx[i][j];
				mx[i][j]=mx[n-1-j][i];
				mx[n-1-j][i]= mx[n-1-i][n-1-j];
				mx[n-1-i][n-1-j]= temp;
			}
		}
		
		return mx;
	}
}
