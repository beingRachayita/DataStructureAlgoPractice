package Arrays;

import java.util.ArrayList;
import java.util.List;

public class StockBuySell {
	class Result{
		int buy;
		int sell;
	}
	public static void main(String[] args) {
		int[] arr = { 98, 178, 250, 300, 40, 540, 690 };
		StockBuySell st= new StockBuySell();
		//int[] arr = { 94, 78, 32, 20, 39, 78, 12 };
		int n = arr.length;
		int i =0;
		List<Result> results = new ArrayList<>();
		for (i = 0; i < arr.length; i++) {
			Result temp = st.new Result();
			while(i<n-1 && arr[i+1]<=arr[i]) {
				i++;
			}
			if(i==n-1)
				break;
			
			temp.buy = i++;
			
			while(i<n-1 && arr[i+1]>=arr[i]) {
				i++;
			}
			
			temp.sell = i;
			results.add(temp);
		}
		
		
		for(Result r: results) {
			System.out.println(arr[r.buy]+" "+ arr[r.sell]);
		}
	}
}
