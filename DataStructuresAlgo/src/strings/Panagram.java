package strings;

import java.io.IOException;
import java.util.Objects;

public class Panagram {
	/**
	 * Given a string input, check if it is a Panagram. If it is not then return the
	 * letters that would be needed to make it a panagram return String in lower
	 * case and alphabetical order
	 * 
	 * @param args
	 * @throws IOException
	 */

	public static void main(String[] args) throws IOException {
		boolean success = true;
		/**success = success && Objects.equals("", isPanagram("Abcdefghijklmnopqrstuvwxyz"));
		success = success && Objects.equals("", isPanagram("The quick brown fox jumps over a lazy dog"));
		success = success && Objects.equals("", isPanagram("How vexingly quick daft zebras jump!"));
		success = success && Objects.equals("cgjkmnpqrsvxz", isPanagram("How beautiful Day!"));
		success = success && Objects.equals("djkqwx", isPanagram("Amazing, beautiful, very charming person"));
		success = success && Objects.equals("abcdefghijklmnopqrstuvwxyz", isPanagram(""));**/ 
		
		
		success = success && Objects.equals("", checkPanagram("Abcdefghijklmnopqrstuvwxyz"));
		success = success && Objects.equals("", checkPanagram("The quick brown fox jumps over a lazy dog"));
		success = success && Objects.equals("", checkPanagram("How vexingly quick daft zebras jump!"));
		success = success && Objects.equals("cgjkmnpqrsvxz", checkPanagram("How beautiful Day!"));
		success = success && Objects.equals("djkqwx", checkPanagram("Amazing, beautiful, very charming person"));
		success = success && Objects.equals("abcdefghijklmnopqrstuvwxyz", checkPanagram(" "));

		if (success) {
			System.out.println("testcases passed");
		} else {
			System.out.println("testcases Failed");
		}
	}

	public static String isPanagram(String str) {
		// create a alphabets int char
		final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
		int[] ascii = new int[27];

		if (str.length() == 0) {
			return ALPHABET;
		}

		// remove spaces, convert it to lowercase, remove special character
		str = str.toLowerCase().trim();
		str = str.replaceAll("[^a-z]", "");
		str = str.replaceAll(" ", "");
		// loop through the string, keep the count in ascii
		for (int i = 0; i < str.length(); i++) {
			ascii[str.charAt(i) - 'a']++;
		}

		// if the count is 0, then that alphabet is not present. Append it to a string
		// to be returned
		StringBuffer output = new StringBuffer();
		for (int i = 0; i < ascii.length; i++) {
			if (ascii[i] == 0) {
				char c = (char) (i + 'a');
				if (ALPHABET.contains(String.valueOf(c))) {
					output.append(String.valueOf(c));
				}
			}
		}

		return output.toString();
	}

	public static String checkPanagram(String str) {
		StringBuffer output = new StringBuffer();
		final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
		// remove spaces, convert it to lowercase, remove special character
		if (str.trim().length() == 0) {
			return ALPHABET;
		}
		
		str = str.toLowerCase().trim();
		str = str.replaceAll("[^a-z]", "");
		str = str.replaceAll(" ", "");
		
		
		for(char ch='a'; ch<='z'; ch++) {
			if(!str.contains(String.valueOf(ch))) {
				output.append(String.valueOf(ch));
			}
		}
		
		return output.toString();
	}

}
