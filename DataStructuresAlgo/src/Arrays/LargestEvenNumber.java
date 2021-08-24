package Arrays;

public class LargestEvenNumber {

	public static void main(String[] args) {
		String num = "535";
		char[] nArray = num.toCharArray();
		int n = nArray.length;
		int lastDigit = Character.getNumericValue(nArray[n-1]);
		for(int i=0; i<nArray.length;i++){
			int digit =Character.getNumericValue(nArray[i]);
			if(digit%2==0 && digit<lastDigit){
				char temp = nArray[i];
				nArray[i]=Character.forDigit(lastDigit,10);
				nArray[n-1]=temp;
				break;
			}
		}
		
		System.out.println(String.valueOf(nArray));
	}
}
