package Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RectangleOverlap {
	
	class Point{
		int x;
		int y;
		
		Point(int x, int y){
			this.x = x;
			this.y = y;
		}
		
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
		
	}
	
	public Point getObject(int x, int y){
		Point p = new Point(x, y);
		return p;
	}
	
	

	public static void main(String[] args) throws IOException {
		//Read the co-ordinates
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input=br.readLine().split(",");*/
		//Initialize Objects
		
		
		RectangleOverlap r = new RectangleOverlap();
		/*Point S = r.getObject(Integer.parseInt(input[0].trim()), Integer.parseInt(input[1].trim()));
		Point P = r.getObject(Integer.parseInt(input[2].trim()), Integer.parseInt(input[3].trim()));
		Point S1 = r.getObject(Integer.parseInt(input[4].trim()), Integer.parseInt(input[5].trim()));
		Point P1 = r.getObject(Integer.parseInt(input[6].trim()), Integer.parseInt(input[7].trim()));*/
		Point S = r.getObject(4,2);
		Point P = r.getObject(2,5);
		Point S1 = r.getObject(5,4);
		Point P1 = r.getObject(3,8);
		
		if(r.checkOverlaps(S, P, S1, P1)){
			System.out.println("Rectangle Overlaps");
		}else{
			System.out.println("Doesn't overlap");
		}
		

	}
	
	//create a boolean method pass all the co-ordinates & check
	/**
	 * Let says S (Top left corners), P(Bottom Right Corners)
	 * If rectangles overlap S.x>P'x & S.y>P'.y
	 */
	
	public boolean checkOverlaps(Point S, Point P, Point S1, Point P1){
		
		if(S.getX()<P1.getX() || S1.getX()<P.getX() ){
				return false;
		}else if(S1.getY()>P.getY()|| S.getY()>P1.getY()){
			return false;
		}
				
		return true;
	}
	

}
