package strings;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st ="abcdeeb";
		st = removeDuplicates(st);
		System.out.println(st);
	}
	
	public static String removeDuplicates(String st) {
		int[] ascii = new int[256];
		char[] str = st.toCharArray();
		for(int i=0; i<str.length;i++) {
			if(ascii[str[i]]==0) {
				ascii[str[i]] = -1;
			}else {
				str[i]='\0';
			}
		}
		
		st = String.valueOf(str);
		st.replaceAll("\0", "");
		return st;
		
	}

}
