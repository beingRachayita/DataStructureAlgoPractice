package recursion;

import java.util.Objects;

public class BunnyEars {

/**
 * We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears. 
 * The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot. Recursively return the 
 * number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
 * @param args
 */
	public static void main(String[] args) {
		boolean success = true;

		success = success && Objects.equals(0, bunnyEars2(0));
		success = success && Objects.equals(2, bunnyEars2(1));
		success = success && Objects.equals(5, bunnyEars2(2));
		success = success && Objects.equals(7, bunnyEars2(3));
		success = success && Objects.equals(10, bunnyEars2(4));
		success = success && Objects.equals(12, bunnyEars2(5));
		
		if(success){
			System.out.println("All testcases Passed");
		}else{
			System.out.println("testcases failed");
		}

	}

	public static int bunnyEars2(int bunnies) {
		  if(bunnies==0){
		    return 0;
		  }
		  if(bunnies%2==0){
		    return 3+ bunnyEars2(bunnies-1);
		  }else{
		  return 2 +bunnyEars2(bunnies-1);
		  }
		}
}
