package BinaryTree;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BinaryTree {
	public class Node {
		private int data;
		Node left;
		Node right;
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
	}

	Node root;

	BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
	//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public Node create(){
		try{
		Node root = new Node();
		System.out.println("Enter the data: (-1 for no data) ");
		int data = Integer.parseInt(rd.readLine().trim());
		if (data == -1) {
			return null;
		}
		root.setData(data);
		System.out.println("Left Node for "+ root.getData());
		root.left = create();
		System.out.println("Right Node for "+ root.getData());
		root.right = create();
		return root;
		}catch(Exception e){
			e.printStackTrace();
		}
		return root;
	}
	
	public void preorder(Node root){
		if(root==null){
			return;
		}
		System.out.print(root.getData()+ " ");
		preorder(root.left);
		preorder(root.right);
	}
	
	public void postorder(Node root){
		if(root==null){
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.getData()+ " ");
		
	}
	
	public void inorder(Node root){
		if(root==null){
			return;
		}
		inorder(root.left);
		System.out.print(root.getData()+ " ");
		inorder(root.right);
	}
}
