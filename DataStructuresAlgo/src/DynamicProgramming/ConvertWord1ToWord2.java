package DynamicProgramming;

public class ConvertWord1ToWord2 {
	public static void main(String[] args) {
		/*String str = "BAB";
		String ptr = "BCBA";*/
		String str = "sunday";
		String ptr = "saturday";

		
		int m = str.length();
		int n = ptr.length();

		char[] ch1 = str.toCharArray();
		char[] ch2 = ptr.toCharArray();
		
		System.out.println();

		int[][] mx = new int[m+1][n+1];
		int i = 0, j = 0;
		mx[0][0] = 0;
		for (i = 1; i <= ch1.length; i++) {
			mx[i][j] = i;
		}
		i = 0;
		for (j = 1; j <= ch2.length; j++) {
			mx[i][j] = j;
		}
		for (i = 1; i <=m; i++) {
			for (j = 1; j <= n; j++) {
				if (ch1[i-1] == ch2[j-1]) {
					mx[i][j] = mx[i-1][j-1];
				} else {
					mx[i][j] = min(mx[i-1][j-1]+1, mx[i-1][j]+1, mx[i][j-1]+1);

				}
				
			}
		}

		/*for(i=0; i<=m; i++){
			for(j=0; j<=n; j++){
				System.out.print(mx[i][j]+" ");
			}
			System.out.println();
		}*/
		
		System.out.println(mx[m][n]);

	}
	
	private static int min(int a, int b, int c){
		int min =0;
		if(a<=b && b<=c){
			min = a;
		}else if(b<=c && c<=a){
			min = b;
		}else{
			min =c;
		}
		
		return min;
	}
}
