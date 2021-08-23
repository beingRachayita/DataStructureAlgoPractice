package LinkedLists;

import LinkedLists.LinkedList.Node;

public class AddTwoNumbers {

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	Node head;

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
	
	public int size(Node head){
		Node temp = head;
		int count =0;
		while(temp!=null){
			temp = temp.next;
			count++;
		}
		return count;
	}

	int carry = 0;
	public AddTwoNumbers add(Node one, Node two){
		Node temp;
		AddTwoNumbers list = new AddTwoNumbers();
		if(one == null){
			list.head = two;
			return list;
			
		}
		if(two == null){
			list.head = one;
			return list;
			
		}
		int size1 = list.size(one);
		int size2 = list.size(two);
		if(size1==size2){
			list.head = addTwoNum(one, two);
		}else{
			int n = 0;
			
			if(size1>size2){
				n = size1-size2;
				temp = one;
				while(n!=0){
					one = one.next;
					n--;
				}
			}else{
				n = size2-size1;
				temp = two;
				while(n!=0){
					two = two.next;
					n--;
				}
			}
			
			list.head = addTwoNum(one, two);
			temp.data = temp.data+carry;
			carry = temp.data  / 10;
			temp.data = temp.data % 10;
			temp.next = list.head;
			list.head = temp;
		}
		if(carry>0){
			Node n = new Node(carry);
			n.next = list.head;
			list.head= n;
		}
		
		return list;
	}
	private Node addTwoNum(Node one, Node two) {
		Node prev = null;
		if (one == null || two == null) {
			return null;
		}
		prev = addTwoNum(one.next, two.next);
		int sum = one.data + two.data + carry;
		carry = sum / 10;
		sum = sum % 10;
		Node result = new Node(sum);
		result.next = prev;
		return result;

	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		AddTwoNumbers list = new AddTwoNumbers();
		list.insert(1);
		list.insert(7);
		list.insert(9);
		list.insert(4);

		AddTwoNumbers list1 = new AddTwoNumbers();
		list1.insert(2);
		list1.insert(3);
		list1.insert(3);

		AddTwoNumbers result = list.add(list.head, list1.head);

		result.display();

	}
}
