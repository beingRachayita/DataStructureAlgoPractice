package BinaryTree;

public class BinarySearchTree {

	public class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}

	}

	Node root;
	
	public BinarySearchTree() {
		// TODO Auto-generated constructor stub
		root = null;
	}
	
	public void add(int data) {
		root = insert(root, data);
	}

	private Node insert(Node root, int data) {
		if(root == null) {
			root = new Node(data);
			return root;
		}
		else if(data>root.data) {
			root.right = insert(root.right, data);
		}else if(data<root.data) {
			root.left = insert(root.left,data);
		}
		
		return root;
		
	}

	public void inOrder(Node root) {
		if (root == null)
			return;

		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);
	}
	
	public void kthLargestElement(int k) {
		findlargestelement(this.root, k);
	}
	int count =0;
	private void findlargestelement(Node root, int k) {
		if(root == null)
			return;
		findlargestelement(root.right, k);
		count = count+1;
		if(count == k) {
			System.out.println(root.data);
		}
		findlargestelement(root.left, k);
	}
}
