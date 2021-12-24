package strings;

public class TestAmazon {
	public static void main(String[] args) {
		//String s = "aaaaa";
		//String s = "daabbd";
		String s = "zypttpyzzz";
		int i =0;
		int n = s.length();
		boolean flag = true;
		while(i<n) {
			if(s.charAt(i)== s.charAt(n-1)) {
				i=i+1;
				n = n-1;
			}else if(s.charAt(i)==s.charAt(i+1)) {
				i=i+2;
			}else if(s.charAt(n-2)==s.charAt(n-1)){
				n-=2;
			} 
			else{
				flag =false;
				break;
			}
			
		}
		if(flag) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
	}
}
