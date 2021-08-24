package Array2D;

public class CelebrityProblem {

	public static void main(String[] args) {
		int[][] matrix={{0,0,1,0},
						{0,0,1,0},
						{0,1,0,0},
						{0,0,1,0},
						};

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

}
