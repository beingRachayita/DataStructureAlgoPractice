package BinaryTree;

import BinaryTree.BinaryTree.Node;

public class AppDemo {

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.root = bt.create();
		
		bt.inorder(bt.root);
		
		bt.convert(bt.root);
		
		System.out.println();
		
		while(bt.head!=null){
			System.out.print(bt.head.getData()+" ");
			bt.head = bt.head.right;
		}

	}

}
