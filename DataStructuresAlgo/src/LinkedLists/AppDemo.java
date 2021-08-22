package LinkedLists;

public class AppDemo {

	public static void main(String[] args) {
		
		  LinkedList list = new LinkedList(); 
		  LinkedList list2 =new LinkedList();
		  list.insert(1); 
		  list.insert(2);
		  list.insert(4); 
		  list.insert(6);
		  
		  list2.insert(3); 
		  list2.insert(5); 
		  list2.insert(7); 
		  
		  list.display();
		  System.out.println();
		  list2.display();
		  
		  //list.head = list.mergeSortedList(list.head, list2.head);
		  
		  list.display();
		 
		
		/*
		 * DoubleLinkedList dlist = new DoubleLinkedList(); dlist.insert(1);
		 * dlist.insert(2); dlist.insert(3); dlist.insert(4); dlist.insert(5);
		 * dlist.insert(6); dlist.insert(7);
		 * 
		 * dlist.display();
		 * 
		 * dlist.displayFromTail();
		 * 
		 * System.out.println(dlist.search(3));
		 * 
		 * dlist.deleteAtIndex(3);
		 * 
		 * dlist.display();
		 * 
		 * dlist.deletefromEnd();
		 * 
		 * dlist.display();
		 * 
		 * dlist.deleteValue(7);
		 * 
		 * dlist.display();
		 * 
		 * dlist.deleteValue(5);
		 * 
		 * dlist.display();
		 */
	
	}

}
