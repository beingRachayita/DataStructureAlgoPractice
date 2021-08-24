package strings;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountFrequency {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String input = br.readLine();
			String res = countEach(input);
			
			System.out.println(res);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static String countEach(String input) {
		//convert the input string to lowercase
		input = input.toLowerCase();
		
		//create an array to store the frequency of each letter. the index is the Letter
		int[] freq = new int[26];
		
		String result="";
		for(int i=0; i<input.length(); i++){
			//This actually subtracts the ascii character of the input char and 'a'
			freq[input.charAt(i)-'a']++;
		}
		
		for(int j=0; j<input.length(); j++){
			if(freq[input.charAt(j)-'a']!=0){
				result = result+input.charAt(j)+freq[input.charAt(j)-'a']+" ";
				freq[input.charAt(j)-'a'] =0;
			}
		}
		return result;
	}

}
