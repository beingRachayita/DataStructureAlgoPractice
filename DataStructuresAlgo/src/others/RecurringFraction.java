package others;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class RecurringFraction {

	/**
	 * Provided a numerator & a denominator. find the decimal answer. 1/2 = 0.5 1/3
	 * = 0.(3)
	 * 
	 * @param args
	 * @throws IOException
	 */

	public static void main(String[] args) throws IOException {
		boolean success = true;

		success = success && Objects.equals("0.5", getRecurringFraction(1l, 2l));
		success = success && Objects.equals("0.(3)", getRecurringFraction(1l, 3l));
		success = success && Objects.equals("0.25", getRecurringFraction(1l, 4l));
		success = success && Objects.equals("11.(6)", getRecurringFraction(35l, 3l));
		success = success && Objects.equals("4.00", getRecurringFraction(20l, 5l));
		success = success && Objects.equals("2.(27)", getRecurringFraction(50l, 22l));
		//success = success && Objects.equals("0.1(6)", getRecurringFraction(1l, 6l));
		success = success && Objects.equals("0.(16)", getRecurringFraction(1l, 6l));

		if (success) {
			System.out.println("testcases passed");
		} else {
			System.out.println("testcases Failed");
		}
	}

	// This will not work for 2.(27)
	private static String getFraction(long numerator, long denominator) {
		String output = "";
		long reminder = numerator % denominator;
		long ans = numerator / denominator;
		if (reminder == 0) {
			return ans + ".00";
		} else {
			output = ans + ".";
			int count = 5;

			while (reminder != 0 && count != 0) {
				reminder = reminder * 10;
				ans = reminder / denominator;
				output += ans;
				reminder = reminder % denominator;
				count--;
			}
			int x = 0;
			String temp = output.substring(output.indexOf('.') + 1, output.length());
			int i = 1;
			char c = temp.charAt(0);
			while (i < temp.length()) {
				if (c == temp.charAt(i)) {
					x++;
				}
				i++;
			}
			System.out.println(output);
			if (x > 0) {
				output = output.substring(0, output.indexOf('.') + 1) + "(" + String.valueOf(c) + ")";
			} else {
				return output;
			}
		}

		return output;
	}

	private static String getRecurringFraction(long numerator, long denominator) {
		String output = "";
		long ans = numerator / denominator;
		long reminder = numerator % denominator;
		output += ans + ".";
		if (reminder == 0) {
			output += "00";
			return output;
		}

		Map<Long, Integer> mp = new HashMap<Long, Integer>();
		String res = "";
		while (reminder != 0 && (!mp.containsKey(reminder))) {
			mp.put(reminder, res.length());
			reminder *= 10;
			ans = reminder / denominator;
			res += ans;
			reminder = reminder % denominator;
		}

		if (reminder == 0) {
			output += res;
		} else {

			output += "(" + res + ")";
		}
		return output;
	}
}
