package recursion;

import java.util.Objects;

public class triangle {

	/**
	 * We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks, the next row has 3 blocks, and so on. Compute recursively (no loops or multiplication) the total number of blocks in such a triangle with the given number of rows
	 * @param args
	 */
	public static void main(String[] args) {
		boolean success = true;

		success = success && Objects.equals(0, triangle(0));
		success = success && Objects.equals(1, triangle(1));
		success = success && Objects.equals(3, triangle(2));
		success = success && Objects.equals(6, triangle(3));
		success = success && Objects.equals(10, triangle(4));
		success = success && Objects.equals(15, triangle(5));
		
		if(success){
			System.out.println("All testcases Passed");
		}else{
			System.out.println("testcases failed");
		}
		
	}
	
	public static int triangle(int rows) {
		  if(rows==0){
		    return 0;
		  }

		  return rows+triangle(rows-1);
		}

}
