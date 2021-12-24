package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnfairnessSum {

	public static void main(String[] args) {
		Integer[] arr = {3,3,4,5,7,9,10};
		Arrays.sort(arr);
		
		int n = arr.length+1;
		//Initializing array
		int[][] mx = new int[n][n];
		int i=0, j=0;
		mx[0][0]=0;
		for(i=1; i<n; i++){
			mx[i][j]=0;
		}
		i=0;
		for(j=1; j<n; j++){
			mx[i][j]=0;
		}		
	
		
		for(i=1; i<n-1; i++){
			for(j=1; j<n-1; j++){
				mx[i][j] = mx[i-1][j-1]+mx[i-1][j]+Math.abs(arr[i-1]-arr[i]);	
			}
		}
		
		
		for(i=0; i<n; i++){
			for(j=0; j<n; j++){
				System.out.print(mx[i][j]);
			}
			System.out.println();
		}
		
	}

}
