package Array2D;

public class DiagonalPrint {

	public static void main(String[] args) {
		int[][] a={
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20}
		};
		
		int k=0, n=0, p=a.length-1, m=a[0].length-1;
		int i=0, j=0;
		for(int x=0; x<=p; x++){
			for(i=k, j=0; i>=0 & j<=n; i--,j++){
				System.out.print(a[i][j]+" ");
			}
			k++;
			n++;
		}
		k=0;
		n=1;
		for(int x=0; x<=p; x++){
			for(i=p, j=n; i>=k & j<=m; i--,j++){
				System.out.print(a[i][j]+" ");
			}
			k++;
			n++;
		}

	}

}
