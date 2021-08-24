package strings;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Anagram {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
    	//convert the strings to lower case
    	a = a.toLowerCase();
    	b = b.toLowerCase();
    	
    	//Create two freq array for each string
    	int[] freqA= new int[26];
    	int[] freqB = new int[26];
    	
    	//capture the frequency of each character in each string
    	for(int i =0; i<a.length();i++){
    		freqA[a.charAt(i)-'a']++;
    	}
    	for(int i =0; i<b.length();i++){
    		freqB[b.charAt(i)-'a']++;
    	}
    	
    	int count =0;int n =0;
    	//check if a strings doesn't contain any character count++
    	for(int i=0; i<a.length()-1; i++){
    		if(b.contains(String.valueOf(a.charAt(i))) && freqB[b.charAt(i)-'a']!= freqA[a.charAt(i)-'a']){
    			if(freqB[b.charAt(i)-'a'] > freqA[a.charAt(i)-'a']){
    				n = freqB[b.charAt(i)-'a']- freqA[a.charAt(i)-'a'];
    				count= count+n;
    				freqB[b.charAt(i)-'a']= freqB[b.charAt(i)-'a']-n;
    				
    			}else{
    				n=freqA[a.charAt(i)-'a']- freqB[b.charAt(i)-'a'];
    				count= count+n;
    				freqA[a.charAt(i)-'a'] = freqA[a.charAt(i)-'a']-n;
    			}
    		}else{
    			count++;
    		}
    	}
    	for(int j =0; j<b.length(); j++){
    		if(a.contains(String.valueOf(b.charAt(j)))&& freqB[b.charAt(j)-'a']!= freqA[a.charAt(j)-'a']){
    			if(freqB[b.charAt(j)-'a'] > freqA[a.charAt(j)-'a']){
    				n = freqB[b.charAt(j)-'a']- freqA[a.charAt(j)-'a'];
    				count= count+n;
    				freqB[b.charAt(j)-'a']= freqB[b.charAt(j)-'a']-n;
    			}else{
    				n=freqA[a.charAt(j)-'a']- freqB[b.charAt(j)-'a'];
    				count= count+n;
    				freqA[a.charAt(j)-'a'] = freqA[a.charAt(j)-'a']-n;
    			}
    		}else{
    			count++;
    		}
    	}	
    
    	
    	return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
      //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);
        System.out.println("Result from make Anagram "+res);
        
        String r = isAnagram(a, b);
        System.out.println("Result from isAnagram "+r);
        
       /* bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();
*/
        scanner.close();
    }
    
    
    static String isAnagram(String a, String b){
    	int[] asciiA= new int[256];
    	int[] asciiB= new int[256];
    	
    	//If the length of the strings don't match they can't be anagram
    	if(a.length()!=b.length()){
    		return "No";
    	}else{
    		for(int i =0; i<a.length(); i++){
    			asciiA[a.charAt(i)]++;
    			asciiB[b.charAt(i)]++;
    		}
    		
    		int count =0;
    		for(int i =0; i<256; i++){
    			if(asciiA[i]>0 && asciiB[i]>0){
    				count++;
    			}
    		}
    		
    		if(count == a.length()){
    			return "YES";
    		}else{
    			return "NO";
    		}
    	}
    }
}
