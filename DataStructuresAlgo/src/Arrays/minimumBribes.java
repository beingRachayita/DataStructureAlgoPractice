package Arrays;

import java.util.Arrays;
import java.util.List;

public class minimumBribes {

	public static void main(String[] args) {

		List<Integer> q = Arrays.asList(2, 1, 5, 3, 4);
		minimumBribes(q);

	}

	public static void minimumBribes(List<Integer> q) {
		boolean chaotic = false;
		int bribes = 0;
		for (int i = 0; i <q.size(); i++) {
			if (q.get(i) - (i + 1) > 2) {
				chaotic = true;
			}
			for (int j = 0; j <i; j++) {
				if (q.get(j) > q.get(i)) {
					bribes++;
				}
			}
		}
		if (chaotic == true) {
			System.out.println("Too chaotic");
		} else {
			System.out.println(bribes);
		}

	}

}
