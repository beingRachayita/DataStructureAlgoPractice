package stack;
import java.util.Stack;

public class CelebrityProblemStack {
	
	static int[][] matrix={{0,0,1,0},
			{0,0,1,0},
			{0,0,0,0},
			{0,0,1,0},
			};
	
	static boolean knows(int a, int b){
		if(matrix[a][b]==1)
			return true;
		
		return false;
	}
	
	static int findCelebrity(int n){
		Stack<Integer> s = new Stack<Integer>();
		
		for(int i =0; i<n; i++){
			s.push(i);
		}
		
		while(s.size()>1){
			int a = s.pop();
			int b = s.pop();
			
			if(knows(a,b)){
				s.push(b);
			}else{
				s.push(a);
			}
		}
		
		if(s.isEmpty())
			return -1;
		
		int c = s.pop();
		
		for(int i=0; i<n; i++){
			if(i!=c && (knows(c, i)||!knows(i,c))){
				return -1;
			}
			
			return c;
		}
		
		return -1;
	}

	public static void main(String[] args) {
		
		int n =4;
		int id = findCelebrity(n);
		if(id == -1){
			System.out.println("No Celebrity");
		}else{
			System.out.println("Celebrity ID: "+ id);
		}
	}
}
