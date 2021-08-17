package Arrays;

public class OperationsArray {

	int[] arr = new int[10];
	final int MAX = 10;

	public void display() {
		for (int i = 0; i < MAX; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public int search(int value) {
		for (int i = 0; i < MAX; i++) {
			if (arr[i] == value)
				return i;
		}
		return -1;
	}

	/**
	 * This method inserts at the provided index. The index can range form 0-9.
	 * 
	 * @param value
	 *            (int)
	 * @param index
	 *            (0-9)
	 */
	public void insert(int value, int index) {

		for (int i = arr.length - 1; i > index; i--) {
			arr[i] = arr[i - 1];
		}
		arr[index] = value;
		System.out.println("Successfully Inserted");
	}

	public void delete(int value) {
		int index = search(value);
		if (index == -1) {
			System.out.println("Not found");
		} else {
			for (int i = index; i < arr.length - 1; i++) {
				arr[i] = arr[i + 1];
			}

			System.out.println("Successfully Deleted");
		}
	}

	public static void main(String[] args) {
		OperationsArray a = new OperationsArray();
		a.arr[0] = 1;
		a.arr[1] = 12;
		a.arr[2] = 2;
		a.arr[3] = 4;
		a.arr[4] = 67;
		a.arr[5] = 14;
		a.display();
		//System.out.println(a.arr.length);
		System.out.println(a.search(67));
		
		a.delete(2);
		a.display();
		
		a.insert(5, 3);
		a.display();
		

	}
}
