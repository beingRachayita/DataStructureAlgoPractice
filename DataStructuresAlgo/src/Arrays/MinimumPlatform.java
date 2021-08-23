package Arrays;

public class MinimumPlatform {

	public static void main(String[] args) {
		double [] arrival={13,13.40, 13.50, 14, 14.15, 16};
		double [] departure={13.10,15 , 14.20, 14.30, 15.15, 18};
		
		int min = getMinPlatform(arrival, departure);
		
		System.out.println(min);
		
	}

	private static int getMinPlatform(double[] arrival, double[] departure) {
		int platform=1, maxPlatform=0;
		int j =0, i=1;
		while( i<arrival.length){
			if(arrival[i]<departure[j]){
				platform++;
				i++;
				if(platform>maxPlatform){
					maxPlatform = platform;
				}
			}else{
				platform--;
				j++;
			}
		}
		return maxPlatform;
	}

}
