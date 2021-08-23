package DynamicProgramming;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		String s ="ABCDEF";
		String st = "AEDNEK";
		int m = s.length()+1;
		int n = st.length()+1;
		
		char[] c1 = s.toCharArray();
		char[] c2 = st.toCharArray();
		
		int[][] mx = new int[m][n];
		int i=0,j=0;
		mx[0][0] =0;
		for(i=1; i<=c1.length; i++){
			mx[i][j]=0;
		}
		i=0;
		for(j=1; j<=c2.length; j++){
			mx[i][j]=0;
		}

		for(i=1; i<m; i++){
			for(j=1; j<n; j++){
				if(c1[i-1]==c2[j-1]){
					mx[i][j]= mx[i-1][j-1]+1;
				}else{
					if(mx[i-1][j]>mx[i][j-1]){
						mx[i][j] = mx[i-1][j];
					}else{
						mx[i][j] = mx[i][j-1];
					}
				}
			}
		}
		
		System.out.println(mx[m-1][n-1]);
	}

}
