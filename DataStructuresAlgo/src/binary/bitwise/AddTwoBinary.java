package binary.bitwise;

public class AddTwoBinary {

	public static void main(String[] args) {
		String a = "11";
		String b = "1";
		System.out.println(mySolution(a, b));
	}

	public static String geeksSolution(String a, String b) {
		int n = a.length() - 1;
		int m = b.length() - 1;
		String ans = "";
		int sum =0;
		while (n >= 0 || m >= 0 || sum==1) { 
			sum += n >= 0 ? a.charAt(n) - '0' : 0;
			sum += m >= 0 ? b.charAt(m) - '0' : 0;
			ans = (char) (sum % 2 + '0') + ans;
			sum /= 2;
			n--;
			m--;
		}

		return ans;
	}
	
	public static String mySolution(String a, String b) {
		int n = Integer.valueOf(a);
		int m = Integer.valueOf(b);
		int carry =0;
		int sum =0;
		String ans ="";
		while(n!=0 || m!=0) {
			sum=carry+(n&1)+(m&1);
			carry = sum/2;
			sum = sum%2;
			ans = sum+ans;
			n= n/10;;
			m = m/10;
		}
		if(carry==1) {
			ans= carry+ans;
		}
		return ans;
	}
}
