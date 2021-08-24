package strings;

public class FirstNonRepeatChar {

	public static void main(String[] args) {
		//String input="GeeksForGeeks";
		String input="GeeksQuiz";
		
		char result = findCharacter2(input);
		if(result =='\0'){
			System.out.println("Not Found");
		}else{
			System.out.println(result);
		}
		
	}
	
	public static char findCharacter1(String input){
		int n = input.length();
		char x='\0';
		int flag =0, i=0;
		for(i=0; i<n; i++){
			flag =0;
			for(int j=i+1; j<n;j++){
				if(input.charAt(i)== input.charAt(j)){
					flag =1;
					break;
				}
			}
			if(flag==0){
				return input.charAt(i);
			}
		}
		
		return x;
	}

	
	public static char findCharacter2(String input){
		int[] ascii = new int[256];
		for(int i=0; i<input.length();i++){
			ascii[input.charAt(i)]++;
		}
		
		for(int i=0; i<input.length(); i++){
			if(ascii[input.charAt(i)] ==1){
				return input.charAt(i);
			}
		}
		
		return '\0';
	}
}
