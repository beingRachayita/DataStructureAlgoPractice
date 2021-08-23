package Arrays;

public class AddTwoNumbers {

	public static void main(String[] args) {
		int[] num1 = {1,7,9,4};
		int[] num2={2,3,3};
		
		int n1 = num1.length-1;
		int n2 = num2.length-1;
		
		
		int[] result;
		
		if(n1>n2){
			result = new int[n1+2];
		}else{
			result = new int[n2+2];
		}
		
		int i = n1, j = n2, k = result.length-1;
		int reminder=0;
		int carry=0;
		while(i>=0 && j>=0){
			result[k] = num1[i]+num2[j]+carry;
			carry = result[k]/10;
			reminder = result[k]%10;
			result[k] = reminder;
			i--;
			j--;
			k--;
		}
		
		while(i>=0){
			result[k]= num1[i]+carry;
			carry = result[k]/10;
			reminder = result[k]%10;
			result[k] = reminder;
			i--;
			k--;
		}
		
		while(j>=0){
			result[k]= num2[j]+carry;
			carry = result[k]/10;
			reminder = result[k%10];
			result[k] = reminder;
			j--;
			k--;
		}
		
		
		for(int x=0; x<result.length; x++){
			System.out.print(result[x]);
		}
	}

}
