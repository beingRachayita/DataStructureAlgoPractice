package LinkedLists;

public class ReverseTwoNodes{
	
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		list.insert(6);
		
		list.display();
		System.out.println();
		
		LinkedList.Node temp = list.head;
		
		//1->2->3->4->5->6
		
		while(temp!=null && temp.next!=null){
			int k = temp.data;
			temp.data = temp.next.data;
			temp.next.data =k;
			temp = temp.next.next;
		}
		
		
		list.display();
	}
	

}
