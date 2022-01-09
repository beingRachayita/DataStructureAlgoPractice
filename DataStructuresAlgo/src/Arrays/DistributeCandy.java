package Arrays;

public class DistributeCandy {

	public static void main(String[] args) {
		//Rating of children Array
		int[] rating= {1,5,2,1};
		int numCandies = findSumCandies(rating);
		System.out.println(numCandies);
	}


	public static int findSumCandies(int[] rating) {
		int result =0;
		int[] left = new int[rating.length];
		int[] right = new int[rating.length];
		//rating[i-1]<rating[i] -> Left
		left[0]=1;
		for(int i=1; i<rating.length;i++) {
			if(rating[i-1]<rating[i]) {
				left[i]=left[i-1]+1;
			}
		}
		
		//rating[i+1]<rating[i] -> right
		right[rating.length-1]=1;
		for(int i = rating.length-2; i>=0; i--) {
			if(rating[i+1]<rating[i]) {
				right[i]= right[i+1]+1;
			}
		}
		
		//compare left & right and sum the max
		for(int i =0; i<rating.length;i++) {
			if(left[i]>right[i]) {
				result+=left[i];
			}else {
				result+=right[i];
			}
		}
		
		//return the sum
		return result;
	}
}
