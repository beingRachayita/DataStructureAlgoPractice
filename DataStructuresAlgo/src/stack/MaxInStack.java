package stack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class MaxInStack {

	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcases = Integer.parseInt(br.readLine());
		Stack<Integer> st = new Stack<Integer>();
		int max = 0;
		while(testcases>0){
			String input[] = br.readLine().split(" ");
			if(Integer.parseInt(input[0])==1){
				st.push(Integer.parseInt(input[1]));
			}else if(Integer.parseInt(input[0])==2){
				st.pop();
			}else if(Integer.parseInt(input[0])==3){
				//find max
				max = findMax(st, max);
				System.out.println(max);
			}
			testcases--;
		}
	}
	
	public static int findMax(Stack<Integer> st, int max){
		int data;
		if(st.isEmpty()){
			return max;
		}
		else if(max<st.peek()){
			data = st.pop();
			max = data;
			max = findMax(st, max);
			st.push(data);
		}else{
			data = st.pop();
			max = findMax(st, max);
			st.push(data);
		}
		return max;
	}
}
