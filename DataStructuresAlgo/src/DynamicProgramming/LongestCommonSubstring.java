package DynamicProgramming;

public class LongestCommonSubstring {

	public static void main(String[] args) {
		String str = "ABAB";
		String ptr ="BABA";
		
		int m = str.length()+1;
		int n = ptr.length()+1;
		
		char[] ch1 = str.toCharArray();
		char[] ch2 = ptr.toCharArray();
 		
		int[][] mx = new int[m][n];
		int i=0, j=0;
		mx[0][0]=0;
		for(i=1; i<=ch1.length; i++){
			mx[i][j]=0;
		}
		i=0;
		for(j=1; j<=ch2.length; j++){
			mx[i][j]=0;
		}
		int max=0;
		for(i=1; i<m; i++){
			for(j=1; j<n; j++){
				if(ch1[i-1]==ch2[j-1]){
					mx[i][j]= mx[i-1][j-1]+1;
				}else{
					mx[i][j]=0;
				}
				
				if(max<mx[i][j]){
					max = mx[i][j];
				}
			}
		}
		
		System.out.println(max);

	}

}
