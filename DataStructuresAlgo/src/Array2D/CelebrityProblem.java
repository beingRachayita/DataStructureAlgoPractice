package Array2D;

public class CelebrityProblem {

	public static void main(String[] args) {
		int[][] matrix={{0,0,1,0},
						{0,0,1,0},
						{0,0,0,0},
						{0,0,1,0},
						};

		checkCelebrity(matrix);
		getCelebrity(matrix);
	}
	
	
	public static void checkCelebrity(int[][] matrix){
		int count =0; 
		int i =0,j=0;
		boolean flag = false;
		for(i=0; i<matrix.length; i++){
			count =0;
			for(j =0; j<matrix[i].length; j++){
				if(matrix[i][j]==0){
					count++;
				}
			}
			if(count == matrix.length){
				flag =true;
				break;
			}
		}
		
		if(flag == false){
			System.out.println("No Celebrity");
		}else{
			count =0;
			for(j =0; j<matrix.length; j++){
				if(matrix[j][i]==1){
					count++;
				}
			}
			if(count==matrix.length-1){
				System.out.println("This is the celebrity "+ i);
			}
		}
	}

	
	public static void getCelebrity(int[][] matrix){
		int x =0;
		int y = matrix[0].length-1;
		while(x<y){
			if(matrix[x][y]==1){
				x++;
			}else{
				y--;
			}
		}
		
		y=0;
		boolean flag = false;
		while(y<matrix[0].length){
			if(matrix[x][y]==1){
				flag = true;
				break;
			}
			y++;
		}
		
		if(flag){
			System.out.println("No Celebrity");
		}else{
			System.out.println("Celebrity is: "+ x);
		}
	}
}
