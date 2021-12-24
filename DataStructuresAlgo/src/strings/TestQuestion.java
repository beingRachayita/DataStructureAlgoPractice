package strings;

public class TestQuestion {
	
	/**
	 * There is a circular point from A-Z. The pointer is always at A. The distance from A-B =1 & A-Z=1
	 * Calculate the minimum number of steps we require to take to form a string
	 * @param args
	 */

	public static void main(String[] args) {
		String in = "azgb";
		in = in.toLowerCase();
		int sum = 0, curr=0, index=0;
		for(int i=0; i<in.length(); i++) {
			//for each char find the distance from a-z clockwise
			index = in.charAt(i)-'a';
			int clockwise= Math.abs(curr-index);
			
			//for each char find anti-clock wise
			int antiClockwise =26- Math.abs(curr-index);
			
			curr = index;
			sum+=Math.min(clockwise, antiClockwise);
		}
	System.out.println(sum);	
	}
		
}
