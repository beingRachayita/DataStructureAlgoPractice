package Array2D;

public class SpiralPrint {

	public static void main(String[] args) {
		int[][] a={
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		
		int k=0, n=0, p=a.length-1, m=a[0].length-1;
		int i=0,j =0;
		while(k<m && n<p){
			i=k;
			for(j=k;j<m;j++){
				System.out.print(a[i][j]+" ");
			}
			j=m;
			for(i=n;i<p;i++){
				System.out.print(a[i][j]+" ");
			}
			i=p;
			for(j=m;j>k;j--){
				System.out.print(a[i][j]+" ");
			}
			j=k;
			for(i=p; i>n;i--){
				System.out.print(a[i][j]+" ");
			}
			k++;
			n++;
			m--;
			p--;
		}

	}

}
