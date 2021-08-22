package LinkedLists;

public class DoubleLinkedList {

	class Node {
		int data;
		Node next;
		Node prev;

		Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}

	Node head;
	Node tail;

	public void insert(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			tail = head;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			newNode.prev = temp;
			tail = newNode;
		}
	}

	public void display() {
		Node temp = head;
		System.out.println();
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public boolean search(int value) {
		Node temp = head;
		if(head==null) {
			System.out.println("List is empty");
			return false;
		}
		while (temp != null) {

			if (temp.data == value)
				return true;

			temp = temp.next;
		}
		return false;
	}

	public void deleteAtIndex(int index) {
		Node temp = head;
		if (index == 1) {
			temp = head.next;
			head.next = null;
			head = temp;
			head.prev = null;
		} else {
			while (index > 2) {
				temp = temp.next;
				index--;
			}
			temp.next = temp.next.next;
			temp.next.prev = temp;
		}
	}

	public void deleteValue(int value) {
		Node temp = head;
		Node removed = null;
		if (temp != null && temp.data == value) {
			removed = temp;
			removed.next = null;
			head = head.next;
			head.prev = null;
		} else {
			while (temp != null && temp.data != value) {
				temp = temp.next;
			}
			if (temp != null) {
				removed = temp;
				temp.prev.next = temp.next;
				temp.next.prev = temp.prev;
				removed.next = null;
				removed.prev = null;
			}
		}
	}
	
	public void displayFromTail() {
		Node temp = tail;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.prev;
		}
	}
	
	public void deletefromEnd() {
		Node temp = tail;
		tail = tail.prev;
		tail.next = null;
		temp.next = null;
		temp.prev = null;
	}

}
