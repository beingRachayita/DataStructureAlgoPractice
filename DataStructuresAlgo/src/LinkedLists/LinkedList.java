package LinkedLists;

public class LinkedList {
	public Node head;
	static int len = 0;

	public static class Node {
		public int data;
		public Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public boolean isEmpty() {
		if (head == null)
			return true;
		else
			return false;
	}

	public void insert(int data) {
		Node n = new Node(data);
		if (head == null) {
			head = n;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = n;
		}
	}

	public void deleteKey(int data) {
		if (head.data == data)
			head.next = head.next.next;
		else {
			Node temp = head;
			while (temp.next != null) {
				if (temp.next.data == data) {
					temp.next = temp.next.next;
				}
				temp = temp.next;
			}
		}
	}

	public void reverse() {
		Node current = head;
		Node prev = null, next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}

	public void rev(Node n) {
		Node next;
		if (n == null) {
			return;
		} else if (n == head) {
			next = n.next;
			n.next = null;
			rev(next);
		} else {
			next = n.next;
			n.next = head;
			head = n;
			rev(next);
		}
	}

	public int size() {
		Node temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public int length(Node node) {
		if (node == null) {
			return 0;
		} else {
			return 1 + length(node.next);
		}
	}

	public boolean search(int data) {
		if (head != null) {
			Node temp = head;
			while (temp != null) {
				if (temp.data == data) {
					return true;
				}
				temp = temp.next;
			}
		}
		return false;
	}

	public boolean searchRec(Node n, int data) {
		if (n == null) {
			return false;
		}
		if (n.data == data) {
			return true;
		}
		return searchRec(n.next, data);

	}

	public int getNode(int index) {
		Node temp = head;
		while (index != 0) {
			index--;
			temp = temp.next;
		}
		return temp.data;
	}

	public int getNodefromEnd(int index) {
		int len = this.size() - index;
		Node temp = head;
		while (len != 0) {
			len--;
			temp = temp.next;
		}
		return temp.data;
	}

	public void findMiddle() {
		int middle = this.size() / 2;

		Node temp = head;
		while (middle != 0) {
			middle--;
			temp = temp.next;
		}
		System.out.println(temp.data);
	}

	public void findMiddleWithTwo() {
		if (head != null) {
			Node slow = head, fast = head;
			while (fast != null && fast.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
			System.out.println(slow.data);
		}
	}

	public void deleteList() {
		head = null;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public Node mergeSortedlist(Node first, Node second) {
		Node h,temp;
		if (first == null) {
			return second;
		}
		if (second == null) {
			return first;
		}
		
		
		if (first.data >= second.data) {
			temp = second;
			second = second.next;
		} else {
			temp = first;
			first = first.next;
		}
		h = temp;
		
		while (first!= null && second!= null) {
			if (first.data >= second.data) {
				temp.next = second;
				temp= second;
				second= temp.next;

			} else {
				temp.next = first;
				temp= first;
				first= temp.next;

			}
		}

		if(second==null){
			temp.next = first;
		}
		
		if(first==null){
			temp.next = second;
		}
		
		return h;
	}
	
	
	public Node mergeSort(Node node){
		if(node==null||node.next==null)
			return node;
		
		Node middle = findMiddleList(node);
		Node middleNext = middle.next;
		middle.next = null;
		
		Node first = mergeSort(node);
		Node second = mergeSort(middleNext);
		
		Node h = mergeSortedlist(first, second);
		return h;
	}
	
	public Node findMiddleList(Node head){
		Node middle = head, middle_next = head;
		while(middle_next.next!=null){
			if(middle_next.next.next== null){
				middle_next = middle_next.next;
				break;
			}
			middle_next = middle_next.next.next;
			middle = middle.next;
		}
		
		return middle;
	}
}
