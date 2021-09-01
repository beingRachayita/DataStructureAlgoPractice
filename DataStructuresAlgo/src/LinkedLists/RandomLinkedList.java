package LinkedLists;

public class RandomLinkedList {

	public class Node{
		int data;
		Node random;
		Node next;
		public Node(int data) {
			this.data = data;
		}
		
	}
	
	Node head;
	
	
	public void init() {
		head = new Node(1);
		head.next= new Node(2);
		head.next.next = new Node(3);
		head.next.next.next= new Node(4);
		head.next.next.next.next = new Node(5);
		
		head.random = head.next.next;
		head.next.random = head;
		head.next.next.random = head.next.next.next.next;
		head.next.next.next.random= head.next.next;
		head.next.next.next.next.random = head.next;
		
	}
	
	public void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(" Data: "+temp.data+" random: "+temp.random.data);
			temp = temp.next;
		}
		System.out.println();
	}
	
	public Node clone() {
		if(head==null) {
			return null;
		}
		Node second = new Node(head.data);
		Node temp = head.next;
		Node ptr = second;
		Node str = head;
		
		//looping through to create single linkedlist & assign the original next point to clone node
		while(temp!=null && ptr!=null && str!=null) {
			Node n = new Node(temp.data);
			ptr.next = n;
			ptr.random = str.random;
			str.next = ptr;
			ptr = ptr.next;
			str = temp;
			temp = temp.next;
		}
		ptr.random = str.random;
		str.next = ptr;
		
		//looping through to create the random assignment
		temp = second;
		while(temp!=null) {
			temp.random = temp.random.next;
			temp = temp.next;
		}
		
		
		return second;
	}
}
