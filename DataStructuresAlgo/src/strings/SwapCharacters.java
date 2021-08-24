package strings;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwapCharacters {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Reading the Input String
		String input= br.readLine();
		
		//Splitting it based on based on space
		String[] words = input.split(" ");
		
		//Initializing output String
		String output=""; 
		
		for(String s: words){
			//concatenating output and each words with swapped character
			output= output+swap(s)+" ";
		}
		System.out.println(output);
		
		
	}
	
	private static String swap(String word){
		char[] arg = word.toCharArray();
		char temp = arg[arg.length-1];
		arg[arg.length-1] = arg[0];
		arg[0] = temp;
		String output = String.valueOf(arg);
		return output;
	}
}
